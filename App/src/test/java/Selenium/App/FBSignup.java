package Selenium.App;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBSignup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jasmine\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Cindy");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Adams");
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("DTC786@hotmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("DTC786@hotmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("dubai420");
		
		Select dropdown = new Select(driver.findElement(By.id("month")));
		dropdown.selectByVisibleText("Feb");
		
		Select date =new Select(driver.findElement(By.id("day")));
		date.selectByVisibleText("2");
		
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("1923");
		
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		
		
		
		//driver.findElement(By.xpath("//button[@id='u_0_w']")).click();
		

	}

}
