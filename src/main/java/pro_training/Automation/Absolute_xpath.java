package pro_training.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Muhammad Naeem\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
		
		WebDriver  driver =new ChromeDriver();
        
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		WebElement id=driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/div/div/form/div/div/input)[1]"));
		id.sendKeys("naemii_111@yahoo.com");
		
		WebElement password=driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/div/div/form/div/div/input)[2]"));
		password.sendKeys("12345678");
		
		WebElement login= driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/div/div/form/div/button)"));
		login.click();
	}

}
