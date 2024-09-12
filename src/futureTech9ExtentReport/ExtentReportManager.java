package futureTech9ExtentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager {
	
	static ExtentReports extent;
	
	public static ExtentReports getReporter() {
		if (extent  == null) {
			extent = new ExtentReports();
			ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark/index1.html");
			spark.config().setTheme(Theme.DARK);
			spark.config().setReportName("My Sample Report");
			spark.config().setDocumentTitle("My First Exxtend Report");
			extent.attachReporter(spark);
		}
		
		return extent;
	}

}
