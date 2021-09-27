package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.WebDriverFactory;

public class AddUserPage {

@FindBy(id="systemUser_userName")
WebElement username;

@FindBy(id="systemUser_employeeName_empName")
WebElement empname;
		
@FindBy(id="systemUser_password")
WebElement passw;

@FindBy(id="systemUser_confirmPassword")
WebElement confpaswd;

@FindBy(id="btnSave")
WebElement save;
WebDriverWait wait;

 public AddUserPage() {
PageFactory.initElements(WebDriverFactory.threadStorage.get(), this);
wait=new WebDriverWait(WebDriverFactory.threadStorage.get(),30);
}
public AdminPage addUser(String Ename,String uname,String pswd,String cpswd)
{
	empname.sendKeys(Ename);
	username.sendKeys(uname);
	passw.sendKeys(pswd);
	confpaswd.sendKeys(cpswd);
	save.click();
	AdminPage ap=new AdminPage();
	return ap.isPageLoaded();
}
public AddUserPage isPagedisplay() {
	// TODO Auto-generated method stub
	wait.until(ExpectedConditions.visibilityOf(empname));
	wait.until(ExpectedConditions.visibilityOf(passw));
	return this;
	}
}
