package com.javatpoint.annotations;

	import org.testng.annotations.Test;  
	public class Depend_On_Methods { 
	
	@Test  
	public void WebStudentLogin()  
	{  
	System.out.println("Student login through web");  
	}  
	@Test  
	public void MobileStudentLogin()  
	{  
	System.out.println("Student login through mobile");  
	}  
	@Test(dependsOnMethods= {"WebStudentLogin"})  
	public void APIStudentLogin()  
	{  
	System.out.println("Student login through API");  
	}  
	}  