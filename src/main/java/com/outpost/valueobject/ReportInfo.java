package com.outpost.valueobject;

import java.sql.Date;

public class ReportInfo {

	String id;

	String type;

	String creator;

	String selectedschedulejob;

	Date date;

	int test;

	int threat;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getSelectedschedulejob() {
		return selectedschedulejob;
	}

	public void setSelectedschedulejob(String selectedschedulejob) {
		this.selectedschedulejob = selectedschedulejob;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getTest() {
		return test;
	}

	public void setTest(int test) {
		this.test = test;
	}

	public int getThreat() {
		return threat;
	}

	public void setThreat(int threat) {
		this.threat = threat;
	}

}
