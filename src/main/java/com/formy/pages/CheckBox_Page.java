package com.formy.pages;

import org.openqa.selenium.WebDriver;

import com.formy.elements.CheckBox_Element;

public class CheckBox_Page {
	WebDriver driver;

	CheckBox_Element checkBox_Element;

	String pageUrl = "https://formy-project.herokuapp.com/";

	public CheckBox_Page(WebDriver driver) {
		this.driver = driver;
		checkBox_Element = new CheckBox_Element(driver);
	}

	public String gotoUrl() {
		return pageUrl;

	}

	public void CheckBoxClick() {
		checkBox_Element.checkBoxElement.click();

	}

	public void checkBoxclick123() {

		boolean ischecked;

		int allCheckBoxSize = checkBox_Element.checkBoxList123.size();

		for (int i = 0; i < allCheckBoxSize; i++) {
			ischecked = checkBox_Element.checkBoxList123.get(i).isSelected();
			if (!ischecked) {
				checkBox_Element.checkBoxList123.get(i).click();

			}

		}

//		for (WebElement iterable_element : checkBox_Element.checkBoxList123) {
//			iterable_element.click();
//			
//		}

	}
	
	public String ForMyTextVisble() {
		return checkBox_Element.formyLogoElement.getText();
		
	}
	
	public void name() {
		
	}

}
