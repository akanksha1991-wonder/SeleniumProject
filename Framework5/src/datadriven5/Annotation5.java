package datadriven5;



import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation5 {
	
	@BeforeTest
	
	{
		
		
		
		System.out.println("Username");
	}
	@Test
	public void software() {
		System.out.println("I am the test");
	}
	@AfterTest
	public void uninstallsoftware() {
		System.out.println("I am the last");
	}

}
