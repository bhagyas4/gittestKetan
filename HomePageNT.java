package POAssignmenntwithFindBY;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageNT extends LoadableComponent<HomePageNT> {
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	@FindBy(name="username")
	private WebElement username;
	@FindBy(name="password")
	private WebElement password;
	@FindBy(xpath="//form[@name='loginform']/button")
	private WebElement  submit; 
	private String pageTitle ="STC Tourism";
	
	@FindBy(xpath ="//button[text()='Tours']")
	private WebElement toursLink;
	
	
	
	
	
	
	
	public HomePageNT() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sachin\\eclipse-workspace\\apr22KetanSeleniumtraining\\test\\resources\\chromedriver.exe");
		 driver = new ChromeDriver();
		 PageFactory.initElements(driver, this);
		 driver.manage().window().maximize();
		 wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		 get();
		 
		
		
	}
	
	public MyAccountPage login (String user , String pass) {
		username.sendKeys(user);
		password.sendKeys(pass);
		submit.click();
		MyAccountPage myaccPage = new MyAccountPage(driver);
		return myaccPage;
	}

	@Override
	protected void isLoaded() {
		
		assertEquals(driver.getTitle(), pageTitle, "Page not loaded");
		
		
	}

	@Override
	protected void load() {
		
		 driver.get("https://nichethyself.com/tourism/home.html");

		
	}
	
	public void closeBrowser() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	

}
