package Selenium.App;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jasmine\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		
		driver.manage().window().maximize();
		
		Actions slider = new Actions(driver);
		driver.switchTo().frame(0);
		slider.dragAndDropBy(driver.findElement(By.xpath("//span[@tabindex='0']")), 200,0).build().perform();
		
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		slider.dragAndDrop(drag, drop).build().perform();
		
		
		driver.navigate().to("https://jqueryui.com/resizable/");;
		driver.switchTo().frame(0);
		slider.dragAndDropBy(driver.findElement(By.xpath("//*[@id=\"resizable\"]")), 200, 100).build().perform();
		slider.clickAndHold(driver.findElement(By.xpath("//*[@id=\\\"resizable\\\"]"))).release(target)
		//slider.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();

	}

}
