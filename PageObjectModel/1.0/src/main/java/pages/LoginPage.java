package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class LoginPage extends ProjectMethods{
	
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	
	/*@FindBy(how=How.LINK_TEXT,using="Sign In")
	private WebElement signin;
	
	public LoginPage clicksign() {
		click(signin);
		return this;
	}
	*/
		
	@FindBy(how=How.ID,using="j_username")
	private WebElement UserName;
	
	public LoginPage enterUserName(String data) {
		type(UserName, data);
		return this;
	}
	
	
	@FindBy(how=How.ID,using="j_password")
	private WebElement Password;
	
	public LoginPage enterPassword(String data) {
		type(Password, data);
		return this;
	}
	
	
	@FindBy(how=How.ID,using="loginsubmit")
	private WebElement Login;
	
	public HomePage clickLogIn() {
		click(Login);
		return new HomePage();		
	}
	
	
	
	
	
	
	
	
	

}
