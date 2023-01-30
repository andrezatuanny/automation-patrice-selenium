package com.QaTestes.automation.patrice.selenium.pages;

import org.openqa.selenium.By;

public class DressesPage extends BasePage {
	//Locators
	private By menuDessesLocator = By.cssSelector("#block_top_menu > ul > li:nth-child(2) > a");
	private By submenuCasualDressesLocator = By.cssSelector("#block_top_menu > ul > li:nth-child(2) > ul > li:nth-child(1) > a");
	private By titlePageCasualDressesLocator = By.className("cat-name");
	
	public void viewCasualDressesPage(){
		if(super.isDisplayed(menuDessesLocator)) {
			super.actionMoveToElementPerform(menuDessesLocator);
			super.actionMoveToElementClickPerform(submenuCasualDressesLocator);
		}else {
			System.out.println("menu dresses was not found");
		}
	}
	
	public String getTitlePage() {
		return super.getText(titlePageCasualDressesLocator);
	}
	
}
