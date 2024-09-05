package com.toolsqa;

import org.testng.annotations.Test;

public class GroupDependentTestMethods {
	
	    @Test(dependsOnGroups = { "SignIn" })
	    public void ViewAcc() {
	        System.out.println("View Your Dashboardd");
	    }
	 
	    @Test(groups = { "SignIn" })
	    public void OpenBrowser() {
	        System.out.println("Browser Opened Successfully");
	    }
	 
	    @Test(groups = { "SignIn" })
	    public void LogIn() {
	        System.out.println("Login Into The Account");
	    }
	}

