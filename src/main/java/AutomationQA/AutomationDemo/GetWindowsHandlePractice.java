 package AutomationQA.AutomationDemo;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowsHandlePractice {
	public static void main (String args[])
			{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//a[@href='http://www.orangehrm.com']")).click();
		Set<String> windowid =driver.getWindowHandles();
	//	List<String> windowlist = new ArrayList<>(windowid);
//		String parent = windowlist.get(0);
//		String Child = windowlist.get(1);
//		driver.switchTo().window(Child);
//		System.out.println(driver.getCurrentUrl()+"|"+driver.getTitle());
//		driver.switchTo().window(parent);
//		System.out.println(driver.getCurrentUrl()+"|"+driver.getTitle());
//		driver.switchTo().window(Child).close();
		
//		System.out.println(parent);
//		System.out.println(Child);
		
		///////////////////////////////////////////////////////////////
		//Approach to looping statement for multiple windows // multiples windows can be closed using for loop and if loops
		for(String Winid : windowid) {
			String Title =driver.switchTo().window(Winid).getTitle();
			//System.out.println(Title);
			if(Title.equals("Human Resources Management Software | HRMS | OrangeHRM") || Title.equals("OrangeHRM"))  
					{
				System.out.println(driver.getCurrentUrl());
				driver.close();
				
			}
			}
	
}}