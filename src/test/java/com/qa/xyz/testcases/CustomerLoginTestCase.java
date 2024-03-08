package com.qa.xyz.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.xyz.base.TestBase;
import com.qa.xyz.pages.BankManagerLoginPage;
import com.qa.xyz.pages.CustomerAccPage;
import com.qa.xyz.pages.CustomerLoginPage;
import com.qa.xyz.pages.HomePage;
import com.qa.xyz.util.TestUtil;

// XB-T2	Verify the customer login functionality.
public class CustomerLoginTestCase extends TestBase {
	CustomerLoginPage cusloginPage;
	BankManagerLoginPage bankManagerLogin;
	HomePage homePage;
	TestUtil testUtil;
	CustomerAccPage custAccPage;

	public CustomerLoginTestCase() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		homePage = new HomePage();
		cusloginPage = homePage.clickOnCustomerLogin();
		custAccPage= cusloginPage.enterUsername();
	}

	@Test
	public void validateCustomerAcc() {
		boolean CustomerAcc = cusloginPage.verifyCustomerAcc();
		Assert.assertTrue(CustomerAcc);
	}



	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
