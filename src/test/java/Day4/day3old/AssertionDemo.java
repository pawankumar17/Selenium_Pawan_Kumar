package day3old;
/*
 * soft Assertion and hard Assertion 2 types
 * 
 */

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {
	@Test
	public void test4(){
		Assert.assertEquals(12, 13);
	}
	@Test(dependsOnMethods = "test4")
	public void test3(){
		String msg="Email Already Registered";
		Assert.assertTrue(msg.contains("Registered"));
	}
}
