package TestCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import CommonFunctions.Commonfunctions;
import PageObjects.HomePageObjects;
import PageObjects.LoginPageObjects;

public class Logintest extends Commonfunctions {
	
	static Logger logger=Logger.getLogger(Logintest.class);
	
	@Test(priority=1)
	public void logintestcase() throws InterruptedException, IOException
	{
	 
		extentTest=extentReport.createTest("verify LoginTest");
		logger.info("LoginTestCase started");
		FileInputStream fis=new FileInputStream("./TestData.xlsx");
		//Workbook workBook = null;
		XSSFWorkbook workBook=new XSSFWorkbook(fis);
		Sheet sheet=null;
		sheet=workBook.getSheetAt(0);		
		String uname=sheet.getRow(1).getCell(0).toString();
		String pass=sheet.getRow(1).getCell(1).toString();
		workBook.close();
		System.out.println("username is:"+ uname);
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
		 
		logger.info("user credentials entered");
	    //Thread.sleep(10000);
	    LoginPageObjects.btn_login.click();
	}

}
