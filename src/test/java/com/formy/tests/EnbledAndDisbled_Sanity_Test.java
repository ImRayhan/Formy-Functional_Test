package com.formy.tests;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EnbledAndDisbled_Sanity_Test extends BaseTest {
	@Test
	public void checkingEnbledDisbledButton() {
		App().Flow().Navigate(App().Pages().EnabledandDisabledElementPage().gotoUrl());
		App().Pages().EnabledandDisabledElementPage().ClickEnbledAndDIsbled();
		boolean disbledInput = App().Pages().EnabledandDisabledElementPage().DisbledInputHere();

		boolean enbleInput = App().Pages().EnabledandDisabledElementPage().InputHereEnbled();
		if (disbledInput) {
			fail();

		} else if (enbleInput) {
			App().Pages().EnabledandDisabledElementPage().inputHere("its Work");

		} else {
			fail();

		}
		String isTextDiplayed = App().Pages().EnabledandDisabledElementPage().enbledAndDisbledText();
		String actualText = "Enabled and Disabled elements";
		Assert.assertEquals(isTextDiplayed, actualText);
		String expectedUrl = "https://formy-project.herokuapp.com/enabled";
		String actualdUrl = App().Flow().GetCurrentUrl();
		Assert.assertEquals(expectedUrl, actualdUrl);
		String expectedTitle = App().Flow().GetTitle();
		String actualTitle = "Formy";
		Assert.assertEquals(expectedTitle, actualTitle);

	}

}
