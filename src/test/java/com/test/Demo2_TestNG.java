package com.test;

import org.testng.annotations.Test;

public class Demo2_TestNG {
  @Test(priority =1)
  public void Login() {
	  System.out.println("this is Login Method");
  }
  @Test(priority =1)
  public void B() {
	  System.out.println("this is Register Method");
  }
  @Test(priority = 2,enabled = true)
  public void SignOut() {
	  System.out.println("this is SignOut Method");
}
}