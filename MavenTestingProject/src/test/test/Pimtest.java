package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Pimtest extends Commontest{

	@Test 
	public void ClickOnPIMWebpage() throws InterruptedException {
		pimclk1.pimclick();
		pimclk1.EmployeeId("0025");
		pimclk1.SearchButton();
		String verifypimtext = pimclk1.pimbutton();
		Assert.assertEquals(verifypimtext, "PIM");
		
	}
	@Test
	public void verifytheresultofid() {
		String verifyid = pimclk1.getEmpIdFromSearchResult("1111");
		Assert.assertEquals(verifyid, "1111");
	}
}
