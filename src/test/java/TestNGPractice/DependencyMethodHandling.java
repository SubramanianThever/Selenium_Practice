package TestNGPractice;

import org.testng.Assert;
import org.testng.annotations.Test;



public class DependencyMethodHandling {
	@Test(priority =1)
	  public void OpenApp() {
		System.out.println("Opening Browser");
		Assert.assertTrue(true);
	}
	@Test(priority =2, dependsOnMethods= {"OpenApp"})
	  public void Login() {
		System.out.println("Login Application");
		Assert.assertTrue(true);
	}
	@Test(priority =3, dependsOnMethods= {"OpenApp","Login"})
	  public void Search() {
		System.out.println("Searching Item");
		Assert.assertTrue(true);
	}
	@Test(priority =4, dependsOnMethods= {"OpenApp","Login"})
	  public void AdvanceSearch() {
		System.out.println("Advance Searching Item");
		Assert.assertTrue(false);
	}
	@Test(priority =5, dependsOnMethods= {"AdvanceSearch"})
	  public void Click() {
		System.out.println("Clicking on Item");
		Assert.assertTrue(true);
	}
	@Test(priority =6, dependsOnMethods= {"Login"})
	  public void LogOff() {
		System.out.println("Login Off Application");
		Assert.assertTrue(true);
	}
}
