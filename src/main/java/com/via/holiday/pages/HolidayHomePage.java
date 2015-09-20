package com.via.holiday.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.via.base.util.PopUpHandler;
import com.via.base.util.SeleniumBase;

public class HolidayHomePage extends SeleniumBase {
	public PopUpHandler puh;
	public List<String> str;
	WebDriver driver;

	public HolidayHomePage(WebDriver driver) {
		this.driver = driver;
	}

	public HolidayHomePage titleHolidayHomePage() {
		Assert.assertEquals(getKeyValue("HHPTitle"), driver.getTitle());
		return this;
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
			str.add(getKeyValue("menuImage") + i + getKeyValue("menuProduct"));
			Assert.assertEquals(getText(driver, "xpath", str.get(i - 1)),
					getKeyValue("text" + i));
			if (getText(driver, "xpath", str.get(i - 1)).equals("Explore")) {
				click(driver, "xpath", str.get(i - 1));
				for (int j = 1; j <= count - 3; j++) {
					str.add(getKeyValue("submenu") + getKeyValue("textsb" + j)
							+ getKeyValue("textsm"));
					Assert.assertEquals(
							getText(driver, "xpath", str.get(j - 1)),
							getKeyValue("textsb" + j));
				}
			}
			if (getText(driver, "xpath", str.get(i - 1)).equals("Your trips")) {
				click(driver, "xpath", str.get(i - 1));
				Assert.assertEquals(
						getText(driver, "xpath", getKeyValue("yrt")), "Sign in");
				Assert.assertEquals(
						getText(driver, "xpath", getKeyValue("yrtNH")),
						"New here? Register");
			}
		}
	}

	public void packagesCollectionImagesPresent() {
		str = new ArrayList<String>();
		int count = Integer.parseInt(getKeyValue("pcImageCount"));
		for (int i = 0; i < count;) {
			str.add(getKeyValue("pcImage") + ++i + getKeyValue("pcImage2"));
			imageverify(driver, "xpath", str.get(i - 1));
		}
	}

	public void hotDealsImagesPresent() {
		str = new ArrayList<String>();
		int count = Integer.parseInt(getKeyValue("hdImageCount"));
		for (int i = 1; i < count; i++) {
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

	// page object model
	// Send feed back block

	// enter name
	public HolidayHomePage setNameSYFB(String name) {
		sendKeys(driver, "xpath", "feedbackName", name);
		return this;
	}

	// enter email
	public HolidayHomePage setEmailSYFM(String email) {
		sendKeys(driver, "xpath", "feedbackEmail", email);
		return this;
	}

	// enter msg
	public HolidayHomePage msgSYFB(String msg) {
		sendKeys(driver, "xpath", "feedbackMsg", msg);
		return this;
	}

	// click on send button
	public HolidayHomePage sendMsgSYFB() {
		click(driver, "xpath", "SYRmsg");
		return this;
	}

	// accept confirm alert
	public void confirmationAlertOfSYFB() {
		puh = new PopUpHandler(driver);
		puh.accept(driver);
	}

	// clear the name field
	// clear enter name
	public void cleaeSetNameSYFB() {
		clearText(driver, "xpath", "feedbackName");
	}

	// clear enter email
	public void clearSetEmailSYFM() {
		clearText(driver, "xpath", "feedbackEmail");
	}

	// clear enter msg
	public void clearMsgSYFB() {
		clearText(driver, "xpath", "feedbackMsg");
	}

	public void cleaeSendUsYourFeedbackFields() {
		this.cleaeSetNameSYFB();
		this.clearSetEmailSYFM();
		this.clearMsgSYFB();
	}

	// destination search
	public void selectDOM() {
		click(driver, "xpath", "domesticCity");
	}

	public void selectINTL() {
		click(driver, "xpath", "intlCity");
	}

	public void setDestination(String destinationCity) {
		click(driver, "xpath", "cityTextBox");
		sendKeys(driver, "xpath", "citytextbox", destinationCity);
		click(driver, "xpath", "dropDownCity");
	}

	// click on search button
	public void searchDestination() {
		click(driver, "xpath", "srchBTN");
	}

	// test cases

	public void sendUsYourFeedback(String name, String email, String msg) {
		this.setNameSYFB(name);
		this.setEmailSYFM(email);
		this.msgSYFB(msg);
		this.sendMsgSYFB();
		this.confirmationAlertOfSYFB();
	}

	public void holidayDestinationSearchDom(String destinationCity) {
		this.selectDOM();
		this.setDestination(destinationCity);
		this.searchDestination();
	}

	public void holidayDestinationSearchIntl(String destinationCity) {
		this.selectINTL();
		this.setDestination(destinationCity);
		this.searchDestination();
	}

}
