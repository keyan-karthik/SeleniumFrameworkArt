package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import CommonFunctions.Commonfunctions;
import PageObjects.MenuPageObjects;


public class Logout extends Commonfunctions {
	@Test(priority=3)
	public void LogoutTestCase()
	{
		
		PageFactory.initElements(driver, MenuPageObjects.class);
		MenuPageObjects.dropdownmenu.click();
		MenuPageObjects.logoutmenu.click();
	}

}
