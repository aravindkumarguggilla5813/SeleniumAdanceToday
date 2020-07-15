package com.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Demo1_TestNG {
  @Test
  public void f1() {
	  System.out.println("this is Test Annotation");
  }
  
  @Test
  public void f2() {
	  System.out.println("this is Test Annotation");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("this is BeforeMethod Annotation");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("this is AfterMethod Annotation");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("this is BeforeClass Annotation");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("this is AfterClass  Annotation");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("this is BeforeTest Annotation");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("this is After Test Annotation");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("this is BeforeSuite Annotation");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("this is AfterSuite Annotation");
  }

}
