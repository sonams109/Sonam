package com.accenture.tests;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo03_Takescreenshot {
WebDriver d;
@Test
public void demoTest() throws IOException {
	d.get("http://demowebshop.tricentis.com/");
	TakesScreenshot t=(TakesScreenshot)d;
	File f=t.getScreenshotAs(OutputType.FILE);
	Date d = new Date();
    System.out.println(d.toString());
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss"); 
	FileUtils.copyFile(f, new File("C:\\myseleniumsetup\\screenshots\\"+sdf.format(d)+".jpg"));
}
@BeforeTest
public void beforeTest() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\pdc2b-training.pdc2b\\eclipse-workspace\\SeleniumAdvance\\src\\test\\resources\\chromedriver.exe");
	d=new ChromeDriver();
}

}

