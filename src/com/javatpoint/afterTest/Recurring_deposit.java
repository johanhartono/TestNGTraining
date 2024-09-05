package com.javatpoint.afterTest;

import org.testng.annotations.AfterTest;  
import org.testng.annotations.Test;  
public class Recurring_deposit   
{  
@Test   
public void recurring_deposit()  
  {  
      System.out.println("Recurring Deposit");  
  }  
@AfterTest  
public void after_test()  
{  
    System.out.println("After test execution..");
    }
}  