package mainjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.Commontest;

public class PIMPage extends BaseClass {
@FindBy (xpath ="//*[text()='PIM']")
WebElement Pimclick;

@FindBy (xpath = "//h6[text()='PIM']")
WebElement pimtext;

@FindBy (xpath = "//*[text()='Employee Id']//parent::div//following-sibling::div//input")
WebElement employid; 

@FindBy (xpath = "//*[text()=' Search ']")
WebElement Searchbtn;

@FindBy (xpath = "//*[@class ='orangehrm-container']")
WebElement searchRecordId;

//
public PIMPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}




/*
 * Author = Akash kawale
 * Date  = 08 Feb 2023
 * Description = This Test method is use to Click on PIM Page
 * Parameter 
 */
public void pimclick() {
	Pimclick.click();
}
/*
* Author = Akash kawale
* Date  = 08 Feb 2023
* Description = This Test method is use to pass the Employee ID
*/
public void EmployeeId(String Id) {
	employid.sendKeys(Id);
}

/*
* Author = Akash kawale
* Date  = 08 Feb2023
* Description = This Test method is use to Verify the PIM page
* Parameter = String
*/

public String pimbutton() {
	return pimtext.getText();
}

/*
* Author = Akash kawale
* Date  = 08 Feb2023
* Description = This Test method is use to Click on Search Button
*/
public void SearchButton() {
	Searchbtn.click();
}

/*
* Author = Akash kawale
* Date  = 08 Feb2023
* Description = This Test method is use to Click on Search Button
*/
public String getEmpIdFromSearchResult(String Empid) {
	return searchRecordId.findElements(By.xpath("//div[text()='"+Empid+"']")).get(0).getText();
}
}
