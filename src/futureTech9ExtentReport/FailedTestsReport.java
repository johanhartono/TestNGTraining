package futureTech9ExtentReport;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class FailedTestsReport {

	@Test
	public void ReportofFailedTest() {

		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark/fullreport-index.html");
		spark.config().setTheme(Theme.DARK);
		spark.config().setReportName("My Sample Report");
		spark.config().setDocumentTitle("My First Exxtend Report");

		ExtentSparkReporter failedTestspark = new ExtentSparkReporter("target/Spark/failedTests-index.html").filter()
				.statusFilter().as(new Status[] { Status.FAIL }).apply();

		extent.attachReporter(spark, failedTestspark);

		ExtentTest loginTest = extent.createTest("Facebook Login Test with valid Creds");
		loginTest.info("Passing User Name");
		loginTest.info("Passing Password");
		loginTest.info("Click Submit Button");
		loginTest.pass("Test Success....");

		ExtentTest homePageTest = extent.createTest("Facebook HomePage Test");
		homePageTest.info("Enter to FaceBook HomePage");
		homePageTest.info("Passing Password");
		homePageTest.fail("Test Failed....");

		ExtentTest loginTestFailed = extent.createTest("Facebook Login Test with Invalid Creds");
		loginTestFailed.info("Passing User Name");
		loginTestFailed.info("Passing Incorrect Password");
		loginTestFailed.info("Click Submit Button");
		loginTestFailed.fail("Test Failed....");

		ExtentTest profilePageTest = extent.createTest("Facebook Profile Test");
		profilePageTest.info("Enter to FaceBook Profile");
		profilePageTest.info("Click on Profile.");
		profilePageTest.pass("Test Success....");

		extent.flush();
	}
}
