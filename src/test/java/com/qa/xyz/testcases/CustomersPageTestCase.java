package com.qa.xyz.testcases;

	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;
	import com.qa.xyz.base.TestBase;
	import com.qa.xyz.pages.BankManagerLoginPage;
    import com.qa.xyz.pages.CustomersPage;
    import com.qa.xyz.pages.HomePage;
	import com.qa.xyz.util.TestUtil;

	//XB-T12	Verify the customers in bank manager login functionality.
	public class CustomersPageTestCase extends TestBase {

		BankManagerLoginPage bankManagerLogin;
		HomePage homePage;
		TestUtil testUtil;
		CustomersPage customersPage;

		public CustomersPageTestCase() {
			super();
		}

		@BeforeMethod
		public void setUp() {
			initialization();
			homePage = new HomePage();
			bankManagerLogin = homePage.clickOnBankManagerLogin();
			customersPage = bankManagerLogin.clickOnCustomers();
		}

		@Test
		public void validateCustomerDetails() {
			customersPage.customersActions();
//			Assert.assertTrue(customersPage.check());
		}

		@AfterMethod
		public void tearDown() {
			driver.close();
		}

	}
