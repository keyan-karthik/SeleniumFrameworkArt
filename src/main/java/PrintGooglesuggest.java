import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintGooglesuggest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("star \n");
		/*
		 * List<WebElement>searchlist=
		 * driver.findElements(By.xpath("//li[@class='sbct']")); for (WebElement
		 * webElement : searchlist) {
		 * //System.out.println("Item is:"+webElement.getText());
		 * if(webElement.getText().contains("vijay")) { webElement.click(); break; } }
		 */
	   Thread.sleep(3000);
	   
	
		
		

	}

}
