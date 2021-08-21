package Week2.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement webEle1 = driver.findElement(By.id("dropdown1"));
		Select drpDwn1= new Select(webEle1);
		drpDwn1.selectByValue("3");
		WebElement webEle2 = driver.findElement(By.xpath("//select[@name='dropdown2']"));
		Select drpDwn2 = new Select(webEle2);
		drpDwn2.selectByVisibleText("Selenium");
		WebElement webEle3 = driver.findElement(By.id("dropdown3"));
		Select drpDwn3= new Select(webEle3);
		drpDwn3.selectByValue("4");
	    Select s= new Select(driver.findElement(By.xpath("//select[@class='dropdown']")));
	    List<WebElement> option = s.getOptions();
	    int size = option.size();
	    for(int i =0;i<size;i++) {
	    	String options= option.get(i).getText();
	    	System.out.println("No.of options in drpdwn is:"+options);
	    }
	    	
	    	System.out.println();
	    	    
	  driver.findElement(By.xpath("(//div[@class='example'])[5]/select")).sendKeys("Loadrunner");
	  WebElement webEle4 = driver.findElement(By.xpath("//option[text()='Select your programs']/parent::select"));
		
		Select drpDwn4= new Select(webEle4);
		drpDwn4.selectByVisibleText("Appium");
		drpDwn4.selectByValue("1");
		
		
		
		
				
		// TODO Auto-generated method stub

	}
}

