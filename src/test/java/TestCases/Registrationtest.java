package TestCases;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import CommonFunctions.Commonfunctions;
import PageObjects.HomePageObjects;
import PageObjects.RegistrationPageObjects;

public class Registrationtest extends Commonfunctions {
	
	@Test(priority=0,enabled=false)
	public void Registrationtestcase() throws InterruptedException
	{
		Thread.sleep(10000);
		
		/*
		 * WebDriverWait wait=new WebDriverWait(driver,30);
		 * wait.until(ExpectedConditions.elementToBeClickable(HomePageObjects.
		 * lnk_Register));
		 */	
		/*
		 * HomePageObjects home=new HomePageObjects();
		 * home.lnk_register(driver).click();
		 */		
		PageFactory.initElements(driver, HomePageObjects.class);
		HomePageObjects.lnk_Register.click();
		PageFactory.initElements(driver,RegistrationPageObjects.class);
		RegistrationPageObjects.txt_firstName.sendKeys("karthik");
		RegistrationPageObjects.txt_lastName.sendKeys("keyan");
		RegistrationPageObjects.txt_emailaddr.sendKeys("karthikgreat24895@gmail.com");
		RegistrationPageObjects.txt_mobile.sendKeys("9884916208");
		RegistrationPageObjects.txt_password.sendKeys("kkyn@6627");
		RegistrationPageObjects.txt_confirmpassword.sendKeys("kkyn@6627");
		RegistrationPageObjects.btn_browse.sendKeys("C:\\Users\\karthik\\Desktop\\Gokul Resume 2018.doc");
		Thread.sleep(5000);
		RegistrationPageObjects.lnk_terms.click();
		String primarywindow=driver.getWindowHandle();
		System.out.println("primary window is:"+primarywindow);
		Set<String>windows=driver.getWindowHandles();
		System.out.println("Total opened windows are:"+windows.size());
		for (String string : windows) {
			System.out.println("window names are:"+string);
		}
		for (String windowname : windows) {
			System.out.println("window names is:"+windowname);
			if(!(windowname.equalsIgnoreCase(primarywindow)))
			{
				driver.switchTo().window(windowname);
				System.out.println("driver control switched to window:"+windowname);
			}
		}
		Thread.sleep(6000);
		JavascriptExecutor execute=(JavascriptExecutor)driver;
		execute.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
		Thread.sleep(3000);
		RegistrationPageObjects.btn_Acceptterms.click();
		Thread.sleep(5000);
		driver.switchTo().window(primarywindow);
		Thread.sleep(3000);
	    RegistrationPageObjects.btn_Register.click();	
		
		
	}
	

}
