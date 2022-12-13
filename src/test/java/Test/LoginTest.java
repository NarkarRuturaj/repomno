package Test;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.LandingPage;
import PageObject.LoginPage;
import PageObject.MyAccountPage;
import resources.base;
public class LoginTest extends base {
	WebDriver driver;
	 Logger log;
	
	@Test(dataProvider="getLoginData")
	public void test(String email, String password, String expectedResult) throws IOException {
	 
	
	//we dont have to write webdriver driver=... simply call the constructor for that create object for Landing page
	LandingPage landingpage=new LandingPage(driver);
	landingpage.myaccountdropdown().click();
	log.debug("I click on my account drop down");
	landingpage.LoginOPtion().click();
	log.debug("I clicked on  login option");
	
	LoginPage loginpage=new LoginPage(driver);
	loginpage.emailAddressField().sendKeys(email);
	log.debug("email address got entered");
	loginpage.passwordField().sendKeys(password);
	log.debug("password got entered");
	loginpage.LoginButton().click();
	log.debug("clicked on login option");
	
	MyAccountPage myaccountpage=new MyAccountPage(driver);
	String actualResult=null;
	try {
		if(myaccountpage.editaccountinformation().isDisplayed()) {
			log.debug("user got logged in");
		actualResult="successfull";
		}
	}catch(Exception e) {
		actualResult="failure";
		log.debug("user didn't get logged");
		
	}
	Assert.assertEquals(actualResult, expectedResult);
	log.info("login test passed successfull");
	
	}
		
	@BeforeMethod
	 public void openapllication() throws IOException {
		 log = LogManager.getLogger(LoginTest.class.getName());
		 driver = intializeDriver();// in order to call intializerDriver simply call it
		 log.debug("browser got launched");;
			driver.get(prop.getProperty("url"));//
			log.debug("I navigate to ninja tutorial apllication");
			
	 }
     @AfterMethod
	 public void closure() {
		
		driver.close();
		log.debug("browser got clsoed");
		
	}
     @DataProvider
     public Object[][] getLoginData() {
    	 Object[][] data= {{"ruturaj47094709@gmail.com" ,"123456" ,"successfull"}};
     return  data;
     }

}
