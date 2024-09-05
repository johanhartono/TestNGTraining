package com.javatpoint.afterClass;

import org.testng.annotations.AfterClass;  
import org.testng.annotations.Test;  
public class Class2   
{  
 @AfterClass  
 public void after_class()  
 {  
     System.out.println("The above are the automation testing tools");  
 }  
 @Test  
 public void testcase1()  
 {  
     System.out.println("Selenium");  
 }  
 @Test  
 public void testcase2()  
 {  
     System.out.println("Rational Functional Tester");  
 }  
 @Test  
 public void testcase3()  
 {  
     System.out.println("Cucumber");  
 }  
 @Test  
 public void testcase4()  
 {  
     System.out.println("eggPlant");  
 }  
}  