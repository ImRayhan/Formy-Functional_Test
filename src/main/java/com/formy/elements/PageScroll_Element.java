package com.formy.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageScroll_Element {
	WebDriver driver;

	public PageScroll_Element(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='btn btn-lg'][normalize-space()='Page Scroll']")
	public WebElement pageScrollElement;

	@FindBy(xpath = "//input[@id='name']")
	public WebElement fullNameElement;

	@FindBy(xpath = "//input[@id='date']")
	public WebElement datElement;
	
	@FindBy(xpath = "//h1[normalize-space()='Large page content']")
	public WebElement largepagecontentElement;


}
