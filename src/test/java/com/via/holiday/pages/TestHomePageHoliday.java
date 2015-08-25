package com.via.holiday.pages;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.via.base.util.SeleniumBase;
import com.via.properties.PropertiesFileProvider;

public class TestHomePageHoliday extends SeleniumBase {
	HomePageHoliday hphCASE = new HomePageHoliday();

	@BeforeTest
	public void openViaHomepage() throws IOException {
		PropertiesFileProvider.propertiesFilePathPageContent();
		PropertiesFileProvider.propertiesFilePathUImap();
		hphCASE.openB2CBrowser();
	}

	@Test
	public void holidayHomePage_UI_Content_images_Test() {
		//hphCASE.titleHoliday();
		//hphCASE.menuProductName();
		//hphCASE.menuImages();
		hphCASE.packagesCollectionImagesPresent();
//		hphCASE.hotDealsImagesPresent();
//		hphCASE.whyViaContent();
//		hphCASE.sendUsYourFeedback();
	}

	@AfterTest
	public void exit() {
		hphCASE.quitTest();
	}
}