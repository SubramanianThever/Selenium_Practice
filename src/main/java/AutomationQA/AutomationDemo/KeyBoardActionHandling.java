package AutomationQA.AutomationDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActionHandling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Subramanian");
		
		
		Actions act = new Actions(driver);
		
		act.keyDown(Keys.CONTROL).keyDown("a").keyUp(Keys.CONTROL).perform();
		act.keyDown(Keys.CONTROL).keyDown("c").keyUp(Keys.CONTROL).perform();
		
		WebElement Email=driver.findElement(By.xpath("//input[@id='email']"));
		act.keyDown(Email, Keys.CONTROL).keyDown("v").keyUp(Keys.CONTROL).perform();
 
	}

}
