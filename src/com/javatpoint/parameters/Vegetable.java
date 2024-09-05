package com.javatpoint.parameters;

import org.testng.annotations.Test;  
import org.testng.annotations.Parameters;  
public class Vegetable   
{  
@Test  
@Parameters("Cauliflower")  
public void c(String m)  
{  
System.out.println("Vegetable names are :");  
System.out.println(m);  
}  
@Test  
@Parameters("Ladyfinger")  
public void orange(String l)  
{  
System.out.println(l);  
}  
}  