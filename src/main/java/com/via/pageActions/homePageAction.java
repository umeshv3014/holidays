package com.via.pageActions;

import org.openqa.selenium.WebDriver;

import com.via.holiday.pages.HolidayHomePage;

public class homePageAction extends HolidayHomePage {

	public homePageAction(WebDriver driver) {
		super(driver);
	}
	
	public boolean isHolidayHomePage(){
		super.titleHolidayHomePage();
		return true;
	}
	public void holidayDestinationSearchDom(String destinationCity) {
		super.selectDOM();
		super.setDestination(destinationCity);
		super.searchDestination();
	}

	public void holidayDestinationSearchIntl(String destinationCity) {
		super.selectINTL();
		super.setDestination(destinationCity);
		super.searchDestination();
	}

	public void backToHolidayHomepage() {
		super.holidayHomePage();
	}

	public void domAndIntlPkgNormalFlow(String destinationCity) {
		this.holidayDestinationSearchDom(destinationCity);
		this.backToHolidayHomepage();
		this.holidayDestinationSearchIntl(destinationCity);
		this.backToHolidayHomepage();
	}

	public void verifyPkgImages() {
		super.packagesCollectionImagesPresent();
	}

	public void verifyHotDealsimage() {
		super.hotDealsImagesPresent();
	}

	public void sendUsYourFeedback(String name, String email, String msg) {
		super.fillSendFeedBackDetail(name, email, msg);
		super.sendMsgSYFB();
		super.confirmationAlertOfSYFB();
		super.cleaesendustextbox();
	}
}
