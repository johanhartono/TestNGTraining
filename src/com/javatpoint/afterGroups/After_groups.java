package com.javatpoint.afterGroups;

import org.testng.annotations.AfterGroups;  
import org.testng.annotations.Test;  
public class After_groups  
{  
@AfterGroups("Testing tool")  
public void after_group()  
{  
System.out.println("The list which is shown above are the testing tools");  
}  
@Test(groups= {"Testing tool"})  
public void testcase1()  
{  
System.out.println("Appium");  
}  
@Test(groups= {"Testing tool"})  
public void testcase2()  
{  
System.out.println("JIRA");  
}  
@Test(groups= {"Testing tool"})  
public void testcase3()  
{  
System.out.println("RedMine");  
}  
}  