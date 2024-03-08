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

//XB-T6	Verify the Withdrawal for valid amount in customer login functionality.
	public class ValidWithdrawalTestCase extends TestBase {
		CustomerLoginPage cusloginPage;
		BankManagerLoginPage bankManagerLogin;
		HomePage homePage;
		TestUtil testUtil;
		CustomerAccPage custAccPage;
		withdrawalPage withdrawalPage;

		public ValidWithdrawalTestCase() {
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
		public void validateWithdrawl() {
			withdrawalPage.withdrawAmt();
	        Assert.assertTrue(withdrawalPage.successWithdraw());
		}

		@Test(priority = 2)
		public void verifyWithdrawlRecord() {
			withdrawalPage.withdrawAmt();
			withdrawalPage.verifyWithdrawl();
			Assert.assertTrue(withdrawalPage.check());
		}


		@AfterMethod
		public void tearDown() {
			driver.close();
		}

	}


