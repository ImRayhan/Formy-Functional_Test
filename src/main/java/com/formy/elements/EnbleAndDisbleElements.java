package com.formy.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnbleAndDisbleElements {
	WebDriver driver;

	public EnbleAndDisbleElements(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@class='btn btn-lg'][normalize-space()='Enabled and disabled elements']")
	public WebElement enblAndeDisblElement;
	
	@FindBy(xpath = "//input[@id='disabledInput']")
	public WebElement disbleInputHerewElement;
	
	@FindBy(xpath = "//input[@id='input']")
	public WebElement inputHereElement;
	
	@FindBy(xpath = "//h1[normalize-space()='Enabled and Disabled elements']")
	public WebElement enabledandDisabledTextelements;


}
