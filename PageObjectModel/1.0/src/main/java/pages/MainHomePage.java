package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class MainHomePage extends ProjectMethods{
	
	public MainHomePage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.LINK_TEXT,using="Sign In")
	private WebElement signin;
	
	public LoginPage clicksign() {
		click(signin);
		return new LoginPage();
	}
	
		
	
	
	
	
	
	
	

}
