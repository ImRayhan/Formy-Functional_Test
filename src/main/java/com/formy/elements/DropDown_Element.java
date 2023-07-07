package com.formy.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropDown_Element {

	WebDriver driver;

	public DropDown_Element(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='btn btn-lg'][normalize-space()='Dropdown']")
	public WebElement DropDown;

	@FindBy(id = "dropdownMenuButton")
	public WebElement dropDownButton;
	
	@FindBy(xpath = "//div[@class='dropdown-menu show']//a[@class='dropdown-item'][normalize-space()='Checkbox']")
	public WebElement dropDownCheckBoxButton;
	
	@FindBy(xpath = "//h1[normalize-space()='Checkboxes']")
	public WebElement CheckBoxDisplay;

}
