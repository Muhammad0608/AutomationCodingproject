package Pro;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;

public class Advance_sharing_codes {
 public WebDriver driver;
  @BeforeClass
  @Parameters("browser")
  public void beforeClass(String browser) {
	  
		  if (browser.equalsIgnoreCase("Chrome")) {
			  System.setProperty("webdriver.chrome.driver","C:\\Users\\Muhammad Naeem\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
			 driver=new ChromeDriver();
			 driver.get("https://www.Amazon.com");
			driver.manage().window().maximize();
			
		  }
		  else if(browser.equalsIgnoreCase("Firefox")) {
			  System.setProperty("webdriver.gecko.driver","C:\\Users\\Muhammad Naeem\\Downloads\\geckodriver-v0.27.0-win64\\geckodriver.exe");	 
				
			  File pathBinary = new File("C:\\Users\\Muhammad Naeem\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
			  FirefoxBinary firefoxBinary = new FirefoxBinary(pathBinary);   
			  DesiredCapabilities desired = DesiredCapabilities.firefox();
			  FirefoxOptions options = new FirefoxOptions();
			  desired.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options.setBinary(firefoxBinary));
			   driver = new FirefoxDriver(options);
			   driver.get("https://www.Amazon.com");
				driver.manage().window().maximize();
		  }
  }
  

  @AfterClass
  public void afterClass() throws InterruptedException, IOException {
	  Thread.sleep(3000);
	  Pictures();
	  driver.close();
  }
public void Pictures() throws IOException {
	Date dt=new Date();
	String sd=dt.toString().replace(" ", "_").replace(":", "_")+".png";
	File di=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(di,new File("C:\\Users\\Muhammad Naeem\\eclipse-workspace\\Automation\\Drivers\\Pictures\\"+sd));
}
}
