package PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import CommonFunctions.Commonfunctions;

public class RegistrationPageObjects extends Commonfunctions {
	
		
	
    @FindBy(xpath="//input[@formcontrolname='firstName']")
	public static WebElement txt_firstName;
	
	
	@FindBy(xpath="//input[@formcontrolname='lastName']")
	public static WebElement txt_lastName;
	
	@FindBy(xpath="//input[@formcontrolname='email']")
	public static WebElement txt_emailaddr;
	
	@FindBy(xpath="//input[@formcontrolname='mobileNumber']")
	public static WebElement txt_mobile;
	
	@FindBy(xpath="//input[@formcontrolname='password']")
	public static WebElement txt_password;
	
	@FindBy(xpath="//input[@formcontrolname='confirmPassword']")
	public static WebElement txt_confirmpassword;
	
	@FindBy(xpath="//input[@formcontrolname='customFile']")
	public static WebElement btn_browse;
	
	
	@FindBy(xpath="//a[text()='terms of service']")
	public static WebElement lnk_terms;
	
	@FindBy(xpath="//button[text()='Register']")
	public static WebElement btn_Register;
	
	@FindBy(xpath="//button[text()=' I Accept & Close ']")
	public static WebElement btn_Acceptterms;
	
	
	
	

}
