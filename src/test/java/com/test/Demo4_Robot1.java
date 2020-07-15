package com.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo4_Robot1 {
  @Test
  public void f() throws AWTException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\aravind.g.kumar\\Desktop\\Browser Drivers\\chromedriver_win32_NewDrivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
Robot rob=new Robot();
driver.get("http://www.inviul.com/blog/");
driver.manage().window().maximize();
driver.findElement(By.id("s")).sendKeys("WebDriver");
	rob.keyPress(KeyEvent.VK_ENTER);
	rob.keyRelease(KeyEvent.VK_ENTER);
	rob.setAutoDelay(5000);
	//driver.close();
	
	//AutoIT
	//Sikuli
	  
  }
}
