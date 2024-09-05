package com.javatpoint.beforeTest;

import org.testng.annotations.BeforeTest;  
import org.testng.annotations.Test;  
  
public class it_department   
{  
      
  @BeforeTest                                             // annotated method placed in the beginning.  
  public void before_test()  
  {  
      System.out.println("It will be executed first");  
  }  
  @Test  
  public void software_developers()  
  {  
      System.out.println("Software Developers");  
  }  
    
  @Test  
  public void software_testers()  
  {  
      System.out.println("Software Testers");  
  }  
    
  @Test  
  public void qa_analyst()  
  {  
      System.out.println("QA Analyst");  
  }}  