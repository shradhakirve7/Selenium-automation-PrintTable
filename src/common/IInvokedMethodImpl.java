package common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class IInvokedMethodImpl implements IInvokedMethodListener {

	@Override
	public void afterInvocation(IInvokedMethod arg0, ITestResult arg1) {
		// TODO Auto-generated method stub
		WebDriverFactory.threadStorage.get().quit();
		
		
	}

	@Override
	public void beforeInvocation(IInvokedMethod arg0, ITestResult arg1) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","C:\\geckoDriver\\geckoDriver.exe");
		WebDriverFactory.threadStorage.set(new FirefoxDriver());
		WebDriverFactory.threadStorage.get().get("https://opensource-demo.orangehrmlive.com/");
		WebDriverFactory.threadStorage.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//.driver=new ChromeDriver();
	    WebDriverFactory.threadStorage.get().get("https://opensource-demo.orangehrmlive.com/");	

	}

}
