package aPages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import aObject.AaHomeObj;
import aObject.AaLoginObject;
import aResouc.ABase;

public class Alogin extends ABase {
	
	WebDriver driver;
	
	@Test
	public void LogNavigate() throws IOException
	{
		driver=aDriveIntil();
		
		AaHomeObj          Ah=new AaHomeObj(driver);
		AaLoginObject      Al=new AaLoginObject(driver); 
		
		Ah.aClick().click();

Al.LoginButtonClick().click();	}

}
