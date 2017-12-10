package com.outpost.main;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class AnalyzerAPP {
	public static void main(String[] args) throws Exception {
		new AnalyzerAPP();
	}

	public AnalyzerAPP() throws Exception {
		URL url = new URL("https://outscan.outpost24.com/pub/report_test.xml"); // The URL
		HttpURLConnection huc = connect(url); // Connects to the website
		huc.connect(); // Opens the connection
		String str = readBody(huc); // Reads the response
		huc.disconnect(); // Closes
		System.out.println(str); // Prints all output to the console
	}

	private String readBody(HttpURLConnection huc) throws Exception // Reads the response
	{
		InputStream is = huc.getInputStream(); // Inputstream
		BufferedReader rd = new BufferedReader(new InputStreamReader(is)); // BufferedReader
		String line;
		StringBuffer response = new StringBuffer();
		while ((line = rd.readLine()) != null) {
			response.append(line); // Append the line
			response.append('\n'); // and a new line
		}
		rd.close();
		return response.toString();
	}

	private HttpURLConnection connect(URL url) throws Exception // Connect to the URL
	{
		HttpURLConnection huc = (HttpURLConnection) url.openConnection(); // Opens connection to the website
		huc.setReadTimeout(15000); // Read timeout - 15 seconds
		huc.setConnectTimeout(15000); // Connecting timeout - 15 seconds
		huc.setUseCaches(false); // Don't use cache
		HttpURLConnection.setFollowRedirects(true); // Follow redirects if there are any
		huc.addRequestProperty("Host", "www.fetagracollege.org"); // www.fetagracollege.org is the host
		huc.addRequestProperty("User-Agent",
				"Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/29.0.1547.57 Safari/537.36"); // Chrome
		return huc;
	}
}