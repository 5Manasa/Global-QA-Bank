package com.qa.xyz.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.qa.xyz.base.TestBase;

public class DepositPage extends TestBase {

	// Page Factory - OR:

	@FindBy(xpath = "//button[@class='btn btn-lg tab btn-primary']")
	WebElement Deposit;

	@FindBy(xpath = "(//button[@class='btn btn-lg tab'])[1]")
	WebElement Transactions;

	@FindBy(xpath = "//input[@type='number']")
	WebElement enterAmt;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement depositSubmit;

	@FindBy(xpath = "//span[contains(text(),'Deposit Successful')]")
	public
	WebElement successAlert;

	// Initializing the Page Objects:
	public DepositPage() {
		PageFactory.initElements(driver, this);
	}

	// Actions:

	public void depositAmt() {
		Deposit.click();
		enterAmt.sendKeys("5000");
		depositSubmit.click();
	}
	
	public void depositInvalidAmt() {
		Deposit.click();
		enterAmt.sendKeys("-5000");
		depositSubmit.click();
	}
	public boolean success() {
		return successAlert.isDisplayed();
	}
	
	public TransactionPage verifyDeposit() {
		Transactions.click();
		return new TransactionPage();
	}
    
	public boolean check() {
		return depositSubmit.isDisplayed();
	}

}
