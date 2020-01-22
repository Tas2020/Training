package Selenium.App;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BoA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jasmine\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.BankofAmerica.com");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='onlineId1']")).sendKeys("jazzz909");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Virginia1210");
		driver.findElement(By.xpath("//button[@id='signIn']")).click();
	}

}
