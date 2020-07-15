package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POMwithOutPFactory {
WebDriver driver=null;
By lnc =By.linkText("Log in");
By uname=By.name("Email");
By pwd=By.name("Password");
By lbtn=By.xpath("//input[@value='Log in']");
By lout=By.linkText("Log out");

public POMwithOutPFactory(WebDriver driver) {
	this.driver=driver;	
}

public void click_lnc() {
	driver.findElement(lnc).click();
}
public void enter_uname() {
	driver.findElement(uname).sendKeys("aravind.guggilla57@gmail.com");
}
public void enter_pwd() {
	driver.findElement(pwd).sendKeys("aravind");
}
public void click_lbtn() {
	driver.findElement(lbtn).click();	
}
public void click_lout() {
	driver.findElement(lout).click();
}

	
	

}
