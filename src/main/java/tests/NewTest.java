package tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest {
	public WebDriver driver;
	
  @Test
  public void openmyblog() {
	  driver.get("http://sankarqtpautomation.blogspot.com/");
  }
  
  @BeforeClass
  public void beforeClass() {
	 System.setProperty("webdriver.chrome.driver","../mavenproject/drivers/chromedriver.exe");
	 driver = new ChromeDriver();
  }
  @AfterClass
  public void AfterClass() {
	  driver.quit();
  }
}
   
