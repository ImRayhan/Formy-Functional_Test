package com.formy.pages;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.formy.elements.SwithWindow_Element;

public class SwithWindow_Page {

	WebDriver driver;
	SwithWindow_Element swithWindow_Element;
	String pageUrl = "https://formy-project.herokuapp.com/";

	public SwithWindow_Page(WebDriver driver) {
		this.driver = driver;
		swithWindow_Element = new SwithWindow_Element(driver);

	}

	public String gotoUrl() {
		return pageUrl;

	}

	public void ClickSwithWindow() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(swithWindow_Element.swithWindowElement)).click();

	}

	public void OpenNewTabHandle() throws InterruptedException {
		String parentWindow = driver.getWindowHandle();
		swithWindow_Element.openNewTabElement.click();
		Set<String> ChildWindow = driver.getWindowHandles();

		for (String window : ChildWindow) {
			if (!window.equals(parentWindow)) {
				driver.switchTo().window(window);
				

			}

		}

	}

	public void ClickOpenAlert() {
		swithWindow_Element.openAlertElement.click();

	}

	public void OpenAlertDismis() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();

	}
	
	public String SwitchWindowText() {
		return swithWindow_Element.switchWindowTextElement.getText();
		
	}

}
