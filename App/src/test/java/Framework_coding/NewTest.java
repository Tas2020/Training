package Framework_coding;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
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
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
	 WebDriver driver;
	 
  @Test
  public void f() {
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("purse");
	  driver.findElement(By.className("nav-input")).click();
	  driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[4]/div[1]/div[11]/div/span/div/div/div[3]/h2/a/span")).click();
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Jasmine\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		driver=new ChromeDriver();
	    driver.get("https://www.Amazon.com");
		driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() throws WebDriverException, IOException {
	  Date date= new Date();
	  
	  long time = date.getTime();
	  System.out.println("Time in Milliseconds:" + time);
	  Timestamp tsdesk = new Timestamp(time);
	  System.out.println("Current Time Stamp: " + tsdesk);
		  //To take screen shot
		  TakesScreenshot screenShot=(TakesScreenshot)driver;
		  FileHandler.copy(screenShot.getScreenshotAs(OutputType.FILE),new File("C:\\Users\\Jasmine\\Documents\\ScreenShots\\"+time+"ScreenShots.png"));
		  
		  
		  
	  }
	 
  

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
