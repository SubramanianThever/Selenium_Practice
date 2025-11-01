package AutomationQA.AutomationDemo;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		//alert only for accept
		
//		driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]")).click();
//		Thread.sleep(5000);
		//1) direct way to accept
//		driver.switchTo().alert().getText();
//		driver.switchTo().alert().accept();
		//2)if need to perform sum action on alert
//		Alert Myalert=driver.switchTo().alert();
//		System.out.println(Myalert.getText());
//		Myalert.accept();
		
		//Alert Confirm and Dismiss
		
//		driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]")).click();
//		Alert MyAlert = driver.switchTo().alert();
//		System.out.print(MyAlert.getText());
//		Thread.sleep(5000);
//		MyAlert.accept();
//		MyAlert.dismiss();
		
		// Alert for user input 
		
		driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]")).click();
		Alert MyAlert = driver.switchTo().alert();
	//	System.out.print(MyAlert.getText());
		Thread.sleep(5000);
		MyAlert.sendKeys("My Name Is Subramanian Thever");
		Thread.sleep(5000);
		MyAlert.accept();
	}
}
