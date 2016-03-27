package com.via.holiday.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.via.base.util.SeleniumBase;
import com.via.holiday.pageFactory.webElements.HolidayBookCalenderModelPanelWebElement;

public class HolidayBookCalenderModelPanel extends SeleniumBase {
	WebDriver driver;
	public HolidayBookCalenderModelPanelWebElement hbcmpwe;

	public HolidayBookCalenderModelPanel(WebDriver driver) {
		this.driver = driver;
		hbcmpwe = PageFactory.initElements(driver,
				HolidayBookCalenderModelPanelWebElement.class);
	}

	public boolean isPreviousmonthEnabled() {
		if (hbcmpwe.previousMonth != null) {
			try {
				hbcmpwe.previousMonth.isEnabled();
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
		return true;
	}

	public boolean isNextmonthEnabled() {
		if (hbcmpwe.nextMonth != null) {
			try {
				hbcmpwe.nextMonth.isEnabled();
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
		return true;
	}

	/*
	 * need to create curren date selector
	 */
	public void getYear() {
		if (hbcmpwe.showToday != null) {
			try {
				hbcmpwe.showToday.getText();
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
	}

	public boolean dateModelPanel() {
		if (hbcmpwe.dateModalPanel != null) {
			try {
				hbcmpwe.dateAndpriceBookPanel();
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
		return true;
	}

	// hbcmpwe method test both next month previous and today date to check the
	// functionality.
	public void selectNextMonth() {
		while (this.isNextmonthEnabled() == true) {
			if (hbcmpwe.nextMonth != null || hbcmpwe.previousMonth != null
					|| hbcmpwe.showToday != null) {
				try {
					hbcmpwe.nextMonth.click();
					if (this.isNextmonthEnabled() == false) {
						hbcmpwe.previousMonth.click();
						hbcmpwe.showToday.click();
					}
				} catch (NoSuchElementException e) {
					logger.error(
							"Not able to locate the webelement, please check the xpath",
							e);
				}
			}
		}
	}

	public void selectPreviousMonth() {
		while (this.isPreviousmonthEnabled() == true) {
			if (hbcmpwe.previousMonth != null || hbcmpwe.showToday != null) {
				try {
					hbcmpwe.previousMonth.click();
					if (this.isPreviousmonthEnabled() == false) {
						hbcmpwe.showToday.click();
					}
				} catch (NoSuchElementException e) {
					logger.error(
							"Not able to locate the webelement, please check the xpath",
							e);
				}
			}
		}
	}

	public int getNumberOfBookingDaysInmonth() {

		return 0;
	}

}
