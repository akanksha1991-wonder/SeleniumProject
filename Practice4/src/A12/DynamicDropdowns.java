package A12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicDropdowns {

	private static final WebElement Dropdown = null;

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "/Users/apple/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
			driver.findElement(By.id("divpaxinfo")).click();
			//driver.findElement(By.id("divpaxOptions"));
				driver.findElement(By.id("adultDropdown")).click();
				WebElement staticDropdown= driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
				Select dropdown=new Select(staticDropdown);
			
		 dropdown.selectByIndex(4);
			
			//Select dropdown=new Select((WebElement) dropdown);
			//dropdown.selectByIndex(5);
			
		
		
		
		

	}

}
