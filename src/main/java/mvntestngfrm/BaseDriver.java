package mvntestngfrm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseDriver 
{
	WebDriver Driver = null;
	public Properties prop;
	 
	public WebDriver initilizedriver() throws IOException 
	{
	 prop = new Properties();
	 FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\mvntestngfrm\\FixedData.properties");
	 prop.load(fis);
	 String  borwser= prop.getProperty("browser");
	 // initilised chorme browser
	 if(borwser.toUpperCase().equals("CHROME"))
	 	{
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver_win32\\chromedriver.exe");
		 Driver = new ChromeDriver();
			
	 	}
	// initilised IE browser
	 else if(borwser.toUpperCase().equals("IE"))
	 	{
		 System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
		 Driver = new InternetExplorerDriver();
	 	}
	// initilised firefox browser
	 else if(borwser.toUpperCase().equals("FIREFOX"))
	 	{
		 Driver = new FirefoxDriver();
	 	}
	Driver.get(prop.getProperty("url").trim());
	 Driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
	 return Driver;
	 }
	 

}
