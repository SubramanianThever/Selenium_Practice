package AutomationQA.AutomationDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatewithMultiSelectHandling {
	public static void Dropdownhandling(WebElement Ele, String Value) {
		Select Eledrp= new Select(Ele);
		List<WebElement> DrpAlloption = Eledrp.getOptions();	
		for(WebElement SelectedDrp : DrpAlloption) {
			if(SelectedDrp.getText().equals(Value)) {
				Eledrp.selectByVisibleText(Value);
				break;
			}
		}		
	}
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
//		WebDriverWait Mywait= new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='SelectedDate']")).click();
		WebElement Yeardrp=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Dropdownhandling(Yeardrp, "2015");
		WebElement Monthdrp=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Dropdownhandling(Monthdrp, "Aug");
		List<WebElement> Dates = driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]/tbody/tr/td/a"));
		for(WebElement Date : Dates) {
			if(Date.getText().equals("1")) {
				Date.click();
			break;
			}
		}
	}

}
