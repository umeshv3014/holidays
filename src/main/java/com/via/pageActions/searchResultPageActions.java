package com.via.pageActions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;

import com.via.holiday.pages.HolidaySearchresultPage;

public class searchResultPageActions extends HolidaySearchresultPage {

	public searchResultPageActions(WebDriver driver) {
		super(driver);
	}

	public void sendHolidayEnquiry(String name, String email, String mobileNu,
			String date, String originCity, String duration,
			String tourRequirementAndPreference) {
		super.selectSendEnqiry();
		super.setNameSE(name);
		super.setEmailSE(email);
		super.setMobileNumberSE(mobileNu);
		super.setdateSE(date);
		super.setoriginCitySE(originCity);
		super.setDurationSE(duration);
		super.setTourRequirementAndPreference(tourRequirementAndPreference);
		super.submitSE();
	}

	public void SendHolidayEnquiry(String name, String email,
			String mobileNu, String date, String originCity, String duration,
			String tourRequirementAndPreference) {
		    super.sendEnquiry();
		    this.sendHolidayEnquiry(name, email, mobileNu, date, originCity,
		    duration, tourRequirementAndPreference);
		super.holidyasThumbImages();
	}
	
	public void destinationDataMatching(String destinationCity){
		super.destinationCityDataMatching(destinationCity);
	}

	public void starRatingFilter() throws InterruptedException {
		int count = hsrpwe.starRatingText.size();
		logger.info(count);
		List<String> str = new ArrayList<String>();
		for (int i = 1; i <= count; i++) {
			String path = (super.getKeyValue("starRatingText") + i + super.getKeyValue("filterText"));
			logger.info(path);
			String text = super.getText(driver, "xpath", path);
			logger.info(str.add(text));
			String gettext = str.get(i - 1);
			logger.info(gettext);
			if (gettext.equals("Standard")) {
				super.selectStarRatingStandard();
				super.getStarRatingStandardText();
				super.getselectStarRatingStandardTotalPkg();
				super.show_All();
				Thread.sleep(1000);
			} else if (gettext.equals("Deluxe")) {
				super.selectStarRatingDeluxe();
				super.getStarRatingDeluxeText();
				super.getStarRatingDeluxTotalPkg();
				super.show_All();
				Thread.sleep(1000);
			} else if (gettext.equals("2 Star")) {
				super.selectStarRatingStar_2();
				super.getStarRatingStar_2_Text();
				super.getselectStarRatingStar_2_TotalPkg();
				super.show_All();
				Thread.sleep(1000);
			} else if (gettext.equals("3 Star")) {
				super.selectStarRatingStar_3();
				super.getStarRatingStar_3_Text();
				super.getselectStarRatingStar_3_TotalPkg();
				super.show_All();
				Thread.sleep(1000);
			} else if (gettext.equals("4 Star")) {
				super.selectStarRatingStar_4();
				super.getStarRatingStar_4_Text();
				super.getselectStarRatingStar_4_TotalPkg();
				super.show_All();
				Thread.sleep(1000);
			} else if (gettext.equals("5 Star")) {
				super.selectStarRatingStar_5();
				super.getStarRatingStar_5_Text();
				super.getselectStarRatingStar_5_TotalPkg();
				super.show_All();
				Thread.sleep(1000);
			} else if (gettext.equals("Budget")) {
				super.selectStarRatingBudget();
				super.getStarRatingBudgetText();
				super.getselectedStarRatingBudgetTotalPkg();
				super.show_All();
				Thread.sleep(1000);
			}else if (gettext.equals("Super Deluxe")){
				super.selectStarRatingSuperDeluxe();
				super.getStarRatingsuperDeluxeText();
				super.getStarRatingsuperDeluxeTotalPkg();
				super.show_All();
				Thread.sleep(1000);
			}else if (gettext.equals("Luxury")){
				super.selectStarRatingluxury();
				super.getStarRatingluxuryText();
				super.getselectedStarRatingLuxuryTotalPkg();
				super.show_All();
				Thread.sleep(1000);
			}else if (gettext.equals("Super Luxury")){
				super.selectStarRatingSuperluxury();
				super.getStarRatingSuperLuxuryText();
				super.getselectedStarRatingSuperLuxuryTotalPkg();
				super.show_All();
				Thread.sleep(1000);
			}else if (gettext.equals("Inside Cabin")){
				super.selectStarRatingInsideCabin();
				super.getStarRatingInsideCabinText();
				super.getStarRatingInsideCabinTotalPkg();
				super.show_All();
				Thread.sleep(1000);
			}
		}
	}

