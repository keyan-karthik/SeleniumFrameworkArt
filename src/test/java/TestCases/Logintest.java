package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import CommonFunctions.Commonfunctions;
import PageObjects.LoginPageObjects;

public class Logintest extends Commonfunctions {
	
	@Test
	public void logintestcase()
	{
	    PageFactory.initElements(driver, LoginPageObjects.class);
		LoginPageObjects.txtlogin.sendKeys(properties.getProperty("username"));
		LoginPageObjects.txtPassword.sendKeys(properties.getProperty("passwordss"));
		LoginPageObjects.btnLogin.click();
					
			
	}

}
