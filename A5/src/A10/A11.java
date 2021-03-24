package A10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A11 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/apple/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.className("_1_3w1N")).click();
		driver.findElement(By.className("_2IX_2- VJZDxU")).sendKeys("akankshanaruka21@gmail.com");
		
		
		
	}

}
