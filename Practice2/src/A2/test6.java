package A2;

import org.testng.annotations.Test;

public class test6 {
	@Test
	public void WebHomeLoan() {
		System.out.println("Web Home Loan");
	}
	@Test(groups= {"smoke"})
	public void MobileHomeLoan()
	{
		System.out.println("Mobile Home Loan");
	}
	@Test
	public void LoginAPIHomeLoan() {
		System.out.println("LoginAPI Home Loan");
		
	}
}
