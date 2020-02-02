package CommonFunctions;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;

public class CaptureScreenshots {
	
	public static void takeScreenshot(WebDriver driver,String filename) throws AWTException, IOException
	{
	
	String screenshotpath="./target\\Screenshot";
	//D:\Eclipse\EclipseWorkspace\karthikeyan_ThoughtWorks\MavenArt\target\screenshots
	
	Robot robot =new Robot();
	Dimension dimension=Toolkit.getDefaultToolkit().getScreenSize();
	Rectangle screenRect=new Rectangle(dimension);
	BufferedImage source=robot.createScreenCapture(screenRect);
	//String screenshotpath="target\\Screenshots";
	
	File destination=new File("screenshotpath\\filename");
	ImageIO.write(source, "png", destination);
	

   }
}
