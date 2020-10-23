package pro_training.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class pointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Muhammad Naeem\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
		
		WebDriver  driver =new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		Actions obj=new Actions(driver);
		obj.moveToElement(driver.findElement(By.xpath("//*[text()='Hello, Sign in']"))).build().perform();
		obj.moveToElement(driver.findElement(By.xpath("//*[text()='Create a List']"))).click().build().perform();
		
		
	}

}
