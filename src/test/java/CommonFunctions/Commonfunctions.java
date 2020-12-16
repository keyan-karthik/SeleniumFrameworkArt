package CommonFunctions;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class Commonfunctions {
	public static WebDriver driver=null;
	public Properties properties;
	static Logger logger=Logger.getLogger(Commonfunctions.class);
	public static ExtentReports extentReport;
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentTest extentTest;
	
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
		PropertyConfigurator.configure("log4j.properties");
		extentReport=new ExtentReports();
		htmlReporter=new ExtentHtmlReporter("Extent.html");
		extentReport.attachReporter(htmlReporter);
		String browser=properties.getProperty("browser");
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		driver.get(properties.getProperty("url"));
		logger.info("Launching Browser");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
	}
	
	
	  @AfterMethod() 
	  public void failcheck(ITestResult result) throws AWTException,IOException {
		  if(ITestResult.FAILURE==result.getStatus()) {
	        CaptureScreenshots.takeScreenshot(driver,result.getName());
	        extentTest.addScreenCaptureFromPath("./target\\Screenshot"+"\\"+result.getName()+".jpg");
	        extentTest.log(Status.FAIL, result.getThrowable());
	  } }
	 
	
	
	@AfterSuite
	public void closebrowser()
	{
		driver.quit();
		logger.info("Browser Closed");
		extentReport.flush();
	}

}
