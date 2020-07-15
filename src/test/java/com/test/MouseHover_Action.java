package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHover_Action {
  WebDriver driver=null;	
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\aravind.g.kumar\\Desktop\\Browser Drivers\\chromedriver_win32_NewDrivers\\chromedriver.exe");
	  driver =new ChromeDriver();
	  driver.manage().window().maximize(); 
	  String url="https://demoqa.com/menu/";
	  //driver.get(url); //it will store in the cookies. 
	  driver.navigate().to(url);
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//implicit wait 
	  Actions act1= new Actions(driver);
	  act1.moveToElement(driver.findElement(By.xpath("//*[@id=\'nav\']/li[2]/a"))).perform();
	  Thread.sleep(1000);
	  act1.moveToElement(driver.findElement(By.xpath("//*[@id=\'nav\']/li[2]/ul/li[3]/a"))).perform();
	  Thread.sleep(1000);
	  act1.moveToElement(driver.findElement(By.xpath("//*[@id=\'nav\']/li[2]/ul/li[3]/ul/li[2]/a"))).click().build().perform();
  }
}
