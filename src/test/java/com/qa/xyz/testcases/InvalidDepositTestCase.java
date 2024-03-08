package com.qa.xyz.testcases;

	import org.testng.Assert;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	import com.qa.xyz.base.TestBase;
	import com.qa.xyz.pages.BankManagerLoginPage;
	import com.qa.xyz.pages.CustomerAccPage;
	import com.qa.xyz.pages.CustomerLoginPage;
	import com.qa.xyz.pages.DepositPage;
	import com.qa.xyz.pages.HomePage;
	import com.qa.xyz.util.TestUtil;

//	XB-T5	Verify the Deposit for invalid amount in customer login functionality.

	public class InvalidDepositTestCase extends TestBase {
		CustomerLoginPage cusloginPage;
		BankManagerLoginPage bankManagerLogin;
		HomePage homePage;
		TestUtil testUtil;
		CustomerAccPage custAccPage;
		DepositPage depositPage;

		public InvalidDepositTestCase() {
			super();
		}

		@BeforeMethod
		public void setUp() {
			initialization();
			homePage = new HomePage();
			cusloginPage = homePage.clickOnCustomerLogin();
			custAccPage = cusloginPage.enterUsername();
			depositPage = custAccPage.clickOnDepositePage();
		}

		@Test(priority = 1)
		public void validateDeposit() {
			depositPage.depositInvalidAmt();
	        Assert.assertTrue(depositPage.success());
		}

		@Test(priority = 2)
		public void verifyDepositRecord() {
			depositPage.depositInvalidAmt();
			depositPage.verifyDeposit();
			Assert.assertTrue(depositPage.check());
		}


		@AfterMethod
		public void tearDown() {
			driver.close();
		}

	}
