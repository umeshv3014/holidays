package com.via.EXCEL;

import org.testng.annotations.DataProvider;

import com.via.base.util.EXCELReader;

public class XlFileProvider {
	public static String dataURL = "D:/VIAautomation/holidays/src/test/resources/testDataXL/testHolidayData.xls";

	@DataProvider(name = "sendFeedBackData")
	public static Object[][] sendFeedBack() {
		EXCELReader XLr = new EXCELReader();
		return XLr.getTableArray(dataURL, "holidayTestData", "sendUsfeedbakData");
	}
	
	@DataProvider(name = "destinationdata")
	public static Object[][] destinationSearch() {
		EXCELReader XLr = new EXCELReader();
		return XLr.getTableArray(dataURL, "holidayTestData", "destinationTest");
	}
}
