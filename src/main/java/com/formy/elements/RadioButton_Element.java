package com.formy.elements;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioButton_Element {
	WebDriver driver;

	public RadioButton_Element(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='btn btn-lg'][normalize-space()='Radio Button']")
	public WebElement radioButtonElement;

	@FindBy(xpath = "//input[@class='form-check-input']")
	public List<WebElement> radioButtonList123Elements;

	@FindBy(xpath = "//input[@value='option3']")
	public WebElement radioButton3Elements;

}
