package com.qa.xyz.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.xyz.base.TestBase;



public class CustomerLoginPage extends TestBase{
	
	//Page Factory - OR:
	@FindBy(xpath = "//select[@id='userSelect']")
	WebElement username;
	
	@FindBy(xpath = "//button[contains(text(),'Customer Login')]")
	WebElement CustomerLogin;
		
	@FindBy(xpath="//button[contains(text(),'Login')]")
	WebElement loginBtn;
	
	
	@FindBy(xpath = "//span[contains(text(),'Hermoine Granger')]")
	WebElement CustomerAcc;

	
	
	//Initializing the Page Objects:
	public CustomerLoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions:

	public CustomerAccPage enterUsername() {
		username.click();
        Select sel=new Select(username);
		sel.selectByVisibleText("Hermoine Granger");
		loginBtn.click();
		return new CustomerAccPage();
	
	}
	
	public boolean verifyCustomerAcc() {
		return CustomerAcc.isDisplayed();
	}
	

}

