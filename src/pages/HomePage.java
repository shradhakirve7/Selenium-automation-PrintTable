package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;

import common.IInvokedMethodImpl;
import common.WebDriverFactory;
@Listeners(IInvokedMethodImpl.class)
public class HomePage {

	@FindBy(id="menu_admin_viewAdminModule")
	WebElement admintab;
	WebDriverWait wait;

	public AdminPage navigatetoAdminPage() {
		// TODO Auto-generated method stub
		
		admintab.click();
		
		AdminPage adp=new AdminPage();
		return adp;
	}
	
	public HomePage() {
		PageFactory.initElements(WebDriverFactory.threadStorage.get(), this);
		wait = new WebDriverWait(WebDriverFactory.threadStorage.get(), 30);
	}
	
	void ispageloaded()
	{
		wait.until(ExpectedConditions.elementToBeClickable(admintab));
		
	}
	
	
}
