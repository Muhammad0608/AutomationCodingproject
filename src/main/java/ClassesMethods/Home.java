package ClassesMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home {
	public WebDriver driver;
@FindBy(xpath="//*[@class='nav-sprite nav-logo-base']")
WebElement Amazonicon;
@FindBy(name="field-keywords")
WebElement Searchboxfield;
@FindBy(xpath="(//*[@class='nav-input'])[2]")
WebElement Seachiconclick;
@FindBy(id="nav-link-accountList")
WebElement Signinoption;
@FindBy(xpath = "(//*[text()='Sign in'])[1]")
WebElement Signinbutton;
@FindBy(xpath = "//a[text()='Customer Service']")
WebElement Customer;

public Home(WebDriver driver)  {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}
public void AmazonIconClick() {
	WebDriverWait ob=new WebDriverWait(driver, 10);
	ob.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='nav-sprite nav-logo-base']")));
	Amazonicon.click();
}
public void SearchBoxField(String phones) {
	Searchboxfield.sendKeys(phones);
}
public void SearchIconClick() {
	Seachiconclick.click();
}
public void SignInClick() {
	Actions ob=new Actions(driver);
	ob.moveToElement(Signinoption).build().perform();
}
public void SignInButton() {
	Actions ob=new Actions(driver);
	ob.moveToElement(Signinbutton).click().build().perform();
}
public WebElement Customerserviseverifacation() {
	return Customer;
}
}
