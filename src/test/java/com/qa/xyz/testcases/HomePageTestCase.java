package com.qa.xyz.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.xyz.base.TestBase;
import com.qa.xyz.pages.BankManagerLoginPage;
import com.qa.xyz.pages.CustomerLoginPage;
import com.qa.xyz.pages.HomePage;
import com.qa.xyz.util.TestUtil;

// XB-T1	Verify the Home page functionalities.
public class HomePageTestCase extends TestBase {
	CustomerLoginPage cusloginPage;
	BankManagerLoginPage bankManagerLogin;
	HomePage homePage;
	TestUtil testUtil;
	

	public HomePageTestCase() {
		super();
	}

	//test cases should be separated -- independent with each other
	//before each test case -- launch the browser and login
	//@test -- execute test case
	//after each test case -- close the browser
	
	@BeforeMethod
	public void setUp() {
		initialization();
		testUtil = new TestUtil();
		bankManagerLogin = new BankManagerLoginPage();
		cusloginPage = new CustomerLoginPage();
		homePage = new HomePage();
	}
	
	
	@Test(priority=1)
	public void verifyHomePageTitle(){
		String homePageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "XYZ Bank","Home page title not matched");
	}
	
	@Test(priority=2)
	public void verifyCustomerLoginTest(){
		homePage.clickOnCustomerLogin();
		Assert.assertTrue(homePage.verifyCustomerLogin());
	}
	
	@Test(priority=3)
	public void verifyBankManagerLoginTest(){
		homePage.clickOnBankManagerLogin();
		Assert.assertTrue(homePage.verifyBankManagerLogin());
	}
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.close();
	}
	
	

}
