package com.formy.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileUpload_Element {
	WebDriver driver;
	
	public FileUpload_Element(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//a[@class='btn btn-lg'][normalize-space()='File Upload']")
	public WebElement fileUploadElement;
	
	@FindBy(xpath = "//input[@id='file-upload-field']")
	public WebElement chooseAfilElement;
	
	@FindBy(xpath = "//button[normalize-space()='Reset']")
	public WebElement resetButtonElement;
	
	@FindBy(xpath = "//h1[normalize-space()='File upload']")
	public WebElement fileUploadTextElement;

}
