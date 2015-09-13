package com.via.holiday.pages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;

import com.via.base.util.PopUpHandler;
import com.via.base.util.SeleniumBase;

public class HolidayHomePageObject extends SeleniumBase {
	public PopUpHandler puh = new PopUpHandler();
	public List<String> str;

	public void openB2CBrowser() throws IOException {
		openBrowsers(getKeyValue("profile"), getKeyValue("baseURL"));
	}

	public void titleHoliday() {
		String title = getKeyValue("HolidaysTitle");
		String tike = driver.getTitle();
		Assert.assertEquals(title,tike);
	}

	public void viaB2CLogo() {
		String xpath = getKeyValue("viaLogo");
		imageverify(driver, "xpath", xpath);
	}

	public void menuImages() {
		str = new ArrayList<String>();
		int count = Integer.parseInt(getKeyValue("pcImageCount"));
		for (int i = 1; i <= count; i++) {
			String xpathPTR = getKeyValue("menuImage") + i
					+ getKeyValue("menuImage2");
			logger.info(xpathPTR);
			String backimage = _getCssValue(driver, "xpath", xpathPTR,
					"background-image");
			imageverify(driver, backimage, backimage);
		}
	}

	public void menuProductName() {
		str = new ArrayList<String>();
		int count = Integer.parseInt(getKeyValue("proNameCount"));
		for (int i = 1; i <= count; i++) {
			str.add(getKeyValue("menuImage") +i+ getKeyValue("menuProduct"));
			Assert.assertEquals(getText(driver, "xpath", str.get(i-1)),	getKeyValue("text" + i));
			if (getText(driver, "xpath", str.get(i-1)).equals("Explore")) {
				click(driver, "xpath", str.get(i-1));
				for (int j = 1; j <= count-3; j++) {
					str.add(getKeyValue("submenu") + getKeyValue("textsb" + j) + getKeyValue("textsm"));
					Assert.assertEquals(getText(driver, "xpath", str.get(j-1)),	getKeyValue("textsb" + j));
				}
			}
			if (getText(driver, "xpath",str.get(i-1) ).equals("Your trips")) {
				click(driver, "xpath", str.get(i-1));
				Assert.assertEquals(getText(driver, "xpath", getKeyValue("yrt")), "Sign in");
				Assert.assertEquals(getText(driver, "xpath", getKeyValue("yrtNH")),"New here? Register");
			}
		}
	}

	public void packagesCollectionImagesPresent() {
		str = new ArrayList<String>();
		int count = Integer.parseInt(getKeyValue("pcImageCount"));
		for (int i = 0; i <= count;) {
			str.add(getKeyValue("pcImage") + ++i + getKeyValue("pcImage2"));
			imageverify(driver, "xpath", str.get(i - 1));
		}
	}

	public void hotDealsImagesPresent() {
		str = new ArrayList<String>();
		int count = Integer.parseInt(getKeyValue("hdImageCount"));
		for (int i = 1; i <= count; i++) {
			str.add(getKeyValue("hdImage") + i + getKeyValue("hdImage2"));
			imageverify(driver, "xpath", str.get(i - 1));
		}
	}

	public void whyViaFooterImages() {
		str = new ArrayList<String>();
		int count = Integer.parseInt(getKeyValue("whyViaFooterImagesCount"));
		String ftrimage = getKeyValue("ftrimage");
		for (int i = 1; i <= count; i++) {
			str.add(getKeyValue("ftrimage" + i));
			imageverify(driver, "xpath", ftrimage + " " + str.get(i - 1));
		}
	}

	public void whyViaContent() {
		String str = getKeyValue("ftrimage");
		for (int i = 1; i <= 6; i++) {
			String content = str + " " + getKeyValue("ftrimage" + i)
					+ getKeyValue("ftrimage1" + i);
			logger.info(getKeyValue("yvc" + i));
			Assert.assertEquals(getText(driver, "xpath", content),
					getKeyValue("yvc" + i));
			String contentPara = str + " " + getKeyValue("ftrimage" + i)
					+ getKeyValue("ftrimage11" + i);
			logger.info(getKeyValue("yvc1" + i));
			Assert.assertEquals(getText(driver, "xpath", contentPara),
					getKeyValue("yvc1" + i));
		}
	}

	public void sendUsYourFeedback(String name, String email, String msg) {
		sendKeys(driver, "xpath", getKeyValue("feedbackName"), name);
		sendKeys(driver, "xpath", getKeyValue("feedbackEmail"),email);// get  value from xl 
		sendKeys(driver, "xpath", getKeyValue("feedbackMsg"),msg);
		click(driver, "xpath", getKeyValue("SYRmsg"));
		puh.accept(driver);
		clearText(driver, "xpath", getKeyValue("feedbackName"));
		clearText(driver, "xpath", getKeyValue("feedbackEmail"));
		clearText(driver, "xpath", getKeyValue("feedbackMsg"));
	}

	public void holidayDestinationSearch(String destinationCity) {
		click(driver, "xpath", getKeyValue("domesticCity"));
		click(driver, "xpath", getKeyValue("cityTextBox"));
		sendKeys(driver, "xpath", getKeyValue("citytextbox"), destinationCity);
		click(driver, "xpath", getKeyValue("dropDownCity"));
		click(driver, "xpath", getKeyValue("srchBTN"));
		click(driver, "xpath", getKeyValue("backToHome"));
	}

}
