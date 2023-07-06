package com.formy.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FormyButtons_Sanity_Test extends BaseTest {

	@Test
	public void VerifyBtnFunctionality() {
		App().Flow().Navigate(App().Pages().ButtonsPage().gotoUrl());
		App().Pages().ButtonsPage().ClickButtons();
		Assert.assertTrue(App().Pages().ButtonsPage().PrimaryBtnIsenbled());
		App().Pages().ButtonsPage().PrimaryBtnClick();
		Assert.assertTrue(App().Pages().ButtonsPage().SuccessBtnIsenbled());
		App().Pages().ButtonsPage().SuccessBtnClick();
		Assert.assertTrue(App().Pages().ButtonsPage().InfoBtnIsenbled());
		App().Pages().ButtonsPage().InfoBtnClick();
		Assert.assertTrue(App().Pages().ButtonsPage().WarningBtnIsenbled());
		App().Pages().ButtonsPage().WarningBtnClick();
		Assert.assertTrue(App().Pages().ButtonsPage().DangerBtnIsenbled());
		App().Pages().ButtonsPage().DangerBtnClick();
		Assert.assertTrue(App().Pages().ButtonsPage().LinkBtnCIsenbled());
		App().Pages().ButtonsPage().LinkBtnClick();
		Assert.assertTrue(App().Pages().ButtonsPage().LeftBtnIsenbled());
		App().Pages().ButtonsPage().LeftBtnClick();
		Assert.assertTrue(App().Pages().ButtonsPage().MiddleBtnIsenbled());
		App().Pages().ButtonsPage().MiddleBtnClick();
		Assert.assertTrue(App().Pages().ButtonsPage().RightBtnIsenbled());
		App().Pages().ButtonsPage().RightBtnClick();
		Assert.assertTrue(App().Pages().ButtonsPage().OneBtnIsenbled());
		App().Pages().ButtonsPage().OneBtnClick();
		Assert.assertTrue(App().Pages().ButtonsPage().TwoBtnIsenbled());
		App().Pages().ButtonsPage().TwoBtnClick();
		Assert.assertTrue(App().Pages().ButtonsPage().BtnIsenbledDropDown());
		App().Pages().ButtonsPage().DropDownBtnClick();
		Assert.assertTrue(App().Pages().ButtonsPage().IsenbledDropDownLinkOneClick());
		App().Pages().ButtonsPage().IsenbledDropDownLinkOneClick();
		String expectedUrl = "https://formy-project.herokuapp.com/buttons";
		String actualUrl = App().Flow().GetCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl);
		String actualTtitle = App().Flow().GetTitle();
		String expetedTitle = "Formy";
		Assert.assertEquals(actualTtitle, expetedTitle);

	}

}
