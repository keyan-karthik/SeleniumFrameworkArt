package TestCases;



import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import CommonFunctions.Commonfunctions;
import PageObjects.HomePageObjects;
import PageObjects.LoginPageObjects;
import PageObjects.MenuPageObjects;

public class AddCartTest extends Commonfunctions {
 
	static Logger logger=Logger.getLogger(AddCartTest.class);
			
	@Test(priority=2)
	public void AddCartTestCase() throws InterruptedException
	{
		logger.info("AddCartTestCase started");
		extentTest=extentReport.createTest("verify AddCartTest");
		/*
		 * Logintest lloogin=new Logintest(); lloogin.logintestcase();
		 */		Thread.sleep(30000);
		PageFactory.initElements(driver, HomePageObjects.class);
		HomePageObjects.lnk_hotelsaravana.click();
		logger.info("Hotel Saravana Clicked");
		System.out.println("hotel clicked");
		Thread.sleep(8000);

		PageFactory.initElements(driver, MenuPageObjects.class);
		List<WebElement> menuprice=MenuPageObjects.menuprice; 
		List<WebElement> menulistitem=MenuPageObjects.menulist; 
		for (int i=0;i<menulistitem.size();i++) {

			if(menulistitem.get(i).getText().equalsIgnoreCase("Dosa")) {
				String istring=Integer.toString(i+1);
				String finalstring="(//table/tr[2]/td[2]/button)"+"["+istring+"]";
				System.out.println(finalstring);
				driver.findElement(By.xpath(finalstring)).click();
				Thread.sleep(5000);
			    driver.switchTo().alert().accept();
			    break;
			} }
		       System.out.println("price clicked");
		       Thread.sleep(20000);
		       MenuPageObjects.dropdownmenu.click();
		       MenuPageObjects.cartmenu.click();
		       Thread.sleep(15000);
		       MenuPageObjects.btncheckout.click();
		       Thread.sleep(5000);
		       System.out.println("item added to cart and checkout");
		     
		       extentTest.log(Status.PASS,"pass");



	}
}
