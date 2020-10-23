package pro_training.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Slenium_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Absolute xpath          // relative xpath
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Muhammad Naeem\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
				
				
				WebDriver  driver =new ChromeDriver();
	
				driver.get("https://www.facebook.com");
				
				driver.manage().window().maximize();
				
		
			//relative xpath	
				
		WebElement id=driver.findElement(By.xpath("//input[@id='email']"));
		 
		id.sendKeys("naemii_111@yahoo.com");
		
		WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
		 pass.sendKeys("12345678");
		 
		 WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
		 login.click();
	}

}
