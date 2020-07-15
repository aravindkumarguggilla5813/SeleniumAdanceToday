package com.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo5_Fileuploading {
  @Test
  public void f() throws AWTException {

 System.setProperty("webdriver.chrome.driver", "C:\\Users\\aravind.g.kumar\\Desktop\\Browser Drivers\\chromedriver_win32_NewDrivers\\chromedriver.exe");
 WebDriver driver=new ChromeDriver();
 Robot rob = new Robot();
driver.get("https://www.monsterindia.com/seeker/registration?");
driver.manage().window().maximize();
driver.findElement(By.xpath("//*[@id=\"registerThemeDefault\"]/div/div[3]/div/div/div/form/div[4]/div[2]/div[1]/div/label/i")).click();//choose file
StringSelection ss=new StringSelection("C:\\Users\\aravind.g.kumar\\Desktop\\demorequirements.doc");
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
rob.setAutoDelay(5000);
rob.keyPress(KeyEvent.VK_CONTROL);
rob.keyPress(KeyEvent.VK_V);
rob.keyRelease(KeyEvent.VK_CONTROL);
rob.keyRelease(KeyEvent.VK_V);
rob.keyPress(KeyEvent.VK_ENTER);
rob.keyRelease(KeyEvent.VK_ENTER);












	  
  }
}
