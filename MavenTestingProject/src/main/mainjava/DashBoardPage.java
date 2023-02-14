package mainjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.Commontest;

public class DashBoardPage extends BaseClass{

	//All the locators of page
	@FindBy(xpath = "//h6[text()='Dashboard']")
	WebElement titleofDashBoard;
	
	
	
	
	//Initialization of locators/variables
	public DashBoardPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	//all methods of page 
	
	/*
	 * Author : Akash Kawale
	 * Date : 04 Feb 2023
	 * Description : This Test method is use to verify dashboard page title
	 * parameter : String
	 */
	public String titleOfDashboardpage() {
		return titleofDashBoard.getText();
		
	}
}
