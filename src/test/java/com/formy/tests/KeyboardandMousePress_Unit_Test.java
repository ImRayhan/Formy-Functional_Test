package com.formy.tests;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;
import static org.testng.Assert.fail;

import org.testng.annotations.Test;

public class KeyboardandMousePress_Unit_Test extends BaseTest {
	@Test(priority = 1, groups = "smoke", enabled = true)
	public void VerifyingKeyboardandMouseInput() {
		App().Flow().Navigate(App().Pages().keyboardandMousePressPage().gotoUrl());
		App().Pages().keyboardandMousePressPage().ClickKeyboardandMousePress();
		App().Pages().keyboardandMousePressPage().EnterFullName("Rayhan Chowdhuryo");
		App().Pages().keyboardandMousePressPage().EnterDeletKey();
		App().Pages().keyboardandMousePressPage().ButtonClick();
		String expectedUrl = "https://formy-project.herokuapp.com/keypress";
		String actualUrl = App().Flow().GetCurrentUrl();
		String expectedTitle = "Formy";
		String actualitle = App().Flow().GetTitle();
		String expectedText = App().Pages().keyboardandMousePressPage().KeyboardandMouseInputText();
		String actualText = "Keyboard and Mouse Input";

		if (!expectedText.equalsIgnoreCase(actualText)) {
			Assert.fail();

		} else if (!expectedTitle.equalsIgnoreCase(actualitle)) {
			Assert.fail();

		} else if (!expectedUrl.equalsIgnoreCase(actualUrl)) {
			Assert.fail();

		}

	}

}
