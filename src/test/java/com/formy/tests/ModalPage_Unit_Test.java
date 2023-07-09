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

public class ModalPage_Unit_Test extends BaseTest {

	@Test(priority = 1, groups = "smoke", enabled = true)
	public void verifyingModel() {
		App().Flow().Navigate(App().Pages().modalPage().gotoUrl());
		App().Pages().modalPage().clickModal();
		App().Pages().modalPage().OpenModal();
		App().Pages().modalPage().ModalTitleClose();
		String actualText = "Modal title";
		String expectedText = App().Pages().modalPage().modalTitleText();
		String expectedUrl = App().Flow().GetCurrentUrl();
		String actualUrl = "https://formy-project.herokuapp.com/modal";
		String expectedTitle = App().Flow().GetTitle();
		String actualTitle = "Formy";
		AssertJUnit.assertEquals(expectedTitle, actualTitle);
		AssertJUnit.assertEquals(expectedUrl, actualUrl);
		AssertJUnit.assertEquals(actualText, expectedText);

	}

}
