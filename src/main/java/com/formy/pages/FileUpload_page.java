package com.formy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.formy.elements.FileUpload_Element;

public class FileUpload_page {
	WebDriver driver;
	String pageUrl = "https://formy-project.herokuapp.com/";
	FileUpload_Element fileUpload_Element;

	public FileUpload_page(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
		fileUpload_Element = new FileUpload_Element(driver);
	}

	public String gotoUrl() {
		return pageUrl;

	}

	public void ClickFileUload() {
		fileUpload_Element.fileUploadElement.click();

	}

	public void ChooseFileUpload(String fileName) {
		fileUpload_Element.chooseAfilElement.sendKeys(fileName);

	}

	public boolean ResetBtnDisplayed() {
		return fileUpload_Element.resetButtonElement.isDisplayed();

	}

	public String FileUploadText() {
		return fileUpload_Element.fileUploadTextElement.getText();

	}

}
