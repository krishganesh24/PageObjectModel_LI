package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.MainHomePage;
import wdMethods.ProjectMethods;

public class Test1 extends ProjectMethods {

	@BeforeTest
	public void setData() {
		testCaseName="TC001_CreatePropsal";
		testDescription="Create Proposal functionality";
		browserName="chrome";
		dataSheetName="TC001_CreateProposal";

	}

	@Test(dataProvider="fetchData")
	public void createProposal(String uName,String pwd,String fName,String lName,String phone,String eMail, String doc,String file,String msg)
	{

		new MainHomePage().clicksign()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn().clickProposal().enterFirstName(fName).enterLastName(lName).enterPhoneNo(phone).
		enterEmail(eMail).clickAddmoreBtn().selectDcoumentTypeDropdown(doc).chooseOption(file).clickSaveBtn().verifySuccessMsg(msg);


	}	

}