package pro_training.Automation;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import ClassesMethods.ForgotPasswordPage;
import ClassesMethods.Home;
import ClassesMethods.signinpage;
import Pro.Advance_sharing_codes;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Amazon extends Advance_sharing_codes {
	
  @Test (priority = 1)
  public void d () {
	  Home it=new Home(driver);
	  
	  it.AmazonIconClick();
	  String ActualURL=driver.getCurrentUrl();
	  SoftAssert Confirm=new SoftAssert();
	  Confirm.assertEquals(ActualURL, "https://www.amazon.com/ref=nav_logo");
	  // Assert.assertEquals(ActualURL, "https://www.amazon.com/ref=nav_logo");
	  it.SearchBoxField("n");
	  it.SearchIconClick();
	  WebElement Customerserviseverifacation= it.Customerserviseverifacation();
	 boolean Customer= Customerserviseverifacation.isDisplayed();
	 Confirm.assertEquals(Customer, true);
	  Confirm.assertAll();
  }
 // @Test (priority = 2)
  public void ForgotPassword() {
	  Home it=new Home(driver);
	  signinpage ob=new signinpage(driver);
	ForgotPasswordPage FP=new  ForgotPasswordPage(driver);
	  it.SignInClick();
	  it.SignInButton();
	  ob.NeedHelp();
	  ob.ForgotPassword();
	  FP.EmailFieldKeys();
	  FP.CountinueButtonClick();
  }
/*   @BeforeClass
  @Parameters("browser")
  public void beforeClass(String browser) {
	  browser(browser);
	 // browser("Firefox");
	 // browser("Chrome");
	  
	  //System.setProperty("webdriver.chrome.driver","C:\\Users\\Muhammad Naeem\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
		// driver=new ChromeDriver();
		 
	/*System.setProperty("webdriver.gecko.driver","C:\\Users\\Muhammad Naeem\\Downloads\\geckodriver-v0.27.0-win64\\geckodriver.exe");	 
		
	  File pathBinary = new File("C:\\Users\\Muhammad Naeem\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
	  FirefoxBinary firefoxBinary = new FirefoxBinary(pathBinary);   
	  DesiredCapabilities desired = DesiredCapabilities.firefox();
	  FirefoxOptions options = new FirefoxOptions();
	  desired.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options.setBinary(firefoxBinary));
	   driver = new FirefoxDriver(options);*/
/*	  driver.get("https://www.google.co.in/"); 
		 
      driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get("https://www.Amazon.com");
		
		driver.manage().window().maximize();
		
  } 

  @AfterClass
  public void afterClass() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.close();
	  
  }
  public void browser(String br) {
	  if (br.equalsIgnoreCase("Chrome")) {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Muhammad Naeem\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://www.Amazon.com");
		driver.manage().window().maximize();
		
	  }
	  else if(br.equalsIgnoreCase("Firefox")) {
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
  } */

}
