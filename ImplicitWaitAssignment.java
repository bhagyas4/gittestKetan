package waitAssignement;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class ImplicitWaitAssignment {
	WebDriver driver ;
	
	
	
	
  @Test
  public void test1() {
	  
	  driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  driver.findElement(By.xpath("//button[text()='Start']")).click();
	  String actualText = "Hello World!";
	 String expectedText = driver.findElement(By.id("finish")).getText();
	 assertEquals(actualText, expectedText);
	  
	  

  }
  
 /* @Test
  public void test2() {
	  
	  driver.get("http://the-internet.herokuapp.com/dynamic_loading/2");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
	  driver.findElement(By.xpath("//button[text()='Start']")).click();
	  String actualText = "Hello World!";
	 String expectedText = driver.findElement(By.id("finish")).getText();
	 assertEquals(actualText, expectedText);
	  
	  

  }*/
  
  
  
  
  
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Sachin\\eclipse-workspace\\apr22KetanSeleniumtraining\\test\\resources\\chromedriver.exe");
	  driver= new ChromeDriver();
	
	  
	  
	  
  }

  @AfterClass
  public void afterClass() {
	  
	  
	  driver.quit();
  }

}
