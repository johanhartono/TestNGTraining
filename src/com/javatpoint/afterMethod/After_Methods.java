package com.javatpoint.afterMethod;

import org.testng.annotations.AfterMethod;  
import org.testng.annotations.Test;  
public class After_Methods   
{  
@AfterMethod  
public void after_method()  
{  
System.out.println("This method will be invoked after the execution of each test method");  
}  
@Test  
public void c_programmers()  
{  
System.out.println("I am a C programmer");  
}  
@Test  
public void java_programmers()  
{  
System.out.println("I am a java programmer");  
}  
@Test  
public void dotnet_developer()  
{  
System.out.println("I am a .Net Developer");  
}  
}  