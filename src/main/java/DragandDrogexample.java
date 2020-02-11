import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DragandDrogexample {

	public static void main()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit Seconds);
		driver.get("http://testleaf.herokuapp.com/");
		
		
	}
}
