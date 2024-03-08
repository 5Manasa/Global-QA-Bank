package com.qa.xyz.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.xyz.base.TestBase;

public class CustomerAccPage extends TestBase {

	@FindBy(xpath = "//select[@id='accountSelect']")
	WebElement AccSelect;

	@FindBy(xpath = "(//button[@class='btn btn-lg tab'])[1]")
	@CacheLookup
	WebElement Transactions;

	@FindBy(xpath = "(//button[@class='btn btn-lg tab'])[2]")
	WebElement Deposit;

	@FindBy(xpath = "(//button[@class='btn btn-lg tab'])[3]")
	WebElement Withdrawal;

	@FindBy(xpath = "//button[contains(text(),'Logout')]")
	WebElement Logout;

	// Initializing the Page Objects:
	public CustomerAccPage() {
		PageFactory.initElements(driver, this);
	}

	public void selectAcc() {
		AccSelect.click();
		Select sel = new Select(AccSelect);
		sel.selectByVisibleText("1001");

	}

	public TransactionPage clickOnTransactionsPage() {
		Transactions.click();
		return new TransactionPage();
	}

	public DepositPage clickOnDepositePage() {
		Deposit.click();
		return new DepositPage();
	}

	public withdrawalPage clickOnWithdrawalPage() {
		Withdrawal.click();
		return new withdrawalPage();

	}

	public CustomerAccPage clickOnLogout() {
		Logout.click();
		return new CustomerAccPage();
	}

	public boolean LogOut() {
		return Logout.isDisplayed();

	}

}
