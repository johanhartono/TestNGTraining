package com.javatpoint.beforeClass;
import org.testng.annotations.BeforeClass;  
import org.testng.annotations.Test;  
  
public class Class1   
{  
 @BeforeClass  
 public void before_class()  
 {  
     System.out.println("This method is executed before Class1");  
 }  
 @Test  
 public void testcase2()  
 {  
     System.out.println("Test case2");  
 }  
 @Test  
 public void testcase1()  
 {  
     System.out.println("Test case1");  
 }  
}  