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

//XB-T9	Verify add customer for invalid data in bank manager login functionality.
	public class InvalidAddCustomerTestCase extends TestBase {
			
			BankManagerLoginPage bankManagerLogin;
			HomePage homePage;
			TestUtil testUtil;
			AddCustomerPage addcustomerPage;
			
			

			public InvalidAddCustomerTestCase() {
				super();
			}

			@BeforeMethod
			public void setUp() {
				initialization();
				homePage = new HomePage();
				bankManagerLogin = homePage.clickOnBankManagerLogin();
				addcustomerPage = bankManagerLogin. clickOnAddCustomer();
			}
			
			@Test
			public void validateAddCustomer() {
				addcustomerPage.invalidaddcustomerActions();
				 Assert.assertFalse(addcustomerPage.check());
			}

		

			@AfterMethod
			public void tearDown() {
				driver.close();
			}

		}

