package Selenium.App;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jasmine\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("cookie_action_close_header")).click();
		//driver.findElement(By.xpath("//button[text()='Simple Alert']")).click();
		//Thread.sleep(6000);
		//driver.switchTo().alert().accept();
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//button[text()='Prompt Pop up']")).click();
		Thread.sleep(6000);
		driver.switchTo().alert().accept();

		
		//driver.findElement(By.xpath("//button[text()='Confirm Pop up']")).click();
		
		
		
		

	}

}
