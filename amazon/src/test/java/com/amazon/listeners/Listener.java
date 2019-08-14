package com.amazon.listeners;

import org.testng.IInvokedMethod;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.internal.InvokedMethod;


public class Listener implements ITestListener {

	public static String value;
	
	@Override
	public void onTestStart(ITestResult result) {
		IInvokedMethod method = new InvokedMethod(result.getTestClass(), result.getMethod(),
				System.currentTimeMillis(), result);
		value = method.getTestMethod().getXmlTest().getLocalParameters().get("platform");
		
		System.out.println(value+"=========");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	
	

}
