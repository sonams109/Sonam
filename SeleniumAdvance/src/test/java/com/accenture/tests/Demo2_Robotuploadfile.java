package com.accenture.tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo2_Robotuploadfile {
WebDriver d;
@Test
public void f() throws AWTException, InterruptedException {
	d.get("https://www.timesjobs.com/candidate/register.html");
	d.findElement(By.name("resumeFile_basic")).click();
	Robot r=new Robot();
	setClipboarddata("C:\\Users\\pdc2b-training.pdc2b\\Desktop\\Resume");
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_V);
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
}
@BeforeTest
public void beforeTest() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\pdc2b-training.pdc2b\\eclipse-workspace\\SeleniumAdvance\\src\\test\\resources\\chromedriver.exe");
	d=new ChromeDriver();
}

public void setClipboarddata(String s)
{
StringSelection s1=new 	StringSelection(s);
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s1, null);
}

}
