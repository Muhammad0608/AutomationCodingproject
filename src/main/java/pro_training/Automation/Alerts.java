package pro_training.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Muhammad Naeem\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
		
		WebDriver  driver =new ChromeDriver();
		driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[text()='Simple Alert']")).click();
		Thread.sleep(6000);
		driver.switchTo().alert().accept();
		
	//	driver.switchTo().alert().dismiss();
	//	driver.switchTo().alert().sendKeys("");
	//	driver.switchTo().alert().accept();
		
		
		/*driver.findElement(By.xpath("//*[texxt()='Confirm Pop up']")).click();
		Thread.sleep(6000);
		driver.switchTo().alert().accept(); */
		
	}

}
