package Week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButttonPage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("home")).click();
	    System.out.println(driver.findElement(By.id("position")).getLocation());
		System.out.println(driver.findElement(By.id("color")).getCssValue("color"));
		WebElement webEle3 = driver.findElement(By.id("size"));
		Dimension size = webEle3.getSize();
		System.out.println("Width:"+size.width);
		System.out.println("Height:"+size.height);		
		
		
		
				
		
		
		
		
	  
	
		
		
		
		// TODO Auto-generated method stub

	}

	

}
