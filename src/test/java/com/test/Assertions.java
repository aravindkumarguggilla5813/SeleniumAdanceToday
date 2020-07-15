package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {
  @Test
  public void f() {
	 Assert.assertEquals(100, 100);
	 Assert.assertTrue(10>5);
	 Assert.assertFalse(5<10);
	 Assert.assertTrue(true);
     Assert.assertFalse(false);
     Assert.assertTrue("aravind kumar".contains("aravind kumar"));
     Assert.assertTrue("Selenium adavnce session".startsWith("Selenium"));
  
  }
  
}
