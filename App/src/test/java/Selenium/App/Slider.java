package Selenium.App;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jasmine\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		
		driver.manage().window().maximize();
		
		Actions hover=new Actions(driver);
		driver.switchTo().frame(0);
		/*WebElement drag=driver.findElement(By.id("draggable"));
		
		WebElement drop=driver.findElement(By.id("droppable"));
				
		hover.dragAndDrop(drag, drop).build().perform();*/
		
		hover.dragAndDropBy(driver.findElement(By.xpath("//span[@tabindex='0']")),200, 0).build().perform();
		
		String name="picture.png";
		
		String directory="C:\\Users\\Jasmine\\Documents\\ScreenShots";
		
		//File sourceFile=((TakesScreenshot)driver).getScreenshotAs(OutputType)
	}

}
