package com.formy.pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.formy.elements.DatePicker_Element;

public class DataPicker_Page {
	WebDriver driver;
	DatePicker_Element dataPickerElement;
	String pageUrl = "https://formy-project.herokuapp.com/";

	public DataPicker_Page(WebDriver driver) {
		this.driver = driver;
		dataPickerElement = new DatePicker_Element(driver);
	}

	public String gotoUrl() {
		return pageUrl;

	}

	public void ClickDatatPicker() {
		dataPickerElement.dataPickerElement.click();

	}

	public void dataPickerBoxClick() {
		dataPickerElement.dataPickerBoxElement.click();

	}

	public void datePick() throws InterruptedException {
		String checkMonth = "November 2023";
		String dataVal = "28";

		while (true) {
			String month = dataPickerElement.monthYearElement.getText();
			System.out.println("month:" + month);
			if (month.equalsIgnoreCase(checkMonth)) {
				break;

			} else {
				dataPickerElement.nextMonthYearElement.click();

			}
			List<WebElement> ele = dataPickerElement.monthallElement;
			for (WebElement webElement : ele) {
				String date = webElement.getText();
				if (date.equalsIgnoreCase(dataVal)) {
					System.out.println("date " + date);
					webElement.click();
					dataPickerElement.dataPickerBoxElement.click();
					break;

				}

			}

		}

	}

	public String DaePickerText() {
		return dataPickerElement.dataPickerGetTextElement.getText();

	}

	public boolean DaePickerTextDisplayed() {
		return dataPickerElement.dataPickerGetTextElement.isDisplayed();

	}
}
