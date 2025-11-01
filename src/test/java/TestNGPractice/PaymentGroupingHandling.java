package TestNGPractice;

import org.testng.annotations.Test;

public class PaymentGroupingHandling {

	@Test(priority =1, groups={"Sanity","Regression", "functional"})
	public void PaymentRupees() {
	System.out.println("Payment on Rupees");
}
	@Test(priority =2,groups={"Sanity","Regression","functional"})
	public void PaymentDollars() {
	System.out.println("Payment On Dollars");
}
}
