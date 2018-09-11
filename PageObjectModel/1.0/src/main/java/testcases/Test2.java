package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.MainHomePage;
import wdMethods.ProjectMethods;

public class Test2 extends ProjectMethods {

	@BeforeTest
	public void setData() {
		testCaseName="TC002_CreatePropsal";
		testDescription="Create Proposal functionality in liidaveqa application";
		browserName="chrome";
		dataSheetName="TC002_CreateProposal";

	}

	@Test(dataProvider="fetchData")
	public void createPropsal(String uName,String pwd,String fName,String lName,String phone,String eMail, String file,String msg) {

		new MainHomePage().clicksign()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn().clickProposal().enterFirstName(fName).enterLastName(lName).enterPhoneNo(phone).
		enterEmail(eMail).chooseImageOption(file).clickSaveBtn().verifySuccessMsg(msg);


	}	

}