package aObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AaLoginObject {
	WebDriver driver;
	
	public AaLoginObject(WebDriver driver)
	{
		this.driver=driver;
	}

	By logClick= By.xpath("//span[normalize-space()='Login']");

	public WebElement LoginButtonClick()
	
	{
		return driver.findElement(logClick);
	}
}
