package com.formy.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.formy.elements.Modal_Element;

public class Modal_Page {

	WebDriver driver;
	Modal_Element modalElement;
	String pageUrl = "https://formy-project.herokuapp.com/";

	public Modal_Page(WebDriver driver) {
		this.driver = driver;
		modalElement = new Modal_Element(driver);

	}

	public String gotoUrl() {
		return pageUrl;

	}

	public void clickModal() {
		modalElement.modalElement.click();

	}

	public void OpenModal() {
		modalElement.openModalElement.click();

	}

	public void ModalTitleClose() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(modalElement.closeBtnElement));
		if (modalElement.closeBtnElement.isDisplayed()) {
			modalElement.closeBtnElement.click();

		}

	}

	public String modalTitleText() {
		return modalElement.modalTitleElement.getText();

	}

}
