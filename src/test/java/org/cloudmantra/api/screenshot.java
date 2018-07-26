package org.cloudmantra.api;
import java.io.File;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.*;
import java.io.IOException;

import org.apache.maven.surefire.shade.org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
//import org.testng.ITestListener;
import org.testng.ITestResult;

public class screenshot implements ITestListener {
	String filepath="C:\\Users\\Administrator\\Pictures\\selenium screenshots\\";

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("***** Error "+result.getName()+" test has failed *****");
    	String methodName=result.getName().toString().trim();
    	takeScreenShot(methodName);
		// TODO Auto-generated method stub
		
	}
	public void takeScreenShot(String methodName) {
    	//get the driver
		WebDriver driver;
    	driver=new FirefoxDriver();
    	
    	 File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         //The below method will save the screen shot in d drive with test method name 
            try {
				FileUtils.copyFile(scrFile, new File(filepath+methodName+".png"));
				System.out.println("***Placed screen shot in "+filepath+" ***");
			} catch (IOException e) {
				e.printStackTrace();}
			}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
