package com.formy.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.formy.elements.ButtonsPage_Element;

public class Formy_Buttons_Page {

	WebDriver driver;
	String url = "https://formy-project.herokuapp.com/";

	ButtonsPage_Element buttonsPage_Element;

	public Formy_Buttons_Page(WebDriver driver) {
		this.driver = driver;
		buttonsPage_Element = new ButtonsPage_Element(driver);

	}

	public String gotoUrl() {
		return url;

	}

	public void ClickButtons() {
		buttonsPage_Element.buttonsElement.click();

	}

	public boolean PrimaryBtnIsenbled() {
		return buttonsPage_Element.primarybTNElement.isEnabled();

	}

	public void PrimaryBtnClick() {

		buttonsPage_Element.primarybTNElement.click();

	}

	public boolean SuccessBtnIsenbled() {
		return buttonsPage_Element.successBtnElement.isEnabled();

	}

	public void SuccessBtnClick() {
		buttonsPage_Element.successBtnElement.click();

	}

	public boolean InfoBtnIsenbled() {
		return buttonsPage_Element.infoBtnElement.isEnabled();

	}

	public void InfoBtnClick() {
		buttonsPage_Element.infoBtnElement.click();

	}

	public boolean WarningBtnIsenbled() {
		return buttonsPage_Element.warningBtnWebElement.isEnabled();

	}

	public void WarningBtnClick() {
		buttonsPage_Element.warningBtnWebElement.click();

	}

	public boolean DangerBtnIsenbled() {
		return buttonsPage_Element.dangerBtnElement.isEnabled();

	}

	public void DangerBtnClick() {
		buttonsPage_Element.dangerBtnElement.click();

	}

	public boolean LinkBtnCIsenbled() {
		return buttonsPage_Element.linkBtnElement.isEnabled();

	}

	public void LinkBtnClick() {
		buttonsPage_Element.linkBtnElement.click();

	}

	public boolean LeftBtnIsenbled() {
		return buttonsPage_Element.leftBtnElement.isEnabled();

	}

	public void LeftBtnClick() {
		buttonsPage_Element.leftBtnElement.click();

	}

	public boolean MiddleBtnIsenbled() {
		return buttonsPage_Element.middlBtnElement.isEnabled();

	}

	public void MiddleBtnClick() {
		buttonsPage_Element.middlBtnElement.click();

	}

	public boolean RightBtnIsenbled() {
		return buttonsPage_Element.rightBtnElement.isEnabled();

	}

	public void RightBtnClick() {
		buttonsPage_Element.rightBtnElement.click();

	}

	public boolean OneBtnIsenbled() {
		return buttonsPage_Element.oneBtnElement.isEnabled();

	}

	public void OneBtnClick() {
		buttonsPage_Element.oneBtnElement.click();

	}

	public boolean TwoBtnIsenbled() {
		return buttonsPage_Element.twoBtnElement.isEnabled();

	}

	public void TwoBtnClick() {
		buttonsPage_Element.twoBtnElement.click();

	}

	public boolean BtnIsenbledDropDown() {
		return buttonsPage_Element.dropDownBtnElement.isEnabled();

	}

	public void DropDownBtnClick() {
		buttonsPage_Element.dropDownBtnElement.click();

	}

	public boolean IsenbledDropDownLinkOneClick() {
		return buttonsPage_Element.oneBtnElement.isEnabled();

	}

	public void DropDownLinkOneClick() {
		buttonsPage_Element.dropDownBtnElement.sendKeys(Keys.ARROW_DOWN);
		buttonsPage_Element.dropDownBtnElement.sendKeys(Keys.ENTER);

	}

	public void DropDownLinkTowClick() {
		Select sel = new Select(buttonsPage_Element.dropDownBtnElement);
		sel.selectByVisibleText("Dropdown link 2");

	}

}
