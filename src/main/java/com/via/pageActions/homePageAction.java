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
	public void holidayDestinationSearch(String destinationCity) throws InterruptedException {
		super.setDestination(destinationCity);
		super.selectDate();
		super.searchDestination();
	}
	
	public void backToHolidayHomepage() {
		super.holidayHomePage();
	}

	public void destinationPkgNormalFlow(String destinationCity) throws InterruptedException {
		this.holidayDestinationSearch(destinationCity);
		this.backToHolidayHomepage();
	}

	public void verifyPkgImages() {
		super.packagesCollectionImagesPresent();
	}

	public void verifyHotDealsimage() {
		super.hotDealsImagesPresent();
	}

	public void sendUsYourFeedback(String name, String email, String msg) {
		super.sendFeedBackDetail(name, email, msg);
		super.confirmationAlertOfSYFB();
		super.cleaesendustextbox();
	}
}
