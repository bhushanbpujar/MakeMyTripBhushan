package genericLib;

import java.io.File;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.IAttributes;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Base {
	public FileLib flib=new FileLib();
	public String excelPath="F:\\TYjava\\AmazonFrameWork\\testData\\Amazon_TestData.xlsx";
	public String path="C:\\Users\\Laxmi Pujar\\workspace\\MakeMyTrip\\testData\\commonData.properties";
	public WebDriver driver=null;
	public static WebDriver driverListener=null;
	ITestContext context;
	@BeforeClass()
	public void configBT()
	{
		if(flib.getPropertyKeyValue(path, "browser").equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(flib.getPropertyKeyValue(path, "browser").equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		driverListener=driver;
	}
	@BeforeMethod()
	public void configBM()
	{
		Reporter.log("Opened the Browser",true);
		/*Maximize the browser*/
		driver.manage().window().maximize();
		Reporter.log("Maximized the Browser",true);
		// Step 1 : Launch the Application
		driver.get(flib.getPropertyKeyValue(path, "url"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@AfterTest
	public void configAT()
	{
		Reporter.log("close the Browser",true);
		/*Close the Browser*/
		driver.quit();
		Reporter.log("closed the Browser",true);
	}
}