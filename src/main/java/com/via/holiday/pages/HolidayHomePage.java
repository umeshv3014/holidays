package com.via.holiday.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.via.base.util.PopUpHandler;
import com.via.base.util.SeleniumBase;
import com.via.holiday.pageFactory.webElements.HolidayHomePageWebElement;

public class HolidayHomePage extends SeleniumBase {
	WebDriver driver;
	public PopUpHandler puh;
	public List<String> str;
	HolidayHomePageWebElement hhpwe;

	public HolidayHomePage(WebDriver driver) {
		this.driver = driver;
		hhpwe = PageFactory.initElements(driver,
				HolidayHomePageWebElement.class);
	}

	/*
	 * assert the title of page
	 */
	public void titleHolidayHomePage() {
		Assert.assertEquals(getKeyValue("HHPTitle"), driver.getTitle());
	}

	//select dom
	public void selectDOM() {
		if (hhpwe.domesticCity != null) {
			try {
				hhpwe.domesticCity.click();
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath ",
						e);
			}
		}
	}

	
	//select intl
	public void selectINTL() {
		if (hhpwe.intlCity != null) {
			try {
				hhpwe.intlCity.click();
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath ",
						e);
			}
		}
	}

	public void setDestination(String destinationCity) {
		if (hhpwe.cityTextBox != null || hhpwe.citytextbox != null
				|| hhpwe.dropDownCity != null) {
			try {
				hhpwe.cityTextBox.click();
				hhpwe.citytextbox.sendKeys(destinationCity);
				hhpwe.dropDownCity.click();
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}

		}
	}

	// click on search button
	public void searchDestination() {
		if (hhpwe.srchBTN != null) {
			try {
				hhpwe.srchBTN.click();
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}

		}
	}
	
	public void viaB2CLogo() {
		String xpath = getKeyValue("viaLogo");
		imageverify(driver, "xpath", xpath);
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

	// enter name
	public void fillSendFeedBackDetail(String name, String email, String msg) {
		if (hhpwe.feedbackName != null || hhpwe.feedbackEmail != null
				|| hhpwe.feedbackMsg != null) {
			try {
				hhpwe.feedbackName.sendKeys(name);
				hhpwe.feedbackEmail.sendKeys(email);
				hhpwe.feedbackMsg.sendKeys(msg);
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}

		}
	}

	// click on send button
	public void sendMsgSYFB() {
		if (hhpwe.SYRmsg != null) {
			try {
				hhpwe.SYRmsg.click();
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}

		}
	}

	// accept confirm alert
	public void confirmationAlertOfSYFB() {
		puh = new PopUpHandler(driver);
		puh.accept(driver);
	}

	public void cleaesendustextbox() {
		if (hhpwe.feedbackName != null || hhpwe.feedbackEmail != null
				|| hhpwe.feedbackMsg != null) {
			try {
				hhpwe.feedbackName.clear();
				hhpwe.feedbackEmail.clear();
				hhpwe.feedbackMsg.clear();
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}

		}
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

	public void sendUsYourFeedback(String name, String email, String msg) {
		this.fillSendFeedBackDetail(name, email, msg);
		this.sendMsgSYFB();
		this.confirmationAlertOfSYFB();
	}

}
