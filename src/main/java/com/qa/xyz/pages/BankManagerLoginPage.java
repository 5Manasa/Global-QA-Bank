package com.qa.xyz.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.xyz.base.TestBase;

public class BankManagerLoginPage extends TestBase {

	// Page Factory - OR:
	@FindBy(xpath = "(//button[@class='btn btn-lg tab'])[1]")
	WebElement addcustomer;

	@FindBy(xpath = "(//button[@class='btn btn-lg tab'])[2]")
	WebElement openAccount;

	@FindBy(xpath = "(//button[@class='btn btn-lg tab'])[3]")
	WebElement customers;

	// Initializing the Page Objects:
	public BankManagerLoginPage() {
		PageFactory.initElements(driver, this);
	}

	// Actions:

	public  AddCustomerPage clickOnAddCustomer() {
		addcustomer.click();
		return new AddCustomerPage();
	}

	public OpenAccountPage clickOnOpenAcc() {
		openAccount.click();
		return new OpenAccountPage();
	}

	public CustomersPage clickOnCustomers() {
		customers.click();
		return new CustomersPage();

	}

}
