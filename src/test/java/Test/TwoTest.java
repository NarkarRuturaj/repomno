package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import resources.base;

public class TwoTest extends base {
	@Test
	public void testTwo() throws IOException, InterruptedException {
		System.out.println("Krish has updated the code");
		System.out.println("test two");
	WebDriver driver = intializeDriver();
	driver.get("http://tutorialsninja.com/demo/index.php?route=product/category&path=52");
	Thread.sleep(2000);
	driver.close();
	}

}
