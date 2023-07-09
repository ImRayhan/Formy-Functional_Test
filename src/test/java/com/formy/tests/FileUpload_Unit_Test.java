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

public class FileUpload_Unit_Test extends BaseTest {

	@Test(priority = 1, groups = "smoke", enabled = true)
	public void VerifyFileUpload() {

		App().Flow().Navigate(App().Pages().fileUploadPage().gotoUrl());
		App().Pages().fileUploadPage().ClickFileUload();
		App().Pages().fileUploadPage().ChooseFileUpload(
				"/Users/rayhanchowdhury/Downloads/wp1828903-programmer-wallpapers.png\\wp1828903-programmer-wallpapers.png");

		boolean resetBtnDisplayed = App().Pages().fileUploadPage().ResetBtnDisplayed();
		AssertJUnit.assertTrue(resetBtnDisplayed);
		String actualText = App().Pages().fileUploadPage().FileUploadText();
		String expextedText = "File upload";
		AssertJUnit.assertEquals(actualText, expextedText);

	}

}
