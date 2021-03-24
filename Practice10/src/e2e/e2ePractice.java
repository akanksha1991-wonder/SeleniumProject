package e2e;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class e2ePractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/apple/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value='MAA']")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			System.out.println("its disabled");
			Assert.assertTrue(true);
			
		}
		else {
			Assert.assertTrue(false);
		}
		
		driver.findElement(By.cssSelector("input[id*= 'ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();
		
		driver.findElement(By.id("divpaxinfo"))	.click();
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
	WebElement staticCurrencyDropdown=	driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	Select currencydropdown=new Select(staticCurrencyDropdown);
	dropdown.selectByIndex(2);
	driver.findElement(By.cssSelector("input[value='Search']")).click();
			
			
			
			
		
		
		

	}

}
