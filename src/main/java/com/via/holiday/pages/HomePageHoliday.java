package com.via.holiday.pages;

import java.io.IOException;
import java.util.ArrayList;

import com.via.properties.PropertiesFileProvider;

public class HomePageHoliday extends PropertiesFileProvider {
	public void openB2CBrowser() throws IOException {
		openBrowsers(getKeyValue("profile"),getKeyValue("URL"));
	}

	public void viaB2CLogo(){
		isImagePresent("xpath", getKeyValue("viaLogo"));
	}

	public void menuImages() {
		for (int i = 1; i <= 7; i++) {
			String elementpath = getKeyValue("menuImage") + i
					+ getKeyValue("menuImage2");
			isImagePresent("xpath", elementpath);
		}
	}

	public void packagesCollectionImagesPresent() {
		for (int i = 1; i < 8; i++) {
			String path = getKeyValue("pcImage") + i 
					+ getKeyValue("pcImage2");
			isImagePresent("xpath", path);
		}

	}

	public void hotDealsImagesPresent() {
		for (int i = 1; i < 4; i++) {
			String path = getKeyValue("hdImage") + i 
					+ getKeyValue("hdImage2");
			isImagePresent("xpath", path);
		}
	}
	public void whyViaFooterImages() {
		String ftrimage = getKeyValue("ftrimage");
		ArrayList<String> str = new ArrayList<String>();
		for (int i = 1; i <=6; i++) {
			str.add(getKeyValue("ftrimage"+i));
			str.add(getKeyValue("ftrimage"+i));
			isImagePresent("xpath",ftrimage+" "+str.get(i));
		}
	}
}
