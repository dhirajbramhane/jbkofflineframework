package com.listerner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.base.TestBase;


public class TestListener implements ITestListener {

	public void onFinish(ITestContext result) {
		TestBase.log.info("suite is ready start with excution " + result.getName());
		
	}

	public void onStart(ITestContext result) {
		TestBase.log.info("suite is  with excution " + result.getName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		TestBase.log.info("test caase failed with excution " + result.getName());
	    TestBase.getScreenShot(TestBase.driver, result.getName());	
	}

	public void onTestSkipped(ITestResult result) {
		TestBase.log.info("test case skipped with execution "+result.getName());
		
	}

	public void onTestStart(ITestResult result) {
		TestBase.log.info("test case started with excution " + result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		TestBase.log.info("test case passed with execution "+result.getName());
		
	}

}
