package AutomationQA.AutomationDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChromeTest {
	public static void main(String args []) {
	WebDriver driver= new ChromeDriver();
	WebDriverWait Mywait =new WebDriverWait(driver, Duration.ofSeconds(10));
	
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
//	if(driver.findElement(By.xpath("//button[@alt='Continue shopping']")).isDisplayed()) {
//	driver.findElement(By.xpath("//button[@alt='Continue shopping']")).click();
//	}
	driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
	driver.findElement(By.xpath("//input[@id='ap_email_login']")).sendKeys("9075749998");
	driver.findElement(By.xpath("//input[@aria-labelledby='continue-announce']")).click();
	WebElement password = Mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
	password.sendKeys("Subu@1991");
	WebElement Signin = Mywait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signInSubmit")));
	Signin.click();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	//driver.findElement(By.xpath("//input[@aria-labelledby='auth-signin-button-announce']")).click();
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	System.out.println(driver.getPageSource());

//	driver.close();

}}
