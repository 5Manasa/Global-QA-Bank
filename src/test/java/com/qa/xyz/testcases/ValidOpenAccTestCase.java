package com.qa.xyz.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.xyz.base.TestBase;
import com.qa.xyz.pages.BankManagerLoginPage;

import com.qa.xyz.pages.HomePage;
import com.qa.xyz.pages.OpenAccountPage;
import com.qa.xyz.util.TestUtil;

//XB-T10	Verify open account for valid data in bank manager login functionality.
public class ValidOpenAccTestCase extends TestBase {

	BankManagerLoginPage bankManagerLogin;
	HomePage homePage;
	TestUtil testUtil;
	OpenAccountPage openAccountPage;

	public ValidOpenAccTestCase() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		homePage = new HomePage();
		bankManagerLogin = homePage.clickOnBankManagerLogin();
		openAccountPage = bankManagerLogin.clickOnOpenAcc();
	}

	@Test(priority = 1)
	public void validateOpenCustomer() {
		openAccountPage.openAccountActions();
		Assert.assertTrue(openAccountPage.check());
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
