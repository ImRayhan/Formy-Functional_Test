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

public class FormyButtons_Sanity_Test extends BaseTest {

	@Test(priority = 1, groups = "smoke", enabled = true)
	public void VerifyBtnFunctionality() {
		App().Flow().Navigate(App().Pages().ButtonsPage().gotoUrl());
		App().Pages().ButtonsPage().ClickButtons();
		AssertJUnit.assertTrue(App().Pages().ButtonsPage().PrimaryBtnIsenbled());
		App().Pages().ButtonsPage().PrimaryBtnClick();
		AssertJUnit.assertTrue(App().Pages().ButtonsPage().SuccessBtnIsenbled());
		App().Pages().ButtonsPage().SuccessBtnClick();
		AssertJUnit.assertTrue(App().Pages().ButtonsPage().InfoBtnIsenbled());
		App().Pages().ButtonsPage().InfoBtnClick();
		AssertJUnit.assertTrue(App().Pages().ButtonsPage().WarningBtnIsenbled());
		App().Pages().ButtonsPage().WarningBtnClick();
		AssertJUnit.assertTrue(App().Pages().ButtonsPage().DangerBtnIsenbled());
		App().Pages().ButtonsPage().DangerBtnClick();
		AssertJUnit.assertTrue(App().Pages().ButtonsPage().LinkBtnCIsenbled());
		App().Pages().ButtonsPage().LinkBtnClick();
		AssertJUnit.assertTrue(App().Pages().ButtonsPage().LeftBtnIsenbled());
		App().Pages().ButtonsPage().LeftBtnClick();
		AssertJUnit.assertTrue(App().Pages().ButtonsPage().MiddleBtnIsenbled());
		App().Pages().ButtonsPage().MiddleBtnClick();
		AssertJUnit.assertTrue(App().Pages().ButtonsPage().RightBtnIsenbled());
		App().Pages().ButtonsPage().RightBtnClick();
		AssertJUnit.assertTrue(App().Pages().ButtonsPage().OneBtnIsenbled());
		App().Pages().ButtonsPage().OneBtnClick();
		AssertJUnit.assertTrue(App().Pages().ButtonsPage().TwoBtnIsenbled());
		App().Pages().ButtonsPage().TwoBtnClick();
		AssertJUnit.assertTrue(App().Pages().ButtonsPage().BtnIsenbledDropDown());
		App().Pages().ButtonsPage().DropDownBtnClick();
		AssertJUnit.assertTrue(App().Pages().ButtonsPage().IsenbledDropDownLinkOneClick());
		App().Pages().ButtonsPage().IsenbledDropDownLinkOneClick();
		String expectedUrl = "https://formy-project.herokuapp.com/buttons";
		String actualUrl = App().Flow().GetCurrentUrl();
		AssertJUnit.assertEquals(actualUrl, expectedUrl);
		String actualTtitle = App().Flow().GetTitle();
		String expetedTitle = "Formy";
		AssertJUnit.assertEquals(actualTtitle, expetedTitle);

	}

}
