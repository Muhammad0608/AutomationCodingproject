package pro_training.Automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import ClassesMethods.Home;
import Pro.Advance_sharing_codes;

public class Propertiess extends Advance_sharing_codes {
  @Test
  public void f() throws IOException {
	  Home it=new Home(driver);
	  it.AmazonIconClick();
	  String ActualURL=driver.getCurrentUrl();
	  System.out.println(System.getProperty("user.dir"));
	  SoftAssert Confirm=new SoftAssert();
	  Confirm.assertEquals(ActualURL, "https://www.amazon.com/ref=nav_logo");
	 	  Properties pro=new Properties();
	  FileInputStream ob=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\Pro\\Amazon.Properties");
  pro.load(ob);
  String name=pro.getProperty("Name");
  System.out.println("This to print Properties project ="+name);

	  it.SearchBoxField(name);
	  it.SearchIconClick();
	  WebElement Customerserviseverifacation= it.Customerserviseverifacation();
	 boolean Customer= Customerserviseverifacation.isDisplayed();
	 Confirm.assertEquals(Customer, true);
	  Confirm.assertAll();  
	  
	
  }
  
}
