package ScreenshotProgram;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import genericLib.Base;

public class EventList implements ITestListener
{

	@Override
	public void onTestFailure(ITestResult r) 
	{
		String methodName = r.getMethod().getMethodName();
		Date d=new Date();
		String date=d.toString().replaceAll(" ", "_").replaceAll(":", "_");
		TakesScreenshot ts=(TakesScreenshot)Base.driverListener;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dst=new File("C:\\Users\\Laxmi Pujar\\workspace\\MakeMyTrip\\Screenshot\\"+methodName+date+".PNG");
		try {
			FileUtils.copyFile(src, dst);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
