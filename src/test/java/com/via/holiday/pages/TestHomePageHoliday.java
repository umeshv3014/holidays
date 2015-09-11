package com.via.holiday.pages;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.via.EXCELs.ExcelFileProvider;
import com.via.base.util.SeleniumBase;
import com.via.properties.FileProvider;

public class TestHolidayPages extends SeleniumBase {
	HomePageHoliday hphCASE = new HomePageHoliday();

	@BeforeTest
	public void openViaHomepage() throws IOException {
		FileProvider.propertiesFilePathPageContent();
		FileProvider.propertiesFilePathUImap();
		hphCASE.openB2CBrowser();
	}


	@Test(priority = 1)
	public void testHomePageUI() {
		hphCASE.titleHoliday();
		hphCASE.menuProductName();
		// hphCASE.menuImages();
		hphCASE.packagesCollectionImagesPresent();
		hphCASE.hotDealsImagesPresent();
		hphCASE.whyViaContent();

	}

	@Test(priority = 2, dataProvider = "sendUsYourFeedbackData", dataProviderClass= ExcelFileProvider.class)
	public void testsendUsYourFeedback(String name, String email, String msg) throws InterruptedException {
		hphCASE.sendUsYourFeedback(name, email, msg);
		Thread.sleep(2000);
	}

	@Test(priority = 3, dataProvider = "getDestination", dataProviderClass= ExcelFileProvider.class)
	public void testHolidayDestination(String destinationCity)
			throws InterruptedException {
		hphCASE.holidayDestinationSearchbox(destinationCity);
	}

	@AfterTest
	public void exit() {
		hphCASE.quitTest();
	}
}
