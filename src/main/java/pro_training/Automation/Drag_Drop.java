package pro_training.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Muhammad Naeem\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
		
		WebDriver  driver =new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Actions obj=new Actions(driver);
		driver.switchTo().frame(0);
		Thread.sleep(6000);
		WebElement Drag=driver.findElement(By.id("draggable"));
		WebElement Drop=driver.findElement(By.id("droppable"));
		obj.dragAndDrop(Drag, Drop).build().perform();
		Thread.sleep(6000);
		driver.switchTo().parentFrame();
		WebElement Sort=driver.findElement(By.linkText("Sortable"));
		
		driver.findElement(By.linkText("Sortable")).click();
		
		
	}

}
