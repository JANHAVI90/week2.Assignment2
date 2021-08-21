package Week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.mk_latn.No;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus1 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		Thread.sleep(1000);
	
	driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Chennai");
	driver.findElement(By.xpath("//li[@data-id='123']")).click();
	driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Bengaluru ");
	driver.findElement(By.xpath("//ul[@class='autoFill']/li")).click();
	driver.findElement(By.xpath("//td[text()='25']")).click();
	driver.findElement(By.xpath("//button[@id='search_btn']")).click();
	Thread.sleep(1000);
    driver.findElement(By.xpath("//div[@class=\"close\"]/i")).click();
    //driver.findElement(By.xpath("//i[@class='icon icon-close']")).click();
    String busSeatResult = driver.findElement(By.xpath("//span[@class='w-60 d-block d-found']")).getText();
    System.out.println("Total no of Seat found :" +busSeatResult);
    Thread.sleep(2000);
    driver.findElement(By.xpath("(//label[@class='custom-checkbox'])[6]")).click();
    String SleepSeat =driver.findElement(By.xpath("(//span[@class='w-60 d-block d-found']")).getText();
    System.out.println("The number of Sleeper Seat found:"+ SleepSeat);
    WebElement webEle1 = driver.findElement(By.xpath("//label[text()='SLEEPER']/preceding-sibling::label"));
    webEle1.click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("(//label[@class='custom-checkbox'])[7]")).click();
   Thread.sleep(2000);
   String AcSeat=driver.findElement(By.xpath("//span[@class='w-60 d-block d-found']")).getText();
   System.out.println("The number of AC seat found:"+ AcSeat);
   Thread.sleep(2000);
   driver.findElement(By.xpath("(//label[@class='custom-checkbox'])[8]")).click();
   Thread.sleep(1000);
   String NonAc= driver.findElement(By.xpath("//span[@class='w-60 d-block d-found']")).getText();
   System.out.println("The number of NonAc is :"+ NonAc);
   Thread.sleep(1000);
   driver.close();
    
}
}
