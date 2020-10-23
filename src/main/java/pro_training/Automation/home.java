package pro_training.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class home {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       // how to open the site into chrome browser
		// 1) setup the chrome driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Muhammad Naeem\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
		
		// 2) call chrome driver constructor
		WebDriver  driver =new ChromeDriver();
		
		// 3) open the chrome/web site
		//driver.get("https://www.amazon.com");
		driver.get("https://www.facebook.com");
		
		//4) how to maximize the browser 
		driver.manage().window().maximize();
		
		//5) how to refresh the browser
	Thread.sleep(6000);
		driver.navigate().refresh();
		
		//6) how to backward
		driver.navigate().back();
		
		//7)how to go forward
		driver.navigate().forward();
		
		//how to find locators
		/*1) id
		 * 2) linktext
		 * 3) partial linktext
		 * 4) class time
		 * 5) xpath
		 * 6) tagename
		 * 7) css selector
		 * 8) name
		 */
		
		// how to store locater into variable
		WebElement CreateAnAccount=driver.findElement(By.id("u_0_2"));
		// how to click on element
		CreateAnAccount.click();
		
		WebElement Forgotlinkclick=driver.findElement(By.linkText("Forgot Password?"));
		//Forgotlinkclick.click();
		
		WebElement Forgotlinkpartial=driver.findElement(By.partialLinkText("Forgot"));
		//Forgotlinkpartial.click();
		Thread.sleep(3000);
		WebElement Firstname=driver.findElement(By.name("firstname"));
		Firstname.sendKeys("Muhammad");
		
		WebElement Lastname=driver.findElement(By.name("lastname"));
		Lastname.sendKeys("Naeem");
		
		WebElement Mobilenumber=driver.findElement(By.name("reg_email__"));
		 Mobilenumber.sendKeys("5712990867");
		 
		 WebElement Password=driver.findElement(By.name("reg_passwd__"));
		 Password.sendKeys("12345678");
		
		
		
		
		
		
		
	}

}
