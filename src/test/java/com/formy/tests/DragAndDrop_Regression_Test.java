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

public class DragAndDrop_Regression_Test extends BaseTest {
	@Test(priority = 1, groups = "smoke", enabled = true)
	public void verfyDragAnddrop() {

		App().Flow().Navigate(App().Pages().dragAndDropPage().gotoUrl());
		App().Pages().dragAndDropPage().ClickdragAndDrop();
		App().Pages().dragAndDropPage().seDragDrop();

		if (!App().Pages().dragAndDropPage().DragtheimageintotheboxDisplayed()
				.equalsIgnoreCase("Drag the image into the box")) {
			Assert.fail();

		}

	}

}
