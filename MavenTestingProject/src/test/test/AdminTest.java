package test;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AdminTest extends Commontest {

	@Test
	public void ClickonAdminPage() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		adminpage.Adminpageclick();
		adminpage.JobClick();
		adminpage.JoBTitles();
		String verifytheJobTitle = adminpage.JobTitless();
		Assert.assertEquals(verifytheJobTitle, "Job Titles");
	}

	@Test
	public void VerifyCheckBoxes() {
		adminpage.CheckBoxes();

	}
}