	public void goingForFilter() throws InterruptedException {
		int count = hsrpwe.goingForText.size();
		logger.info(count);
		List<String> str = new ArrayList<String>();
		for (int i = 1; i <= count; i++) {
			String path = (super.getKeyValue("goingForText") + i + super.getKeyValue("filterText"));
			logger.info(path);
			String text = super.getText(driver, "xpath", path);
			logger.info(str.add(text));
			String gettext = str.get(i - 1);
			if (gettext.equals("Any")) {
				super.getGoingForAnyText();
				super.getGoingForAnyTextTotalPkg();
				super.show_All();
				Thread.sleep(1000);
			} else if (gettext.equals("1-3 Nights")) {
				super.selectGoingForWeekendHolidays();
				super.getGoingForweekendholidaysText();
				super.getGoingForweekendholidaysTotalPkg();
				super.show_All();
				Thread.sleep(1000);
			} else if (gettext.equals("4-7 Nights")) {
				super.selectGoingForShortHolidays();
				super.getGoingForShortHolidaysText();
				super.getGoingForShortHolidaysTotalPkg();
				super.show_All();
				Thread.sleep(1000);
			} else if (gettext.equals("7+ Nights")) {
				super.selectGoingForLongHolidays();
				super.getGoingForLongtHolidaysText();
				super.getGoingForLongHolidaysTotalPkg();
				super.show_All();
				Thread.sleep(1000);
			}
		}
	}

	public void flightFilter() throws InterruptedException {
		int count = hsrpwe.flightText.size();
		logger.info(count);
		List<String> str = new ArrayList<String>();
		for (int i = 1; i <= count; i++) {
			String path = (super.getKeyValue("flightText") + i + super
					.getKeyValue("filterText"));
			logger.info(path);
			String text = super.getText(driver, "xpath", path);
			logger.info(str.add(text));
			String gettext = str.get(i - 1);
			if (gettext.equals("With Flight")) {
				super.selectWithFlight();
				super.gettWithFlightText();
				super.getWithFlightTotalPkg();
				super.show_All();
				Thread.sleep(1000);
			} else if (gettext.equals("Without Flight")) {
				super.selectWithoutFlight();
				super.getWithoutFlightText();
				super.getWithoutFlightTotalPkg();
				super.show_All();
				Thread.sleep(1000);
			}
		}
	}

	public void transferFilter() throws InterruptedException {
		int count = hsrpwe.transferText.size();
		logger.info(count);
		List<String> str = new ArrayList<String>();
		for (int i = 1; i <= count; i++) {
			String path = (super.getKeyValue("transferText") + i + super
					.getKeyValue("filterText"));
			logger.info(path);
			String text = super.getText(driver, "xpath", path);
			logger.info(str.add(text));
			String gettext = str.get(i - 1);
			if (gettext.equals("With Transfers")) {
				super.selectWithTransfers();
				super.selectWithTransfersText();
				super.getWithTransfersTotalPkg();
				super.show_All();
				Thread.sleep(1000);
			} else if (gettext.equals("Without Transfers")) {
				super.selectTransfersoutFlight();
				super.selectTransfersoutFlightText();
				super.getTransfersoutFlightTotalPkg();
				super.show_All();
				Thread.sleep(1000);
			}
		}
	}

	public void sightseeingFilter() throws InterruptedException {
		int count = hsrpwe.sightseeingText.size();
		logger.info(count);
		List<String> str = new ArrayList<String>();
		for (int i = 1; i <= count; i++) {
			String path = (super.getKeyValue("sightseeingText") + i + super
					.getKeyValue("filterText"));
			logger.info(path);
			String text = super.getText(driver, "xpath", path);
			logger.info(str.add(text));
			String gettext = str.get(i - 1);
			if (gettext.equals("With Sightseeing")) {
				super.selectWithSightseeing();
				super.getWithSightseeingText();
				super.getWithSightseeingTotalPkg();
				super.show_All();
				Thread.sleep(1000);
			} else if (gettext.equals("Without Sightseeing")) {
				super.selectWithoutSightseeing();
				super.selectWithoutSightseeing();
				super.getWithoutSightseeingText();
				super.show_All();
				Thread.sleep(1000);
			}
		}
	}

}
