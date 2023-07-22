package Week4.Day2.Assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//1.https://github.com/TestLeafPages/SeleniumAssignments/blob/master/week3/day2/Assignments/MergeContact.java

public class MergeContact {

	public static void main(String[] args) throws InterruptedException { 
		// TODO Auto-generated method stub

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disabled-notifications");

		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// 1. Launch URL "http://leaftaps.com/opentaps/control/login"

		driver.get("http://leaftaps.com/opentaps/control/login");

		// 2. Enter UserName and Password Using Id Locator

		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("demoSalesManager");

		// Enter password as crmsfa

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// 3. Click on Login Button using Class Locator

		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();

//		   4. Click on CRM/SFA Link
		driver.findElement(By.partialLinkText("CRM")).click();

//		  
//		  5. Click on contacts Button

		driver.findElement(By.xpath("//a[text()=\"Contacts\"]")).click();
//		  	
//		  6. Click on Merge Contacts using Xpath Locator
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();

//		  
//		  7. Click on Widget of From Contact

		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
//		  
//		  8. Click on First Resulting Contact

		Set<String> oldwindow = driver.getWindowHandles();
		List<String> newwindow = new ArrayList<String>(oldwindow);
		String parent = newwindow.get(0);
		String Child = newwindow.get(1);
		driver.switchTo().window(Child);
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]")).click();
		driver.switchTo().window(parent);
//		  9. Click on Widget of To Contact

		Thread.sleep(10000);
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
//		  
//		  10. Click on Second Resulting Contact
		// driver.findElement(By.linkText("10393")).click();

		Thread.sleep(10000);
		Set<String> oldwindow1 = driver.getWindowHandles();
		List<String> newwindow1 = new ArrayList<String>(oldwindow1);
		driver.switchTo().window(newwindow1.get(1));
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]")).click();
		driver.switchTo().window(parent);
//		  11. Click on Merge button using Xpath Locator

		Thread.sleep(10000);

		driver.findElement(By.xpath("//a[text()='Merge']")).click();
//		  
//		  12. Accept the Alert

		Thread.sleep(10000);

		driver.switchTo().alert().accept();
//		  
//		  13. Verify the title of the page

		Thread.sleep(5000);

		driver.getTitle();

	}

}
