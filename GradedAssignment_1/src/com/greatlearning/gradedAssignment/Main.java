package com.greatlearning.gradedAssignment;

import com.greatlearning.gradedAssignment.superdepartment.AdminDept;
import com.greatlearning.gradedAssignment.superdepartment.HrDept;
import com.greatlearning.gradedAssignment.superdepartment.TechDept;

public class Main {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			AdminDept obj1 = new AdminDept();
			System.out.println("Welcome to " + obj1.departmentName());
			System.out.println(obj1.getTodaysWork());
			System.out.println(obj1.getWorkDeadline());
			System.out.println(obj1.isTodayAHoliday());
			System.out.println();
			HrDept obj2 = new HrDept();
			System.out.println("Welcome to " + obj2.departmentName());
			System.out.println(obj2.doActivity());
			System.out.println(obj2.getTodaysWork());
			System.out.println(obj2.getWorkDeadline());
			System.out.println(obj2.isTodayAHoliday());
			System.out.println();
			TechDept obj3 = new TechDept();
			System.out.println("Welcome to " + obj3.departmentName());
			System.out.println(obj3.getTodaysWork());
			System.out.println(obj3.getWorkDeadline());
			System.out.println(obj3.getTechStackInformation());
			System.out.println(obj3.isTodayAHoliday());
		}
}
