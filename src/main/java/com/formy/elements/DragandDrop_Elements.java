package com.formy.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DragandDrop_Elements {
	WebDriver driver;

	public DragandDrop_Elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='btn btn-lg'][normalize-space()='Drag and Drop']")
	public WebElement dragAndDropElement;

	@FindBy(xpath = "//div[@id='image']//img")
	public WebElement seElement;

	
	@FindBy(xpath = "//div[@id='box']")
	public WebElement droppedElement;

	@FindBy(xpath = "//h1[normalize-space()='Drag the image into the box']")
	public WebElement dragtheimageintotheboxelElement;

}
