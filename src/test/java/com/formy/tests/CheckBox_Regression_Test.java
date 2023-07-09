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

public class CheckBox_Regression_Test extends BaseTest {
	@Test(priority = 1, groups = "smoke", enabled = true)
	public void VerifyCheckBox() {
		App().Flow().Navigate(App().Pages().CheckBoxPage().gotoUrl());
		App().Pages().CheckBoxPage().CheckBoxClick();
		App().Pages().CheckBoxPage().checkBoxclick123();
		
		if (!App().Pages().CheckBoxPage().ForMyTextVisble().equalsIgnoreCase("ForMy")) {
			Assert.fail();
		}
		AssertJUnit.assertEquals(App().Flow().GetCurrentUrl(), "https://formy-project.herokuapp.com/checkbox");
		AssertJUnit.assertEquals(App().Flow().GetTitle(),"Formy");

	}

}
