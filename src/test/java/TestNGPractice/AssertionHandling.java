package TestNGPractice;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class AssertionHandling { 
	  @Test
	  public void Test() {
		  String ExpResult = "Open the Book";
		  String ActResult = "Close the Book";
		  
		  if(ExpResult.equals(ActResult)){
			  System.out.println("Test Cases Passed");
			  Assert.assertTrue(true);	  
			  }
		  else {
			  System.out.println("Test Cases Failed");
			  Assert.assertTrue(false);
		  }
		//  Assert.assertEquals(ExpResult, ActResult);
	  }

}
