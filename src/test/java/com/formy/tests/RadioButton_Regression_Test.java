package com.formy.tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButton_Regression_Test extends BaseTest {

	@Test(priority = 1, groups = "smoke", enabled = true)
	public void verifyRadioButtons() {
		App().Flow().Navigate(App().Pages().radioButtonPage().gotoUrl());
		App().Pages().radioButtonPage().ClickRadioButton();
		App().Pages().radioButtonPage().RadioButtonclickAll();
		AssertJUnit.assertTrue(App().Pages().radioButtonPage().radioButton3());
		String actualUrl = "https://formy-project.herokuapp.com/radiobutton";
		String expectedlUrl = App().Flow().GetCurrentUrl();
		String expectedTitle = App().Flow().GetTitle();
		String actualTitle = "Formy";
		AssertJUnit.assertEquals(actualUrl, expectedlUrl);
		AssertJUnit.assertEquals(actualTitle, expectedTitle);

	}

}
