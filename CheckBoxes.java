package Week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxes {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
boolean chkBox=	driver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']/following::input")).isSelected();
if (chkBox)
System.out.println("The checkBox is Selected");
else
	System.out.println("the checkBox is Not Selected");
boolean deSelChk = driver.findElement(By.xpath("(//label[text()='DeSelect only checked']/following::input)[2]")).isSelected();
 
if(!deSelChk)
driver.findElement(By.xpath("(//label[text()='DeSelect only checked']/following::input)[2]")).click();
driver.findElement(By.xpath("(//label[text()='DeSelect only checked']/following::input)[2]")).click();
		
driver.findElement(By.xpath("(//label[text()='Select all below checkboxes ']/following::input)[1]")).click();
driver.findElement(By.xpath("(//label[text()='Select all below checkboxes ']/following::input)[2]")).click();
driver.findElement(By.xpath("(//label[text()='Select all below checkboxes ']/following::input)[3]")).click();
driver.findElement(By.xpath("(//label[text()='Select all below checkboxes ']/following::input)[4]")).click();	
driver.findElement(By.xpath("(//label[text()='Select all below checkboxes ']/following::input)[5]")).click();

	
	// TODO Auto-generated method stub

	}

}
