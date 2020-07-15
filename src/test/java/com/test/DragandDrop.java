package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragandDrop {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\aravind.g.kumar\\Desktop\\Browser Drivers\\chromedriver_win32_NewDrivers\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();	  
	  driver.get("https://demos.telerik.com/aspnet-ajax/treeview/examples/overview/defaultcs.aspx");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	  
      WebElement from=driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceholder1_RadTreeView1\"]/ul/li/ul/li[3]/ul/li[1]/div/div/span")) ;
      WebElement to= driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceholder1_priceChecker\"]/div[1]"));
      Thread.sleep(2000);
      Actions act1=new Actions(driver);
      //act1.sendKeys(Keys.PAGE_DOWN).perform();//Scroll Down
      //act1.sendKeys(Keys.PAGE_UP).perform(); //Scroll up
      act1.dragAndDrop(from, to).perform();
      Thread.sleep(5000);
      String price =driver.findElement(By.id("ctl00_ContentPlaceholder1_Label1")).getText();
      Thread.sleep(30000);
      System.out.println("the total amount is"+price);
      driver.close();
      
      
      
      
      
      
      
	  
  }
}
