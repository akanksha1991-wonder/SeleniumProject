package introduction;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testcase2 {

	@Test
	public void ploan()
	{
		System.out.println("good");
		


	}
	@BeforeTest
	public void prerequisite() {
		System.out.println("I will execute first ");
	}
	

}
