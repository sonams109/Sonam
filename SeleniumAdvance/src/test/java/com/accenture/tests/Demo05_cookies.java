package com.accenture.tests;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo05_cookies {
	WebDriver d;
	@Test
	public void demoTest() throws IOException {
		d.get("http://demowebshop.tricentis.com/");
		d.manage().deleteAllCookies();
		Cookie c=new Cookie("User","Tricentis");
		d.manage().addCookie(c);
	Set<Cookie> cookiesDetails = d.manage().getCookies();
		for(Cookie s:cookiesDetails)
		{
			System.out.println(s.getExpiry());
			System.out.println(s.getName());
		}
	}
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pdc2b-training.pdc2b\\eclipse-workspace\\SeleniumAdvance\\src\\test\\resources\\chromedriver.exe");
		d=new ChromeDriver();
	}
}
