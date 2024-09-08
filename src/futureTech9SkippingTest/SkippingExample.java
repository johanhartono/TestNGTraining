package futureTech9SkippingTest;

import org.testng.annotations.Test;
import org.testng.SkipException;

public class SkippingExample {
	
	@Test
	public void testOne() {
		System.out.println("Hi, Iam Test One ....");
		
	}
	@Test (enabled=false)
	public void testTwo() {
		System.out.println("Hi, Iam Test Two ....");
		
	}
	@Test
	public void testThree() {
		System.out.println("Hi, Iam Test Three ....");
		throw new SkipException("Skipping Deliberately , As this test is incomplete");
		
	}
	@Test
	public void testFour() {
		System.out.println("Hi, Iam Test Four ....");
		
	}

}
