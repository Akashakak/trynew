package mainjava;

import org.openqa.selenium.WebDriver;

public abstract class BaseClass {		//abstract because we dont want to create object anywhere
	
	//Base Class is consisting only for Define Variable

	public static WebDriver driver;
	protected LoginPage loginpage;         //use only when we extends the class
	protected DashBoardPage dashboard;
	protected PIMPage pimclk1;
	protected Adminpage adminpage;
}
