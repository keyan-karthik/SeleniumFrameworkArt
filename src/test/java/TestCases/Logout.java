package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import CommonFunctions.Commonfunctions;
import PageObjects.MenuPageObjects;


public class Logout extends Commonfunctions {
	@Test(priority=3)
	public void LogoutTestCase()
	{
		extentTest=extentReport.createTest("verify logout");
		PageFactory.initElements(driver, MenuPageObjects.class);
		MenuPageObjects.dropdownmenu.click();
		MenuPageObjects.logoutmenu.click();
		extentTest.log(Status.PASS,"pass");
	}

}
