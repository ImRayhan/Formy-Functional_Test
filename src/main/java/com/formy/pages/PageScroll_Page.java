package com.formy.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.formy.elements.PageScroll_Element;

public class PageScroll_Page {
	WebDriver driver;
	PageScroll_Element pageScroll_Element;
	String pageUrl = "https://formy-project.herokuapp.com/";
	JavascriptExecutor js;

	//
	public PageScroll_Page(WebDriver driver) {
		this.driver = driver;
		pageScroll_Element = new PageScroll_Element(driver);
		js = (JavascriptExecutor) driver;
	}

	public String gotoUrl() {
		return pageUrl;

	}

	public void ClickPageUrl() {
		pageScroll_Element.pageScrollElement.click();

	}

	public void ScrollDown() throws InterruptedException {
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,500)");

	}

	public void ScrollUp() throws InterruptedException {
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0, -500);");

	}

	public void FullName(String fullName) {
		pageScroll_Element.fullNameElement.sendKeys(fullName);

	}

	public void Date(String date) {
		pageScroll_Element.datElement.sendKeys(date);

	}

	public String LargepagecontentText() {
		return pageScroll_Element.largepagecontentElement.getText();

	}

}
