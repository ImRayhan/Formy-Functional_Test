package com.formy.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KeyAndMousePrees_Element {
	WebDriver driver;

	public KeyAndMousePrees_Element(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@class='btn btn-lg'][normalize-space()='Key and Mouse Press']")
	public WebElement keyAndMousePressElement;

	@FindBy(xpath = "//input[@id='name']")
	public WebElement enterFullNameFieldElement;

	@FindBy(xpath = "//button[@id='button']")
	public WebElement buttonElement;
    
	@FindBy(xpath = "//h1[normalize-space()='Keyboard and Mouse Input']")
	public WebElement keyboardandMouseInput;
	
	

}
