package AutomationQA.AutomationDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragandDropHandling {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// below for mouse hover
		driver.get("https://demo.automationtesting.in/Static.html");
		driver.manage().window().maximize();
		
		WebElement DropArea = driver.findElement(By.xpath("//div[@id='droparea']"));
		WebElement angular = driver.findElement(By.xpath("//img[@id='angular']"));
		WebElement mongo = driver.findElement(By.xpath("//img[@id='mongo']"));
		WebElement node = driver.findElement(By.xpath("//img[@id='node']"));
		
		Actions act = new Actions(driver);		
		act.dragAndDrop(angular, DropArea).dragAndDrop(mongo, DropArea).dragAndDrop(node, DropArea).build().perform();
		Action Act =act.dragAndDrop(mongo, DropArea).build();
		Act.perform();

	}

}
