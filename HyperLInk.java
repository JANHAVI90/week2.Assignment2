package Classroom;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperLInk {

	public static <webElement> void main(String[] args) {
		WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Go to Home Page']")).click();
		driver.navigate().back();	
		String hrefLink = driver.findElement(By.xpath("//a[contains(text(),'Find where am supposed to go without clicking me?')]")).getAttribute("href");
		System.out.println("navigate to the page"+hrefLink);
	
		driver.findElement(By.xpath("//a[contains(text(),'Verify am I broken?')]")).click();
		 int responseCode = 404;
		if(responseCode >=404) {
			System.out.println("the page is broken");}
		else
			System.out.println("the page is not broken");
			String title = driver.getTitle();
			System.out.println(title);
			driver.navigate().back();
			driver.findElement(By.xpath("//label[text()='(Interact with same link name)']/preceding-sibling::a")).click();
			driver.navigate();
			List<WebElement> Link = driver.findElements(By.tagName("a"));
			int count= Link.size();
			System.out.println("the no.of links:"+count);
			
		}
		
				
		// TODO Auto-generated method stub

	}


