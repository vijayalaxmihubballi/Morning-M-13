package Beauty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LauncingLakme_Test {

	
	@Test
	public void Lakme()
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.lakmeindia.com/");
		driver.quit();
	}
}
