package AutomationQA.AutomationDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderHandling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement LeftSlider = driver.findElement(By.xpath("//div [@id='slider-range']/span[1]"));
		System.out.println("Original Left Slider Locator:" +LeftSlider.getLocation());
		WebElement RightSlider = driver.findElement(By.xpath("//div [@id='slider-range']/span[2]"));
		System.out.println("Original Right Slider Locator:" +RightSlider.getLocation());
		
		Actions act = new Actions(driver);
		act.dragAndDropBy(LeftSlider, 50, 0).build().perform();
		act.clickAndHold(RightSlider).moveByOffset(-50, 0).release().build().perform();
		
		System.out.println("Current Left Slider Locator:" +LeftSlider.getLocation());
		System.out.println("Current Right Slider Locator:" +RightSlider.getLocation());

	}

} 
