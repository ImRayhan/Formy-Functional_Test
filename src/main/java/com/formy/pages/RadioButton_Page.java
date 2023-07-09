package com.formy.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.formy.elements.RadioButton_Element;

public class RadioButton_Page {

	WebDriver driver;
	RadioButton_Element radioButton_Element;
	String pageUrl = "https://formy-project.herokuapp.com/";

	public RadioButton_Page(WebDriver driver) {
		this.driver = driver;
		radioButton_Element = new RadioButton_Element(driver);
	}

	public String gotoUrl() {
		return pageUrl;

	}

	public void ClickRadioButton() {
		radioButton_Element.radioButtonElement.click();

	}

	public void RadioButtonclickAll() {
		List<WebElement> ALL = radioButton_Element.radioButtonList123Elements;

		for (WebElement iterable_element : ALL) {

			iterable_element.click();

		}

	}

	public boolean radioButton3() {
		return radioButton_Element.radioButton3Elements.isSelected();

	}

}
