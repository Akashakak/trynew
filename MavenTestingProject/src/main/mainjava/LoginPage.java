package mainjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.BaseTest;

public class LoginPage extends BaseClass {
	// All the Locators of page
	@FindBy(xpath = "//*[text()='Login']")
	WebElement txtloginpage;
	@FindBy(name = "username")
	WebElement userName;
	@FindBy(name = "password")
	WebElement pass;
	@FindBy(tagName = "button")
	WebElement loginbutton;

	// Initialization of locators /variables
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Metod requires to perform test steps
	/*
	 * Author : Akash Kawale Date :04 feb 2023 
	 * Description : This Test Method is use to verify Login page title
	 * parameter return : String
	 */
	public String titleofloginpage() {
		return txtloginpage.getText();
	}
	/*
	 * Author : Akash Kawale 
	 * Date :04 feb 2023 
	 * Description : This Test Method is use
	 * to verify Login page title parameter return : String
	 */

	public String urlofPage() {
		return driver.getCurrentUrl();

	}
	/*
	 * Author : Akash Kawale 
	 * Date :04 feb 2023 
	 * Description : This Test Method is use to verify Login page title 
	 */
	public void SetUserName(String username) {
		userName.sendKeys(username);

	}
	/*
	 * Author : Akash Kawale 
	 * Date :04 feb 2023 
	 * Description : This Test Method is use to verify Login page title  
	 */
	public void SetPassword(String C) {
		pass.sendKeys(C);
	}
	/*
	 * Author : Akash Kawale 
	 * Date :04 feb 2023 
	 * Description : This Test Method is use to verify Login page title 
	 */
	public void ClickLoginButton() {
		loginbutton.click();
	}
	/*
	 * Author : Akash Kawale 
	 * Date :04 feb 2023 
	 * Description : This Test Method is use to verify Login page title 
	 * parameter = reurn String
	 */
	public String GetBuidTitle() {
		return driver.getTitle();
	}
}
