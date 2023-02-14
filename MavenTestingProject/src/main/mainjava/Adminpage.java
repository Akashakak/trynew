package mainjava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.Commontest;

public class Adminpage extends BaseClass{
	
	//WebElements 
	@FindBy (xpath = "//span[text()='Admin']")
	WebElement Adminpage;
	
	@FindBy (xpath = "//span[text()='Job ']//parent::li//following-sibling::i")
	WebElement jobDdown;
	
	@FindBy (xpath = "//*[text()='Job Titles']")
	WebElement jobtitles;
	
	@FindBy (xpath = "//h6[text()='Job Titles']")
    WebElement textJObTitles;	
	
	@FindBy (xpath ="//*[text()='Account Assistant']//parent::div//preceding-sibling::div//span//i")
	WebElement boxes;
	
	@FindBy (xpath = "//*[text()='Pay Grades']") 
	WebElement paygards;
	
	
	
	
	
	
	//Driver selection
	public Adminpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Methods
	/*
	 * Author : Akash kawale
	 * Date : 07 Feb2023
	 * Description : This Method is use to click on Admin page
	 */
	public void Adminpageclick() {
		Adminpage.click();
		}
	/*
	 * Author : Akash kawale
	 * Date : 07 Feb2023
	 * Description : This Method is use to click on Job Click
	 */
	public void JobClick() {
		jobDdown.click();
	}
	
	/*
	 * Author : Akash kawale
	 * Date : 07 Feb2023
	 * Description : This Method is use to click on Job Titles
	 */
	public void JoBTitles() {
		jobtitles.click();
	}
	
	/*
	 * Author : Akash Kawale
	 * Date : 07 Feb2023
	 * Description : This Method Used to Verify the Job Title Text
	 * Parameter : String
	 */
	public String JobTitless() {
		return textJObTitles.getText();
	}
	
	/*
	 * Author : Akash Kawale 
	 * Date : 07 Feb2023
	 * Description : This method is use to click the CheckBoxes
	 */
	public void CheckBoxes() {
		List<WebElement> Boexss  = boxes.findElements(By.xpath("//*[text()='Account Assistant']//parent::div//preceding-sibling::div//span//i"));
		for(WebElement Beox : Boexss) {
			Beox.click();
		}
		/*
		 * Author : Akash Kawale 
		 * Date   : 07 Feb2023
		 * Description : This method is use to click on job 
		 */
		
	}
	
}
