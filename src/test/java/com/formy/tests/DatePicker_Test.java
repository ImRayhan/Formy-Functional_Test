package com.formy.tests;
import org.testng.annotations.Test;

public class DatePicker_Test extends BaseTest {

	@Test
	public void VerifyCalender() throws InterruptedException {
		App().Flow().Navigate(App().Pages().dataPickerPage().gotoUrl());
		App().Pages().dataPickerPage().ClickDatatPicker();
		App().Pages().dataPickerPage().dataPickerBoxClick();
		App().Pages().dataPickerPage().datePick();



	}

}
