package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjects {
	
	/*
	 * @FindBy(id="txtUsername") public static WebElement txtlogin;
	 * 
	 * @FindBy(id="txtPassword") public static WebElement txtPassword;
	 * 
	 * @FindBy(id="btnLoginnn") public static WebElement btnLogin;
	 */	
	@FindBy(xpath="//input[@formcontrolname='userName']")
	public static WebElement txt_email;
	
	@FindBy(xpath="//input[@formcontrolname='password']")
	public static WebElement txt_password;
	
	@FindBy(xpath="//button[text()='Sign in']")
	public static WebElement btn_login;
	

}
