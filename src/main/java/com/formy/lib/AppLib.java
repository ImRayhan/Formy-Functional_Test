package com.formy.lib;

import org.openqa.selenium.WebDriver;

public class AppLib {

	WebDriver driver;
	 FlowLib flow;
	 PageLib pageLib;

	public AppLib(WebDriver driver) {
		this.driver = driver;
		flow = new FlowLib(driver);
		pageLib = new PageLib(driver);

	}

	public FlowLib Flow() {
		return flow;

	}

	public PageLib Pages() {
		return pageLib;

	}

}
