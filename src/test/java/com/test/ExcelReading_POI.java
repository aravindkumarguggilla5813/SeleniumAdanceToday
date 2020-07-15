package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExcelReading_POI {
  @Test
  public void f() throws IOException, InterruptedException {
	  
	  File src=new File("C:\\Users\\aravind.g.kumar\\Desktop\\SampleData.xlsx");
	  FileInputStream fis=new FileInputStream(src);
	  XSSFWorkbook WB=new XSSFWorkbook(fis);
	  XSSFSheet SH=WB.getSheetAt(0);
	  System.out.println("First row number"+SH.getFirstRowNum());
	  System.out.println("LAst row number"+SH.getLastRowNum());
	  int rowcount=SH.getLastRowNum()-SH.getFirstRowNum()+1;
	  int noofcolumns=SH.getRow(0).getPhysicalNumberOfCells();
	  System.out.println("the row count is"+rowcount);
	  System.out.println("the column count is"+noofcolumns);
	  
	//System.out.println(SH.getRow(0).getCell(0).getStringCellValue()+"\t\t\t"+SH.getRow(0).getCell(1).getStringCellValue());
	//System.out.println(SH.getRow(1).getCell(0).getStringCellValue()+"\t\t\t"+SH.getRow(1).getCell(1).getStringCellValue());
	//System.out.println(SH.getRow(1).getCell(1).getStringCellValue()+"\t\t\t"+SH.getRow(2).getCell(1).getStringCellValue());
	  for(int i=1;i<rowcount;i++) {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\aravind.g.kumar\\Desktop\\Browser Drivers\\chromedriver_win32_NewDrivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			String url="http://demowebshop.tricentis.com/";
			driver.get(url);
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Log in")).click();
			driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(SH.getRow(i).getCell(0).getStringCellValue());
		    driver.findElement(By.xpath("//input[@name='Password']")).sendKeys(SH.getRow(i).getCell(1).getStringCellValue());
		    driver.findElement(By.xpath("//input[@value='Log in']")).click();
		    driver.findElement(By.linkText("Log out")).click();
		    
		    Assert.assertTrue(driver.getTitle().startsWith("Demo"));
	  
		    //writing back to excel
		    
		    XSSFRow header = SH.getRow(0);
		    XSSFCell header2=header.createCell(2);
		    header2.setCellValue("Status");
		    SH.getRow(1).createCell(2).setCellValue("PASS");
		    SH.getRow(2).createCell(2).setCellValue("Fail");
		   // SH.getRow(3).createCell(2).setCellValue("PASS");
		    FileOutputStream fos=new FileOutputStream(src);
		    WB.write(fos);
		    driver.close();
		}  
  }
  }

