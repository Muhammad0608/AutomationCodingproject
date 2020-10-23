package pro_training.Automation;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import ClassesMethods.Home;
import Pro.Advance_sharing_codes;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;

public class Provider extends Advance_sharing_codes {
  @Test(dataProvider = "search")
  public void f(String n) throws IOException {
Home it=new Home(driver);
	  
	  it.AmazonIconClick();
	  String ActualURL=driver.getCurrentUrl();
	  SoftAssert Confirm=new SoftAssert();
	  Confirm.assertEquals(ActualURL, "https://www.amazon.com/ref=nav_logo");
     it.SearchBoxField(n);
	  it.SearchIconClick();
	  WebElement Customerserviseverifacation= it.Customerserviseverifacation();
	 boolean Customer= Customerserviseverifacation.isDisplayed();
	 Confirm.assertEquals(Customer, true);
	  Confirm.assertAll();
Pictures();
  }

  @DataProvider
  public Object[][] search() {
    return new Object[][] {
      new Object[] { "phones" },
      new Object[] { "Home" },
      new Object[] {"Store"},
    };
  }
}
