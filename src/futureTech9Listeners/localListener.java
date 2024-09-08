package futureTech9Listeners;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class localListener implements ITestListener {

		public void onTestSuccess(ITestResult result) {
			System.out.println("***** TEST SUCCESS *****");
			
		}
		
		public void onTestFailure(ITestResult result) {
			System.out.println("***** TEST FAILURE*****");
		}
}
