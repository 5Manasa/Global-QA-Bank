package com.qa.xyz.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.xyz.base.TestBase;

	public class OpenAccountPage extends TestBase {

		// Page Factory - OR:

		@FindBy(xpath = "//select[@id='userSelect']")
		WebElement CustomerName;

		@FindBy(xpath = "//select[@id='currency']")
		WebElement Currency;

		@FindBy(xpath = "//button[contains(text(),'Process')]")
		WebElement Submit;
		
		@FindBy(xpath = "//label[contains(text(),'Customer :')]")
		WebElement CustomerCheck;

		// Initializing the Page Objects:
		public OpenAccountPage() {
			PageFactory.initElements(driver, this);
		}

		// Actions:

		public void openAccountActions() {
			CustomerName.click();
	        Select sel=new Select(CustomerName);
			sel.selectByVisibleText("Hermoine Granger");
			
			Currency.click();
	        Select sel1=new Select(Currency);
			sel1.selectByVisibleText("Dollar");
			Submit.click();
			
			Alert alt1 = driver.switchTo().alert();
			alt1.accept();
			
		}
		
	
		public boolean check() {
			return CustomerCheck.isDisplayed();
		}

	}


