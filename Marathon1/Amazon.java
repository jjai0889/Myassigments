package Marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		01) Launch Chrome 
		ChromeDriver driver = new ChromeDriver();
		
//		02) Load https://www.amazon.in/
//		     
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		//add  implicitlyWait
//	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
//		03) Type "Bags" in the Search box
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags");
		
		
//		04) Choose the 	 item in the result (bags for boys)
		
		driver.findElement(By.xpath("//span[text()=' for boys']")).click();
		
//		05) Print the total number of results (like 50000)1-48 of over 50,000 results for "bags for boys"
		
	    String Total = driver.findElement(By.xpath("(//div[contains(@class,'a-section a-spacing')])[1]")).getText();
		
		System.out.println(Total);
		
		
//		06) Select the first 2 brands in the left menu (like American Tourister, Generic)
		
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")).click();
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();
		
		
		
//		07) Choose New Arrivals (Sort)
		
		driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		
		
//		08) Print the first resulting bag info (name, discounted price)
		
		String Name = driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]")).getText();
		System.out.println(Name);
		
		String price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		System.out.println(price);
		
		//Discount is not displaying
		
		String Discount = driver.findElement(By.xpath("(//span[text()='(24% off)'])[1]")).getText();
		System.out.println(Discount);
		
//		09) Get the page title and close the browser(driver.close())
		
		driver.getTitle();
		driver.close();


	}

}
