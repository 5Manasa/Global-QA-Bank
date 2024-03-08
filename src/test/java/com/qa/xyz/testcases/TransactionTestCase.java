package com.qa.xyz.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.xyz.base.TestBase;
import com.qa.xyz.pages.CustomerAccPage;
import com.qa.xyz.pages.CustomerLoginPage;
import com.qa.xyz.pages.HomePage;
import com.qa.xyz.pages.TransactionPage;
import com.qa.xyz.util.TestUtil;


//XB-T3	Verify the Transactions in customer login functionality.

	public class TransactionTestCase extends TestBase {
		CustomerLoginPage cusloginPage;
		HomePage homePage;
		TestUtil testUtil;
		CustomerAccPage custAccPage;
		TransactionPage transPage;

		public TransactionTestCase() {
			super();
		}

		//test cases should be separated -- independent with each other
		//before each test case -- launch the browser and login
		//@test -- execute test case
		//after each test case -- close the browser
		
		@BeforeMethod
		public void setUp() {
			initialization();
			homePage = new HomePage();
			cusloginPage = homePage.clickOnCustomerLogin();
			custAccPage = cusloginPage.enterUsername();
			transPage = custAccPage.clickOnTransactionsPage();
		}
		
		
		@Test(priority=1)
		public void verifyTransactions(){
			Assert.assertTrue(transPage.TransactionType());
			
		}
		
		@Test(priority=2)
		public void verifyRecords(){
			Assert.assertTrue(transPage.verifyrecords());
		}
		
		@AfterMethod
		public void tearDown(){
			driver.close();
		}
		
	}


