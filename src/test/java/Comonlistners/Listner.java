package Comonlistners;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

/*public class Listner implements ITestListener {
	public WebDriver driver;
 public void onTestStrat(ITestResult result) {
	 System.out.println("Test is started");
}
 public void onTestSuccess(ITestResult result) {
	
	 Date dt=new Date();
		String sd=dt.toString().replace(" ", "_").replace(":", "_")+".png";
		File di=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
		FileHandler.copy(di,new File("C:\\Users\\Muhammad Naeem\\eclipse-workspace\\Automation\\Drivers\\Pictures\\Pass\\"+result.getTestName()+sd));
		}
		catch (IOException e) {
			e.printStackTrace();
		}
 }
	 public void onTestFailure(ITestResult result) {
		 Date dt=new Date();
			String sd=dt.toString().replace(" ", "_").replace(":", "_")+".png";
			File di=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try {
			FileHandler.copy(di,new File("C:\\Users\\Muhammad Naeem\\eclipse-workspace\\Automation\\Drivers\\Pictures\\Fail\\"+result.getTestName()+sd));
		}
			catch (IOException e) {
				e.printStackTrace();
			}
	 } 
 }*/

