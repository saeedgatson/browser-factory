package com.browserfactory.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.browserfactory.BrowserFactory;
import com.opera.core.systems.OperaDriver;

public class BrowserFactoryTest {
	private WebDriver _driver;

	@BeforeMethod
	public void setUp() throws Exception {
	}

	@AfterMethod
	public void tearDown() throws Exception {
		if(_driver != null) {
			_driver.close();
			_driver.quit();
		}
	}

	@Test
	public void FirefoxCreated() {
		_driver = BrowserFactory.GetBrowser("FireFox");
		Assert.assertEquals(FirefoxDriver.class, _driver.getClass());
	}
	
	@Test
	public void ChromeCreated() {
		_driver = BrowserFactory.GetBrowser("Chrome");
		Assert.assertEquals(ChromeDriver.class, _driver.getClass());
	}
	
	@Test
	public void SafariCreated() {
		_driver = BrowserFactory.GetBrowser("Safari");
		Assert.assertEquals(SafariDriver.class, _driver.getClass());
	}
	
	@Test
	public void HtmlUnitCreated() {
		_driver = BrowserFactory.GetBrowser("HtmlUnit");
		Assert.assertEquals(HtmlUnitDriver.class, _driver.getClass());
	}
	
	@Test
	public void OperaCreated() {
		_driver = BrowserFactory.GetBrowser("Opera");
		Assert.assertEquals(OperaDriver.class, _driver.getClass());
	}
}
