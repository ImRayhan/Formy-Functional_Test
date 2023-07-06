package com.formy.pages;

import org.openqa.selenium.WebDriver;

import com.formy.elements.AutoComplete_Element;

public class Formy_AutoComplete_Page {
	WebDriver driver;
	String pageUrl = "https://formy-project.herokuapp.com/";

	AutoComplete_Element autoComplete_Element;

	public Formy_AutoComplete_Page(WebDriver driver) {
		this.driver = driver;
		autoComplete_Element = new AutoComplete_Element(driver);

	}

	public String gotoUrl() {
		return pageUrl;

	}

	public void clickAutocomplete() {
		autoComplete_Element.autocompletElement.click();

	}

	public void EnterAdress(String enterAdress) {

		autoComplete_Element.enterAdressElement.sendKeys(enterAdress);

	}

	public void StreetAdress(String streetAdress) {
		autoComplete_Element.streetAdressElement.sendKeys(streetAdress);

	}

	public void City(String city) {
		autoComplete_Element.cityElement.sendKeys(city);

	}

	public void State(String state) {
		autoComplete_Element.statElemente.sendKeys(state);

	}

	public void ZipCode(String zipCode) {
		autoComplete_Element.zipCodeeElement.sendKeys(zipCode);

	}

	public void Country(String country) {
		autoComplete_Element.countryElement.sendKeys(country);

	}
	
	public String visbleText() {
		return autoComplete_Element.autocompleteTextVerify.getText();
		
	}
	
	public Boolean EnbleComponents() {
		return autoComplete_Element.componentsElmentsTextVerify.isEnabled();
		
	}

	
}
