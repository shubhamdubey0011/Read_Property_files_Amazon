package com.amazon.utils;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseConfiguration {

	private static final String baseURL = "https://www.amazon.in";

	public static String getBaseURL() {
		return baseURL;
	}

	public void openAmazon() {
		Driver.getInstance().get(getBaseURL());
		Driver.getInstance().manage().window().maximize();
	}

	public void waitforPresent(String element) {
		WebDriverWait wait = new WebDriverWait(Driver.getInstance(), 20);
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(LocatorUtil.getBy(element)));
		} catch (Exception e) {
			if (!LocatorUtil.secondPart.equals(null)) {
				System.setProperty("secondLocator", LocatorUtil.secondPart);
				wait.until(ExpectedConditions.visibilityOfElementLocated(LocatorUtil.getBy("secondLocator")));
			}
		}
	}

	public WebElement findElement(String locator) {
		try {
			return Driver.getInstance().findElement(LocatorUtil.getBy(locator));
		} catch (Exception e) {
			if (!LocatorUtil.secondPart.equals(null)) {
				System.setProperty("secondLocator", LocatorUtil.secondPart);
				return Driver.getInstance().findElement(LocatorUtil.getBy("secondLocator"));
			}
		}
		return null;
	}

	public List<WebElement> findElements(String locator) {
		return Driver.getInstance().findElements(LocatorUtil.getBy(locator));
	}

	public void clickOnElement(String locator) {
		findElement(locator).click();
	}

	public void sendValue(String locator, String value) {
		findElement(locator).sendKeys(value);
	}

}
