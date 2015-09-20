package com.via.holiday.pages;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.via.EXCEL.XlFileProvider;
import com.via.base.util.SeleniumBase;
import com.via.properties.PropFileProvider;

public class HolidayPagesTest extends SeleniumBase {
	HolidayHomePage hphCASE;
	HolidaySearchresultPage hspCASE;

	@BeforeTest
	public void openViaHomepage() throws IOException {
		PropFileProvider.UImapXpath();
		PropFileProvider.PageContent();
		XlFileProvider.sendFeedBack();
		this.openB2CBrowser();
	}

	public void openB2CBrowser() throws IOException {
		openBrowsers(getKeyValue("profile"), getKeyValue("baseURL"));
	}

	// @Test(priority = 1)
	// public void holidayHomePage_UI_Content_images_Test() {
	// hphCASE = new HolidayHomePage(driver);
	// hphCASE.titleHolidayHomePage();
	// // hphCASE.menuProductName();
	// // hphCASE.menuImages();
	// hphCASE.packagesCollectionImagesPresent();
	// hphCASE.hotDealsImagesPresent();
	// // hphCASE.whyViaContent();
	// }

	// @Test(priority = 2, dataProvider = "sendFeedBackData", dataProviderClass
	// = XlFileProvider.class)
	// public void sendUsFeedBack(String name, String email, String msg) {
	// hphCASE = new HolidayHomePage(driver);
	// hphCASE.sendUsYourFeedback(name, email, msg);
	// hphCASE.cleaeSendUsYourFeedbackFields();
	// }

	@Test(priority = 1, dataProvider = "destinationdataDom", dataProviderClass = XlFileProvider.class)
	public void destinationSearchDom(String destinationCity)
			throws InterruptedException {
		hphCASE = new HolidayHomePage(driver);
		hspCASE = new HolidaySearchresultPage(driver);
		hphCASE.holidayDestinationSearchDom(destinationCity);
		hspCASE.getTitleSearchResultPage();
		hspCASE.destinationCityDataMatching(destinationCity);
		hspCASE.numberOfPackages();
		Thread.sleep(1000);
	}

	// @Test(priority = 2, dataProvider = "destinationdataIntl",
	// dataProviderClass = XlFileProvider.class)
	// public void destinationSearchIntl(String destinationCity)
	// throws InterruptedException {
	// hphCASE = new HolidayHomePage(driver);
	// hspCASE = new HolidaySearchresultPage(driver);
	// hphCASE.holidayDestinationSearchIntl(destinationCity);
	// hspCASE.getTitleSearchResultPage();
	// hspCASE.destinationCityDataMatching(destinationCity);
	// hspCASE.numberOfPackages();
	// Thread.sleep(1000);
	// }

	// @Test(priority = 5,dataProvider = "sendHolidayEnquiryData",
	// dataProviderClass = XlFileProvider.class)
	// public void SendHolidayEnquiry(String fullName, String email,
	// String mobileNu, String date, String originCity, String duration,
	// String tourRequirementAndPreference) {
	// hspCASE = new HolidaySearchresultPage(driver);
	// hspCASE.sendHolidayEnquiry(fullName, email, mobileNu, date, originCity,
	// duration, tourRequirementAndPreference);
	// }
	@Test(priority = 2, dataProvider = "sendHolidayEnquiryData", dataProviderClass = XlFileProvider.class)
	public void sendEnquiry(String fullName, String email, String mobileNu,
			String date, String originCity, String duration,
			String tourRequirementAndPreference) {
		hspCASE = new HolidaySearchresultPage(driver);
		hspCASE.holidyasThumbImages();
		hspCASE.countNumberOfBookNowAndSendEnquirey(fullName, email, mobileNu,
				date, originCity, duration, tourRequirementAndPreference);
	}

	@AfterTest
	public void exit() {
		hphCASE.quitTest(driver);
	}
}