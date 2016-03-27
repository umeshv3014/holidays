package com.via.holiday.pages;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.via.base.util.SeleniumBase;
import com.via.holiday.pageFactory.webElements.HolidayHomePageWebElement;
import com.via.holiday.pageFactory.webElements.HolidaySearchResultPageWebElement;

public class HolidaySearchresultPage extends SeleniumBase {
	public WebDriver driver;
	public HolidaySearchResultPageWebElement hsrpwe;
	public HolidayHomePageWebElement hhpwe;

	public HolidaySearchresultPage(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		hsrpwe = PageFactory.initElements(driver,
				HolidaySearchResultPageWebElement.class);
		hhpwe = PageFactory.initElements(driver,
				HolidayHomePageWebElement.class);
	}

	/*
	 * get the page title and assert
	 */

	public void getTitleSearchResultPage() {
		Assert.assertEquals(getKeyValue("HSRPTitle"), driver.getTitle());
	}

	public void destinationCityDataMatching(String destinationCity) {
		hsrpwe.modifySearch.click();
		Assert.assertEquals(destinationCity, hhpwe.holidayDestination());
	}

	public int numberOfPackages() {
		int nupck = Integer.parseInt(getText(driver, "xpath",
				getKeyValue("showingCount")));
		logger.info(nupck);
		int nu = hsrpwe.totalNumberOfPackages();
		logger.info(nu);
		Assert.assertEquals(nupck, nu);
		return nu;
	}

	public int totalPkgs() {
		int totlapkgs = hsrpwe.nuOfPackages.size();
		return totlapkgs;
	}

	public int getTotalNumberOfBOOKNOW() {
		int totlaNumberOfBookableHolidys = hsrpwe.nuOfbookableHolidays.size();
		logger.info("total number of Book Now " + totlaNumberOfBookableHolidys);
		return totlaNumberOfBookableHolidys;
	}

	public int getTotalNumberOfSENDENQUIRY() {
		int totlaNumberOfSendEnquiry = hsrpwe.nuOfSendEnquiry.size();
		logger.info("total number of Send Enquiry " + totlaNumberOfSendEnquiry);
		return totlaNumberOfSendEnquiry;
	}

	public void sendEnquiry() {
		if (hsrpwe.sendEnquiryButton != null) {
			try {
				hsrpwe.sendEnquiryButton.click();
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
	}

	public void sendEnquiryAlertSucess() {
		if (hsrpwe.SendEnquirySuccessAlert != null) {
			try {
				hsrpwe.SendEnquirySuccessAlert.click();
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
	}

	public String getStandardText() {
		String text = hsrpwe.standardText.getText();
		return text;

	}

	// end standard test

	// start 2 star test

	// need to alter
	public void holidyasThumbImages() {
		List<String> str = new ArrayList<String>();
		for (int i = 1; i < hsrpwe.thumbImages(); i++) {
			String we = super.getKeyValue("holidayThumbImages") + i
					+ super.getKeyValue("htImage");
			logger.info(we);
			str.add(we);
			String path = str.get(i - 1);
			imageverify(driver, "xpath", path);
			logger.info(imageverify(driver, "xpath", str.get(i - 1)));
		}
	}

	public void dragSlider(String locatorType, String locatorValue, int xAxis,
			int yAxis) {
		super.horizontalSliderBarAction(driver, locatorType, locatorValue,
				xAxis, yAxis);
		hsrpwe.resetFilter();
	}

	public void filterStarRatingBudget() {
		hsrpwe.budgetcheckBox.click();
		String text = hsrpwe.budgetText.getText();
		Assert.assertEquals("Budget", text);
		String total = hsrpwe.budgetTotlaPkg.getText();
		String trimto = total.trim().replaceAll("\\W", "");
		int tot = Integer.parseInt(trimto);
		logger.info("toal filte pkg " + tot);
		int toalfilterpak = this.totalPkgs();
		logger.info("toal filte pkg " + toalfilterpak);
		Assert.assertEquals(toalfilterpak, tot);
	}

	public void destinationHolidayPackages() {
		String pkg1 = "//*[@id='packagesResults']/div/div[";
		String subpakg1 = "//*[@id='packagesResults']/div/div[@class='row list']/div[";
		String pkg2 = "]";
		int count = hsrpwe.nuOfPackages.size();
		for (int i = 1; i <= count; i++) {
			Map<Integer, List<String>> map = new HashMap<Integer, List<String>>();
			List<String> str = new ArrayList<String>();
			str.add(pkg1 + i + pkg2);
		}

	}

}
