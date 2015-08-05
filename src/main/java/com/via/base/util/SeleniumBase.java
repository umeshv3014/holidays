package com.via.base.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class SeleniumBase {
	public WebDriver driver;
	public WebElement webelement;
	public InputStream inputStream;
	Properties prop = new Properties();
	public Logger logger = Logger.getLogger(SeleniumBase.class.getName());

	public void openBrowsers(String DefultProfilePath, String URL) {
		PropertyConfigurator.configure("./log/Log4j.properties");
		ProfilesIni profile = new ProfilesIni();
		FirefoxProfile ffprofile = profile.getProfile(DefultProfilePath);
		driver = new FirefoxDriver(ffprofile);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get(URL);
		driver.manage().window().maximize();
	}

	/* to locate web element of all type common Fun */
	public WebElement webElement(WebDriver driver, String locatorType,
			String locatorValue) {
		if (locatorType.equals("id")) {
			webelement = driver.findElement(By.id(locatorValue));
		} else if (locatorType.equals("xpath")) {
			webelement = driver.findElement(By.xpath(locatorValue));
		} else if (locatorType.equals("className")) {
			webelement = driver.findElement(By.className(locatorValue));
		} else if (locatorType.equals("linkText")) {
			webelement = driver.findElement(By.linkText(locatorValue));
		} else if (locatorType.equals("name")) {
			webelement = driver.findElement(By.name(locatorValue));
		} else if (locatorType.equals("cssSelector")) {
			webelement = driver.findElement(By.cssSelector(locatorValue));
		} else if (locatorType.equals("partialLinkText")) {
			webelement = driver.findElement(By.partialLinkText(locatorValue));
		} else if (locatorType.equals("tagName")) {
			webelement = driver.findElement(By.tagName(locatorValue));
		}
		return webelement;
	}

	public String getTitle() {
		logger.info("getting title");
		String titlej = driver.getTitle();
		return titlej;
	}

	public void quitTest() {
		driver.close();
		// System.exit(0);
	}

	public Boolean isImagePresent(String locatorType, String locatorValue) {
		WebElement image = webElement(driver, locatorType,locatorValue );
		Boolean imagePresent = (Boolean) ((JavascriptExecutor) driver)
				.executeScript(
						"return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0",
						image);
		return imagePresent;
	}

	public void getPropertyFile(String filePath) throws IOException {
		File file = new File(filePath);
		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			prop.load(fileInput);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public String getKeyValue(String locatorValue) {
	return prop.getProperty(locatorValue);
	}
}
