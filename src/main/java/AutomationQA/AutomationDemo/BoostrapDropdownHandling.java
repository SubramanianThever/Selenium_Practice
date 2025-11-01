package AutomationQA.AutomationDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BoostrapDropdownHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id=\"menu1\"]")).click();
		List<WebElement> Tutorial =driver.findElements(By.xpath("//a[@role='menuitem']"));
		
		for(WebElement TT : Tutorial)
		{
			//String TAT = TT.getText();
			if(TT.getText().equals("HTML")){
				TT.click();
				System.out.println(TT.getText());
				break;
			}
		}
//		driver.close();
		//driver.findElement(By.linkText("HTML")).click();

	}

}
