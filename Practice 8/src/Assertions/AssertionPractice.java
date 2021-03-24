package Assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssertionPractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/apple/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		 Assert.assertFalse(driver.findElement(By.cssSelector("input[id*= 'SeniorCitizenDiscount']")).isSelected()); 
		
		
	}

}
