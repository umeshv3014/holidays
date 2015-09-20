package com.via.holiday.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.via.base.util.SeleniumBase;
import com.via.holiday.pageFactory.webElements.HolidaySearchResultPageWebElement;

public class HolidaySearchresultPage extends SeleniumBase {
	public WebDriver driver;
	public List<String> str;
	public HolidaySearchResultPageWebElement hsrpwe;

	public HolidaySearchresultPage(WebDriver driver) {
		this.driver = driver;
	}

	public void getTitleSearchResultPage() {
		Assert.assertEquals(getKeyValue("HSRPTitle"), driver.getTitle());
	}

	public void destinationCityDataMatching(String destinationCity) {
		click(driver, "xpath", "modifySearch");
		Assert.assertEquals(destinationCity,
				getText(driver, "xpath", "getDestinationcity"));
	}

	public int numberOfPackages() {
		int nupck = Integer.parseInt(getText(driver, "xpath", "showingCount"));
		logger.info(nupck);
		List<WebElement> nuOfPackages = driver.findElements(By
				.xpath("//*[@id='packagesResults']/div/div"));
		int nu = nuOfPackages.size();
		logger.info(nu);
		Assert.assertEquals(nupck, nu);
		return nu;
	}

	public int getTotalNumberOfBOOKNOW() {
		hsrpwe = new HolidaySearchResultPageWebElement(driver);
		List<WebElement> nuOfbookableHolidays = driver
				.findElements(By
						.xpath("//*[@id='packagesResults']//button[contains(text(),'BOOK NOW')]"));
		int totlaNumberOfBookableHolidys = nuOfbookableHolidays.size();
		logger.info("total number of Book Now " + totlaNumberOfBookableHolidys);
		return totlaNumberOfBookableHolidys;
	}

	public int getTotalNumberOfSENDENQUIRY() {
		List<WebElement> nuOfSendEnquiry = driver
				.findElements(By
						.xpath("//*[@id='packagesResults']//button[contains(text(),'SEND ENQUIRY')]"));
		int totlaNumberOfSendEnquiry = nuOfSendEnquiry.size();
		logger.info("total number of Send Enquiry " + totlaNumberOfSendEnquiry);
		return totlaNumberOfSendEnquiry;
	}

	public HolidaySearchresultPage sendEnquiry() {
		click(driver, "xpath", "nuOfSENDENQUIRY");
		return this;
	}

	public int getPriceOfHolidays() {

		return 0;
	}

	public void backToHolidayHomePage() {
		click(driver, "xpath", "backToHome");
	}

	// Send Enqiry block on seasrh ressult page
	public void selectSendEnqiry() {
		hsrpwe.SHEbutton.click();
	}

	public void setNameSE(String name) {
		hsrpwe.SHEname.sendKeys(name);
	}

	public void setEmailSE(String email) {
		hsrpwe.SHEemail.sendKeys(email);
	}

	public void setMobileNumberSE(String mobileNu) {
		hsrpwe.mobileNumberSE.sendKeys(mobileNu);
	}

	public void setdateSE(String date) {
		hsrpwe.SHEdate.clear();
		hsrpwe.SHEdate.sendKeys(date);
		hsrpwe.SHEclanderClose.click();
	}

	public void setoriginCitySE(String originCity) {
		hsrpwe.SHEcity.sendKeys(originCity);
	}

	public void setDurationSE(String duration) {
		hsrpwe.SHEduration.sendKeys(duration);
	}

	public void setTourRequirementAndPreference(
			String tourRequirementAndPreference) {
		hsrpwe.SHEcomments.sendKeys(tourRequirementAndPreference);
	}

	public void submitSE() {
		hsrpwe.SHEsubmit.click();
	}
	
	public void enquirySubmittedSuccessfully(){
		hsrpwe.SHEsucess.click();
	}

	public void holidyasThumbImages() {
		List<WebElement> img = driver.findElements(By
				.xpath("//*[@id='packagesResults']//img"));
		for (int i = 0; i < img.size(); i++) {
			imageverify(driver, "xpath", "//*[@id='packagesResults']//img");
			logger.info("all images" + img.size());
		}
	}

	// search result page test cases
	public void sendHolidayEnquiry(String name, String email, String mobileNu,
			String date, String originCity, String duration,
			String tourRequirementAndPreference) {
		this.selectSendEnqiry();
		this.setNameSE(name);
		this.setEmailSE(email);
		this.setMobileNumberSE(mobileNu);
		this.setdateSE(date);
		this.setoriginCitySE(originCity);
		this.setDurationSE(duration);
		this.setTourRequirementAndPreference(tourRequirementAndPreference);
		this.submitSE();
	}

	public void countNumberOfBookNowAndSendEnquirey(String name, String email,
			String mobileNu, String date, String originCity, String duration,
			String tourRequirementAndPreference) {
		this.getTotalNumberOfBOOKNOW();
		this.getTotalNumberOfSENDENQUIRY();
		this.sendEnquiry();
		this.sendHolidayEnquiry(name, email, mobileNu, date, originCity,
				duration, tourRequirementAndPreference);
		this.holidyasThumbImages();
	}
}