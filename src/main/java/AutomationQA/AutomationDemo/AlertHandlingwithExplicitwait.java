package AutomationQA.AutomationDemo;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertHandlingwithExplicitwait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		WebDriverWait Mywait = new WebDriverWait(driver, Duration.ofSeconds(10));//Explicity Wait
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]")).click();
		Alert Myalert=Mywait.until(ExpectedConditions.alertIsPresent());
		Thread.sleep(5000);
		System.out.println(Myalert.getText());
		Myalert.accept();
	}

}
