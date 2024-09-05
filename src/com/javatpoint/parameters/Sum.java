package com.javatpoint.parameters;

import org.testng.annotations.Test;  
import org.testng.annotations.Parameters;  
public class Sum   
{  
@Test  
@Parameters({"a","b"})  
public void add(int c, int d)  
{  
int sum=c+d;  
System.out.println("Sum of two numbers : "+sum);  
}  
}  