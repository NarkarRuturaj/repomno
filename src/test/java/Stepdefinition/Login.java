package Stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import PageObject.LandingPage;
import PageObject.LoginPage;
import PageObject.MyAccountPage;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import resources.base;

public class Login extends base {
	WebDriver driver;
	LandingPage landingpage;
	LoginPage loginpage;
	MyAccountPage myaccountpage;
	
	

    @Given("^Open any Browser$")
    public void open_any_browser() throws IOException {
    	 driver = intializeDriver();
    }

    @And("^Navigate to Login page$")
    public void navigate_to_login_page() throws InterruptedException  {
    	driver.get(prop.getProperty("url"));
    	
    	 landingpage=new LandingPage(driver);
    	 landingpage.myaccountdropdown().click();
    	
    	 landingpage.LoginOPtion().click();
    	 Thread.sleep(2000);
    
    	
    	
       
    }

    @When("^User enters username as \"([^\"]*)\" and password as \"([^\"]*)\" into the fields$")
    public void user_enters_username_as_something_and_password_as_something_into_the_fields(String email, String password)  {
       
    	 loginpage=new LoginPage(driver);
    	loginpage.emailAddressField().sendKeys(email);
    	
    	loginpage.passwordField().sendKeys(password);
    	
    	
    	

    }

    @And("^User clicks on Login button$")
    public void user_clicks_on_login_button()  {
    	loginpage.LoginButton().click();
    }

    @Then("^Verify user is able to successfully login$")
    public void verify_user_is_able_to_successfully_login()  {
    	 myaccountpage=new MyAccountPage(driver);
    	Assert.assertTrue(myaccountpage.editaccountinformation().isDisplayed());
       
    }
    @After
    public void closeBrowser() {
    	driver.close();
    }

  

  

}


