package com.amazon.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

	private static WebDriver Instance = null;

	private Driver() {
		System.setProperty("webdriver.chrome.driver", "./Resources//Drivers//chromedriver.exe");
		Instance = new ChromeDriver();
	}

	public static WebDriver getInstance() {
		if (Instance == null)
			new Driver();
		return Instance;
	}

	public static void closeDriver() {
		System.out.println("closing browser");
		getInstance().close();
		Instance = null;
	}

	public static void quitDriver() {
		System.out.println("Quiting browser");
		getInstance().quit();
		Instance = null;
	}

}