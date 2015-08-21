package com.via.base.util;

import org.openqa.selenium.Alert;
import org.testng.Assert;

public class PopUpHandler extends SeleniumBase {
	public void accept(String expectedAlertMsg) {
		Alert alertAccept = driver.switchTo().alert();
		String actual = alertAccept.getText();
		Assert.assertEquals(actual, "tesxt");
		alertAccept.accept();
	}

	public void javaScriptAlertdismiss(String expectedAlertMsg) {
		Alert alertdismiss = driver.switchTo().alert();
		String actual = alertdismiss.getText();
		Assert.assertEquals(actual, "tesxt");
		alertdismiss.dismiss();
	}
}
