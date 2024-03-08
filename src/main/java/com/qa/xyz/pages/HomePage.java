package com.qa.xyz.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.xyz.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//strong[contains(text(),'XYZ Bank')]")
	@CacheLookup
	WebElement PageTitle;

	@FindBy(xpath = "//button[contains(text(),'Customer Login')]")
	WebElement CustomerLogin;

	@FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
	WebElement BankManagerLogin;

	@FindBy(xpath = "//label[contains(text(),'Your Name :')]")
	WebElement username;
	
	@FindBy(xpath = "//div[@class='center']")
	WebElement Center;
	
	@FindBy(xpath = "//span[@class='fontBig ng-binding']")
	WebElement CustomerAcc;

	// Initializing the Page Objects:
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String verifyHomePageTitle() {
		return driver.getTitle();
	}

	public CustomerLoginPage clickOnCustomerLogin() {
		CustomerLogin.click();
		return new CustomerLoginPage();
	}

	public BankManagerLoginPage clickOnBankManagerLogin() {
		BankManagerLogin.click();
		return new BankManagerLoginPage();
	}
	
	public boolean verifyCustomerLogin() {
		return username.isDisplayed();
	}
	
	public boolean verifyBankManagerLogin() {
		return Center.isDisplayed();
	}

	public void HomePageActions() {
		Actions action = new Actions(driver);
		action.moveToElement(CustomerLogin).build().perform();
		CustomerLogin.click();
		action.moveToElement(BankManagerLogin).build().perform();
		BankManagerLogin.click();
	}

	public boolean verifyCustomerAcc() {
		return CustomerAcc.isDisplayed();
	}

}
