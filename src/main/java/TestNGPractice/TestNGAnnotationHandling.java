package TestNGPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotationHandling {

	@AfterSuite
	public void aftersuit(){
		System.out.println("I am After suit");
		}
	
	@BeforeClass
	public void BeforeClass(){
		System.out.println("I am Before Class");
		}

	@BeforeMethod
	public void beforemethod(){
		System.out.println("I am Before Method");
		}

	@BeforeTest
	public void beforetest(){
		System.out.println("I am Before Test");
		}

	@Test(priority = 1)
	public void actuatTest1(){
		System.out.println("I am first Test");
		}

	@BeforeSuite
	public void beforesuit(){
		System.out.println("I am Before suit");
		}

	@AfterTest
	public void aftertest(){
		System.out.println("I am After Test");
		}

	@AfterMethod
	public void aftermethod(){
		System.out.println("I am After Method");
		}

	@AfterClass
	public void afterclass(){
		System.out.println("I am After class");
		}

	@Test(priority = 2)
	public void actualtest2(){
		System.out.println("I am Second Test");
		}

}
