package com.via.holiday.pages;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.Assert;

import com.via.properties.PropertiesFileProvider;

public class HomePageHoliday extends PropertiesFileProvider {
	public void openB2CBrowser() throws IOException {
		openBrowsers(getKeyValue("profile"), getKeyValue("URL"));
	}

	public void viaB2CLogo() {
		isImagePresent("xpath", getKeyValue("viaLogo"));
	}

	public void titleHoliday() {
		String title = getKeyValue("HolidaysTitle");
		Assert.assertEquals(
				title,
				"Domestic & International Holiday Packages, Tour Packages, Package Tours - Via.com");
	}

	public void menuImages() {
		for (int i = 1; i <= 7; i++) {
			String elementpath = getKeyValue("menuImage") + i
					+ getKeyValue("menuImage2");
			isImagePresent("xpath", elementpath);
		}
	}

	public void menuProductName() {
		for (int i = 1; i <= 7; i++) {
			String text = getKeyValue("menuImage") + i
					+ getKeyValue("menuProduct");
			Assert.assertEquals(getText("xpath", text), getKeyValue("text" + i));
			if (i == 6) {
				click(driver, "xpath", text);
				// submenu explore
				for (int j = 1; j <= 4; j++) {
					String textsbm = getKeyValue("submenu")
							+ getKeyValue("textsb" + j) + getKeyValue("textsm");
					Assert.assertEquals(getText("xpath", textsbm),
							getKeyValue("textsb" + j));
				}
			}
			if (i == 7) {
				click(driver, "xpath", text);
				String textySI = getKeyValue("yrt");
				Assert.assertEquals(getText("xpath", textySI), "Sign in");
				String textyNH = getKeyValue("yrtNH");
				Assert.assertEquals(getText("xpath", textyNH), "New here? Register");
			}
		}
	}

	public void packagesCollectionImagesPresent() {
		for (int i = 1; i < 8; i++) {
			String path = getKeyValue("pcImage") + i + getKeyValue("pcImage2");
			isImagePresent("xpath", path);
		}

	}

	public void hotDealsImagesPresent() {
		for (int i = 1; i < 4; i++) {
			String path = getKeyValue("hdImage") + i + getKeyValue("hdImage2");
			isImagePresent("xpath", path);
		}
	}

	public void whyViaFooterImages() {
		ArrayList<String> str = new ArrayList<String>();
		String ftrimage = getKeyValue("ftrimage");
		for (int i = 1; i <= str.size(); i++) {
			str.add(getKeyValue("ftrimage" + i));
			str.add(getKeyValue("ftrimage" + i));
			isImagePresent("xpath", ftrimage + " " + str.get(i));
		}
	}
}
