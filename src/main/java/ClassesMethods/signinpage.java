package ClassesMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signinpage {
  

	public WebDriver driver;
@FindBy(linkText = "Need help?")
WebElement NeedHelpOption;
@FindBy(linkText = "Forgot your password?")
WebElement ForgotPasswordRecover;
public signinpage(WebDriver driver) {
	this.driver=driver;
		PageFactory.initElements(driver, this);
	
}
public void NeedHelp() {
	NeedHelpOption.click();
}
public void ForgotPassword() {
	ForgotPasswordRecover.click();
}
}
