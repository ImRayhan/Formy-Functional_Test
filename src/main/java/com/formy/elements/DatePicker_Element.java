package com.formy.elements;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DatePicker_Element {
	WebDriver driver;

	public DatePicker_Element(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@class='btn btn-lg'][normalize-space()='Datepicker']")
	public WebElement dataPickerElement;
	
	
	@FindBy(xpath = "//input[@id='datepicker']")
	public WebElement dataPickerBoxElement;
	
	@FindBy(css = "div[class='datepicker-days'] th[class='datepicker-switch']")
	public WebElement monthYearElement;
	
	@FindBy(xpath = "//div[@class='datepicker-days']//th[@class='next'][normalize-space()='»']")
	public WebElement nextMonthYearElement;
	
	@FindBy(xpath = "//td[@class='day']")
	public List<WebElement> monthallElement;
	
	
}
