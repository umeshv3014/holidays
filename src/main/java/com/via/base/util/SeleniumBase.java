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
	public static Properties prop = new Properties();
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

	public void click(WebDriver driver, String locatorType, String locatorValue) {
		webElement(driver, locatorType, locatorValue).click();
	}

	public String getText(WebDriver driver, String locatorType,
			String locatorValue) {
		WebElement we = webElement(driver, locatorType, locatorValue);
		String text = we.getText();
		logger.info(text);
		return text;
	}

	public void sendKeys(WebDriver driver, String locatorType,
			String locatorValue, String key) {
		webElement(driver, locatorType, locatorValue).sendKeys(key);
	}

	public String _getCssValue(WebDriver driver, String locatorType,
			String locatorValue, String propertyName) {
		WebElement text = webElement(driver, locatorType, locatorValue);
		String texta = text.getCssValue(propertyName);
		logger.info(texta);
		return texta;
	}

	public Boolean imageverify(WebDriver driver, String locatorType,
			String locatorValue) {
		WebElement imageFilea = webElement(driver, locatorType, locatorValue);
		Boolean ImagePresent = (Boolean) ((JavascriptExecutor) driver)
				.executeScript(
						"return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0",
						imageFilea);
		if (!ImagePresent) {
			logger.info("Image not displayed.");
		} else {
			logger.info("Image displayed.");
		}
		return ImagePresent;
	}

	public static void getPropertyFile(String filePath) throws IOException {
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

	public String getKeyValue(String keyValue) {
		return prop.getProperty(keyValue);
	}

	public void quitTest() {
		driver.close();
		// System.exit(0);
	}

}