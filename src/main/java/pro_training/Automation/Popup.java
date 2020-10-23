package pro_training.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Muhammad Naeem\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
		
		WebDriver  driver =new ChromeDriver();
		driver.get("https://www.Expedia.com");
		driver.manage().window().maximize();
	WebElement BookFlight=driver.findElement(By.xpath("(//*[@id=\"d1-btn\"])[1]"));
	BookFlight.click();
	//Thread.sleep(3000);
	WebElement Next=driver.findElement(By.xpath("(//*[@class='uitk-button uitk-button-small uitk-flex-item uitk-button-paging'])[2]"));
	Next.click();

		WebElement DateFlight=driver.findElement(By.xpath("//button[@aria-label='Nov 1, 2020']"));
		DateFlight.click();
		WebElement Done=driver.findElement(By.xpath("(//*[text()='Done'])[2]"));
		Done.click();
		
		
	}

}
