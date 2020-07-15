package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Webdriver_Demo1 {
  
	WebDriver driver=null;
	@Test
  public void f() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\aravind.g.kumar\\Desktop\\Browser Drivers\\chromedriver_win32_NewDrivers\\chromedriver.exe");
driver =new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://demowebshop.tricentis.com/");
System.out.println("title of the page"+driver.getTitle());
Assert.assertTrue("Demo Web Shop".startsWith("Demo"));
driver.findElement(By.linkText("Log in")).click();
driver.findElement(By.id("Email")).sendKeys("aravind.guggilla57@gmail.com");
driver.findElement(By.name("Password")).sendKeys("aravind");
driver.findElement(By.xpath("//input[@value='Log in']")).click();

		
		
  }
	
}
