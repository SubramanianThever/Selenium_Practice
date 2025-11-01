package AutomationQA.AutomationDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTableHandling {
			public static void main(String args[]) {
				
				WebDriver driver= new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.get("https://testautomationpractice.blogspot.com/");
				driver.manage().window().maximize();
				int row=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr")).size();
				int Cols=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr//th")).size();
//				System.out.println("No of Rows:"+row+" No of Header:"+Cols);
//				System.out.println("\t"+"BooKname"+"\t"+"Authorname"+"\t"+"Subject"+"\t"+"Price");
				//Print all data
//				for(int r=2; r<=row;r++) 
//				{
//				for(int c =1; c<=Cols;c++) {
//				String value = driver.findElement(By.xpath("//table[@name='BookTable']//tbody//tr["+r+"]//td["+c+"]")).getText();
//				 System.out.print("\t"+value+"\t");
//					}
//					System.out.println("");
//				}
				int Total=0;
				for(int r=2; r<=row;r++) 
					{
					String Subject = driver.findElement(By.xpath("//table[@name='BookTable']//tbody//tr["+r+"]//td[3]")).getText();
//					System.out.println(Subject);
					if(Subject.contains("Sele")) {
						String Price = driver.findElement(By.xpath("//table[@name='BookTable']//tbody//tr["+r+"]//td[4]")).getText();
						Total= Total + Integer.parseInt(Price);	
						}
					}
				System.out.print(Total);
			}
}
