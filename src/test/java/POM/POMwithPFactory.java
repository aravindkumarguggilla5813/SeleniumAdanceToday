package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class POMwithPFactory {
	
WebDriver driver;
@FindBy(how=How.LINK_TEXT,using="Log in") WebElement login;
@FindBy(how=How.ID,using="Email") WebElement username;
@FindBy(how=How.NAME,using="Password") WebElement password;
@FindBy(how=How.XPATH,using="//input[@value='Log in']")WebElement Lbutton;
@FindBy(how=How.LINK_TEXT,using="Log out") WebElement lout;

public POMwithPFactory(WebDriver driver) {
	this.driver=driver;
}

public void loginmethod(String uid,String pwd)
{
	login.click();
	username.sendKeys(uid);
	password.sendKeys(pwd);
	Lbutton.click();
	lout.click();
}

	

}
