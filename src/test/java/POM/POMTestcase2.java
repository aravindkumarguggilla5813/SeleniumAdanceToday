package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class POMTestcase2 {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\aravind.g.kumar\\Desktop\\Browser Drivers\\chromedriver_win32_NewDrivers\\chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		 driver.get("http://demowebshop.tricentis.com/");
		 driver.manage().window().maximize();
		 POMwithPFactory locate=PageFactory.initElements(driver, POMwithPFactory.class);
         locate.loginmethod("aravind.guggilla57@gmail.com", "aravind");
         ExtentHtmlReporter report= new ExtentHtmlReporter("C:\\Users\\aravind.g.kumar\\Desktop\\ExtentReport.html");
         ExtentReports extent=new ExtentReports();
         extent.attachReporter(report);
         ExtentTest logger=extent.createTest("LoginReport");
         logger.log(Status.INFO, "this is extent report generation");
         logger.log(Status.PASS, "This testcase is pass");
         extent.flush();
         
         ExtentTest logger2=extent.createTest("UserRegistration");
         logger2.log(Status.ERROR, "there is some error");
         logger2.log(Status.FATAL, "this is some fatal error");
         logger2.log(Status.SKIP,MarkupHelper.createLabel("This is SKIP", ExtentColor.INDIGO));
         logger.log(Status.PASS, MarkupHelper.createLabel("This is PASS ", ExtentColor.ORANGE));
         
         
         extent.flush();
         
         
				 
  }
}
