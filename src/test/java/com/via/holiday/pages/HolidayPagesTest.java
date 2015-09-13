package com.via.holiday.pages;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.via.EXCEL.XlFileProvider;
import com.via.base.util.SeleniumBase;
import com.via.properties.PropFileProvider;

public class HolidayPagesTest extends SeleniumBase{
	HolidayHomePageObject hphCASE = new HolidayHomePageObject();

	@BeforeTest
	public void openViaHomepage() throws IOException {
		PropFileProvider.UImapXpath();
        PropFileProvider.PageContent();
        XlFileProvider.sendFeedBack();
        hphCASE.openB2CBrowser();
	}

	@Test(priority = 2)
	public void holidayHomePage_UI_Content_images_Test() {
		hphCASE.titleHoliday();
		hphCASE.menuProductName();
		//hphCASE.menuImages();
     	hphCASE.packagesCollectionImagesPresent();
        hphCASE.hotDealsImagesPresent();
     	hphCASE.whyViaContent();
//		
	}
	
	@Test(priority = 2, dataProvider="sendFeedBackData", dataProviderClass=XlFileProvider.class)
	public void sendUsFeedBack(String name, String email, String msg){
		hphCASE.sendUsYourFeedback(name, email, msg);
	}
	
	@Test(priority = 3, dataProvider="destinationdata", dataProviderClass=XlFileProvider.class)
	public void destinationSearch(String destinationCity){
		hphCASE.holidayDestinationSearch(destinationCity);
	}

	@AfterTest
	public void exit() {
		hphCASE.quitTest();
	}
}