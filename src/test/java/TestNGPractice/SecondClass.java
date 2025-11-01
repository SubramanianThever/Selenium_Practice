package TestNGPractice;

import org.testng.annotations.Test;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

public class SecondClass {
	  @AfterTest
	  public void aftertest() {
		  System.out.println("I am AfterTest");

	  }
	 
  @Test
  public void Test() {
	  System.out.println("I am Second Class");
  }
	@AfterSuite
	public void aftersuit(){
		System.out.println("I am After suit");
		}	



}
