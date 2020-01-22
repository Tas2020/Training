package Selenium.App;

import java.time.Year;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jasmine\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		//driver.findElement(By.name("firstname")).sendKeys("jasmine");
		
		//driver.findElement(By.tagname("a"));
		//List<WebElement> links = driver.findElements(By.tagName("a"));
		//System.out.println(links.size());
		//driver.findElement(By.cssSelector("body.a-m-us.a-aui_157141-c.a-aui_158613-t1.a-aui_72554-c.a-aui_dropdown_187959-c.a-aui_pci_risk_banner_210084-c.a-aui_perf_130093-c.a-aui_tnr_v2_180836-c.a-aui_ux_145937-c.a-meter-animate:nth-child(4) header.nav-opt-sprite.nav-locale-us.nav-lang-en.nav-ssl.nav-unrec:nth-child(17) div.nav-sprite-v1.celwidget.nav-bluebeacon.nav-a11y-t1.nav-fresh.nav-packard-glow.hamburger.using-mouse div.nav-sprite:nth-child(2) div.nav-fill div:nth-child(2) div:nth-child(1) > a.nav-a:nth-child(2)"));
	
		//Use of select class
		
Select dropdown=new Select(driver.findElement(By.id("month")));
dropdown.selectByVisibleText("Jul");
//dropdown.selectByVisibleText("Jun");

Select date = new Select(driver.findElement(By.id("day")));
date.selectByValue("4");

Select Year=new Select(driver.findElement(By.id("year")));
Year.selectByVisibleText("2006");


//driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();



	}

}
