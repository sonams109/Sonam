package com.accenture.tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo07_DatadrivenTest {
WebDriver d;
@Test
public void datExcel() throws IOException {
	d.get("http://demowebshop.tricentis.com/");
	FileInputStream fis=new FileInputStream("C:\\myseleniumsetup\\testdata\\TestData.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet s1=wb.getSheetAt(0);
	int rowcnt=s1.getLastRowNum();
	for(int i=0;i<=rowcnt;i++)
	{
		String Username=s1.getRow(i).getCell(0).getStringCellValue();
		String password=s1.getRow(i).getCell(1).getStringCellValue();
	
		loginTest(Username,password);
		try {
			d.findElement(By.linkText("Log out")).click();
		   }
		catch(Exception e){
			
		}
	}

}

@BeforeTest
public void beforeTest() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\pdc2b-training.pdc2b\\eclipse-workspace\\SeleniumAdvance\\src\\test\\resources\\chromedriver.exe");
	d=new ChromeDriver();
}
public void loginTest(String uname,String Pwd) {
	
	d.findElement(By.linkText("Log in")).click();
	d.findElement(By.id("Email")).sendKeys(uname);
	d.findElement(By.id("Password")).sendKeys(Pwd);
	d.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();

	
}

}
