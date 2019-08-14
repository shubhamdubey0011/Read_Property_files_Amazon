package com.amazon.basepages;

import com.amazon.locators.BaseSignUpPageLoc;
import com.amazon.utils.BaseConfiguration;

public class BaseSignUpPage extends BaseConfiguration implements BaseSignUpPageLoc {
	
	public void filldata() {
		waitforPresent(SIGN_UP_NAME);
		findElement(SIGN_UP_NAME).sendKeys("Mayank");
		findElement(SIGN_UP_PHONE_NUMBER).sendKeys("9999999999");
		findElement(SIGN_UP_EMAIL).sendKeys("wfewe@sef.com");
	}
	
	

}
