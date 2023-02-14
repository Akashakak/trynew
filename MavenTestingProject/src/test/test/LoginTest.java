package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
	
	
	@Test(priority =0 , groups = {"Smoke","regression"})
	public void varifyTitleOfLoginPage() {
		String verifytitleofloginpage = loginpage.titleofloginpage();
		Assert.assertEquals(verifytitleofloginpage, "Login");
		
	}
	@Test (priority =1 , groups = {"Smoke","regression"})
	public void verifyCurrentUrlOfPage() {
	String verifycurrenturlofpage= 	loginpage.urlofPage();
	Assert.assertEquals(verifycurrenturlofpage, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test(priority =2 , groups = {"Smoke","regression"})
	public void verifyLoginWithCorrectCreential() {
		loginpage.SetUserName("Admin");
		loginpage.SetPassword("admin123");
		loginpage.ClickLoginButton();
		String titleofDash = dashboard.titleOfDashboardpage();
		Assert.assertEquals(titleofDash, "Dashboard");
		}
	@Test (priority =-1 , groups = {"Smoke","regression"})
	public void VerifyBuildTitleName() {
		String verifydashboardtitle =loginpage.GetBuidTitle();
		Assert.assertEquals(verifydashboardtitle, "OrangeHRM");
	}
	

}
