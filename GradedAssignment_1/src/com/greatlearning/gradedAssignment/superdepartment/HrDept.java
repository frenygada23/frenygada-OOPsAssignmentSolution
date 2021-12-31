package com.greatlearning.gradedAssignment.superdepartment;

public class HrDept extends SuperDept {
	public String departmentName() {
		return "HR department";
	}

	public String getTodaysWork() {
		return "Fill today’s timesheet and mark your attendance";
	}

	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	public String doActivity() {
		return "Team lunch";
  }
}