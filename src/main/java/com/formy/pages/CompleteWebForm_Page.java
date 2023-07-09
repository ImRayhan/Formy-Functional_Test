package com.formy.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.formy.elements.CompleteWebForm_Element;

public class CompleteWebForm_Page {
	WebDriver driver;
	CompleteWebForm_Element completeWebForm_Element;
	String pageUrl = "https://formy-project.herokuapp.com/";

	public CompleteWebForm_Page(WebDriver driver) {

		this.driver = driver;
		completeWebForm_Element = new CompleteWebForm_Element(driver);

	}

	public String gotoUrl() {
		return pageUrl;

	}

	public void ClickCompleteWebForm() {
		completeWebForm_Element.completeWebFormElement.click();

	}

	public void FirstName(String firstName) {
		completeWebForm_Element.enterFirstNamElement.sendKeys(firstName);

	}

	public void LastName(String lastName) {
		completeWebForm_Element.enterLastNamElement.sendKeys(lastName);

	}

	public void JobTitle(String jobTitle) {
		completeWebForm_Element.jobTitlElement.sendKeys(jobTitle);

	}

	public void HighestLavelOfEducation() {
		completeWebForm_Element.collegElement.click();

	}

	public void sex() {
		completeWebForm_Element.malElement.click();

	}

	public void yearsOfExperince(String experince) {

		Select sel = new Select(completeWebForm_Element.yearsOfExperiencElement);
		sel.selectByVisibleText(experince);

	}

	public void Date() {
		completeWebForm_Element.dateElement.click();
		String checkmonth = "August 2023";
		String datVal = "10";

		while (true) {
			String month = completeWebForm_Element.monthElement.getText();
			System.out.println("month: is: " + month);

			if (month.equalsIgnoreCase(checkmonth)) {
				break;

			} else {
				completeWebForm_Element.nextMonthYearElement.click();

			}

			List<WebElement> ele = completeWebForm_Element.dateallElement;
			for (WebElement webElement : ele) {
				String date = webElement.getText();

				if (date.equalsIgnoreCase(datVal)) {
					System.out.println("date is: " + date);
					webElement.click();
					completeWebForm_Element.dateElement.click();
					break;

				}

			}

		}

	}

	public void Submit() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(completeWebForm_Element.subMitElement)).click();

	}

	public String successfullSubmitMassage() {
		return completeWebForm_Element.thanksForSubmittingText.getText();

	}

	public boolean Thanksforsubmittingyourform() {
		return completeWebForm_Element.thanksForSubmittingText.isDisplayed();

	}

}
