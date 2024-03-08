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
import com.qa.xyz.pages.withdrawalPage;
import com.qa.xyz.util.TestUtil;

// XB-T7	Verify the Withdrawal for invalid amount in customer login functionality.

public class InvalidWithdrawalTestCase extends TestBase {
	CustomerLoginPage cusloginPage;
	BankManagerLoginPage bankManagerLogin;
	HomePage homePage;
	TestUtil testUtil;
	CustomerAccPage custAccPage;
	withdrawalPage withdrawalPage;

	public InvalidWithdrawalTestCase() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		homePage = new HomePage();
		cusloginPage = homePage.clickOnCustomerLogin();
		custAccPage = cusloginPage.enterUsername();
		withdrawalPage = custAccPage.clickOnWithdrawalPage();
	}

	@Test(priority = 1)
	public void validateDeposit() {
		withdrawalPage.invalidwithdrawAmt();
		Assert.assertTrue(withdrawalPage.successWithdraw());
	}

	@Test(priority = 2)
	public void verifyDepositRecord() {
		withdrawalPage.invalidwithdrawAmt();
		withdrawalPage.verifyWithdrawl();
		Assert.assertTrue(withdrawalPage.check());
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
