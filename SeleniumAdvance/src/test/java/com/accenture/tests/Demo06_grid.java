package com.accenture.tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Demo06_grid {
	WebDriver d;
	@Test
	public void f() {
		
	}

	@BeforeTest
	public void setup() throws MalformedURLException {
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setBrowserName("Chrome");
		dc.setPlatform(Platform.WINDOWS);
		RemoteWebDriver d=new RemoteWebDriver(new URL("http://10.243.204.91:4343"),dc);
		
	}
}
