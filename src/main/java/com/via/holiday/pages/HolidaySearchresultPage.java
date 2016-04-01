package com.via.holiday.pages;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		int count = hsrpwe.numberOfFilteredPackages();
		System.out.println(count);
		for (int i = 1; i <= count; i++) {
			String pricePath = super.getKeyValue("price") + i + super.getKeyValue("price1");
			String ppots = super.getKeyValue("ppots") + i + super.getKeyValue("ppots1");
			String pkgID = super.getKeyValue("pkgid") + i + super.getKeyValue("pkgid1");
			String price = super.getText(driver, "xpath", pricePath);
			String ppotsa = super.getText(driver, "xpath", ppots);
			
			String pkgid = super.getAttribute(driver, "xpath", pkgID, "data-packageid");
			int id = Integer.parseInt(pkgid);
			System.out.println(id);
			
			Map<Integer, List<String>> map = new HashMap<Integer, List<String>>();
			List<String> valSetOne = new ArrayList<String>();
			
			valSetOne.add(price);
			valSetOne.add(ppotsa);
			
			map.put(id,valSetOne);
			
			for (Map.Entry<Integer, List<String>> entry : map.entrySet()) {
				Integer key = entry.getKey();
				List<String> values = entry.getValue();
				System.out.println(key + "=" + values );
				
			}
			
		}

	}

}