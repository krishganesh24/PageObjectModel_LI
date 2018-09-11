package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class HomePage extends ProjectMethods{
	
	public HomePage() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.LINK_TEXT,using="proposal Tool")
	private WebElement proposal;
	
	public HomePage clickProposal() {
		click(proposal);
		return this;	
	}
	
		
	@FindBy(how=How.ID,using="firstName")
	private WebElement firstname;
	public HomePage enterFirstName(String data) {
		type(firstname,data);
		return this;
	}
	
	
	@FindBy(how=How.ID,using="lastName")
	private WebElement lastname;
	
	public HomePage enterLastName(String data) {
		type(lastname, data);
		return this;
	}
	
	
	@FindBy(how=How.ID,using="phNo")
	private WebElement phoneno;
	
	public HomePage enterPhoneNo(String data) {
		type(phoneno,data);
		return this;		
	}
	
	
	@FindBy(how=How.ID,using="email")
	private WebElement email;
	
	public HomePage enterEmail(String data) {
		type(email,data);
		return this;		
	}
	
	
	@FindBy(how=How.XPATH,using="(//span[@class='add-row error'])[3]")
	private WebElement addmorebtn;
	
	public HomePage clickAddmoreBtn() {
		click(addmorebtn);
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="//select[@class='documents styled-select valid']")
	private WebElement documentdropdown;

	public HomePage selectDcoumentTypeDropdown(String data) {
		selectDropDownUsingText(documentdropdown, data);
		return this;
		
	}
	
	
	@FindBy(how=How.XPATH,using="(//input[@type='file'])[1]")
	private WebElement filepath;

	public HomePage chooseImageOption(String data) {
		type(filepath,data);
		return this;
	}
	
	
	
	@FindBy(how=How.XPATH,using="((//input[@type='file'])[3]")
	private WebElement file;

	public HomePage chooseOption(String data) {
		type(file,data);
		return this;
	}
	
	@FindBy(how=How.ID,using="btn-addLeadsForm")
	private WebElement savebtn;
	
	public HomePage clickSaveBtn() {
		click(savebtn);
		return this;	
	}
	
	
	
	@FindBy(how=How.XPATH,using="//div[@id='globalMessages']/div/ul/li")
	private WebElement verifymsg;

	public HomePage verifySuccessMsg(String data) {
		verifyExactText(verifymsg, data);
		return this;
	}
}
	
	