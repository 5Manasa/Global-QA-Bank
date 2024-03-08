package com.qa.xyz.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.xyz.base.TestBase;
import com.qa.xyz.pages.AddCustomerPage;
import com.qa.xyz.pages.BankManagerLoginPage;

		
import com.qa.xyz.pages.HomePage;

import com.qa.xyz.util.TestUtil;

//XB-T8	Verify add customer for valid data in bank manager login functionality.
	public class ValidAddCustomerTestCase extends TestBase {
			
			BankManagerLoginPage bankManagerLogin;
			HomePage homePage;
			TestUtil testUtil;
			AddCustomerPage addcustomerPage;
			
			

			public ValidAddCustomerTestCase() {
				super();
			}

			@BeforeMethod
			public void setUp() {
				initialization();
				homePage = new HomePage();
				bankManagerLogin = homePage.clickOnBankManagerLogin();
				addcustomerPage = bankManagerLogin. clickOnAddCustomer();
			}
			
			@Test(priority = 1)
			public void validateAddCustomer() {
				addcustomerPage.addcustomerActions();
		        Assert.assertTrue(addcustomerPage.check());
			}

		

			@AfterMethod
			public void tearDown() {
				driver.close();
			}

		}


