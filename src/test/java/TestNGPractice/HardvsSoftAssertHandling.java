package TestNGPractice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import junit.framework.Assert;

public class HardvsSoftAssertHandling {
//	 @Test
//	  public void HardAssert() {
//		  
//		 System.out.println("Before Assert");
//		 System.out.println("Before Assert"); 
//		 Assert.assertTrue(1==2);
//		 System.out.println("After Assert"); 
//		 System.out.println("After Assert"); 
//
//		 }
	 @Test
	  public void SoftAssert() {
		  
		 System.out.println("Before Assert");
		 System.out.println("Before Assert"); 
		 
		 SoftAssert sa= new SoftAssert(); 
		 sa.assertTrue(1==2);
		 
		 System.out.println("After Assert"); 
		 System.out.println("After Assert"); 
		 sa.assertAll(); // Mandatory
		 }

}
