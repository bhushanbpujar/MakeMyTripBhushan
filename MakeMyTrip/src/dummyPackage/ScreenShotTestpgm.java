package dummyPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(dummyPackage.ScreenshotTest.class)

public class ScreenShotTestpgm 
{
	@Test
	public void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();		
		Thread.sleep(3000);
		driver.get("flipkart.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		Assert.assertTrue(false);
	}
}
