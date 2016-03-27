package com.via.holiday.pages;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.via.base.util.PopUpHandler;
import com.via.base.util.SeleniumBase;
import com.via.holiday.pageFactory.webElements.HolidayHomePageWebElement;

public class HolidayHomePage extends SeleniumBase {
	WebDriver driver;
	WebDriverWait wait;
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
		logger.info(driver.getTitle());
	}

	// done some changes check it
	// http://www.seleniumeasy.com/selenium-tutorials/working-with-ajax-or-jquery-auto-complete-text-box-using-webdriver
	public void setDestination(String destination)
			throws InterruptedException {

		hhpwe.holidayDestination(destination);
		Thread.sleep(1000);
		driver.findElement(
				By.xpath(".//img/following-sibling::strong[contains(text(),'"
						+ destination + "')]")).click();

	}

	// click on calendar image
	public void selectDate() {
		GregorianCalendar calender = new GregorianCalendar();

		hhpwe.selectCalender();
		driver.findElement(
				By.xpath("*//td/a[contains(@title,'Select "
						+ new SimpleDateFormat("EEEE").format(calender
								.getTime())
						+ ", "
						+ new SimpleDateFormat("MMM").format(calender.getTime())
						+ " " + calender.get(Calendar.DAY_OF_MONTH) + ", "
						+ calender.get(Calendar.YEAR) + "')]")).click();

	}

	// click on search button
	public void searchDestination() {
		hhpwe.clicksrchBTN();
	}

	public void viaB2CLogo() {
		String xpath = getKeyValue("viaLogo");
		imageverify(driver, "xpath", xpath);
	}

	public void packagesCollectionImagesPresent() {
		int count = hhpwe.getOurCollectionsImageCount();
		str = new ArrayList<String>();
		for (int i = 1; i < count; ++i) {
			str.add(getKeyValue("pcImage") + i + getKeyValue("pcImage2"));
			imageverify(driver, "xpath", str.get(i - 1));
		}
	}

	public void hotDealsImagesPresent() {
		int count = hhpwe.getHotDealsImageCount();
		str = new ArrayList<String>();
		for (int i = 1; i < count; i++) {
			str.add(getKeyValue("hdImage") + i + getKeyValue("hdImage2"));
			imageverify(driver, "xpath", str.get(i - 1));
		}
	}

	public void sendFeedBackDetail(String name, String email, String msg) {
		hhpwe.getFeedbackName(name);
		hhpwe.getFeedbackEmail(email);
		hhpwe.getFeedbackMsg(msg);
		hhpwe.sendFeedBackMsg();
	}

	// accept confirm alert
	public void confirmationAlertOfSYFB() {
		puh = new PopUpHandler(driver);
		puh.accept(driver);
	}

	public void cleaesendustextbox() {
		hhpwe.clearFeedbackName();
		hhpwe.clearFeedbackEmail();
		hhpwe.clearFeedbackMsg();
	}

	public void holidayHomePage() {
		hhpwe.gobackToHolidayPage();
	}

}
