package com.formy.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwithWindow_Element {
	WebDriver driver;

	public SwithWindow_Element(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='btn btn-lg'][normalize-space()='Switch Window']")
	public WebElement swithWindowElement;

	@FindBy(xpath = "//button[@id='new-tab-button']")
	public WebElement openNewTabElement;

	@FindBy(xpath = "//button[@id='alert-button']")
	public WebElement openAlertElement;

	@FindBy(xpath = "//h1[normalize-space()='Switch Window']")
	public WebElement switchWindowTextElement;

}
