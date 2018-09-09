package com.accenture.tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo01_Action {
	WebDriver d;
@Test(enabled=false)
public void demoTest() {
	d.get("http://demowebshop.tricentis.com/");
	Actions a=new Actions(d);
	//does right click on page
	//a.contextClick().build().perform();
	d.findElement(By.linkText("Log in")).click();
	WebElement email=d.findElement(By.id("Email"));
	a.moveToElement(email).keyDown(email, Keys.SHIFT).sendKeys("myname").build().perform();
}
@Test
public void demoRobot() throws AWTException
{
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_WINDOWS);
	r.keyRelease(KeyEvent.VK_WINDOWS);
	//r.keyPress(KeyEvent.VK_CAPS_LOCK);
	//r.keyRelease(KeyEvent.VK_CAPS_LOCK);
}
@BeforeTest
public void beforeTest() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\pdc2b-training.pdc2b\\eclipse-workspace\\SeleniumAdvance\\src\\test\\resources\\chromedriver.exe");
	d=new ChromeDriver();
}
}
