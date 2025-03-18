package testPackage;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VerifiacationClass{
	
	@Test
	public void verify() {
		
		
//		Assert.assertEquals(true, true);
//		Assert.assertEquals("siva", "siva");
//		Assert.assertEquals(5, 5);
//		
//		Assert.assertNotEquals(5, 7);
//		
//		Assert.assertSame(25, 25);
//		Assert.assertNotSame(true, false);
//		
//		Assert.assertTrue(true);
//		
//		Assert.assertFalse(false);
//		
//		Assert.assertNull(null);
//		
//		Assert.assertNotNull("siva");
//		
//		SoftAssert sa = new SoftAssert();
//		
//		System.out.println("1st line executed");
//		sa.assertEquals(3, 3);
//		
//		
//		
//		System.out.println("2nd line executed");
//		sa.assertNotEquals("hii", "hello");
//		
//		System.out.println("3rd line executed");
//		sa.assertSame(78, 89);
//		
//		System.out.println("4th line executed");
//		sa.assertNotSame("apple", "orange");
//		
//		
//		sa.assertAll();
//		
		
		
		SoftAssert sa = new SoftAssert();
		
		System.out.println("1st line executed");
		sa.assertEquals(true, true);
		
		System.out.println("2nd line executed");
		sa.assertNotEquals(56, 65);
		
		
		System.out.println("3rd line executed");
		sa.assertSame("hii","hii");
		sa.assertAll();
		
		
	}

}
