package com.formy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.formy.elements.DragandDrop_Elements;

public class DragAndDrop_Page {

	WebDriver driver;
	DragandDrop_Elements dragandDrop_Element;
	String pageUrl = "https://formy-project.herokuapp.com/";

	public DragAndDrop_Page(WebDriver driver) {
		this.driver = driver;
		dragandDrop_Element = new DragandDrop_Elements(driver);

	}

	public String gotoUrl() {
		return pageUrl;

	}

	public void ClickdragAndDrop() {
		dragandDrop_Element.dragAndDropElement.click();

	}

	public void seDragDrop() {

		Actions act = new Actions(driver);
		driver.navigate().refresh();
		act.clickAndHold(dragandDrop_Element.seElement).release(dragandDrop_Element.droppedElement).build().perform();
		// act.dragAndDrop(dragandDrop_Element.seElement,
		// dragandDrop_Element.droppedElement).build().perform();

	}
	
	public String DragtheimageintotheboxDisplayed() {
		return dragandDrop_Element.dragtheimageintotheboxelElement.getText();
		
		
	}

}
