package Marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AbhiBus1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Launch browser

		ChromeDriver driver = new ChromeDriver();

		// Maximize the browser
		driver.manage().window().maximize();

		// Load the url
		driver.get("https://www.abhibus.com/");

		// Add implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Actions act = new Actions(driver);

		// Click on the bus
		driver.findElement(By.id("pills-home-tab")).click();

		// Type from in chennai
		driver.findElement(By.id("source")).sendKeys("chennai");
		// Choose first result in the suggestion
		driver.findElement(By.xpath("//li[@class='ui-menu-item ui-state-focus']")).click();

		// Type bangalore
		driver.findElement(By.id("destination")).sendKeys("Bangalore");
		// Choose first result in the suggestion
		driver.findElement(By.xpath("//li[@class='ui-menu-item ui-state-focus']")).click();

		// 08) Select tomorrow's date in the Date field

		driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
		
		driver.findElement(By.xpath("(//a[text()='7'])[1]")).click();

//     	09) Click Search Buses
		
		driver.findElement(By.xpath("//a[text()='Search']")).click();

//     	09) Print the name of the first resulting bus (use .getText())
		
		String Bus = driver.findElement(By.xpath("(//h2[@title='Yolo Bus'])[1]")).getText();
		
		System.out.println(Bus);

//     	10) Choose SLEEPER in the left menu from Bus Type
		
		driver.findElement(By.xpath("//input[@id='Bustypes4']")).click();

//     	11) Print the first resulting bus seat count(Example:35 Seats Available)(use .getText())
		
		String bus = driver.findElement(By.xpath("(//p[contains(text(),'15 Seats Available')])[1]")).getText();
		
		System.out.println(bus);

//     	12) Click SelectSeat
		
		driver.findElement(By.xpath("(//span[text()='Select Seat'])[1]")).click();

//     	13) Choose any one Available seat
		
		driver.findElement(By.xpath("//li[contains(@class,'sleeper available')]/a")).click();

//     	14) Print Seats Selected ,Total Fare
		
		String seat = driver.findElement(By.xpath("(//p[@class='right'])[1]")).getText();
		
		System.out.println(seat);
		
       String fare = driver.findElement(By.xpath("(//p[@class='right'])[2]")).getText();
		
		System.out.println(fare);

//     	15) Select Boarding Point  and Dropping Point
		
		//Boarding Point
		
		   WebElement boarding = driver.findElement(By.xpath("(//select[@id='boardingpoint_id'])[1]"));
		  
		   Select sec = new Select(boarding);
		   
		   sec.selectByIndex(2);
		   
		  //Dropping Point
		   
		   WebElement dropping = driver.findElement(By.xpath("(//select[@id='droppingpoint_id'])[1]"));
		   
		   Select sec1 = new Select(dropping);
		   
		   sec1.selectByIndex(3);
		
		

//     	16) Get the Title of the page(use .getTitle())
		   
		   String title = driver.getTitle();
		   
		   System.out.println(title);
		   
		   

//     	17) Close the browser
		   
		   driver.close();

	}

}
