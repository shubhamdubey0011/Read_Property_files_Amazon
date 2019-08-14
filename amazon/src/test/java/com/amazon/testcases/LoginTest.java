package com.amazon.testcases;

import org.testng.ITestContext;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.amazon.basepages.BaseHomePage;
import com.amazon.listeners.Listener;
import com.amazon.utils.BaseConfiguration;
import com.amazon.utils.ReadPropertiesFile;

public class LoginTest extends BaseConfiguration{

	@BeforeClass
	public void readConfig(ITestContext context) {
		System.out.println("before class");
		ReadPropertiesFile.fileReader();
		//System.out.println( context.getCurrentXmlTest().getAllParameters()+"aaaaaaaa");
	}

	@BeforeTest
	public void getParameters(ITestContext context) {
		//String value1 = context.getCurrentXmlTest();
//	    String value1 = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("platform");
		//System.out.println("before test: "+context.getCurrentXmlTest());
//		System.out.println( context.getCurrentXmlTest().getName()+"aaaaaaaa");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before method");
		openAmazon();
	}
	
	@Test(enabled = true, priority = 1)
	public void testUserIsSignedUp() {
		System.out.println("=====1=======");
		
		BaseHomePage homePage = new BaseHomePage();
//		BaseSignUpPage signUp =  new BaseSignUpPage();
//		
		homePage.moveToSignInLabel();
		homePage.clickOnSignUp();
//		signUp.filldata();

	}

	@Test(enabled = false)
	public void testUserIsAbleToAddProduct() {
		System.out.println("=====2=======");

//		BaseHomePage homePage = new BaseHomePage();
//		BaseSignUpPage signUp =  new BaseSignUpPage();
//		
//		homePage.moveToSignInLabel();
//		homePage.clickOnSignUp();
//		signUp.filldata();
		
	}
}
