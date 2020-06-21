package TestCases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import CommonFunctions.Commonfunctions;
import PageObjects.HomePageObjects;
import PageObjects.LoginPageObjects;

public class LoginDataProviderex extends Commonfunctions {
	
	public String[][] data= {
			{"karthikgreat24895@gmail.com","kkyn@6627"},
			{"xxxx","yyyy"},
					};
	
	@DataProvider(name="logindata")
	public String[][] loginDataProvider()
	{
		return data;
	}
	
	@Test(dataProvider="logindata") 
	public void logintestcase(String uname,String pass) throws InterruptedException, IOException
	{
	 
		Thread.sleep(10000);
		PageFactory.initElements(driver, HomePageObjects.class);
		HomePageObjects.lnk_Login.click();
		/*
		 * LoginPageObjects.txtlogin.sendKeys(properties.getProperty("username"));
		 * LoginPageObjects.txtPassword.sendKeys(properties.getProperty("password"));
		 * LoginPageObjects.btnLogin.click();
		 */	
		Thread.sleep(10000);
		PageFactory.initElements(driver, LoginPageObjects.class);	
		
		  LoginPageObjects.txt_email.sendKeys(uname);
		  LoginPageObjects.txt_password.sendKeys(pass);
		 
		
	    //Thread.sleep(10000);
	    LoginPageObjects.btn_login.click();
	}

}
	


