package com.department.main;

	import com.department.admin.AdminDepartment;
	import com.department.hr.HrDepartment;
	import com.department.sup.SuperDepartment;
	import com.department.tech.TechDepartment;

	public class DriverMain {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			SuperDepartment dis4 = new SuperDepartment();
			dis4.departmentName();
			dis4.getTodaysWork();
			dis4.getWorkDeadline();
			dis4.TodayisAHoliday();
			AdminDepartment dis = new AdminDepartment();
			dis.departmentName();
			dis.getTodaysWork();
			dis.getWorkDeadline();
			TechDepartment dis1 = new  TechDepartment();
			dis1.departmentName();
			dis1.getTodaysWork();
			dis1.getWorkDeadline();
			dis1.getTechStackInformation();
			 HrDepartment dis2 = new  HrDepartment();
			 dis2.departmentName();
			 dis2.getTodaysWork();
			 dis2.getWorkDeadline();
			 dis2.doActivity();	 
		}

}
