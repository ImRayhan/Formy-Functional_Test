package com.formy.elements;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBox_Element {
	WebDriver driver;

	public CheckBox_Element(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@class='btn btn-lg'][normalize-space()='Checkbox']")
	public WebElement checkBoxElement;

	@FindBy(xpath = "//*[@type=\"checkbox\"]")
	public List<WebElement> checkBoxList123;
	
	@FindBy(xpath = "//a[@id='logo']")
	public WebElement formyLogoElement;

}
