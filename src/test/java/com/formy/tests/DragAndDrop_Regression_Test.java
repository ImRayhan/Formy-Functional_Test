package com.formy.tests;

import static org.testng.Assert.fail;

import org.testng.annotations.Test;

public class DragAndDrop_Regression_Test extends BaseTest {
	@Test
	public void verfyDragAnddrop() {

		App().Flow().Navigate(App().Pages().dragAndDropPage().gotoUrl());
		App().Pages().dragAndDropPage().ClickdragAndDrop();
		App().Pages().dragAndDropPage().seDragDrop();

		if (!App().Pages().dragAndDropPage().DragtheimageintotheboxDisplayed()
				.equalsIgnoreCase("Drag the image into the box")) {
			fail();

		}

	}

}
