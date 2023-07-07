package com.formy.tests;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DatePicker_Smoke extends BaseTest {

	@Test
	public void VerifyCalender() throws InterruptedException {
		App().Flow().Navigate(App().Pages().dataPickerPage().gotoUrl());
		App().Pages().dataPickerPage().ClickDatatPicker();
		App().Pages().dataPickerPage().dataPickerBoxClick();
		App().Pages().dataPickerPage().datePick();
		String expectedUrl = "https://formy-project.herokuapp.com/datepicker";
		String actualUrl = App().Flow().GetCurrentUrl();
		String actualTitle = App().Flow().GetTitle();
		String expectedTitle = "Formy";
		Assert.assertEquals(actualTitle, expectedTitle);
		Assert.assertEquals(expectedUrl, actualUrl);
		String datePickACtualText = App().Pages().dataPickerPage().DaePickerText();
		String DatepickerExpectedText = "Datepicker";
		if (!datePickACtualText.equalsIgnoreCase(DatepickerExpectedText)) {
			fail();

		}

	}

}
