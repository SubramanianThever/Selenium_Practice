package AutomationQA.AutomationDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DatePickerHandling {
	public static void PastdateSelect(WebDriver driver,String Year, String Month, String Date) {
		while(true) {
			String CurrentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			String CurrentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			if(CurrentYear.equals(Year) && CurrentMonth.equals(Month)) {
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();//span[text()='Prev']
		}
		List<WebElement> CurrentDate =driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
		for(WebElement dt : CurrentDate) {
			if(dt.getText().equals(Date)) {
				dt.click();
				break;
			}
		}
	}
	public static void FuturedateSelect(WebDriver driver, String Year, String Month, String Date) {
		while(true) {
			String CurrentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			String CurrentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			if(CurrentYear.equals(Year) && CurrentMonth.equals(Month)) {
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();//span[text()='Next']
		}
		List<WebElement> CurrentDate =driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
		for(WebElement dt : CurrentDate) {
			if(dt.getText().equals(Date)) {
				dt.click();
				break;
			}
		}
	}

	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
//		WebDriverWait Mywait= new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		WebElement Frame=driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
		driver.switchTo().frame(Frame);
//		WebElement Date = Mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='datepicker']")));
//		Date.sendKeys("10/08/2025");
//		driver.close();
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		String Year ="2027";
		String Month ="August";
		String Date = "1";
		int year = Integer.parseInt(Year);
		if(year<=2025) {
		PastdateSelect(driver, Year, Month, Date );
		}
		else
		{
			FuturedateSelect(driver, Year, Month, Date);
		}
//		driver.close();
	}
}
