package AutomationQA.AutomationDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MoveActionHandling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// below for mouse hover
//		driver.get("https://demo.automationtesting.in/Register.html");
		
		// below for right click
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		// Examples of Mouse Hover Action
		
//		WebElement Interaction = driver.findElement(By.xpath("//a[@href='Interactions.html']"));
//		WebElement Drag_drop = driver.findElement(By.xpath("//a[text()='Drag and Drop ']"));
//		WebElement Static = driver.findElement(By.xpath("//a[text()='Static ']"));
//		
//		Actions act = new Actions(driver);
//		act.moveToElement(Interaction).moveToElement(Drag_drop).moveToElement(Static).build().perform();
//		Static.click();
		
		//Double Click
		
		WebElement Feild1 = driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement Feild2 = driver.findElement(By.xpath("//input[@id='field2']"));
		WebElement Button = driver.findElement(By.xpath("//button[@ondblclick='myFunction1()']"));
		Feild1.clear();
		Feild1.sendKeys("I am Subramanian");
		String Text=Feild2.getAttribute("value");
		Actions act = new Actions(driver);				//Actions is a Class will use to perform mouse actions
		Action Act =act.doubleClick(Button).build();	//Action is a interface that is used to store the build actions									
		Act.perform();  
		if(Feild1.getText().equals(Text)) {
			System.out.print("Copied Successfully");
		}
		else
		{
			System.out.print("Not Copied");
		}
	
	}

}
