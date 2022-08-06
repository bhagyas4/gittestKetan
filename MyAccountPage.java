package POAssignmenntwithFindBY;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyAccountPage {
	
	WebDriver driver;
	WebDriverWait wait;
	@FindBy(xpath="//a[@href='home.html']")
	private WebElement signoutLink;
	
	@FindBy(xpath ="//button[text()='Contact us!']")
	private WebElement contactus;
	
	private By contactUsLocator = By.xpath("//button[text()='Contact us!']");

	
	
	
	
	public MyAccountPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
		wait= new WebDriverWait(driver,Duration.ofSeconds(10));
	}
	
	
	public  MyAccountPage gotocontactUs() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(contactUsLocator));
		contactus.click();
		return this;
		
		
	}

		
		
		
		
		
	public void logout() {
		signoutLink.click();
	}

}
