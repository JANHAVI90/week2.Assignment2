package Week2.day2;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImagePage {

	
	public static void main(String[] args) throws InterruptedException {
		

		
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver = new ChromeDriver();
				driver.get("http://leafground.com/pages/Image.html");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					Thread.sleep(1000);
				driver.findElement(By.xpath("//label[text()='Click on this image to go home page']/following-sibling::img")).click();
				driver.navigate().back();
				Thread.sleep(1000);
				String img= driver.findElement(By.xpath("//label[text()='Am I Broken Image?']/following-sibling::img")).getAttribute("src");
				System.out.println(img);
				driver.navigate().to("http://leafground.com/images/abcd.jpg");
				String str1= driver.getTitle();
				if(str1. contains("HTTP Status 404"))
				
					System.out.println("The Image is Broken");
				
				else 
					System.out.println("The image is Not Broken");
				
					driver.navigate().back();
					driver.findElement(By.xpath("//label[text()='Click me using Keyboard or Mouse']/following-sibling::img")).click();
					Thread.sleep(1000);
					driver.close();
					
					
		// TODO Auto-generated method stub

	}

}
