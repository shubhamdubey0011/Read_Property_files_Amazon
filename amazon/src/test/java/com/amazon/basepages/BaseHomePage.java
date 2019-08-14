package com.amazon.basepages;

import org.openqa.selenium.interactions.Actions;

import com.amazon.locators.BaseHomePageLoc;
import com.amazon.utils.BaseConfiguration;
import com.amazon.utils.Driver;

public class BaseHomePage extends BaseConfiguration implements BaseHomePageLoc {


	public void moveToSignInLabel() {
		waitforPresent(SIGN_IN_LABLE);
		Actions action = new Actions(Driver.getInstance());
		action.moveToElement(findElement(SIGN_IN_LABLE)).build().perform();
	}

	public void clickOnSignUp() {
		waitforPresent(START_HERE_LABEL);
		clickOnElement(START_HERE_LABEL);
	}
	
	
	
}
