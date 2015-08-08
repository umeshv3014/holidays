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

	@Test(priority=1)
	public void titleHolidayTest() {
		titleHoliday();
	}

	@Test(priority=2)
	public void logoTest(){
		viaB2CLogo();
	}

	@Test(priority=3)
	public void menuProductIconTest(){
		menuImages();
	}
	@Test(priority=4)
	public void menuProductNameTest(){
		menuProductName();
	}
	@Test(priority=5)
	public void testPackagesCollectionImagesPresent() {
		packagesCollectionImagesPresent();
	}

	@Test(priority=6)
	public void testHotDealsImagesPresent() {
		hotDealsImagesPresent();
	}
	@Test(priority=7)
	public void testwhyViaFooterImages() {
		whyViaFooterImages();
	}

	@AfterTest
	public void exit() {
		quitTest();
	}
}