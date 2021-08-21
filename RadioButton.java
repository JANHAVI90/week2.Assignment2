package Week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//div[@id='first']/label")).click();
		 WebElement radioButton = driver.findElement(By.xpath("(//input[@name='news'])[2]"));
		 
		 if(radioButton.isSelected()) {
			 System.out.println("The radio Button is Selected By Default");
		 }
		 else {
			 radioButton.click();
			 
			 
		 }
		 WebElement radioBtn = driver.findElement(By.xpath("(//input[@class='myradio'])[4]"));
		 if(radioBtn.isSelected()) {
			 System.out.println("The radio Button is Selected By Default");
		 }
		 else {
			 radioBtn.click();
		 }
		 }
		// TODO Auto-generated method stub

	}


