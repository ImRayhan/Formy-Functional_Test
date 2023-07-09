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

public class CompleteWebForm_Smoke_Test extends BaseTest {

	@Test(priority = 1, groups = "smoke", enabled = true)
	public void verifyingWebForm() {
		App().Flow().Navigate(App().Pages().completeWebFormPage().gotoUrl());
		App().Pages().completeWebFormPage().ClickCompleteWebForm();
		App().Pages().completeWebFormPage().FirstName("rayhan chowdhury");
		App().Pages().completeWebFormPage().LastName("chowdhury");
		App().Pages().completeWebFormPage().JobTitle("maneger");
		App().Pages().completeWebFormPage().HighestLavelOfEducation();
		App().Pages().completeWebFormPage().sex();
		App().Pages().completeWebFormPage().yearsOfExperince("5-9");
		App().Pages().completeWebFormPage().Date();
		App().Pages().completeWebFormPage().Submit();
		String expectedUrl = App().Flow().GetCurrentUrl();
		String actuallUrl = "https://formy-project.herokuapp.com/thanks";
		String expectedTitle = App().Flow().GetTitle();
		String actulTitle = "Formy";
		String expectedMassage = App().Pages().completeWebFormPage().successfullSubmitMassage();
		String actuallMassage = "Thanks for submitting your form";
		AssertJUnit.assertEquals(expectedTitle, actulTitle);
		AssertJUnit.assertEquals(expectedUrl, actuallUrl);
		AssertJUnit.assertEquals(expectedMassage, actuallMassage);
		boolean expectedMassage1 = App().Pages().completeWebFormPage().Thanksforsubmittingyourform();
		AssertJUnit.assertTrue(expectedMassage1);

	}

}
