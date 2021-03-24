package A2;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class test2 {
	@AfterTest
	public void LastExecution() {
		System.out.println("I will execute last");
	}
	@Test
	public void Demo() {
		System.out.println("Hello");
		
	}
	@AfterSuite
	public void AfSuite() {
		System.out.println("I will not execute first");
	}
	@Test
	public void SecondTest() {
		System.out.println("World");
	}
}

