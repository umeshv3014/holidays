package com.via.base.util;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class TakeErrorScreenShot {
	WebDriver driver;
	SeleniumBase sb;

	public TakeErrorScreenShot(WebDriver driver) {
		this.driver = driver;
	}

	public void takeScreenShotOnFailure(ITestResult testResult,
			Method methodName) throws IOException {
		Date date = new Date();
		SimpleDateFormat dateFormate = new SimpleDateFormat(
				"dd_MM_yyyy_hh_mm_ss");
		sb = new SeleniumBase();
		if (testResult.getStatus() == ITestResult.FAILURE) {
			try {
				sb.logger.info(testResult.getStatus());
				File scrFile = ((TakesScreenshot) driver)
						.getScreenshotAs(OutputType.FILE);
				String filePath = System.getProperty("user.dir")
						+ "/errorScreenShotes/" + methodName.getName()
						+"_"+ dateFormate.format(date) + ".png";
				FileUtils.copyFile(scrFile, new File(filePath));
			} catch (Exception e) {
				sb.logger.error("Error image not saved", e);
			}
		}
	}
}
