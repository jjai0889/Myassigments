package Week4.Day2.Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

//		    1.Load the URL https://www.amazon.in/

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable notifications");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");

//			2.search as oneplus 9 pro 
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

//			3.Get the price of the first product

		String price = driver.findElement(By.xpath("//*[@class='a-price-whole']")).getText();

		System.out.println("Mobile Price" + " " + price);

//			4. Print the number of customer ratings for the first displayed product

		String customer = driver.findElement(By.xpath("//*[@class='a-size-base s-underline-text']")).getText();
		System.out.println("customer rating" + " " + customer);

//			5. Click the first text link of the first image

		driver.findElement(By.xpath("//*[contains(text(),'OnePlus 9')]")).click();
		Set<String> oldWindow = driver.getWindowHandles();
		List<String> newWindow = new ArrayList<String>(oldWindow);
		driver.switchTo().window(newWindow.get(1));

//			6. Take a screen shot of the product displayed
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/Amazon.png");
		FileUtils.copyFile(source, dest);

//			7. Click 'Add to Cart' button

		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
//			8. Get the cart subtotal and verify if it is correct.
		Thread.sleep(5000);
		String subtotal = driver.findElement(By.xpath("//*[@id='attach-accessory-cart-subtotal']")).getText();
		System.out.println(subtotal);

		if (subtotal.contains("45,999")) {

			System.out.println("Value is correct");

		}

		else {

			System.out.println("incorrect");

		}

//			9.close the browser

		driver.quit();

	}

}
