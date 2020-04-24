package testNGpackage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotations {

	@BeforeTest
	public void launchBrowser(){
		System.out.println("Before Test");
	}
	
	@Test
	public void TestCase() {
		System.out.println("Test Case 1");
	}
	
	@AfterTest
	public void tearDown() {
		System.out.println("After Method");
	}
 
	
}
