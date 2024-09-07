package com.toolsqa;

import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class HardSoftAssertsExample {
	WebDriver driver = new ChromeDriver();
	
	@Test (priority = 2)
	public void CloseBrowser() {
		driver.close();
		Reporter.log("Driver Closed After Testing");
	}
	
	@Test (priority = 1,enabled= false)
	public void OpenBrowser() {
			Reporter.log("This test verifies the current selenium compatibility with TestNG by launching the chrome driver");
	        Reporter.log("Launching Google Chrome Driver version 81 for this test"); 
	        
	        driver.get("https://demoqa.com/");
	        SoftAssert softassert = new SoftAssert();
	        Reporter.log("The website used was DemoQA for this test", true);
	        String expectedTitle = "DEMOQA";
	        String originalTitle = driver.getTitle();
	        softassert.assertEquals(originalTitle, expectedTitle);
	        System.out.println("*** Checking For The Second Title ***");

	        softassert.assertEquals(originalTitle, expectedTitle );
	        softassert.assertAll();
  }
	@Test (priority = 0,description="hard asserts will stop when first test was failed")
	public void OpenBrowser1() {
			Reporter.log("This test verifies the current selenium compatibility with TestNG by launching the chrome driver");
			
	        Reporter.log("Launching Google Chrome Driver version 81 for this test"); 
	        
	        driver.get("https://demoqa.com/");
	        
	        SoftAssert softassert = new SoftAssert();
	        
	        Reporter.log("The website used was DemoQA for this test(Hard Asserts)", true);
	        
	        String expectedTitle = "DEMOQAX";
	        
	        String originalTitle = driver.getTitle();
	        
	        Assert.assertEquals(originalTitle, expectedTitle,"First Test Failed then Stopped");
	        
	        System.out.println("*** Checking For The Second Title ***");
	        
	        Assert.assertEquals(originalTitle, expectedTitle,"dont have chance" );
	        
	        
	        System.out.println("*** Checking For The Third Title ***");
	        
	        softassert.assertEquals(originalTitle, expectedTitle,"never have chance" );
	        
	        softassert.assertAll();
  }
	@Test (priority = 1,description="soft asserts will continue even first test was failed")
	public void OpenBrowser2() {
			Reporter.log("This test verifies the current selenium compatibility with TestNG by launching the chrome driver");
			
	        Reporter.log("Launching Google Chrome Driver version 81 for this test"); 
	        
	        driver.get("https://demoqa.com/");
	        
	        SoftAssert softassert = new SoftAssert();
	        
	        Reporter.log("The website used was DemoQA for this test(soft Asserts)", true);
	        
	        String expectedTitle = "DEMOQAX";
	        
	        String originalTitle = driver.getTitle();
	        
	        softassert.assertEquals(originalTitle, expectedTitle,"First Test");
	        
	        System.out.println("*** Checking For The Second Title ***");
	        
	        softassert.assertEquals(originalTitle, expectedTitle,"Second Test" );
	        
	        System.out.println("*** Checking For The Third Title ***");
	        
	        softassert.assertEquals(originalTitle, expectedTitle,"Third Test" );
	        
	        softassert.assertAll();
  }	       
  }
