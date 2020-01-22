package Selenium.App;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jasmine\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.Amazon.com");
		driver.manage().window().maximize();
		
		Actions hover=new Actions(driver);
		hover.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		hover.moveToElement(driver.findElement(By.linkText("Create a List"))).click().build().perform();	
	//	hover.moveToElement(driver.findElement(By.linkText("Wedding Registry"))).click().build().perform();
		
		WebElement.drag=driver.findElement(By.id("draggable"));

	}

}
