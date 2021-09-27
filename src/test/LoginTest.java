package test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import common.IInvokedMethodImpl;
import pages.Loginpage;

@Listeners(IInvokedMethodImpl.class)
public class LoginTest {

	@Test
	public void verifyadmin()
	{
	Loginpage lp=new Loginpage();
	lp.login("admin","admin123");
	
	}
}
