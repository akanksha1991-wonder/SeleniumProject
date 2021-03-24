package A1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a2 {
	static WebDriver driver=new ChromeDriver();

	public static void main(String[] args) {
		System.setProperty("webdriver,chrome,driver", "/Users/apple/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("This is my first code");
	}

}
