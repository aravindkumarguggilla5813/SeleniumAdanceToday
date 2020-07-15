package com.test;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo3_popupscenario {
  @Test
  public void popup() throws InterruptedException, IOException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\aravind.g.kumar\\Desktop\\Browser Drivers\\chromedriver_win32_NewDrivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();    
	  driver.get("http://demo.guru99.com/test/delete_customer.php");
	  Thread.sleep(2000);
	 driver.findElement(By.name("cusid")).sendKeys("12345");
	  driver.findElement(By.name("submit")).click();
	  Alert alt=driver.switchTo().alert();
	  System.out.println("alert text is "+alt.getText());
	  Assert.assertTrue(alt.getText().contains("Do you really want to delete this Customer?"));
	  alt.accept();//it will click on OK button
	 // alt.dismiss();//it will click on Cancel Button
	 
	  Thread.sleep(5000);
	  Alert alt1=driver.switchTo().alert();
	  System.out.println("alert text is "+alt1.getText());
	  alt1.accept();
	  driver.close();
	  
  }
}
