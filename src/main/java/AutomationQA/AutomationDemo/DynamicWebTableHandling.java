package AutomationQA.AutomationDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicWebTableHandling {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://practice.expandtesting.com/dynamic-pagination-table");
		driver.manage().window().maximize();

		//below is Explicitwait Condition 
		
		WebDriverWait Mywait=new WebDriverWait(driver, Duration.ofSeconds(100));
	
		String data = driver.findElement(By.xpath("//div[@id='example_info']")).getText();
		System.out.println(data);
		
		int totalentries = Integer.parseInt(data.substring(data.indexOf("of")+3,data.indexOf("entries")-1));
		System.out.println(totalentries);
		for(int en=1;en<=totalentries;en++) {
			
			 int row =driver.findElements(By.xpath("//tbody[@id=\"demo\"]//tr")).size();
			 int Cols =driver.findElements(By.xpath("//tbody[@id=\"demo\"]//tr[1]//td")).size();
			 
			 for(int tr=1;tr<=row;tr++) {
			 for(int td=1;td<=Cols;td++) {
				String entries = driver.findElement(By.xpath("//tbody[@id='demo']//tr["+tr+"]//td["+td+"]")).getText();
					 System.out.print(entries+"\t");				
				 }
				 System.out.println();
			}
			 if(en % 3 == 0) {
				 if(en % 3 == 0) {
					    WebElement Next = Mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='pagination']//li[@id='example_next']//a")));
					    
					    // Click using JavaScript to avoid intercept issues
					    ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].click();", Next);
					}

				}

//			 if(en%3==0) {
//			 WebElement Next =Mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class='pagination']//li[@id='example_next']//a")));
//				Next.click();
//			 }
			 }
		 	
	driver.quit();
	}
}
//for(int p=1;p<=totalpageno;p++) {
//	 if(p>1) {
//		WebElement Activepage = driver.findElement(By.xpath("//ul[@class='pagination']//li["+p+"]"));		
//		Activepage.click();}}

//Mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"username\"]")));
//WebElement username = driver.findElement(By.xpath("//input[@name=\"username\"]"));
//username.clear();
//username.sendKeys("Admin");
//WebElement password = driver.findElement(By.name("password"));
//password.clear();
//password.sendKeys("admin123");
//driver.findElement(By.xpath("//button[@type='submit']")).click();

//Below Dynamic Paging 
//
//int totalpageno = Integer.parseInt(data.substring(13,14));

//package AutomationQA.AutomationDemo;
//
//import java.time.Duration;
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//public class DynamicWebTableHandling {
//
//    public static void main(String[] args) {
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://practice.expandtesting.com/dynamic-pagination-table");
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//
//        boolean hasNext = true;
//
//        while (hasNext) {
//            // Wait for rows to be visible
//            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#demo tr")));
//
//            // Get all rows and columns
//            List<WebElement> rows = driver.findElements(By.cssSelector("#demo tr"));
//            for (WebElement row : rows) {
//                List<WebElement> cols = row.findElements(By.tagName("td"));
//                for (WebElement col : cols) {
//                    System.out.print(col.getText() + "\t");
//                }
//                System.out.println();
//            }
//
//            // Check if Next button is disabled
//            WebElement nextBtn = driver.findElement(By.id("example_next"));
//            if (nextBtn.getAttribute("class").contains("disabled")) {
//                hasNext = false;
//            } else {
//                // Scroll into view and click
//                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", nextBtn);
//                wait.until(ExpectedConditions.elementToBeClickable(nextBtn));
//                nextBtn.click();
//
//                // Wait for table to reload
//                wait.until(ExpectedConditions.stalenessOf(rows.get(0)));
//            }
//        }
//
//        driver.quit();
//    }
//}
