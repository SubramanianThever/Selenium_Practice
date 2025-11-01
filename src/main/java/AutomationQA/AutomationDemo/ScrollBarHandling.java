package AutomationQA.AutomationDemo;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBarHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js= (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,1500)", "");
//		System.out.print(js.executeScript("return window.pageYOffset;"));
		WebElement ele=driver.findElement(By.xpath("//table[@id='taskTable']"));
		
		
		// Scroll till element
		js.executeScript("arguments[0].scrollIntoView();", ele);
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		//Scroll till end
//
		js.executeScript("window.scrollBy(0,document.body.scrollHeight )", "");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight )", "");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		//Below is Examples of X axis handling
		
		js.executeScript("window.scrollBy(100,0)", "");
		System.out.println(js.executeScript("return window.pageXOffset;"));
		
		
		// Scroll till element
		js.executeScript("arguments[0].scrollIntoView();", ele);
		System.out.println(js.executeScript("return window.pageXOffset;"));
		
		//Scroll till end
//
		js.executeScript("window.scrollBy(0,document.body.scrollWidth)", "");
		System.out.println(js.executeScript("return window.pageXOffset;"));
	
	}

		
	

}
