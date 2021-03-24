package introduction;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class Testcase3 {
	@BeforeClass
	public void Beforeclass() {
		System.out.println("Before class no.1");
	}

@Test(dataProvider="getData")
public void WebLoginCarLoan(String username,String password) {
	System.out.println("weblogincar");
	System.out.println("username");
	System.out.println("password");
	
}
@Test(enabled=false)
public void MobileLoginCarLoan() {
	System.out.println("mobilelogincar");
}
@BeforeSuite
public void Bfsuite() {
	System.out.println("Before suite no.1");
}
@AfterClass
public void Afterclass() {
	System.out.println("After class no.1");
}

@Test(dependsOnMethods= {"WebLoginCarLoan"})
public void LoginApiCarLoan() {
	System.out.println("loginapicarloan");
}
@DataProvider
public Object[][] getData() {
	//Scenarios-:
	//1st scenario (Username, password)- good credit history
	//2 nd scenario (Username, password)- No credit history
	//3rd scenario (Username,password)- Good credit history
	Object[][]data= new Object[3][2];
	data[0][0]="firstsetusername";
	data[0][1]="password";
	//Columns are nothing but values of that particular combination(row).
	
	//2nd combination
	data[1][0]="secondsetusername";
	data[1][1]="secondpassword";
	
	//3rd combination
	data[2][0]="thirdsetpassword";
	data[2][1]="thirdpassword";
	return data;
	
	
}


		
		

	}


