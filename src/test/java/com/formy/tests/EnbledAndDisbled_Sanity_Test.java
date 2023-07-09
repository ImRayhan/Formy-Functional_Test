package com.formy.tests;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EnbledAndDisbled_Sanity_Test extends BaseTest {
	@Test(priority = 1, groups = "smoke", enabled = true)
	public void checkingEnbledDisbledButton() {
		App().Flow().Navigate(App().Pages().EnabledandDisabledElementPage().gotoUrl());
		App().Pages().EnabledandDisabledElementPage().ClickEnbledAndDIsbled();
		boolean disbledInput = App().Pages().EnabledandDisabledElementPage().DisbledInputHere();

		boolean enbleInput = App().Pages().EnabledandDisabledElementPage().InputHereEnbled();
		if (disbledInput) {
			Assert.fail();

		} else if (enbleInput) {
			App().Pages().EnabledandDisabledElementPage().inputHere("its Work");

		} else {
			Assert.fail();

		}
		String isTextDiplayed = App().Pages().EnabledandDisabledElementPage().enbledAndDisbledText();
		String actualText = "Enabled and Disabled elements";
		AssertJUnit.assertEquals(isTextDiplayed, actualText);
		String expectedUrl = "https://formy-project.herokuapp.com/enabled";
		String actualdUrl = App().Flow().GetCurrentUrl();
		AssertJUnit.assertEquals(expectedUrl, actualdUrl);
		String expectedTitle = App().Flow().GetTitle();
		String actualTitle = "Formy";
		AssertJUnit.assertEquals(expectedTitle, actualTitle);

	}

}
