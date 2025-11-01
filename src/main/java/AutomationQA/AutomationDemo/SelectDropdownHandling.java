package AutomationQA.AutomationDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownHandling {
	public static void main (String args[]) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement Countrydrp= driver.findElement(By.xpath("//Select[@id='country']"));
		Select SelectCountrydrp = new Select(Countrydrp); 
		
		// Below is method to use dropdowns
		
//		SelectCountrydrp.selectByVisibleText("Australia");
//		SelectCountrydrp.selectByValue("canada");
//		SelectCountrydrp.selectByIndex(3);
		
//		below is how to count size and how to print name of dropdowns text
//		System.out.print("No of Country inside dropdwon: "+ SelectCountrydrp.getOptions().size());
		List<WebElement> Countryname = SelectCountrydrp.getOptions();
		for(WebElement Country : Countryname)
		{
//			System.out.println(Country.getText());
//			String MyCountry =Country.getText();
			
//			if(MyCountry.equals("India")) {
			if(Country.getText().equals("India")) {
				SelectCountrydrp.selectByVisibleText("India");
				System.out.println("Yes I am Indian");
				
			}
		}
	}


}

