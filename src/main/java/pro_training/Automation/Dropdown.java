package pro_training.Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Muhammad Naeem\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
		
		
		WebDriver  driver =new ChromeDriver();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[text()='Create New Account']")).click();
		Select wt=new Select(driver.findElement(By.name("birthday_month")));
		wt.selectByVisibleText("Apr");
		
		Select nt=new Select(driver.findElement(By.name("birthday_day")));
		nt.selectByVisibleText("10");
		
	}

	
}
