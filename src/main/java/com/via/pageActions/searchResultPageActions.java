package com.via.pageActions;

import org.openqa.selenium.WebDriver;

import com.via.holiday.pages.HolidaySearchresultPage;

public class searchResultPageActions {
	WebDriver driver;
	public HolidaySearchresultPage hsrp;

	public searchResultPageActions(WebDriver driver) {
		this.driver = driver;
		hsrp = new HolidaySearchresultPage(driver);
	}

	public void countNumberOfBookNowAndSendEnquirey(String name, String email,
			String mobileNu, String date, String originCity, String duration,
			String tourRequirementAndPreference) {
		hsrp.getTotalNumberOfBOOKNOW();
		hsrp.getTotalNumberOfSENDENQUIRY();
		hsrp.sendEnquiry();
		hsrp.sendHolidayEnquiry(name, email, mobileNu, date, originCity,
				duration, tourRequirementAndPreference);
		hsrp.holidyasThumbImages();
	}

	// filter testing with search result

	public void filterStarRatingStandard() {
		hsrp.selectStarRatingStandard();
		hsrp.getStarRatingStandardText();
		hsrp.getselectStarRatingStandardTotalPkg();
	}

	public void filterStarRatingBudget() {

	}
}
