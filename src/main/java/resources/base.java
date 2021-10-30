package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class base {
	public  WebDriver driver;
	public Properties prop;
public WebDriver initializeDriver() throws IOException
{
	prop= new Properties();
	FileInputStream fis=new FileInputStream("C:\\Study\\Eclipse Project Files\\Selenium-Automation-Projects\\src\\main\\java\\resources\\data.properties");
	prop.load(fis);
	String browserName=prop.getProperty("browser");
	

if(browserName.equals("chrome"))
{
	System.setProperty("webdriver.chrome.driver", "C:\\Study\\Driver\\chromedriver.exe");
	driver= new ChromeDriver();
}
else if (browserName.equals("firefox"))
{
	 driver= new FirefoxDriver();
}
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
return driver;
}
/*public String getScreenShotPath(String testCaseName,WebDriver driver) throws IOException
{
	String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
	FileUtils.copyFile(source,new File(destinationFile));
	return destinationFile;

}*/
public String captureScreenshot(WebDriver webdriver, String testCaseName) throws IOException {
		Date d = new Date();
		String FileName = d.toString().replace(":", "_").replace(" ", "_") +testCaseName+ ".png";
		File ss = ((TakesScreenshot)webdriver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ss, new File("C:\\Study\\ScreenPrint\\" + FileName));
		return FileName;
	}
}
