package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	WebDriver driver;
	public LandingPage(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[contains(text(),'My Account')]")
private	WebElement myaccountdropdown;
	
	@FindBy(linkText="Login")
private	WebElement loginOtion;
	
	public WebElement myaccountdropdown() {
		return myaccountdropdown;
	}
	public WebElement LoginOPtion() {
		return loginOtion;
	}
	

}
