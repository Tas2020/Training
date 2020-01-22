package Selenium.App;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TdBank {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jasmine\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.TDBank.com");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='td-button td-button-secondary td-button-large td-copy-nowrap loginout']")).click();
		driver.findElement(By.xpath("//input[@id='formElement_0']")).sendKeys("sager420");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("dubai420");
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/button")).click();
	
		
		Thread.sleep(6000);
		/*driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		
		
		Thread.sleep(4000);
		//driver.close();*/
	}		

}
