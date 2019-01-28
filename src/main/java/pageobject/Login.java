package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	
	public WebDriver driver;
	public Login(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By googleimgclick = By.xpath("//*[@id=\'gbwa\']/div[1]/a");
	public WebElement googleimgclick()
	{
		return driver.findElement(googleimgclick);
	}

}
