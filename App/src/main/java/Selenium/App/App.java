package Selenium.App;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import ChromeBrowser.ChromeDriver;
//import ChromeBrowser.WebDriver;


public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Jasmine\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
	//	WebDriver driver=new ChromeDriver(); 
	//	org.openqa.selenium.WebDriver driver=new org.openqa.selenium.chrome.ChromeDriver();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	//	Thread.sleep(6000);
		//how to refresh the browser
		//driver.navigate().refresh();
		
		//how to go backward
	//	driver.navigate().back();
		
		//how to go forward
	//	driver.navigate().forward();
		
		//how to maximize browser
		driver.manage().window().maximize();
		
		//how to get current url
		//String current=driver.getCurrentUrl();
	//	System.out.println(current);
		
		//how to close 
	//	Thread.sleep(6000);
		//driver.close();
		
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bags");
		//driver.findElements(By.className("nav-input")).c
		
		//driver.findElement(By.linkText("Try Prime")).click();
		driver.findElement(By.linkText("nav-a  ")).click();
	//	driver.findElement(By.linkText("nav-a  ")).click();
		
		
		
		
    	
    	
    }
}
