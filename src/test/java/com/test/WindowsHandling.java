package com.test;

import java.net.MalformedURLException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class WindowsHandling {
  WebDriver driver =null;
	@Test
  public void f() {
	  
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\aravind.g.kumar\\Desktop\\Browser Drivers\\chromedriver_win32_NewDrivers\\chromedriver.exe");
	  driver =new ChromeDriver();
	  driver.manage().window().maximize(); 
	  String url="http://demo.guru99.com/popup.php";
	  //driver.get(url); //it will store in the cookies. 
	  driver.navigate().to(url);
	  driver.findElement(By.linkText("Click Here")).click();
	  Set<String> windows=driver.getWindowHandles();
	  Iterator<String> it=windows.iterator();
	  String parentwindow=it.next();
	  String childwindow=it.next();
	  driver.switchTo().window(childwindow);
	  
	 driver.findElement(By.name("emailid")).sendKeys("aravindmca57@gmail.com");
	 driver.findElement(By.name("btnLogin")).click();
	 System.out.println("the child window URL is "+driver.getCurrentUrl());
	 driver.close();
	 driver.switchTo().window(parentwindow);
	 System.out.println("the parent window title is"+driver.getTitle());
	  
   //driver.quit();	
	 
	 
	 @Test
	  public void f1() throws MalformedURLException {
	  DesiredCapabilities cap=new DesiredCapabilities();
	  cap.setBrowserName("chrome");
	  cap.setBrowserName("Firefox");
	  cap.setPlatform(Platform.ANY);
	  cap.setPlatform(Platform.ANY);
	  ChromeOptions cop= new ChromeOptions();
	  cop.merge(cap);
	  String huburl="http://10.218.184.36:5813/wd/hub";
	  WebDriver driver=new RemoteWebDriver( new URL(huburl),cap);
	  driver.get("http://www.google.com");
	  System.out.println("title"+driver.getTitle());	  
		  
	  
  }
}
