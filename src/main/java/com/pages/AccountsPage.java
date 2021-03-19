package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountsPage {

	private WebDriver driver;
	private By accountSections = By.cssSelector(" div[class='row addresses-lists']");
	
	public AccountsPage(WebDriver driver) {
		
		this.driver = driver;
	}
	public int getAccountsSectionCount() {
		return driver.findElements(accountSections).size();
	}
	public String getAccountPageTitle() {
		return driver.getTitle();
	}
	
	public List<String> getAccountsSectionList() {
		List<String> accountList = new ArrayList<>();
		List<WebElement> accountsHeaderList = driver.findElements(accountSections);
		for(WebElement e : accountsHeaderList) {
			String text =e.getText();
			System.out.println(text);
			accountList.add(text);
			
		}
		return accountList;
		
	}
	
	
	
	
	
	
}
