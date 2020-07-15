package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo6_ExcelReading_1 {
  @Test
  public void f() throws IOException {
 File src= new File("C:\\Users\\aravind.g.kumar\\Desktop\\testdata.xlsx");
 FileInputStream fis= new FileInputStream(src);
 XSSFWorkbook WB=new XSSFWorkbook(fis);
 XSSFSheet sh=WB.getSheetAt(0);
 System.out.println("first row number"+sh.getFirstRowNum());
 System.out.println("last row number"+sh.getLastRowNum());
 int rowcount=sh.getLastRowNum()-sh.getFirstRowNum();
 System.out.println("row count is"+rowcount);
 for(int i=1;i<=rowcount;i++) {
System.out.println(sh.getRow(i).getCell(0).getStringCellValue() +"\t\t\t"+sh.getRow(i).getCell(1).getStringCellValue());
System.setProperty("webdriver.chrome.driver", "C:\\Users\\aravind.g.kumar\\Desktop\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://demowebshop.tricentis.com/");
driver.findElement(By.linkText("Log in")).click();
driver.findElement(By.id("Email")).sendKeys(sh.getRow(i).getCell(0).getStringCellValue());
driver.findElement(By.id("Password")).sendKeys(sh.getRow(i).getCell(1).getStringCellValue());
driver.findElement(By.xpath("//input[@value='Log in']")).click();
System.out.println("title of the page is "+driver.getTitle());
driver.close();
 
 
 }
 
 
 
 
 
 
 
 
 
 
	  
  }
}
