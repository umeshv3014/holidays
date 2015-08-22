package com.via.base.util;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class PopUpHandler extends SeleniumBase {
	
	public void accept(WebDriver driver) {
		Alert alrt = driver.switchTo().alert();
		logger.info(alrt.getText());
		alrt.accept();
	}

	public void dismiss(WebDriver driver) {
		Alert alrt = driver.switchTo().alert();
		logger.info(alrt.getText());
		alrt.dismiss();
	}
}