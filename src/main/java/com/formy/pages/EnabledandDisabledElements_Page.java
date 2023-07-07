package com.formy.pages;

import org.openqa.selenium.WebDriver;

import com.formy.elements.EnbleAndDisbleElements;

public class EnabledandDisabledElements_Page {
	WebDriver driver;
	EnbleAndDisbleElements enbleAndDisbleElements;
	String pageUrl = "https://formy-project.herokuapp.com/";
	
	public EnabledandDisabledElements_Page(WebDriver driver) {
		this.driver = driver;
		enbleAndDisbleElements = new EnbleAndDisbleElements(driver);
		
	}
	
	public String gotoUrl() {
		return pageUrl;
		
	}
	
	public void ClickEnbledAndDIsbled() {
		enbleAndDisbleElements.enblAndeDisblElement.click();
		
	}
	
	public boolean DisbledInputHere() {
		return enbleAndDisbleElements.disbleInputHerewElement.isEnabled();
		
	}
	public boolean InputHereEnbled() {
		return enbleAndDisbleElements.inputHereElement.isEnabled();
		
	}
	
	public void inputHere(String input) {
		enbleAndDisbleElements.inputHereElement.sendKeys(input);
		
	}

	public String enbledAndDisbledText() {
		return enbleAndDisbleElements.enabledandDisabledTextelements.getText();
		
	}

}
