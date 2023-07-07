package com.formy.tests;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DropDoown_Sanity extends BaseTest {
	@Test
	public void VerifyingDropDownMenue() {
		App().Flow().Navigate(App().Pages().dropDownPage().gotoUrl());
		App().Pages().dropDownPage().ClickDropDown();
		App().Pages().dropDownPage().dropDownChoise();
		String exectedText = "Checkboxes";
		String actualText = App().Pages().dropDownPage().CheckBoxVisbleText();
		Assert.assertEquals(exectedText, actualText);
		String expectedUrl = "https://formy-project.herokuapp.com/checkbox";
		String actuaUrl = App().Flow().GetCurrentUrl();
		String expectedTitle = "Formy";
		String actualTitle = App().Flow().GetTitle();

		assertEquals(actuaUrl, expectedUrl);
		assertEquals(expectedTitle, actualTitle);

	}

}
