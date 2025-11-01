package TestNGPractice;

import org.testng.annotations.Test;

public class SignupGroupingHandling {
	
	@Test(priority =1, groups={"Regression"})
	public void facebooklogin() {
	System.out.println("Signup on Facebook");
}
	@Test(priority =2,groups={"Regression"})
	public void Instalogin() {
	System.out.println("Signup on Insta");
}
	@Test(priority =3,groups={"Regression"})
	public void Emaillogin() {
	System.out.println("Signup on Email");
}




}
