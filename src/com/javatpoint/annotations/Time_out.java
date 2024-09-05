package com.javatpoint.annotations;

import org.testng.annotations.Test;  
public class Time_out 
{  
@Test(timeOut=200)  
public void testcase1() throws InterruptedException  
{  
Thread.sleep(500);  
System.out.println("This is testcase1");  
}  
@Test    
public void testcase2()  
{  
System.out.println("This is testcase2");  
    }  
@Test  
public void testcase3()  
{  
System.out.println("This is testcase3");  
}  
}  
