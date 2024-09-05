package com.javatpoint.annotations;

import org.testng.annotations.Test;

public class Descriptions {
	      
		@Test(description="This is testcase1")  
		public void testcase1()  
		{  
		System.out.println("HR");  
		}  
		@Test(description="This is testcase2")  
		public void testcase2()  
		{  
		System.out.println("Software Developer");  
		}  
		@Test(description="This is testcase3")  
		public void testcase3()  
		{  
		System.out.println("QA Analyst");  
		}  
}  