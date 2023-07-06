package com.formy.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Autocomplete_Regression extends BaseTest {

	@Test
	public void VerifyAutoCompleteForm() {
		App().Flow().Navigate(App().Pages().AutocompltePage().gotoUrl());
		App().Pages().AutocompltePage().clickAutocomplete();
		App().Pages().AutocompltePage().EnterAdress("42 alice ave buffalo ny 14215");
		App().Pages().AutocompltePage().StreetAdress("42 alice ave");
		App().Pages().AutocompltePage().City("buffalo");
		App().Pages().AutocompltePage().State("NY");
		App().Pages().AutocompltePage().ZipCode("14215");
		App().Pages().AutocompltePage().Country("USA");
		String expectedUrl = "https://formy-project.herokuapp.com/autocomplete";
		String expectedTitle = "Formy";
		String actualUrl = App().Flow().GetCurrentUrl();
		String actuaTitle = App().Flow().GetTitle();
		SoftAssert as = new SoftAssert();
		as.assertEquals(expectedUrl, actualUrl);
		Assert.assertEquals(expectedTitle, actuaTitle);
		as.assertAll();
		Assert.assertTrue(App().Pages().AutocompltePage().EnbleComponents());
		Assert.assertEquals(App().Pages().AutocompltePage().visbleText(), "Autocomplete");

	}

}
