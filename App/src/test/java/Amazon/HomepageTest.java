package Amazon;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class HomepageTest {
  @Test
  public void f() {
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.gecko.driver", arg1)
	  
	  //driver =new ChromeDriver();
	  driver=new ChromeDriver();
	  
  }

  @AfterClass
  public void afterClass() {
  }

}
