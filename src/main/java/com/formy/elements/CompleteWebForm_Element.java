package com.formy.elements;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompleteWebForm_Element {
	WebDriver driver;

	public CompleteWebForm_Element(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='btn btn-lg'][normalize-space()='Complete Web Form']")
	public WebElement completeWebFormElement;

	@FindBy(xpath = "//input[@id='first-name']")
	public WebElement enterFirstNamElement;

	@FindBy(xpath = "//input[@id='last-name']")
	public WebElement enterLastNamElement;

	@FindBy(xpath = "//input[@id='job-title']")
	public WebElement jobTitlElement;

	@FindBy(css = "#radio-button-2")
	public WebElement collegElement;

	@FindBy(css = "#checkbox-1")
	public WebElement malElement;

	@FindBy(xpath = "//select[@id='select-menu']")
	public WebElement yearsOfExperiencElement;

	@FindBy(xpath = "//input[@id='datepicker']")
	public WebElement dateElement;

	@FindBy(css = "a[role='button']")
	public WebElement subMitElement;

	@FindBy(css = "div[class='datepicker-days'] th[class='datepicker-switch']")
	public WebElement monthElement;

	@FindBy(xpath = "//div[@class='datepicker-days']//th[@class='next'][normalize-space()='»']")
	public WebElement nextMonthYearElement;

	@FindBy(xpath = "//td[@class='day']")
	public List<WebElement> dateallElement;

	@FindBy(xpath = "//div[@role='alert']")
	public WebElement successFullMassagElement;
	
	@FindBy(xpath = "//h1[normalize-space()='Thanks for submitting your form']")
	public WebElement thanksForSubmittingText;

}
