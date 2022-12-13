package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import resources.base;

public class ThreeTest extends base {
	@Test
	public void ThreeTest() throws IOException, InterruptedException {
		System.out.println("test three");
		WebDriver driver = intializeDriver();
		driver.get("http://tutorialsninja.com/demo/index.php?route=product/category&path=52");
		Thread.sleep(2000);
		driver.close();
	}

}
