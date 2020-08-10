package dummyPackage;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestProgram1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.goibibo.com");
		String parentWindow=driver.getWindowHandle();
		System.out.println(parentWindow);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait= new WebDriverWait(driver, 100);
		String city = "Goa";
		driver.findElement(By.xpath("//span[text()='Hotels']/preceding-sibling::i[contains(@class,'hotels')]")).click();
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@role='combobox']//input"))));
		driver.findElement(By.xpath("//div[@role='combobox']//input")).sendKeys(city);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[text()='"+city+"']"))));
		driver.findElement(By.xpath("//span[text()='"+city+"']")).click();
		driver.findElement(By.xpath("//div[text()='Check-in']")).click();
		int count1=1;
		while (count1>=1) 
		{
			try 
			{
				count1--;
				driver.findElement(By.xpath("//p[text()='February 2021']/../../following-sibling::div//span[text()='23']")).click();
			} catch (Exception e) 
			{
				count1++;
				driver.findElement(By.xpath("//div[contains(@class,'onthChangeRightArrow')]")).click();
			}
		}
		int count2=1;
		while (count2>=1) 
		{
			try 
			{
				count2--;
				driver.findElement(By.xpath("//p[text()='March 2021']/../../following-sibling::div//span[text()='1']")).click();
			} catch (Exception e) 
			{
				count2++;
				driver.findElement(By.xpath("//div[contains(@class,'onthChangeRightArrow')]")).click();
			}
		}
		driver.findElement(By.xpath("//button[text()='Search Hotels']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//h4[text()='GINGER Goa Panjim']"))));
		driver.findElement(By.xpath("//h4[text()='GINGER Goa Panjim']")).click();
		Set<String> sessions=driver.getWindowHandles();
		Iterator<String> sessionIds = sessions.iterator();
		if (sessionIds.hasNext()) 
		{
			String pid = sessionIds.next();
			String cid = sessionIds.next();
			driver.switchTo().window(pid);
			Thread.sleep(2000);
			driver.switchTo().window(cid);
		}
	}
}
