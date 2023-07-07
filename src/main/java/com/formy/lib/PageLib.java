package com.formy.lib;

import org.openqa.selenium.WebDriver;

import com.formy.elements.DatePicker_Element;
import com.formy.pages.CheckBox_Page;
import com.formy.pages.DataPicker_Page;
import com.formy.pages.DragAndDrop_Page;
import com.formy.pages.DropDown_Page;
import com.formy.pages.EnabledandDisabledElements_Page;
import com.formy.pages.Formy_AutoComplete_Page;
import com.formy.pages.Formy_Buttons_Page;

public class PageLib {
	WebDriver driver;

	Formy_AutoComplete_Page Formy_AutoComplete_Page;
	Formy_Buttons_Page formy_Buttons_Page;
	CheckBox_Page checkBox_Page;
	DataPicker_Page dataPicker_Page;
	DragAndDrop_Page dragAndDrop_Page;
	DropDown_Page dropDown_Page;
	EnabledandDisabledElements_Page enabledandDisabledElements_Page;

	public PageLib(WebDriver driver) {
		this.driver = driver;
		Formy_AutoComplete_Page = new Formy_AutoComplete_Page(driver);
		formy_Buttons_Page = new Formy_Buttons_Page(driver);
		checkBox_Page = new CheckBox_Page(driver);
		dataPicker_Page = new DataPicker_Page(driver);
		dragAndDrop_Page = new DragAndDrop_Page(driver);
		dropDown_Page = new DropDown_Page(driver);
		enabledandDisabledElements_Page = new EnabledandDisabledElements_Page(driver);

	}

	public Formy_AutoComplete_Page AutocompltePage() {
		return Formy_AutoComplete_Page;

	}

	public Formy_Buttons_Page ButtonsPage() {
		return formy_Buttons_Page;

	}

	public CheckBox_Page CheckBoxPage() {
		return checkBox_Page;

	}

	public DataPicker_Page dataPickerPage() {
		return dataPicker_Page;

	}

	public DragAndDrop_Page dragAndDropPage() {
		return dragAndDrop_Page;

	}
	
	public DropDown_Page dropDownPage() {
		return dropDown_Page;
		
	}
	public EnabledandDisabledElements_Page EnabledandDisabledElementPage() {
		return enabledandDisabledElements_Page;
		
	}

}
