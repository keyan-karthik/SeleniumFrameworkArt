package CommonFunctions;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class Commonfunctions {
	public WebDriver driver;
	public Properties properties;
	
	public  Properties loadProperties() throws IOException
	{
		properties=new Properties();
		FileInputStream configpath=new FileInputStream("config.properties");
		properties.load(configpath);
		return properties;
	}
	
	@BeforeSuite
	public void launchbrowser() throws IOException 
	{
		loadProperties();
		String browser=properties.getProperty("browser");
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		driver.get(properties.getProperty("url"));
		
	}
	
	@AfterMethod()
	public void failcheck(ITestResult result) throws AWTException, IOException
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			CaptureScreenshots.takeScreenshot(driver,result.getName());
			
		}
	}
	
	
	@AfterSuite
	public void closebrowser()
	{
		//driver.quit();
	}

}
