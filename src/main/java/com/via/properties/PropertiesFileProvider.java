package com.via.properties;

import java.io.IOException;

import com.via.base.util.SeleniumBase;

public class PropertiesFileProvider extends SeleniumBase {
	
	public void propertiesFilePath() throws IOException{
		String filePath = "D:/VIAautomation/holidays/src/test/resources/com/via/UImap/ElementPath.properties";
		getPropertyFile(filePath);
	}
}
