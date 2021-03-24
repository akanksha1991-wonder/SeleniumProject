package introduction;



import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class testcase {
	@AfterTest
	public void lastexecution() {
		System.out.println("I will execute last");
		
	}
	@Parameters({"URL","APIKey/username"})
	
	@Test
	

	public  void Demo(String urlname,String key) {
		System.out.println("hello");
		System.out.println(urlname);
		System.out.println(key);
		
		

	}
	@AfterSuite
	public void Afsuite() {
		System.out.println("After suite last");
	}
	@Test
	public void SecondTest() {
		System.out.println("Bye");
		Assert.assertTrue(false);
		
		
	}

}
