package com.formy.tests;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;
import com.formy.lib.AppLib;

public class BaseTest {
	WebDriver driver;
	private AppLib app;

	@Parameters("browser")
	@BeforeMethod(alwaysRun = true)
	public void setup(@Optional("chrome") String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();

		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();

		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		app = new AppLib(driver);

	}

	@AfterMethod(alwaysRun = true)
	public void tearUp() {
		driver.quit();

	}

	public AppLib App() {
		return app;

	}

}
