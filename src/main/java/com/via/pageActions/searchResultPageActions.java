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
		hsrpwe.sendEnquiry();
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
			String text = super.getText(
					driver,
					"xpath",
					super.getKeyValue("starRatingText") + i
							+ super.getKeyValue("filterText"));
			str.add(text);
			String getText = str.get(i - 1);
			logger.info(getText);
			if (getText.equals("Standard")) {
				hsrpwe.selectStandard();
				if (hsrpwe.standardTotalpkg() != 0) {
					hsrpwe.standartdPkg();
				} else {
					hsrpwe.deselectStandard();
				}
				Thread.sleep(1000);
			} else if (getText.equals("Deluxe")) {
				hsrpwe.selectdeluxe();
				if (hsrpwe.deluxeTotlapkg() != 0) {
					hsrpwe.deluxeTotlaPkg();
				} else {
					hsrpwe.deselectdeluxe();
				}
				Thread.sleep(1000);
			} else if (getText.equals("2 Star")) {
				hsrpwe.select_2_star();
				if (hsrpwe.star2Totalpkg() != 0) {
					hsrpwe.getTotalStar_2();
				} else {
					hsrpwe.deselect_2_star();
				}
				Thread.sleep(1000);
			} else if (getText.equals("3 Star")) {
				hsrpwe.select3Star();
				if (hsrpwe.star3Totalpkg() != 0) {
					hsrpwe.get3StarTotal();
				} else {
					hsrpwe.deselect3Star();
				}
				Thread.sleep(1000);
			} else if (getText.equals("4 Star")) {
				hsrpwe.select4Star();
				if (hsrpwe.star4Totalpkg() != 0) {
					hsrpwe.get4StarTotal();
				} else {
					hsrpwe.deselect4Star();
				}
				Thread.sleep(1000);
			} else if (getText.equals("5 Star")) {
				hsrpwe.select5Star();
				if (hsrpwe.star5Totalpkg() != 0) {
					hsrpwe.get5StarTotal();
				} else {
					hsrpwe.deselect5Star();
				}
				Thread.sleep(1000);
			} else if (getText.equals("Budget")) {
				hsrpwe.selectBudget();
				if (hsrpwe.budgetTotlapkg() != 0) {
					hsrpwe.getbudgetTotlaPkg();
				} else {
					hsrpwe.deselectBudget();
				}
				Thread.sleep(1000);
			} else if (getText.equals("Super Deluxe")) {
				hsrpwe.selectSuperDeluxe();
				if (hsrpwe.superDeluxeTotlapkg() != 0) {
					hsrpwe.superDeluxeTotlaPkg();
				} else {
					hsrpwe.deselectSuperDeluxe();
				}
				Thread.sleep(1000);
			} else if (getText.equals("Luxury")) {
				hsrpwe.selectLuxury();
				if (hsrpwe.luxuryTotalpkg() != 0) {
					hsrpwe.luxuryTotalPkg();
				} else {
					hsrpwe.deselectLuxury();
				}
				Thread.sleep(1000);
			} else if (getText.equals("Super Luxury")) {
				hsrpwe.selectSuperLuxury();
				if (hsrpwe.superLuxuryTotalpkg() != 0) {
					hsrpwe.superLuxuryTotalPkg();
				} else {
					hsrpwe.deselectSuperLuxury();
				}
				Thread.sleep(1000);
			} else if (getText.equals("Inside Cabin")) {
				hsrpwe.selectinsideCabin();
				if (hsrpwe.insdeCabinTotalpkg() != 0) {
					hsrpwe.insideCabinTotalPkg();
				} else {
					hsrpwe.deselectinsideCabin();
				}
				Thread.sleep(1000);
			} else if (getText.equals("Deluxe Ocean View Cabin")) {
				hsrpwe.selectDovcCabin();
				if (hsrpwe.dovCabinTotalpkg() != 0) {
					hsrpwe.dOVCcabinTotalPkg();
				} else {
					hsrpwe.deselectDovcCabin();
				}
				Thread.sleep(1000);
			} else if (getText.equals("Outside/Ocean View Cabin")) {
				hsrpwe.selectoovcCabin();
				if (hsrpwe.OOVCcabinTotalpkg() != 0) {
					hsrpwe.oOVCcabinTotalPkg();
				} else {
					hsrpwe.deselectoovcCabin();
				}
				Thread.sleep(1000);
			}
		}
	}

	public void goingForFilter() throws InterruptedException {
		List<String> str = new ArrayList<String>();
		for (int i = 1; i <= hsrpwe.totalGoingForPackages(); i++) {
			String text = super.getText(
					driver,
					"xpath",
					super.getKeyValue("goingForText") + i
							+ super.getKeyValue("filterText"));
			str.add(text);
			String getText = str.get(i - 1);
			if (getText.equals("Any")) {
				if (hsrpwe.anyTotalpkg() != 0) {
					hsrpwe.anyTotalPkg();
				}else {
					hsrpwe.deselectAnyCheckBox();
				}
				Thread.sleep(1000);
			} else if (getText.equals("1-3 Nights")) {
				hsrpwe.selectWeekendHolidays();
				if (hsrpwe.weekendHolidaysTotlapkg() != 0) {
					hsrpwe.weekendHolidaysTotlaPkg();
				}else {
					hsrpwe.deselectWeekendHolidays();
				}
				Thread.sleep(1000);
			} else if (getText.equals("4-7 Nights")) {
				hsrpwe.selectShortHoliday();
				if (hsrpwe.ShortHolidayTotalpkg() != 0) {
					hsrpwe.getShortHolidayTotalPkg();
				}else {
					hsrpwe.deselectShortHoliday();
				}
				Thread.sleep(1000);
			} else if (getText.equals("7+ Nights")) {
				hsrpwe.selectLongHoliday();
				if (hsrpwe.longHolidayTotlapkg() != 0) {
					hsrpwe.getlongHolidayTotlaPkg();
				}else {
					hsrpwe.deselectLongHoliday();
				}
				Thread.sleep(1000);
			}
		}
	}

	public void flightFilter() throws InterruptedException {
		List<String> str = new ArrayList<String>();
		for (int i = 1; i <= hsrpwe.totalFlightPackages(); i++) {
			String text = super.getText(
					driver,
					"xpath",
					super.getKeyValue("flightText") + i
							+ super.getKeyValue("filterText"));
			str.add(text);
			String getText = str.get(i - 1);
			if (getText.equals("With Flight")) {
				hsrpwe.selectWithFlights();
				if (hsrpwe.withFlightsTotalpkg() != 0) {
					hsrpwe.getwithFlightsTotalPkg();
				}else {
					hsrpwe.deselectWithFlights();
				}
				Thread.sleep(1000);
			} else if (getText.equals("Without Flight")) {
				hsrpwe.selectWithoutFlight();
				if (hsrpwe.withoutFlightTotalpkg() != 0) {
					hsrpwe.getwithoutFlightTotalPkg();
				}else {
					hsrpwe.deselectWithoutFlight();
				}
				Thread.sleep(1000);
			}
		}
	}

	public void transferFilter() throws InterruptedException {
		List<String> str = new ArrayList<String>();
		for (int i = 1; i <= hsrpwe.totalFlightPackages(); i++) {
			String text = super.getText(
					driver,
					"xpath",
					super.getKeyValue("transferText") + i
							+ super.getKeyValue("filterText"));
			str.add(text);
			String getText = str.get(i - 1);
			if (getText.equals("With Transfers")) {
				hsrpwe.selectWithTransfer();
				if (hsrpwe.withTransferTotalpkg() != 0) {
					hsrpwe.withTransferTotalPkg();
				}else {
					hsrpwe.deselectWithTransfer();
				}
				Thread.sleep(1000);
			} else if (getText.equals("Without Transfers")) {
				hsrpwe.selectWithoutTransfer();
				if (hsrpwe.withoutTransferTotalpkg() != 0) {
					hsrpwe.withoutTransferTotalPkg();
				}else {
					hsrpwe.deselectWithoutTransfer();
				}
				Thread.sleep(1000);
			}
		}
	}

	public void sightseeingFilter() throws InterruptedException {
		List<String> str = new ArrayList<String>();
		for (int i = 1; i <= hsrpwe.totalSightSeeingPackages(); i++) {
			String text = super.getText(
					driver,
					"xpath",
					super.getKeyValue("sightseeingText") + i
							+ super.getKeyValue("filterText"));
			str.add(text);
			String getText = str.get(i - 1);
			if (getText.equals("With Sightseeing")) {
				hsrpwe.selectWithsightseeing();
				if (hsrpwe.withsightseeingTotalpkg() != 0) {
					hsrpwe.withsightseeingTotalPkg();
				}else {
					hsrpwe.deselectWithsightseeing();
				}
				Thread.sleep(1000);
			} else if (getText.equals("Without Sightseeing")) {
				hsrpwe.selectwithoutsightseeing();
				if (hsrpwe.withoutsightseeingTotalpkg() != 0) {
					hsrpwe.withoutsightseeingTotalPkg();
				}else {
					hsrpwe.deselectwithoutsightseeing();
				}
				Thread.sleep(1000);
			}
		}
	}

}
