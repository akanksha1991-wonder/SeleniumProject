package A3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValuesDrives {

	public static void main(String[] args) throws IOException {
		Properties prop=new Properties();
		FileInputStream fis= new FileInputStream("/Users/apple/eclipse-workspace/Practice3/data.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		prop.setProperty("browser", "firefox");
		System.out.println(prop.getProperty("browser"));
		FileOutputStream fos= new FileOutputStream("/Users/apple/eclipse-workspace/Practice3/data.properties");
		prop.store(fos, null);
	}

}
