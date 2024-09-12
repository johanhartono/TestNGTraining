package futureTech9ExtentReport;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class SampleExtentReport {

	@Test
	public void ExtentReport() {

		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark/my_sample_report.html");
		spark.config().setTheme(Theme.DARK);
		spark.config().setReportName("My Sample Report");
		spark.config().setDocumentTitle("My First Exxtend Report");
		extent.attachReporter(spark);

		ExtentTest loginTest = extent.createTest("Facebook Login Test");
		loginTest.info("Passing User Name");
		loginTest.info("Passing Password");
		loginTest.info("Click Submit Button");
		loginTest.pass("Test Success....");
		
		ExtentTest homePageTest = extent.createTest("Facebook HomePage Test");
		homePageTest.info("Enter to FaceBook HomePage");
		homePageTest.info("Passing Password");
		homePageTest.info("Click on Profile.");
		homePageTest.fail("Test Failed....");		
		

		extent.flush();
	}

}
