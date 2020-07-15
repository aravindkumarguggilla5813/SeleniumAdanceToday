package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeyStrokes_Action {
  WebDriver driver=null;	
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\aravind.g.kumar\\Desktop\\Browser Drivers\\chromedriver_win32_NewDrivers\\chromedriver.exe");
	  driver =new ChromeDriver();
	  driver.manage().window().maximize(); 
	  String url="http://demowebshop.tricentis.com/";
	  //driver.get(url); //it will store in the cookies. 
	  driver.navigate().to(url);
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//implicit wait 
	  
	  WebElement Search =driver.findElement(By.id("small-searchterms"));
	  Actions act1= new Actions(driver);
	  act1.sendKeys(Search,"computer").perform();
	  Thread.sleep(2000);
	  act1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
	    
  }
}
