package Marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class pvr {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
//		    01) Launch the Url  https://www.pvrcinemas.com/
		
		    driver.get("https://www.pvrcinemas.com/");
		    
//			02) Click  on Movie Library
		    
		    driver.findElement(By.xpath("//div[text()='Movie Library ']")).click();

		
//		    03) Select the City -->chennai
		    
		    //driver.findElement(By.xpath("//input[@name='search-cities']")).click();
	
//            WebElement Namedd = driver.findElement(By.xpath("//Select[@fdprocessedid='scy9yxf']"));
//            
//            Select sec = new Select(Namedd);
//            sec.selectByValue("Chennai");
		
//			04) Select the Genre-->Animation
		    
		    
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		    
            WebElement Animationdd = driver.findElement(By.name("genre"));
            
            Select sec1 = new Select(Animationdd);
            
            sec1.selectByVisibleText("ANIMATION");

		
//			05) Select the Language-->english
            
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement Languagedd = driver.findElement(By.name("lang"));
		
		Select sec2 = new Select(Languagedd);
		//sec2.deselectByIndex(2);
		sec2.selectByVisibleText("ENGLISH");
		    
//			06) Click on Apply
		
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		Thread.sleep(3000);
		
//			07) Click on first resulting animation movie
		
		
		
		driver.findElement(By.xpath("//div[@class='movie-list']/div[1]/img")).click();

		
//			08) Click proceed to book
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();


//			09) Enter the all fields  cinema , Name, date, Prefered show time, no of seats, food and beverages,Email and Mobile
		
		    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		     Thread.sleep(3000);
		    // cinema
		    WebElement Cinema = driver.findElement(By.xpath("//Select[@id='cinemaName']"));
		    
		    Select sec3 = new Select(Cinema);
		    
		    sec3.selectByIndex(2);
		    
		    //Preferred show time
		    
		    WebElement showdd = driver.findElement(By.name("timings"));
		    
		    Select sec4 = new Select(showdd);
		    
		    sec4.selectByIndex(2);
		    
		    //seat
		    
		    driver.findElement(By.name("noOfTickets")).sendKeys("2");
		    
		    //Name
		    
		    driver.findElement(By.name("name")).sendKeys("Jai");
		    
		    //email
		    
		    driver.findElement(By.name("email")).sendKeys("jai@gmail.com");
		    
		    //phone
		    
		    driver.findElement(By.name("mobile")).sendKeys("9885464532");
		    
		    //F&B
		    
		    WebElement Food = driver.findElement(By.name("food"));
		    
		    Select sec5 = new Select(Food);
		    
		    sec5.selectByIndex(1);
		    
		    //text
		    
		    driver.findElement(By.name("comment")).sendKeys("Testing");
		    
		
//			10) Click on copy to self 
		
		    driver.findElement(By.xpath("//span[text()='Copy To Self']")).click();
		
		
//			11) Click on  Send Request
		
		driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();

		
//			12) Click cancel 
		
		//Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//button[text()='CANCEL'])[2]")).click();
		
		

		
//			13) Close the OTP dialog
		
		driver.findElement(By.xpath("//button[@aria-label='Close this dialog']")).click();

		
//			14) Verify the ttile of the page
		
		System.out.println(driver.getTitle());


	}

}
