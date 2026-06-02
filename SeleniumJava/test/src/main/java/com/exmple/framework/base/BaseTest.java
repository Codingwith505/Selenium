package com.exmple.framework.base;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.exmple.framework.factory.DriverFactory;
import com.exmple.framework.utils.ConfigReader;

public class BaseTest {
	
	protected WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		driver = DriverFactory.initDriver();
		driver.get(ConfigReader.get("baseUrl"));

	}
	
	@AfterMethod
	public void QuiteDriver() {
		DriverFactory.quitDriver();
	}

}
