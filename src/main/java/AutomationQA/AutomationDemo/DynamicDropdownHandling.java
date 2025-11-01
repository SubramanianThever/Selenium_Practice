package AutomationQA.AutomationDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdownHandling {
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
//		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//textarea[@aria-label='Search']")).sendKeys("Selenium");
//		List<WebElement> AllSearch=driver.findElements(By.xpath("//div[@role='option']//div[@class='wM6W7d']//span"));
//		for(WebElement Search : AllSearch) {
//			String Search1 = Search.getText();
//			if(Search1.equals("Selenium")){
//				Search.click();
////				driver.findElement(By.xpath("//input[@value='Google Search']")).click();
//				break;
//			}
					
//		}
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("Mobile");
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys(Keys.ARROW_DOWN.ARROW_DOWN.ARROW_DOWN.ENTER);
		
//		List<WebElement> AllSearch=driver.findElements(By.xpath("//div[@role='rowgroup']//div[@role='button']"));
//		for(WebElement Search : AllSearch) {
//			String Search1 = Search.getText();
//			if(Search1.equals("Mobile")){
////				Search.click();
//				driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
//				break;
			}
}