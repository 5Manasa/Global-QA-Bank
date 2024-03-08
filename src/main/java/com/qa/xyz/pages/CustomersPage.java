package com.qa.xyz.pages;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;


	import com.qa.xyz.base.TestBase;

		public class CustomersPage extends TestBase {

			// Page Factory - OR:

			@FindBy(xpath = "//input[@placeholder='Search Customer']")
			WebElement Search;

			@FindBy(xpath = "//button[contains(text(),'Delete')]")
			WebElement Delete;

			

			// Initializing the Page Objects:
			public CustomersPage() {
				PageFactory.initElements(driver, this);
			}

			// Actions:

			public void customersActions() {
				Search.sendKeys("Harry");
				Delete.click();
				
			}
			

		}


