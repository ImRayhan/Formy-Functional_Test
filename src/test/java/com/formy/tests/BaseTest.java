package com.formy.tests;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.formy.lib.AppLib;

public class BaseTest {
	WebDriver driver;
	private AppLib app;

	@BeforeMethod(alwaysRun = true)
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		app = new AppLib(driver);

	}

	@AfterMethod(alwaysRun = true)
	public void tearUp() {
		// driver.quit();

	}

	public AppLib App() {
		return app;

	}

}
