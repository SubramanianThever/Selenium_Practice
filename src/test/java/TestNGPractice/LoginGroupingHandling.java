package TestNGPractice;

import org.testng.annotations.Test;

public class LoginGroupingHandling {
	@Test(priority =1, groups={"Sanity"})
	  public void facebooklogin() {
		System.out.println("Login on Facebook");
	}
	@Test(priority =2,groups={"Sanity"})
	  public void Instalogin() {
		System.out.println("Login on Insta");
	}
	@Test(priority =3,groups={"Sanity"})
	  public void Emaillogin() {
		System.out.println("Login on Email");
	}

}
