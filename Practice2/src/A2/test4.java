package A2;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class test4 {
	@Test(dataProvider="getData")

	public void WebLoginCarLoan(String username,String password) {
		//Selenium
		System.out.println("Web Car Loan");
		System.out.println(username);
		System.out.println(password);
	}
	@BeforeSuite
	public void BfSuite() {
		System.out.println("I am no. 1");
	}
	@BeforeMethod
	public void BfMethod() {
		System.out.println(" I will execute before every test method");
	}
	@Parameters({"URL"})
	@Test
	public void MobileLoginCarLoan(String urlname) {
		//Appium
		System.out.println("Mobile Car Loan");
		System.out.println(urlname);
	}
	
	@Test
	public void LoginAPICarLoan() {
		//Rest API car loan
		System.out.println("Login Car Loan");
		
	}
	@DataProvider
	public Object[][] getData() {
		Object [][] data =new Object[2][2];
		data[0][0]= "firstusername";
		data[0][1]= "password";
		data[1][0]= "secondusername";
		data[1][1]= "second password";
		return(data);
		
	}
	
}
