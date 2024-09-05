package com.javatpoint.afterClass;

import org.testng.annotations.AfterClass;  
import org.testng.annotations.Test;  
  
public class Class1   
{  
 @AfterClass  
 public void after_class()  
 {  
     System.out.println("The above are the programming languages");  
 }  
 @Test  
 public void testcase1()  
 {  
     System.out.println("C");  
 }  
 @Test  
 public void testcase2()  
 {  
     System.out.println("C++");  
 }  
 @Test  
 public void testcase3()  
 {  
     System.out.println("Java");  
 }  
  
}  