package aPages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import aObject.AaHomeObj;
import aResouc.ABase;

public class AHome extends ABase{
	
	 public WebDriver driver;
	@Test
	public void aNavigate() throws IOException {	
	driver=aDriveIntil();
	
	AaHomeObj Ah=new AaHomeObj(driver);
	
	Ah.aClick().click();
	
	

}
}
