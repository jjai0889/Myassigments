package Week4.Day2.Assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();

		options.addArguments("--disabled notification");

		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

//		    1) Go to https://www.nykaa.com/

		driver.get("https://www.nykaa.com/");

//			2) Mouseover on Brands and Search L'Oreal Paris

		WebElement eleBrand = driver.findElement(By.xpath("//a[text()='brands']"));

		// instantiate action

		Actions mousehover = new Actions(driver);
		mousehover.moveToElement(eleBrand).perform();

//			3) Click L'Oreal Paris

		driver.findElement(By.linkText("L'Oreal Paris")).click();

//			4) Check the title contains L'Oreal Paris(Hint-GetTitle)

		String title = driver.getTitle();

		System.out.println(title);

//			5) Click sort By and select customer top rated

		// svg handle

		Thread.sleep(10000);

		driver.findElement(By.xpath("(//*[name()='svg' and @class='arrow-icon'])[1]")).click();

		Thread.sleep(10000);
		driver.findElement(By.xpath("(//*[@class='control-indicator radio '])[3]")).click();

//			6) Click Category and click Hair->Click haircare->Shampoo

		driver.findElement(By.xpath("//span[text()='Category']")).click();
		// Thread.sleep(10000);
		// WebElement hair = driver.findElement(By.xpath("(//span[text()=\"Hair
		// Care\"])[2]"));
		// driver.findElement(By.xpath("(//span[text()=\"Hair Care\"])[2]")).click();
		// mousehover.moveToElement(hair).perform();
		driver.findElement(By.xpath("//span[text()='Hair']")).click();
		driver.findElement(By.xpath("//span[text()='Hair Care']")).click();

		// Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text()='Shampoo']")).click();
		// Thread.sleep(10000);
		// driver.switchTo().alert().accept();

//			7) Click->Concern->Color Protection

		Thread.sleep(10000);

		driver.findElement(By.xpath("//span[text()='Concern']")).click();

		driver.findElement(By.xpath("//span[text()='Color Protection']")).click();

//			8)check whether the Filter is applied with Shampoo

		WebElement filterval = driver.findElement(By.xpath("//span[@class='filter-value']"));

		String value = filterval.getText();
		System.out.println(value);

//			9) Click on L'Oreal Paris Colour Protect Shampoo

		Thread.sleep(10000);

		driver.findElement(By.xpath("//div[contains(text(),'Paris Colour')]")).click();

//			10) GO to the new window and select size as 175ml

		Thread.sleep(10000);

		Set<String> oldwindow = driver.getWindowHandles();
		List<String> newwindow = new ArrayList<String>(oldwindow);
		String parent = newwindow.get(0);
		String Child = newwindow.get(1);

		driver.switchTo().window(Child);
		Thread.sleep(10000);

		driver.findElement(By.xpath("//span[text()='180ml']")).click();

		// Actions mousehover1 = new Actions(driver);
		// mousehover1.moveToElement(size).click().perform();

//			11) Print the MRP of the product

		WebElement MRP = driver.findElement(By.xpath("//span[@class='css-1jczs19']"));
		String mrpValue = MRP.getText();
		System.out.println(mrpValue);

//			12) Click on ADD to BAG
		
		driver.findElement(By.xpath("//span[text()='Add to Bag']")).click();
		
//			13) Go to Shopping Bag 
		driver.findElement(By.xpath("//button[@class='css-aesrxy']")).click();
//			14) Print the Grand Total amount
		WebElement grand = driver.findElement(By.xpath("//span[@class='css-1um1mkq e171rb9k3']"));
		String grandTotal = grand.getText();
		System.out.println(grandTotal);
		
//			15) Click Proceed
		driver.findElement(By.xpath("//span[text()='Proceed']")).click();
		
//			16) Click on Continue as Guest
		driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
		
//			17) Check if this grand total is the same in step 14

		WebElement price = driver.findElement(By.xpath("//p[@class='css-1e59vjt eka6zu20']"));
		String pricedetails = price.getText();
		System.out.println(pricedetails);
		
		if(grandTotal.equals(pricedetails)) {
			
			System.out.println("Matching");
		}
		
//			18) Close all windows

		 driver.quit();

	}

}
