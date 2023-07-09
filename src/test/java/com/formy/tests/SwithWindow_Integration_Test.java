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

public class SwithWindow_Integration_Test extends BaseTest {

	@Test(priority = 1, groups = "smoke", enabled = true)
	public void VerifyingMultipleTab() throws InterruptedException {

		App().Flow().Navigate(App().Pages().swithWindowPage().gotoUrl());
		App().Pages().swithWindowPage().ClickSwithWindow();
		App().Pages().swithWindowPage().OpenNewTabHandle();
		App().Pages().swithWindowPage().ClickSwithWindow();
		App().Flow().NavigateRefresh();
		App().Flow().NavigateBack();
		String expectedvisbilityText = App().Pages().swithWindowPage().SwitchWindowText();
		String actualText = "Switch Window";
		String expectedUrl = App().Flow().GetCurrentUrl();
		String actualUrl = "https://formy-project.herokuapp.com/";
		String expecteTitle = App().Flow().GetTitle();
		String actualTitle = "Formy";
		AssertJUnit.assertEquals(expecteTitle, actualTitle);
		AssertJUnit.assertEquals(expectedvisbilityText, actualText);
		AssertJUnit.assertEquals(expectedUrl, actualUrl);

	}
	
	@Test(priority = 2, groups = "smoke", enabled = true)
	public void VerifyingAlert() {
		App().Flow().Navigate(App().Pages().swithWindowPage().gotoUrl());
		App().Pages().swithWindowPage().ClickSwithWindow();
		App().Pages().swithWindowPage().ClickOpenAlert();
		App().Pages().swithWindowPage().OpenAlertDismis();
		String expectedvisbilityText = App().Pages().swithWindowPage().SwitchWindowText();
		String actualText = "Switch Window";
		String expectedUrl = App().Flow().GetCurrentUrl();
		String actualUrl = "https://formy-project.herokuapp.com/switch-window";
		String expecteTitle = App().Flow().GetTitle();
		String actualTitle = "Formy";
		AssertJUnit.assertEquals(expecteTitle, actualTitle);
		AssertJUnit.assertEquals(expectedvisbilityText, actualText);
		AssertJUnit.assertEquals(expectedUrl, actualUrl);

	}

}
