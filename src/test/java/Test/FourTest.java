package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import resources.base;

public class FourTest extends base {
public	WebDriver driver;
	@Test
	public void Fourtest() throws IOException, InterruptedException {
		System.out.println("karan has updated this cod with statements");
		System.out.println("test four ");
	 driver = intializeDriver();
	driver.get("http://tutorialsninja.com/demo/index.php?route=product/category&path=52");
	Thread.sleep(2000);
	Assert.assertTrue(false);
	
	}
	@AfterMethod
	public void closure() {
		driver.close();
	}

}
