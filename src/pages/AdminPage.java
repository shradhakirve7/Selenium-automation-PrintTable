package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.WebDriverFactory;

public class AdminPage {
	
	@FindBy(id="btnAdd")
	WebElement AddButton;

	WebDriverWait wait;
	
	 public AdminPage() 
		{	PageFactory.initElements(WebDriverFactory.threadStorage.get(), this);
		wait=new WebDriverWait(WebDriverFactory.threadStorage.get(),30);
	}
	
	public  AddUserPage  gotoAduserPage() {
		// TODO Auto-generated method stub
		AddButton.click();
		AddUserPage adu=new AddUserPage();
		return new AddUserPage().isPagedisplay() ;
	 	
	}
	
	public AdminPage isPageLoaded()
	{
		wait.until(ExpectedConditions.visibilityOf(AddButton));
		return this;
		
	}

	

}
