package justrentmalta2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login2 {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/apple/Downloads/chromedriver 3");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.get("https://justrentmalta.ml/home/");
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/header[1]/div/div/div[1]/div[2]/nav/ul/li[5]/a")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/header[1]/div[1]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[5]/a[1]")).click();
	
		driver.findElement(By.name("email")).sendKeys("ricardo@justrentmalta.com");
		driver.findElement(By.name("password")).sendKeys("Server123");
		driver.findElement(By.xpath("//*[@id=\"login-tab\"]/form/div/div[5]/span")).click();
		driver.quit();
		
	}

}
