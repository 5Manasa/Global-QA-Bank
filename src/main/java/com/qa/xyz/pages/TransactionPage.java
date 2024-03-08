package com.qa.xyz.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.xyz.base.TestBase;


public class TransactionPage extends TestBase {

	@FindBy(xpath = "(//button[@class='btn btn-lg tab'])[1]")
	@CacheLookup
	WebElement Transactions;

	@FindBy(xpath = "//button[contains(text(),'>')]")
	WebElement next;
	
	@FindBy(xpath = "//button[contains(text(),'<')]")
	WebElement previous;
	
	@FindBy(xpath = "//button[contains(text(),'Top')]")
	WebElement Top;

	@FindBy(xpath = "//input[@id='start']")
	WebElement startdate;
	
	@FindBy(xpath = "(//input[@placeholder='yyyy-MM-ddTHH:mm:ss'])[1]")
	WebElement sdate;
			
	@FindBy(xpath = "//input[@id='end']")
	WebElement enddate;
	
	@FindBy(xpath = "(//input[@placeholder='yyyy-MM-ddTHH:mm:ss'])[2]")
	WebElement edate;
	
	@FindBy(xpath = "(//td[@class='ng-binding'])[3]")
	WebElement list;
	
	@FindBy(xpath = "//thead/tr/td[3]")
	WebElement Type;

	// Initializing the Page Objects:
	public TransactionPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void checkTransactions(){
		Transactions.click();
		startdate.click();
		sdate.click();
		edate.click();
		next.click();
		Top.click();
		previous.click();
		
	}
	
	public boolean TransactionType() {
		return Type.isDisplayed();
			
	}
	
	public boolean verifyrecords() {
		return list.isDisplayed();
			
	}


		
}
