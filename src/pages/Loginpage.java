package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.WebDriverFactory;

public class Loginpage {
	
	@FindBy(id="txtUsername")
    WebElement username;
	
	@FindBy(id="txtPassword")
	WebElement password;
	
	@FindBy(id="btnLogin")
	WebElement login;
	
	WebDriverWait wait;
	
	public Loginpage()
	{	
		PageFactory.initElements(WebDriverFactory.threadStorage.get(), this);
	}
	
	public HomePage login(String Uname, String pswd) {
		// TODO Auto-generated method stub
			username.sendKeys(Uname);
		password.sendKeys(pswd);
		login.click();
		
		HomePage hp=new HomePage();
		return hp;
	}
	
 
	
}
