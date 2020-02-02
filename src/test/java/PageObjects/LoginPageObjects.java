package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjects {
	
	@FindBy(id="txtUsername")
	public static WebElement txtlogin;
	
	@FindBy(id="txtPassword")
	public static WebElement txtPassword;
	
	@FindBy(id="btnLoginnn")
	public static WebElement btnLogin;
	

}
