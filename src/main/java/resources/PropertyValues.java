package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyValues {
	static Properties prop = new Properties();
	
	public static String Browser(String Va) throws IOException {
	FileInputStream fis=new FileInputStream("C:\\Study\\Eclipse Project Files\\Selenium-Automation\\src\\main\\java\\resources\\data.properties");
	prop.load(fis);
	return prop.getProperty(Va);
	}
}