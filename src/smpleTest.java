import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//Sample Explanation the Usage for TestNg running sequencely
public class smpleTest {
	

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Executing Before Test Suite");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Executing Before Test  Class");
	}

	@BeforeTest
	public void preparingTest1() {
		System.out.println("Executing Preparing Test 1");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Executing Before Test Methods");
	}


	@Test
	public void runningTest1() {
		int z;
		z = 7+3;
		System.out.println("Test 1 is running (7+3) = " + z);
		
	}
	
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("Executing After Test Methods");
	}
	
	@AfterClass
	public void afterClassMethod() {
		System.out.println("Executing After Class Methods");
	}

	@AfterTest
	public void ResultTest1() {
		System.out.println("After Test1 Completed. This test is displaying results");
	}
	
	
	@AfterSuite
	public void afterSuiteMethod() {
		System.out.println("Executing After Test Suite");
	}
}
