import org.testng.annotations.*;

//Sample Explanation the Usage for TestNg running sequences/hierarchies
public class sequenceTestNG {
	

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Executing Before Test Suite");
	}
	
	@BeforeTest
	public void preparingTest1() {
		System.out.println("Executing Before Test -> Preparing Test 1");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Executing Before Class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Executing Before Method");
	}

	@Test
	public void runningTest1() {
		int z;
		z = 7+3;
		System.out.println("Test 1 is running (given 7+3) = " + z);
	}
	
	@Test
	public void runningTest2() {
		int z;
		z = 7-3;
		System.out.println("Test 1 is running (given 7-3) = " + z);
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("Executing After Method");
	}
	
	@AfterClass
	public void afterClassMethod() {
		System.out.println("Executing After Class");
	}

	@AfterTest
	public void ResultTest1() {
		System.out.println("After Test1 Completed. This test is displaying results");
	}

	@AfterSuite
	public void afterSuiteMethod() {
		System.out.println("Executing After Suite");
	}

}
	

