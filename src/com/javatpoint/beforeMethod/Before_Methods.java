package com.javatpoint.beforeMethod;

import org.testng.annotations.BeforeMethod;  
import org.testng.annotations.Test;  
public class Before_Methods   
{  
int a=10;  
int b=9;  
@BeforeMethod  
public void before_method()  
{  
System.out.println("This method will be invoked before every test method");  
}  
@Test  
public void sum()  
{  
int sum;  
sum=a+b;  
System.out.print("Sum of a and b is : "+sum);  
}  
@Test  
public void difference()  
{  
int diff;  
diff=a-b;  
System.out.println("Difference of a and b is :"+diff);  
  }  
}  