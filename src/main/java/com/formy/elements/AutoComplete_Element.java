package com.formy.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutoComplete_Element {
	WebDriver driver;

	public AutoComplete_Element(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='btn btn-lg'][normalize-space()='Autocomplete']")
	public WebElement autocompletElement;

	@FindBy(xpath = "//input[@id='autocomplete']")
	public WebElement enterAdressElement;

	@FindBy(xpath = "//input[@id='street_number']")
	public WebElement streetAdressElement;

	@FindBy(xpath = "//input[@id='locality']")
	public WebElement cityElement;

	@FindBy(css = "#administrative_area_level_1")
	public WebElement statElemente;

	@FindBy(xpath = "//input[@id='postal_code']")
	public WebElement zipCodeeElement;

	@FindBy(xpath = "//input[@id='country']")
	public WebElement countryElement;

	@FindBy(xpath = "//h1[normalize-space()='Autocomplete']")
	public WebElement autocompleteTextVerify;
	
	@FindBy(xpath = "//a[@class='dropdown-item']")
	public WebElement componentsElmentsTextVerify;

}
