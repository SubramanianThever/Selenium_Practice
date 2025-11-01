package AutomationQA.AutomationDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GenericMethodDropdownHandling {
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		WebElement Year= driver.findElement(By.xpath("//select[@id='yearbox']"));
//		Select Drpl = new Select(Country);
//		Drpl.selectByVisibleText("1991");
		Alldropdowncontroller(Year,"1991");
		WebElement Month=driver.findElement(By.xpath("//Select[@placeholder='Month']"));
		Alldropdowncontroller(Month,"August");
		WebElement Day=driver.findElement(By.xpath("//Select[@id='daybox']"));	
		Alldropdowncontroller(Day,"1");

	}
public static void Alldropdowncontroller(WebElement ele, String Value) {
	Select drp = new Select(ele);
	drp.selectByVisibleText(Value);
	
	// or
//	List<WebElement> Alloption= drp.getOptions();
//	for(WebElement All : Alloption ) {
//		if(All.getText().equals(Value)){
//		
//			drp.selectByVisibleText(Value);
//		}
//	}
}
}
