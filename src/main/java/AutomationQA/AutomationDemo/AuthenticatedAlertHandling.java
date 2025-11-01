package AutomationQA.AutomationDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticatedAlertHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
//		https://username:password@the-internet.herokuapp.com/basic_auth  // To skip the authentication
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
//		driver.get("https://the-internet.herokuapp.com/basic_auth");
	
	}

}
