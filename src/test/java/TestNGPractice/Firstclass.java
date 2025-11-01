package TestNGPractice;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Firstclass {

	@Test
	public void Test(){
		System.out.println("I am firstClass");
		}
	
	  @BeforeTest
	  public void beforetest() {
		  System.out.println("I am Before Test");
	}
	  
	@BeforeSuite
	public void aftersuit(){
		System.out.println("I am Before suit");
		}	

}
