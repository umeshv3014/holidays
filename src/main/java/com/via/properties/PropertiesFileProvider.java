package com.via.properties;

import java.io.IOException;

import com.via.base.util.SeleniumBase;

public class PropertiesFileProvider extends SeleniumBase {
	
	public void propertiesFilePathUImap() throws IOException{
		String filePath = "D:/VIAautomation/holidays/src/test/resources/com/via/UImap/ElementPath.properties";
		getPropertyFile(filePath);
	}
	public void propertiesFilePathPageContent() throws IOException{
		String filePath = "D:/VIAautomation/holidays/src/test/resources/com/via/UImap/contentTest.properties";
		getPropertyFile(filePath);
	}
}
