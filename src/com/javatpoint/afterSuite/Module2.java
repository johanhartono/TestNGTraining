package com.javatpoint.afterSuite;
import org.testng.annotations.AfterSuite;  
import org.testng.annotations.Test;  
public class Module2   
{  
@AfterSuite  
public void after_suite()  
{  
    System.out.println("Last method");  
      
}  
@Test  
public void c_test()  
{  
    System.out.println("Test3");  
}  
}  