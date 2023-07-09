package com.formy.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.formy.elements.KeyAndMousePrees_Element;

public class KeyboardandMousePress_Page {
	WebDriver driver;
	String pageUrl = "https://formy-project.herokuapp.com/";
	KeyAndMousePrees_Element keyAndMousePrees_Element;

	public KeyboardandMousePress_Page(WebDriver driver) {
		this.driver = driver;
		keyAndMousePrees_Element = new KeyAndMousePrees_Element(driver);
	}

	public String gotoUrl() {
		return pageUrl;

	}

	public void ClickKeyboardandMousePress() {
		keyAndMousePrees_Element.keyAndMousePressElement.click();

	}

	public void EnterFullName(String fullName) {
		keyAndMousePrees_Element.enterFullNameFieldElement.sendKeys(fullName);		

	}
	
	public void EnterDeletKey() {
		keyAndMousePrees_Element.enterFullNameFieldElement.sendKeys(Keys.BACK_SPACE);		
		
	}
	
	public void ButtonClick() {
		keyAndMousePrees_Element.buttonElement.click();
		
	}
	
	public String KeyboardandMouseInputText() {
		return keyAndMousePrees_Element.keyboardandMouseInput.getText();
		
	}

}
