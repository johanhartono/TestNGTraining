package futureTech9ExtentReport;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtenteInitialization {
	ExtentReports extent;
	ExtentTest loginTest;

	@BeforeMethod
	public void init() {
		extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark/index.html");
		spark.config().setTheme(Theme.DARK);
		spark.config().setReportName("My Sample Report");
		spark.config().setDocumentTitle("My First Exxtend Report");
		extent.attachReporter(spark);
		
		loginTest = extent.createTest("Facebook Login Test");
	}

	@AfterMethod
	public void quit() {
		extent.flush();
	}

	@Test
	public void LoginTest() {
		
		loginTest.info("Passing User Name");
		loginTest.info("Passing Password");
		loginTest.info("Click Submit Button");
		loginTest.info("Verify Home Page Title");
		loginTest.info("Validation Failure....");
		Assert.assertEquals("Facebook Login", "Facebook HomePage"); // hard asserts
		loginTest.pass("Test Success....");

	}
}
