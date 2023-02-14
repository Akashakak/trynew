package test;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;

public class Commontest extends BaseTest{
	
	@BeforeClass 
	public void LoginP() {
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	loginpage.SetUserName("Admin");
	loginpage.SetPassword("admin123");
	loginpage.ClickLoginButton();
	String titleofDash = dashboard.titleOfDashboardpage();
	Assert.assertEquals(titleofDash, "Dashboard");
	}

}
