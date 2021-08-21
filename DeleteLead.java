package Classroom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		 driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
		 
		 driver.findElement(By.name("phoneCountryCode")).clear();
		 driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("044");
			driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("1234567");
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();	
		 Thread.sleep(2000);
		 WebElement webEle1 = driver.findElement(By.xpath("(//a[@class='linktext'])[4]"));
		 String LeadId = webEle1.getText();
		 System.out.println("LeadId is :"+ LeadId);
		 Thread.sleep(1000);
		 webEle1.click();
		 driver.findElement(By.xpath("//a[text()='Delete']")).click();
			System.out.println("FindLead for ID -"+LeadId +" is deleted.");
			driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
			driver.findElement(By.xpath("//input[@name='id']")).sendKeys(LeadId);
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			String str = driver.findElement(By.xpath(("//div[contains(text(),'No records to display')]"))).getText();
			  System.out.println(str);
			  
			  if(str.contains("No records to display"))
				System.out.println("No records to display for the lead id");
			
			else
				System.out.println("Still records are there for the lead id");
			  driver.close();
			  
			
			
		 	
		 
		 
		 
		 
		 
		// TODO Auto-generated method stub

	}

}
