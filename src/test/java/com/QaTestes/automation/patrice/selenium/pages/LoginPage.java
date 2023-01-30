package com.QaTestes.automation.patrice.selenium.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{
	//Locators
			private By emailAddressLocator = By.id("email");
			private By passwordAddressLocator = By.name("passwd");
			private By submitBtnAddressLocator = By.xpath("//*[@id=\"SubmitLogin\"]");
			private By tagMyAccountLocator = By.tagName("h1");
	
	public void signin() {
			if(super.isDisplayed(emailAddressLocator)) {
				super.type("atuanny@hotmail.com", emailAddressLocator);
				super.type("678@Test", passwordAddressLocator);
				super.click(submitBtnAddressLocator);
			}else {
				System.out.println("email textbox was not present");
			}
		}
	
	public String getMyAccountMessage() {
		return super.getText(tagMyAccountLocator);
	}

}
