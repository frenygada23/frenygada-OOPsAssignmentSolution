package com.department.tech;
	import com.department.sup.SuperDepartment;

	public class TechDepartment extends SuperDepartment{
		public  String departmentName()
		{
		    String Tech = "Tech";
		    System.out.println(" Tech Department");
		     return Tech;
		}
		public  String  getTodaysWork()
			{
			String module = "module";
			 System.out.println("Complete coding of module 1");
		       
		        return module ;
			}
		public  String getWorkDeadline()
			{
		       String  Complete = "Complete";
		       System.out.println("Complete by EOD ");
		        return  Complete;
			}
		public String getTechStackInformation()

			{
			String java="java";
			System.out.println("Core Java");
		      return java;
			}
	}
