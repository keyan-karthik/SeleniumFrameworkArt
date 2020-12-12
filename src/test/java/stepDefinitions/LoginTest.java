package stepDefinitions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import CommonFunctions.Commonfunctions;
import PageObjects.HomePageObjects;
import PageObjects.LoginPageObjects;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest extends Commonfunctions {
	
	@Given("^user enter into login page$")
	public void user_enter_into_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		//driver=new ChromeDriver();
		//driver.get("https://sleepy-brook-65250.herokuapp.com/");
	    System.out.println("user enters in login page");
	}

	@When("^user provides valid credentials$")
	public void user_provides_valid_credentials() throws IOException, InterruptedException  {
	    // Write code here that turns the phrase above into concrete actions
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
		
	}

	@Then("^user redirected to homepage$")
	public void user_redirected_to_homepage()  {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user landed homepage after successful login");
	   
	}


}
