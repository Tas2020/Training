package Selenium.App;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

public class Iframe {
	WebDriver driver;
	
  @Test
  public void f() {
  }
  @BeforeClass
  public void beforeClass() throws WebDriverException, IOException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Jasmine\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		driver=new ChromeDriver();
	    driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		Actions mm = new Actions (driver);
		mm.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();
		screenshot(); 
  }

  @AfterClass
  public void afterClass() {
	  
  }
public void screenshot() throws WebDriverException, IOException { 
	Date date= new Date();
	  
	  long time = date.getTime();
	  System.out.println("Time in Milliseconds:" + time);
	  Timestamp tsdesk = new Timestamp(time);
	  System.out.println("Current Time Stamp: " + tsdesk);
		  //To take screen shot
		  TakesScreenshot screenShot=(TakesScreenshot)driver;
		  FileHandler.copy(screenShot.getScreenshotAs(OutputType.FILE),new File("C:\\Users\\Jasmine\\Documents\\ScreenShots\\"+time+"ScreenShots.png"));	
}
}
