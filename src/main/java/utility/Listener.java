package utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import base.ProjectSpecification;

public class Listener extends ProjectSpecification implements ITestListener {

	ExtentTest test;
	ExtentReports extents = ExtentReportDemoWeb.getReport();
	
	@Override
	public void onTestStart(ITestResult result) {
		
		test = extents.createTest(result.getMethod().getMethodName());
		System.out.println("Test started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test passed");
		System.out.println("Test sucess");
	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.fail(result.getThrowable());
		System.out.println("Test failed");
		
		String filepath = null;
		
		try {
			
			filepath = getScreenShot(result.getMethod().getMethodName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test.addScreenCaptureFromPath(filepath, result.getMethod().getMethodName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test skipped");
	}


	@Override
	public void onFinish(ITestContext context) {
		extents.flush();
	}

	
	
}
