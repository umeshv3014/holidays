package com.via.pageActions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;

import com.via.holiday.pages.HolidaySearchresultPage;

public class searchResultPageActions extends HolidaySearchresultPage {

	public searchResultPageActions(WebDriver driver) {
		super(driver);
	}

	public void sendHolidayEnquiry(String name, String email,
			String mobileNumber, String date, String originCity,
			String duration, String tourRequirementAndPreference) {
		hsrpwe.selectSendEnquiry();
		hsrpwe.setSendEnquiryname(name);
		hsrpwe.setSendEnquiryEmail(email);
		hsrpwe.setSendEnquiryMobileNumber(mobileNumber);
		hsrpwe.setSendEnquiryDate();
		hsrpwe.setSendEnquiryCityName(originCity);
		hsrpwe.setSendEnquiryDuration(duration);
		hsrpwe.setSendEnquirycomments(tourRequirementAndPreference);
		hsrpwe.submitSendEnquiry();
	}

	public void SendHolidayEnquiry(String name, String email, String mobileNu,
			String date, String originCity, String duration,
			String tourRequirementAndPreference) {
		super.sendEnquiry();
		this.sendHolidayEnquiry(name, email, mobileNu, date, originCity,
				duration, tourRequirementAndPreference);
		super.holidyasThumbImages();
	}

	public void destinationDataMatching(String destinationCity) {
		super.destinationCityDataMatching(destinationCity);
	}

	public void starRatingFilter() throws InterruptedException {
		List<String> str = new ArrayList<String>();
		for (int i = 1; i <= hsrpwe.totalStarRatingPackages(); i++) {
			String path = (super.getKeyValue("starRatingText") + i + super
					.getKeyValue("filterText"));
			logger.info(path);
			String text = super.getText(driver, "xpath", path);
			logger.info(str.add(text));
			String getText = str.get(i - 1);
			logger.info(getText);
			if (getText.equals("Standard")) {
				hsrpwe.selectStandard();
				hsrpwe.getStandardText();
				hsrpwe.getTotalStandartdpkg();
				Thread.sleep(1000);
			} else if (getText.equals("Deluxe")) {
				hsrpwe.selectdeluxe();
				hsrpwe.getdeluxeText();
				hsrpwe.getdeluxeTotlaPkg();
				Thread.sleep(1000);
			} else if (getText.equals("2 Star")) {
				hsrpwe.select_2_star();
				hsrpwe.get2StarText();
				hsrpwe.getTotalStar_2();
				Thread.sleep(1000);
			} else if (getText.equals("3 Star")) {
				hsrpwe.select3Star();
				hsrpwe.get3StarText();
				hsrpwe.get3StarTotal();
				Thread.sleep(1000);
			} else if (getText.equals("4 Star")) {
				hsrpwe.select4Star();
				hsrpwe.get4StarText();
				hsrpwe.get4StarTotal();
				Thread.sleep(1000);
			} else if (getText.equals("5 Star")) {
				hsrpwe.select5Star();
				hsrpwe.get5StarText();
				hsrpwe.get5StarTotal();
				Thread.sleep(1000);
			} else if (getText.equals("Budget")) {
				hsrpwe.selectBudget();
				hsrpwe.getbudgetText();
				hsrpwe.getbudgetTotlaPkg();
				Thread.sleep(1000);
			} else if (getText.equals("Super Deluxe")) {
				hsrpwe.selectSuperDeluxe();
				hsrpwe.getsuperDeluxeText();
				hsrpwe.getSuperDeluxeTotlaPkg();
				Thread.sleep(1000);
			} else if (getText.equals("Luxury")) {
				hsrpwe.selectLuxury();
				hsrpwe.getluxuryText();
				hsrpwe.getluxuryTotalPkg();
				Thread.sleep(1000);
			} else if (getText.equals("Super Luxury")) {
				hsrpwe.selectSuperLuxury();
				hsrpwe.getsuperLuxuryText();
				hsrpwe.getsuperLuxuryTotalPkg();
				Thread.sleep(1000);
			} else if (getText.equals("Inside Cabin")) {
				hsrpwe.selectinsideCabin();
				hsrpwe.getinsideCabinText();
				hsrpwe.getinsideCabinTotalPkg();
				Thread.sleep(1000);
			} else if (getText.equals("Deluxe Ocean View Cabin")) {
				hsrpwe.selectDovcCabin();
				hsrpwe.getDOVCcabinText();
				hsrpwe.getDOVCcabinTotalPkg();
				Thread.sleep(1000);
			} else if (getText.equals("Outside/Ocean View Cabin")) {
				hsrpwe.selectoovcCabin();
				hsrpwe.getOOVCcabinText();
				hsrpwe.getOOVCcabinTotalPkg();
				Thread.sleep(1000);
			}
		}
	}

