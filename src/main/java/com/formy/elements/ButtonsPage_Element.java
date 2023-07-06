package com.formy.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ButtonsPage_Element {
	WebDriver driver;

	public ButtonsPage_Element(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@class='btn btn-lg'][normalize-space()='Buttons']")
	public WebElement buttonsElement;
	
	@FindBy(xpath = "//button[normalize-space()='Primary']")
	public WebElement primarybTNElement;

	@FindBy(xpath = "//button[normalize-space()='Success']")
	public WebElement successBtnElement;

	@FindBy(xpath = "//button[normalize-space()='Info']")
	public WebElement infoBtnElement;

	@FindBy(xpath = "//button[normalize-space()='Warning']")
	public WebElement warningBtnWebElement;

	@FindBy(xpath = "//button[normalize-space()='Danger']")
	public WebElement dangerBtnElement;

	@FindBy(xpath = "//button[normalize-space()='Link']")
	public WebElement linkBtnElement;

	@FindBy(xpath = "//button[normalize-space()='Left']")
	public WebElement leftBtnElement;

	@FindBy(xpath = "//button[normalize-space()='Middle']")
	public WebElement middlBtnElement;

	@FindBy(xpath = "//button[normalize-space()='Right']")
	public WebElement rightBtnElement;

	@FindBy(xpath = "//button[normalize-space()='1']")
	public WebElement oneBtnElement;

	@FindBy(xpath = "//button[normalize-space()='2']")
	public WebElement twoBtnElement;

	@FindBy(xpath = "(//button[normalize-space()='Dropdown'])[1]")
	public WebElement dropDownBtnElement;

	@FindBy(xpath = "//a[normalize-space()='Dropdown link 1']")
	public WebElement dropdownLinkOne;

	@FindBy(xpath = "//a[normalize-space()='Dropdown link 2']")
	public WebElement dropdownLinkTwo;

}
