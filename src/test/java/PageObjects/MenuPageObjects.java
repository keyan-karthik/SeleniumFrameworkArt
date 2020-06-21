package PageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuPageObjects {
	
	@FindBy(xpath="//table/tr[1]/td/span")
	public static List<WebElement> menulist;
	
	@FindBy(xpath="(//table/tr[2]/td[2]/button)")
	public static List<WebElement> menuprice;
	
	@FindBy(id="navbarDropdown")
	public static WebElement dropdownmenu;
	
	@FindBy(xpath="//a[text()=' Cart ']")
	public static WebElement cartmenu;

	@FindBy(xpath="//a[text()=' Checkout ']")
	public static WebElement btncheckout;
}
