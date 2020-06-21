package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageObjects {
	

	
	
	
	/*
	 * public HomePageObjects(WebDriver driver) { this.driver=driver; wait=new
	 * WebDriverWait(driver,30); }
	 */
	
	/*
	 * public static void waitfunction(WebElement locator) {
	 * wait.until(ExpectedConditions.elementToBeClickable(locator)); }
	 */
	
	@FindBy(xpath="//a[text()='Home']")
	public static WebElement lnk_Home;
	
	
	@FindBy(xpath="//a[text()='Login']")
	public static WebElement lnk_Login;
	
	/*
	 * public WebElement lnk_register(WebDriver driver) {
	 * wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.
	 * xpath("//a[text()='Register']")))); return
	 * driver.findElement(By.xpath("//a[text()='Register']")); }
	 */
	@FindBy(xpath="//a[text()='Register']")
	public static WebElement lnk_Register;
	
	@FindBy(xpath="//img[@class='card-img-top']")
	public static WebElement lnk_hotelsaravana;

}
