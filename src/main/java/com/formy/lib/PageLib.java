package com.formy.lib;

import org.openqa.selenium.WebDriver;

import com.formy.elements.DatePicker_Element;
import com.formy.pages.CheckBox_Page;
import com.formy.pages.CompleteWebForm_Page;
import com.formy.pages.DataPicker_Page;
import com.formy.pages.DragAndDrop_Page;
import com.formy.pages.DropDown_Page;
import com.formy.pages.EnabledandDisabledElements_Page;
import com.formy.pages.FileUpload_page;
import com.formy.pages.Formy_AutoComplete_Page;
import com.formy.pages.Formy_Buttons_Page;
import com.formy.pages.KeyboardandMousePress_Page;
import com.formy.pages.Modal_Page;
import com.formy.pages.PageScroll_Page;
import com.formy.pages.RadioButton_Page;
import com.formy.pages.SwithWindow_Page;

public class PageLib {
	WebDriver driver;

	Formy_AutoComplete_Page Formy_AutoComplete_Page;
	Formy_Buttons_Page formy_Buttons_Page;
	CheckBox_Page checkBox_Page;
	DataPicker_Page dataPicker_Page;
	DragAndDrop_Page dragAndDrop_Page;
	DropDown_Page dropDown_Page;
	EnabledandDisabledElements_Page enabledandDisabledElements_Page;
	FileUpload_page fileUpload_page;
	KeyboardandMousePress_Page keyboardandMousePress_Page;
	Modal_Page modal_Page;
	PageScroll_Page pageScroll_Page;
	RadioButton_Page radioButton_Page;
	SwithWindow_Page swithWindow_Page;
	CompleteWebForm_Page completeWebForm_Page;

	public PageLib(WebDriver driver) {
		this.driver = driver;
		Formy_AutoComplete_Page = new Formy_AutoComplete_Page(driver);
		formy_Buttons_Page = new Formy_Buttons_Page(driver);
		checkBox_Page = new CheckBox_Page(driver);
		dataPicker_Page = new DataPicker_Page(driver);
		dragAndDrop_Page = new DragAndDrop_Page(driver);
		dropDown_Page = new DropDown_Page(driver);
		enabledandDisabledElements_Page = new EnabledandDisabledElements_Page(driver);
		fileUpload_page = new FileUpload_page(driver);
		keyboardandMousePress_Page = new KeyboardandMousePress_Page(driver);
		modal_Page = new Modal_Page(driver);
		pageScroll_Page = new PageScroll_Page(driver);
		radioButton_Page = new RadioButton_Page(driver);
		swithWindow_Page = new SwithWindow_Page(driver);
		completeWebForm_Page = new CompleteWebForm_Page(driver);

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

	public FileUpload_page fileUploadPage() {
		return fileUpload_page;

	}

	public KeyboardandMousePress_Page keyboardandMousePressPage() {
		return keyboardandMousePress_Page;

	}

	public Modal_Page modalPage() {
		return modal_Page;

	}

	public PageScroll_Page pageScrollPage() {
		return pageScroll_Page;

	}

	public RadioButton_Page radioButtonPage() {
		return radioButton_Page;

	}
	
	public SwithWindow_Page swithWindowPage() {
		return swithWindow_Page;
		
	}
	
	public CompleteWebForm_Page completeWebFormPage() {
		return completeWebForm_Page;
		
	}

}
