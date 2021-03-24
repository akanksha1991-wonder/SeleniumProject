package Checkboxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckboxesPractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/apple/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		System.out.println(driver.findElement(By.cssSelector("input[id*= 'SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*= 'SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*= 'SeniorCitizenDiscount']")).isSelected());
		
		//Count the number of checkboxes.
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) 
		{
			System.out.println("its enabled");
			Assert.assertTrue(true);
			
		
			
		}
		else {
			Assert.assertTrue(false);
		}

	}

}
