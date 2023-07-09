package com.formy.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Modal_Element {
	WebDriver driver;
	
	public Modal_Element(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='btn btn-lg'][normalize-space()='Modal']")
	public WebElement modalElement;
	
	@FindBy(xpath = "//button[@id='modal-button']")
	public WebElement openModalElement;
	
	@FindBy(xpath = "//button[@id='close-button']")
	public WebElement closeBtnElement;
	
	@FindBy(xpath = "//h5[@id='exampleModalLabel']")
	public WebElement modalTitleElement;
	
}
