package Classroom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Createcontact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Contacts")).click();
        driver.findElement(By.linkText("Create Contact")).click();
        driver.findElement(By.id("firstNameField")).sendKeys("Jan");
        driver.findElement(By.id("lastNameField")).sendKeys("N");
        driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("jan");
        driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("N");
        driver.findElement(By.name("description")).sendKeys("Testing");
        driver.findElement(By.id("createContactForm_description")).sendKeys("This is descp Box");
        driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("abcd1@gmail.com");
        WebElement webEle1 = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select drpDwn = new Select(webEle1);
		drpDwn. selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.className("subMenuButton")).click();
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("This is impt note Box");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	     driver.getTitle();
	     String title = driver.getTitle();
	     String title1= "View Contact|opentaps CRM";
	     if (title1.equals(title))
	     {System.out.println("Im in the resulting page");
	     
	     }
	     else 
	    	 System.out.println("Im not in the resulting page");
		
	     driver.close();
	     
		
        
		// TODO Auto-generated method stub

	}

}
