package TestNGPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class LoginPageHandling {
	WebDriver driver;
  @Test(priority = 1)
  public void openurl() {
	  
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://demo.automationtesting.in/Datepicker.html");
	  driver.manage().window().maximize();
	  
  }
  @Test(priority = 2)
  public void Datepickerforfuturedate() {
	  driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
	  String Year="2027";
	  String Month="August";
	  String Day="1";
	 while(true) {
			 String Currentyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			 String Currentmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			 
				if (Currentyear.equals(Year)&&Currentmonth.equals(Month)) {
					break;
		}
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
	 }
	 List<WebElement> CurrentDay =driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
	 
	 for(WebElement Curday:CurrentDay) {
		 if(Curday.getText().equals(Day)){
			 Curday.click();
			 break;	 
		 }		 
	 }
	 }

  @Test(priority = 4)
  public void Datepickerforpastdate() {
	  driver.findElement(By.xpath("//input[@id='datepicker2']")).click();
	  String Year="2022";
	  String Month="August";
	  String Day="1"; while(true) {
			 String Currentyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			 String Currentmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			 
				if (Currentyear.equals(Year)&&Currentmonth.equals(Month)) {
					break;
		}
				WebElement Prev=driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']"));
				JavascriptExecutor js= (JavascriptExecutor)driver;
				js.executeScript("arguments[0].click", Prev);
	 }
	 List<WebElement> CurrentDay =driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
	 
	 for(WebElement Curday:CurrentDay) {
		 if(Curday.getText().equals(Day)){
			 Curday.click();
			 break;	 
		 }		 
	 }
	  }  
  


  @Test(priority = 3)
  public void SelectDrp_Datepicker() {
	  driver.findElement(By.xpath("//input[@id='datepicker2']")).click();
	  String Year="2027";
	  String Month="August";
	  String Day="1";
			 Select  Currentyear=new Select( driver.findElement(By.xpath("//Select[@title='Change the year']")));
			 Currentyear.selectByVisibleText(Year);
			 Select Currentmonth=new Select(driver.findElement(By.xpath("//Select[@title='Change the month']")));
			 Currentmonth.selectByVisibleText(Month);
			 
		
	 List<WebElement> CurrentDay =driver.findElements(By.xpath("//div[@class='datepick-month']/table/tbody/tr/td/a"));
	 
	 for(WebElement Curday:CurrentDay) {
		 if(Curday.getText().equals(Day)){
			 Curday.click();
			 break;	 
		 }
				 
		 
	 }
	  }
  
}
