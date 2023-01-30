package com.QaTestes.automation.patrice.selenium.pages;

import org.openqa.selenium.By;

public class RegisterPage extends BasePage {
	//Locators
	private By emailAddressLocator = By.id("email_create");
	private By submitBntLocator = By.id("SubmitCreate");
	private By emailLocator = By.id("email");
	private By AdditionalInformationLocator = By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[5]/span");
	private By genderFemaleLocator = By.id("id_gender2");
	private By firstNameLocator = By.id("customer_firstname");
	private By lastNameLocator = By.id("customer_lastname");
	private By passwordLocator = By.id("passwd");
	private By daysLocator = By.id("days");
	private By monthsLocator = By.id("months");
	private By yearsLocator = By.id("years");
	private By newsletterLocator = By.id("newsletter"); 
	private By receiveOffersLocator = By.id("optin");
	private By registerBtnLocator = By.id("submitAccount");
	private By welcomeMessageLocator = By.cssSelector("#center_column > p.alert.alert-success"); 
	
	public void insertEmailToRegister() {
		if(super.isDisplayed(emailAddressLocator)) {
			type("an.dreza-@hotmail.com", emailAddressLocator);
			click(submitBntLocator);
		}else {
			System.out.println("email textbox was not present");
		}
	}
	
	public void fillOutForm() {
		this.insertEmailToRegister();
		super.waitVisibilityOfElementLocated(AdditionalInformationLocator);
		if(super.isDisplayed(genderFemaleLocator)) {
			super.click(genderFemaleLocator);
			super.type("Andreza", firstNameLocator);
			super.type("Tuanny", lastNameLocator);
			super.type("1234@", passwordLocator);
			super.selectByValue(daysLocator, "13");
			super.selectByValue(monthsLocator, "2");
			super.selectByValue(yearsLocator, "1995");
			super.click(newsletterLocator);
			super.click(receiveOffersLocator);
			super.click(registerBtnLocator);
		} else {
			System.out.println("message was not found.");
		}
	}
	public String getEmailNewAccount() {
		super.waitVisibilityOfElementLocated(AdditionalInformationLocator);
		return super.getTextByAttribute(this.emailLocator, "value");
	}
	
	public String getWelcomeMessage() {
		super.waitVisibilityOfElementLocated(welcomeMessageLocator);
		return super.getText(welcomeMessageLocator);
	}
}
