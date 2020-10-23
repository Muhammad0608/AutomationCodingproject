package pro_training.Automation;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import ClassesMethods.Home;
import Pro.Advance_sharing_codes;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;

public class Amazon_6 extends Advance_sharing_codes{
	// public WebDriver driver;
  @Test
  public void f() {

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
  
  

}
