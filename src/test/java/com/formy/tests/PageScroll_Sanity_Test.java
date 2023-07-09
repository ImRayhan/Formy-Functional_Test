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

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class PageScroll_Sanity_Test extends BaseTest {
	WebDriver driver;

	@Test(priority = 1, groups = "smoke", enabled = true)
	public void verifyingScrollingPage() throws InterruptedException {
		App().Flow().Navigate(App().Pages().pageScrollPage().gotoUrl());
		App().Pages().pageScrollPage().ClickPageUrl();
		App().Pages().pageScrollPage().ScrollDown();
		App().Pages().pageScrollPage().FullName("rayhan chowdhury");
		App().Pages().pageScrollPage().Date("07/10/2023");
		App().Pages().pageScrollPage().ScrollUp();
		String largepageContentText = App().Pages().pageScrollPage().LargepagecontentText();
		String actualText = "Large page content";
		String expectedUrl = App().Flow().GetCurrentUrl();
		String actualUrl = "https://formy-project.herokuapp.com/scroll";
		String expectedTitle = App().Flow().GetTitle();
		String actualTitle = "Formy";
		if (!largepageContentText.equalsIgnoreCase(actualText)) {
			Assert.fail();

		} else if (!expectedTitle.equalsIgnoreCase(actualTitle)) {
			Assert.fail();

		} else if (!expectedUrl.equalsIgnoreCase(actualUrl)) {
			Assert.fail();

		}

	}

}
