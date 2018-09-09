package com.accenture.tests;


import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo04_Javascript {
	WebDriver d;
	@Test
	public void demoTest() throws IOException {
		d.get("http://demowebshop.tricentis.com/");
		d.manage().window().maximize();
		JavascriptExecutor j=(JavascriptExecutor) d;
		j.executeScript("window.scroll(0,800)");
		j.executeScript("alert('Hi')");
		d.switchTo().alert().accept();
	}
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pdc2b-training.pdc2b\\eclipse-workspace\\SeleniumAdvance\\src\\test\\resources\\chromedriver.exe");
		d=new ChromeDriver();
	}
}
