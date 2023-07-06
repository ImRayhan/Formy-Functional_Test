package com.formy.lib;

import org.openqa.selenium.WebDriver;

public class FlowLib {
	 WebDriver driver;
	
	
	public FlowLib(WebDriver driver) {
		this.driver = driver;
		
	}

	public void Navigate(String url) {
		this.driver.get(url);

	}

	public String GetCurrentUrl() {
		return driver.getCurrentUrl();

	}
	
	public String GetTitle() {
		return driver.getTitle();
		
	}
	


}
