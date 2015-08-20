package com.via.holiday.pages;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestHomePageHoliday extends HomePageHoliday {

	@BeforeTest
	public void openViaHomepage() throws IOException {
		propertiesFilePath();
		openB2CBrowser();
	}

	@Test
	public void titleHolidayTest() {
		titleHoliday();
	}

	@Test
	public void logoTest() {
		viaB2CLogo();
	}

	@Test
	public void menuProductIconTest() {
		menuImages();
	}

	@Test
	public void menuProductNameTest() {
		menuProductName();
	}

	@Test
	public void testPackagesCollectionImagesPresent() {
		packagesCollectionImagesPresent();
	}

	@Test
	public void testHotDealsImagesPresent() {
		hotDealsImagesPresent();
	}

	@Test
	public void testwhyViaFooterImages() {
		whyViaFooterImages();
	}

	@AfterTest
	public void exit() {
		quitTest();
	}
}