package testScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericLib.Base;
import pOMFile.HomePage;
@Listeners(ScreenshotProgram.EventList.class)
public class BookingFlight extends Base
{
	@Test
	public void bookingFlightTest() throws InterruptedException
	{
		HomePage homepage=PageFactory.initElements(driver, HomePage.class);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,20);
		Thread.sleep(6000);
		homepage.getFrom().click();
		homepage.getFrom().sendKeys("Bengaluru");
		homepage.getBengaluru().click();
		homepage.getTo().click();
		homepage.getTo().sendKeys("Mumbai");
		homepage.getMumbai().click();
		homepage.getRoundTrip().click();
		wait.until(ExpectedConditions.elementToBeClickable(homepage.getDeparture()));
		homepage.getDeparture().click();
		int count1=0;
		for (int i = 0; i <= count1; i++) 
		{
			try {
				homepage.getFromDate().click();
			} catch (Exception e) {
				homepage.getNextMonthArrow().click();
				count1++;
			}
		}
		int count2=0;
		for (int i = 0; i <= count2; i++) 
		{
			try {
				homepage.getToDate().click();
			} catch (Exception e) {
				homepage.getNextMonthArrow().click();
				count2++;
			}
		}
		homepage.getSearch().click();
		System.out.println(driver);
		wait.until(ExpectedConditions.elementToBeClickable(homepage.getAirlinesFilter()));
		homepage.getAirlinesFilter().click();
		homepage.getSpicejet().click();
		homepage.getApplyFilters().click();
		homepage.getSort().click();
	}
}
