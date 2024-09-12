package futureTech9ExtentReport;

import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReportUsingConfig {
	@Test
	public void ExtentReportJSON() throws IOException {

		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark/my_sample_report_config_json.html");

		final File CONF = new File("extentConfig.json");
		spark.loadJSONConfig(CONF);
		
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

	
	@Test
	public void ExtentReportXML() throws IOException {

		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark/my_sample_report_config_xml.html");

		final File CONF = new File("extentConfig.xml");
		spark.loadXMLConfig(CONF);
		
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
