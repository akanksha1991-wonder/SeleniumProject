package parameters;





import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;


public class practice {
	
	
	
	@Test
	public void Login() throws IOException {
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("/Users/apple/eclipse-workspace/Globalparameters/src/parameters/data.properties");
		prop.load(fis);
		
		
		//System.out.println(prop.getProperty("username"));
		
		if(prop.getProperty("browser").equals("firefox"))
		{
			
			WebDriver driver=new FirefoxDriver();
		}
		else if(prop.getProperty("browser").equals("chrome")) {
			WebDriver driver=new ChromeDriver();
		}
		else {
			WebDriver driver=new SafariDriver();
		}
		
		
			
		
		
	

}

		
		
	}


