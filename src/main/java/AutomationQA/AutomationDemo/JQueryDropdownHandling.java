package AutomationQA.AutomationDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JQueryDropdownHandling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='justAnInputBox']")).click();
		AllOptions(driver, "choice 1","choice 2", "choice 6 1");
	//	AllOptions(driver, "All");
		
//		for(WebElement TT : Tutorial)
//		{
//			String TAT=TT.getText();
//			if(TAT.equals("choice 1")){
//				TT.click();
//				System.out.println(TT.getText());
//				break;
//			}
//		}
//		driver.close();
		//driver.findElement(By.linkText("HTML")).click();

	}
	public static void AllOptions(WebDriver driver, String... Value ) {
		List<WebElement> Options =driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		if(!Value[0].equalsIgnoreCase("All")) {
			for(WebElement Option : Options) {
		//		String text = Option.getText();
				for(String val : Value) {
				if(Option.getText().equals(val)) {
					Option.click();
					break;
				}}
			}
		}
		else {
			for(WebElement Option : Options) {
				Option.click();
//				String text = Option.getText();
//				if(text.equals(Value)) {
//					Option.click();
//		}
	}

}}}
