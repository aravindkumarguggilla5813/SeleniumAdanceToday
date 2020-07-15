package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class POMTestcase {
  @Test
  public void f() {
	  
	  
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\aravind.g.kumar\\Desktop\\Browser Drivers\\chromedriver_win32_NewDrivers\\chromedriver.exe");
	 WebDriver driver =new ChromeDriver();
	 driver.get("http://demowebshop.tricentis.com/");
	 driver.manage().window().maximize();
	 POMwithOutPFactory Pobject= new POMwithOutPFactory(driver);
	 Pobject.click_lnc();
	 Pobject.enter_uname();
	 Pobject.enter_pwd();
	 Pobject.click_lbtn();
	 Pobject.click_lout();
	 System.out.println("title is "+driver.getTitle());
	  
  }
}
