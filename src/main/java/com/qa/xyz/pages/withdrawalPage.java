package com.qa.xyz.pages;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.CacheLookup;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;


	import com.qa.xyz.base.TestBase;

	public class withdrawalPage extends TestBase {

		// Page Factory - OR:

		@FindBy(xpath = "//button[@class='btn btn-lg tab btn-primary']")
		WebElement withdraw;

		@FindBy(xpath = "(//button[@class='btn btn-lg tab'])[1]")
		@CacheLookup
		WebElement Transactions;

		@FindBy(xpath = "//input[@type='number']")
		WebElement enterAmt;

		@FindBy(xpath = "//button[@type='submit']")
		WebElement withdrawSubmit;

		@FindBy(xpath = "//span[contains(text(),'Transaction successful')]")
		public
		WebElement successAlert;

		// Initializing the Page Objects:
		public withdrawalPage() {
			PageFactory.initElements(driver, this);
		}

		// Actions:

		public void withdrawAmt() {
			withdraw.click();
			enterAmt.sendKeys("5000");
			withdrawSubmit.click();
		}
		
		public void invalidwithdrawAmt() {
			withdraw.click();
			enterAmt.sendKeys("-1000");
			withdrawSubmit.click();
		}


		public TransactionPage verifyWithdrawl() {
			Transactions.click();
			return new TransactionPage();
		}
		
		public boolean check() {
			return enterAmt.isDisplayed();
		}

		public boolean successWithdraw() {
			return successAlert.isDisplayed();
		}
	}

