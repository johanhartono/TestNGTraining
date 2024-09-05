package com.javatpoint.Listener;
 
import org.testng.Assert;  
import org.testng.annotations.Test;  
public class Testcases   
{  
@Test  
public void testtopass()  
{  
Assert.assertTrue(true);  
}  
@Test  
public void testtofail()  
{  
Assert.assertFalse(false);  
}  
} 