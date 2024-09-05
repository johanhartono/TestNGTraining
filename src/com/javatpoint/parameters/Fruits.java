package com.javatpoint.parameters;

import org.testng.annotations.Test;  

import org.testng.annotations.Parameters;  
public class Fruits   
{  
@Test  
@Parameters("mango")  
public void mango(String m)  
{  
	System.out.println("Fruits names are:  ");  
	System.out.println(m);  
}  
@Test  
@Parameters("orange")  
public void orange(String o)  
{  
	System.out.println(o);  
}  
}  