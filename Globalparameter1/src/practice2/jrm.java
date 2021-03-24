package practice2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;



public class jrm {
	
	public void Login() throws IOException{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("/Users/apple/eclipse-workspace/Globalparameter1/data2.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("username"));
		
	}

}
