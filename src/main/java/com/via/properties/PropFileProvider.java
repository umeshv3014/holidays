package com.via.properties;

import java.io.IOException;

import com.via.base.util.SeleniumBase;

public class PropFileProvider extends SeleniumBase {
	
	public static void UImapXpath() throws IOException{
		String filePath = "D:/VIAautomation/holidays/src/test/resources/com/via/UImap/ElementPath.properties";
		getPropertyFile(filePath);
	}
	public static void PageContent() throws IOException{
		String filePath = "D:/VIAautomation/holidays/src/test/resources/com/via/UImap/contentTest.properties";
		getPropertyFile(filePath);
	}
}
