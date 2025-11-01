package AutomationQA.AutomationDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxhandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		List<WebElement> Checkboxes =driver.findElements(By.xpath("//input[@class=\"form-check-input\" and @type=\"checkbox\"]"));
		//1) traditional way to select all the checkbooks
//		for(int i=0;i<Checkboxes.size();i++) {
//		Checkboxes.get(i).click();
//		}
		//2) Selecting all checkboxes
//		for(WebElement Checkbox : Checkboxes) {
//		Checkbox.click();
//		}
		//3) Selecting last 3 checkbox 7-3=4
//		for(int i=4;i<Checkboxes.size();i++) {
//		Checkboxes.get(i).click();
//		}
		//4) Selecting first 3 checkbox 7-3=4
		for(int i=0;i<3;i++) {
		Checkboxes.get(i).click();
		}
		Thread.sleep(5000);
		for(int i=0;i<Checkboxes.size();i++) {
			if(Checkboxes.get(i).isSelected()) {
		Checkboxes.get(i).click();
			}
		}
	}

}
