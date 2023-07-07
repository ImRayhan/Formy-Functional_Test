package com.formy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.formy.elements.DropDown_Element;

public class DropDown_Page {
	WebDriver driver;
	DropDown_Element dropDown_Element;
	
	String pageUrl = "https://formy-project.herokuapp.com/";

	public DropDown_Page(WebDriver driver) {
		this.driver = driver;
		dropDown_Element = new DropDown_Element(driver);

	}
	
	public String gotoUrl() {
		return pageUrl;
		
	}
	
	
	public void ClickDropDown() {
		dropDown_Element.DropDown.click();
		
		
	}
	
	public void dropDownChoise() {
//		Select sel = new Select(dropDown_Element.dropDownButton);
//		sel.selectByVisibleText(dropDownText);
		dropDown_Element.dropDownButton.click();
		if (dropDown_Element.dropDownCheckBoxButton.isDisplayed()) {
			dropDown_Element.dropDownCheckBoxButton.click();
			
		}
		
		
		
	}
	public String CheckBoxVisbleText() {
		return dropDown_Element.CheckBoxDisplay.getText();
		
		
	}
	
	
	
	

}
