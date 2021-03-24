package A1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a1 {
	static WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/apple/Downloads/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		//driver.findElement(By.id("email")).sendKeys("This is my first code");
		//driver.findElement(By.name("pass")).sendKeys("123456");
		//driver.findElement(By.linkText("Forgotten account?")).click();
		
	}
	public static void takeScreenshot(String fileName) throws Exception {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("./screenshots/google.png"));
		System.out.println("Screenshot taken");
	}

}