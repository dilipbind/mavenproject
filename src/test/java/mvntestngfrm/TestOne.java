package mvntestngfrm;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageobject.Login;

public class TestOne {
	

	@Test
	public void test() throws IOException
	{
		
		BaseDriver bdriver =  new BaseDriver();
		WebDriver driver = bdriver.initilizedriver();
		Login logindri = new Login(driver);
		logindri.googleimgclick().click();
		
		
	}
	
	

}
