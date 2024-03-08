package com.qa.xyz.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.xyz.base.TestBase;

public class AddCustomerPage extends TestBase {

	// Page Factory - OR:

	@FindBy(xpath = "//input[@placeholder='First Name']")
	WebElement Firstname;

	@FindBy(xpath = "//input[@placeholder='Last Name']")
	WebElement lastname;

	@FindBy(xpath = "//input[@placeholder='Post Code']")
	WebElement PostalCode;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement submit;
	
	@FindBy(xpath = "//label[contains(text(),'First Name :')]")
	WebElement FirstnameCheck;

	// Initializing the Page Objects:
	public AddCustomerPage() {
		PageFactory.initElements(driver, this);
	}

	// Actions:

	public void addcustomerActions() {
		Firstname.sendKeys("Manasa");
		lastname.sendKeys("Tungala");
		PostalCode.sendKeys("500072");
		submit.click();
		
		Alert alt1 = driver.switchTo().alert();
		alt1.accept();
		
	}
	
	public void invalidaddcustomerActions() {
		Firstname.sendKeys("ManasahcbagyvcayHGSDJIHSDGUEDGAXVHhjsxbadb");
		lastname.sendKeys("TungalavcsgfbhXDwtaaaaaaaaaaaaaaaaaaaayDVaj");
		PostalCode.sendKeys("@$&852wqfsdw");
		submit.click();
		
		Alert alt2 = driver.switchTo().alert();
		alt2.accept();
	}
	
	public boolean check() {
		return FirstnameCheck.isDisplayed();
	}

}
