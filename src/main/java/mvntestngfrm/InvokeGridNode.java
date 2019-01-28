package mvntestngfrm;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

//import com.gargoylesoftware.htmlunit.javascript.host.URL;

public class InvokeGridNode {
	
	public WebDriver invoke_Window_Chrome_Node() throws MalformedURLException
	{
	DesiredCapabilities dc = new DesiredCapabilities();
	dc.setBrowserName("chrome");
	dc.setPlatform(Platform.WINDOWS);
	WebDriver driver = new RemoteWebDriver(new URL("http://10.232.31.228:4444/wb/hub"),dc);
	return driver;
	}
	

}
