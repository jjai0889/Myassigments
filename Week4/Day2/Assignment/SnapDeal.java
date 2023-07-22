package Week4.Day2.Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SnapDeal {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
//		    1. Launch https://www.snapdeal.com/
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disabled notifications");
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.snapdeal.com/");
		
		
		
//			2. Go to Mens Fashion
		
		driver.findElement(By.xpath("//span[@class='catText']")).click();
		
		
//			3. Go to Sports Shoes
		
		driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
//			4. Get the count of the sports shoes
		
		String count = driver.findElement(By.xpath("//div[@class='child-cat-count ']")).getText();
		
		System.out.println(count);
		
//			5. Click Training shoes
		
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();		
		
//			6. Sort by Low to High
		driver.findElement(By.xpath("//*[contains(@class, 'icon-expand-arrow s')]")).click();
		
//			7. Check if the items displayed are sorted correctly
		
		driver.findElement(By.xpath("//li[@class='search-li']")).click();
//			8.Select the price range (900-1200)
		
		WebElement pricerange = driver.findElement(By.xpath("(//input[@class=\"input-filter\"])[1]"));
		pricerange.clear();
		pricerange.sendKeys("200");
		
		WebElement pricerange1 = driver.findElement(By.xpath("(//input[@class=\"input-filter\"])[2]"));
		pricerange1.clear();
		pricerange1.sendKeys("700");
		driver.findElement(By.xpath("//div[contains(@class,'price-go')]")).click();
		
//			9.Filter with color Navy 
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[contains(@class,'White&Blue ')]")).click();
		
//			10 verify the all applied filters 
		
		String filter = driver.findElement(By.xpath("(//div[@class='filters'])[1]")).getText();
		
		System.out.println(filter);
		
		
//			11. Mouse Hover on first resulting Training shoes
		Thread.sleep(10000);
		
		WebElement shoe = driver.findElement(By.xpath("//img[@class='product-image wooble']"));
		Actions mousehover = new Actions(driver);
		//mousehover.scrollToElement(shoe);
		mousehover.moveToElement(shoe).perform();
//			12. click QuickView button
		Thread.sleep(10000);
		WebElement quickview = driver.findElement(By.xpath("//div[contains(@class,'quick-view-bar')]"));
		mousehover.moveToElement(quickview).perform();
		
//			13. Print the cost and the discount percentage
		
		String price = driver.findElement(By.xpath("//span[@class='lfloat product-price']")).getText();
		System.out.println("Mobile Price"+" "+price);
	
		String perc = driver.findElement(By.xpath("//span[text()='26% Off']")).getText();
		System.out.println(perc);
		
		
//			14. Take the snapshot of the shoes.
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/snap.png");
		FileUtils.copyFile(source, dest);
		
		
//			15. Close the current window
		driver.close();
		
//			16. Close the main window
		
		driver.quit();

	}

}
