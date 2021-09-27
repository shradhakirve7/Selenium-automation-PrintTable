package test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import common.IInvokedMethodImpl;
import pages.AdminPage;
import pages.HomePage;
import pages.Loginpage;
@Listeners(IInvokedMethodImpl.class)
public class AddUserTest {

	@Test
	public void verifyadmin()
	{
	Loginpage lp=new Loginpage();
	lp.login("admin","admin123")//return hp
	.navigatetoAdminPage();//return adp
	/*.GotoAduserPage().//return adu
	addUser("shradha", "shra", "pased", "pased");
	*/
	}
	
}
