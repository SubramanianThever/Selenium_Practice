package AutomationQA.AutomationDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesHandling {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		//first frame
		WebElement Frame1 = driver.findElement(By.xpath("//frame[@src=\"frame_1.html\"]"));
		driver.switchTo().frame(Frame1); // allow to enter frame1
		driver.findElement(By.xpath("//input[@name=\"mytext1\"]")).sendKeys("Welcome");
		driver.switchTo().defaultContent(); // get back to main page
		
		// for second frame
		WebElement Frame2 = driver.findElement(By.xpath("//frame[@src=\"frame_2.html\"]"));
		driver.switchTo().frame(Frame2); //allow to enter frame2
		driver.findElement(By.xpath("//input[@name=\"mytext2\"]")).sendKeys("Welcome");
		driver.switchTo().defaultContent();
		
		//Third Frame 
		WebElement Frame3 = driver.findElement(By.xpath("//frame[@src=\"frame_3.html\"]"));
		driver.switchTo().frame(Frame3); //allow to enter frame2
		driver.findElement(By.xpath("//input[@name=\"mytext3\"]")).sendKeys("Welcome");
//		driver.switchTo().defaultContent();
		
		//IFrame Handling
		WebElement iframe = driver.findElement(By.xpath("//iframe[@src='https://docs.google.com/forms/d/1yfUq-GO9BEssafd6TvHhf0D6QLDVG3q5InwNE2FFFFQ/viewform?embedded=true']"));
		driver.switchTo().frame(iframe);
		WebElement radiobutton= driver.findElement(By.xpath("//div[@class='rseUEf nQOrEb']"));
//		JavascriptExecutor js=(JavascriptExecutor)driver;
	//	js.executeScript("arguments[0].click());",radiobutton);
    	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Subramanian");

	}

}