	public void goingForFilter() throws InterruptedException {
		List<String> str = new ArrayList<String>();
		for (int i = 1; i <= hsrpwe.totalGoingForPackages(); i++) {
			String path = (super.getKeyValue("goingForText") + i + super
					.getKeyValue("filterText"));
			logger.info(path);
			String text = super.getText(driver, "xpath", path);
			logger.info(str.add(text));
			String getText = str.get(i - 1);
			if (getText.equals("Any")) {
				hsrpwe.getanyText();
				hsrpwe.getanyTotalPkg();
				Thread.sleep(1000);
			} else if (getText.equals("1-3 Nights")) {
				hsrpwe.selectWeekendHolidays();
				hsrpwe.getweekendHolidaysText();
				hsrpwe.getweekendHolidaysTotlaPkg();
				Thread.sleep(1000);
			} else if (getText.equals("4-7 Nights")) {
				hsrpwe.selectShortHoliday();
				hsrpwe.getShortHolidayText();
				hsrpwe.getShortHolidayTotalPkg();
				Thread.sleep(1000);
			} else if (getText.equals("7+ Nights")) {
				hsrpwe.selectLongHoliday();
				hsrpwe.getlongHolidayText();
				hsrpwe.getlongHolidayTotlaPkg();
				Thread.sleep(1000);
			}
		}
	}

	public void flightFilter() throws InterruptedException {
		List<String> str = new ArrayList<String>();
		for (int i = 1; i <= hsrpwe.totalFlightPackages(); i++) {
			String path = (super.getKeyValue("flightText") + i + super
					.getKeyValue("filterText"));
			logger.info(path);
			String text = super.getText(driver, "xpath", path);
			logger.info(str.add(text));
			String getText = str.get(i - 1);
			if (getText.equals("With Flight")) {
				hsrpwe.selectWithFlights();
				hsrpwe.getwithFlightsText();
				hsrpwe.getwithFlightsTotalPkg();
				Thread.sleep(1000);
			} else if (getText.equals("Without Flight")) {
				hsrpwe.selectWithoutFlight();
				hsrpwe.getwithoutFlightText();
				hsrpwe.getwithoutFlightTotalPkg();
				Thread.sleep(1000);
			}
		}
	}

	public void transferFilter() throws InterruptedException {
		List<String> str = new ArrayList<String>();
		for (int i = 1; i <= hsrpwe.totalFlightPackages(); i++) {
			String path = (super.getKeyValue("transferText") + i + super
					.getKeyValue("filterText"));
			logger.info(path);
			String text = super.getText(driver, "xpath", path);
			logger.info(str.add(text));
			String getText = str.get(i - 1);
			if (getText.equals("With Transfers")) {
				hsrpwe.selectWithTransfer();
				hsrpwe.getwithTransferText();
				hsrpwe.getwithTransferTotalPkg();
				Thread.sleep(1000);
			} else if (getText.equals("Without Transfers")) {
				hsrpwe.selectWithoutTransfer();
				hsrpwe.getwithoutTransferText();
				hsrpwe.getwithoutTransferTotalPkg();
				Thread.sleep(1000);
			}
		}
	}

	public void sightseeingFilter() throws InterruptedException {
		List<String> str = new ArrayList<String>();
		for (int i = 1; i <= hsrpwe.totalSightSeeingPackages(); i++) {
			String path = (super.getKeyValue("sightseeingText") + i + super
					.getKeyValue("filterText"));
			logger.info(path);
			String text = super.getText(driver, "xpath", path);
			logger.info(str.add(text));
			String getText = str.get(i - 1);
			if (getText.equals("With Sightseeing")) {
				hsrpwe.selectWithsightseeing();
				hsrpwe.getwithsightseeingText();
				hsrpwe.getwithsightseeingTotalPkg();

				Thread.sleep(1000);
			} else if (getText.equals("Without Sightseeing")) {
				hsrpwe.selectwithoutsightseeing();
				hsrpwe.getwithoutsightseeingText();
				hsrpwe.getwithoutsightseeingTotalPkg();

				Thread.sleep(1000);
			}
		}
	}

}
