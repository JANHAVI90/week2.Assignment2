package Classroom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.bs.I.Is;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EditPage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys("abcde1@gmail.com");
		driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns']//input)[2]")).sendKeys("TestLeaf",Keys.TAB);
		driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns']//input)[3]")).sendKeys("Welcome",Keys.TAB);
		driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns']//input)[4]")).sendKeys("selenium",Keys.TAB);
		System.out.println(driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns']//input)[5]")).isEnabled());
		
			
		// TODO Auto-generated method stub

	}

}
