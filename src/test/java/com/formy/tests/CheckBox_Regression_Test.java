package com.formy.tests;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBox_Regression_Test extends BaseTest {
	@Test
	public void VerifyCheckBox() {
		App().Flow().Navigate(App().Pages().CheckBoxPage().gotoUrl());
		App().Pages().CheckBoxPage().CheckBoxClick();
		App().Pages().CheckBoxPage().checkBoxclick123();
		
		if (!App().Pages().CheckBoxPage().ForMyTextVisble().equalsIgnoreCase("ForMy")) {
			fail();
		}
		Assert.assertEquals(App().Flow().GetCurrentUrl(), "https://formy-project.herokuapp.com/checkbox");
		Assert.assertEquals(App().Flow().GetTitle(),"Formy");

	}

}
