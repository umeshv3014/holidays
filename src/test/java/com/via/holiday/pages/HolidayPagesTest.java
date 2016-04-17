package com.via.holiday.pages;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.via.EXCEL.XlFileProvider;
import com.via.base.util.SeleniumBase;
import com.via.base.util.TakeErrorScreenShot;
import com.via.holiday.pageFactory.webElements.HolidaySearchResultPageWebElement;
import com.via.pageActions.homePageAction;
import com.via.pageActions.searchResultPageActions;
import com.via.properties.PropFileProvider;

public class HolidayPagesTest extends SeleniumBase {
	HolidayHomePage hphCASE;
	HolidaySearchresultPage hspCASE;
	TakeErrorScreenShot tess;
	homePageAction hpa;
	searchResultPageActions srpa;
	HolidaySearchResultPageWebElement hsrpwe;
	HolidaySearchresultPage hsrp;

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

	@AfterTest
	public void exit() throws InterruptedException {
		super.quitTest(driver);

	}

	/*
	 * holidayHomePage_UI_Content_images_Test 1. check the title 2. check
	 * packages images 3. check hot deals images
	 */
//	@Test(priority = 0)
//	public void holidayHomePage_UI_Content_images_Test() {
//		hphCASE = new HolidayHomePage(driver);
//		hphCASE.titleHolidayHomePage();
//		hphCASE.packagesCollectionImagesPresent();
//		hphCASE.hotDealsImagesPresent();
//	}

	/*
	 * send feed back request
	 */

//	@Test(priority = 1, dataProvider = "sendFeedBackData", dataProviderClass = XlFileProvider.class)
//	public void sendUsFeedBack(String name, String email, String msg) {
//		hpa = new homePageAction(driver);
//		hpa.sendUsYourFeedback(name, email, msg);
//	}

	/*
	 * search DOM holiday destination
	 */

	@Test(priority = 0, dataProvider = "destinationData", dataProviderClass = XlFileProvider.class)
	public void destinationPkgTest(String destinationCity)
			throws InterruptedException {
		hpa = new homePageAction(driver);
		hpa.holidayDestinationSearch(destinationCity);
		Thread.sleep(1000);
	}

//	@Test(priority = 3, dataProvider = "destinationDataDom", dataProviderClass = XlFileProvider.class)
//	public void destinationCityDataMatch(String destinationCity) {
//		srpa = new searchResultPageActions(driver);
//		srpa.destinationCityDataMatching(destinationCity);
//	}

	/*
	 * sendEnquiry on holiday search result page
	 */

	@Test(priority = 1, dataProvider = "sendHolidayEnquiry", dataProviderClass = XlFileProvider.class)
	public void sendEnquiry(String fullName, String email, String mobileNumber, String originCity, String duration,
			String tourRequirementAndPreference) {
		srpa = new searchResultPageActions(driver);
		srpa.sendHolidayEnquiry(fullName, email, mobileNumber, originCity,
				duration, tourRequirementAndPreference);

	}

	 /*
	 * slidertest on holiday search result page, it is hard coded now need to
	 * work on it
	 */
	 // @Test(priority = 5)
	 // public void slidertest() {
	 // int xAxis = 40;
	 // int yAxis = 0;
	 // hspCASE.dragSlider("xpath", "slider", xAxis, yAxis); //use
	 // searchresultpageaction
	 // hspCASE.filterStarRatingStandard(); //use searchresultpageaction
	 // }
	/*
	 * filter test on holiday search result page.
	 */
	@Test(priority = 2)
	public void starRatingFilterTest() throws InterruptedException {
		srpa = new searchResultPageActions(driver);
		srpa.starRatingFilter();
	}

	@Test(priority = 3)
	public void goingForFilterTest() throws InterruptedException {
		srpa = new searchResultPageActions(driver);
		srpa.goingForFilter();
	}

	@Test(priority = 4)
	public void flightFilterTest() throws InterruptedException {
		srpa = new searchResultPageActions(driver);
		srpa.flightFilter();
	}

	@Test(priority = 5)
	public void transferFilterTest() throws InterruptedException {
		srpa = new searchResultPageActions(driver);
		srpa.transferFilter();
	}

	@Test(priority = 6)
	public void sightseeingFilterTest() throws InterruptedException {
		srpa = new searchResultPageActions(driver);
		srpa.sightseeingFilter();
	}
	
//	@Test(priority = 9)
//	public void priceAndID(){
//		hsrp = new HolidaySearchresultPage(driver);
//		hsrp.destinationHolidayPackages();
//	}

	@AfterMethod(alwaysRun = true)
	public void takeScreenShotOnFailure(ITestResult testResult,
			Method methodName) throws IOException {
		tess = new TakeErrorScreenShot(driver);
		tess.takeScreenShotOnFailure(testResult, methodName);
	}
}
