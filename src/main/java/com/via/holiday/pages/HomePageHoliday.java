package com.via.holiday.pages;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.Assert;

import com.via.base.util.PopUpHandler;
import com.via.properties.PropertiesFileProvider;

public class HomePageHoliday extends PropertiesFileProvider {
	PopUpHandler puh = new PopUpHandler();

	public void openB2CBrowser() throws IOException {
		openBrowsers(getKeyValue("profile"), getKeyValue("baseURL"));
	}

	public void titleHoliday() {
		String title = getKeyValue("HolidaysTitle");
		Assert.assertEquals(
				title,
				"Domestic & International Holiday Packages, Tour Packages, Package Tours - Via.com");
	}

	public void viaB2CLogo() {
		String xpath = getKeyValue("viaLogo");
		imageverify(driver, "xpath", xpath);
	}

	public void menuImages() {
		for (int i = 1; i <= 7; i++) {
			String xpathPTR = getKeyValue("menuImage") + i
					+ getKeyValue("menuImage2");
			logger.info(xpathPTR);
			String backimage = _getCssValue(driver, "xpath", xpathPTR,
					"background-image");
			imageverify(driver, backimage, backimage);
		}
	}

	public void menuProductName() {

		for (int i = 1; i <= 7; i++) {
			String text = getKeyValue("menuImage") + i
					+ getKeyValue("menuProduct");
			Assert.assertEquals(getText(driver, "xpath", text),
					getKeyValue("text" + i));
			if (getText(driver, "xpath", text).equals("Explore")) {
				click(driver, "xpath", text);
				for (int j = 1; j <= 4; j++) {
					String textsbm = getKeyValue("submenu")
							+ getKeyValue("textsb" + j) + getKeyValue("textsm");
					Assert.assertEquals(getText(driver, "xpath", textsbm),
							getKeyValue("textsb" + j));
				}
			}
			if (getText(driver, "xpath", text).equals("Your trips")) {
				click(driver, "xpath", text);
				Assert.assertEquals(
						getText(driver, "xpath", getKeyValue("yrt")), "Sign in");
				Assert.assertEquals(
						getText(driver, "xpath", getKeyValue("yrtNH")),
						"New here? Register");
			}
		}
	}

	public void packagesCollectionImagesPresent() {
		String pc1 = getKeyValue("pcImage");
		String pc2 = getKeyValue("pcImage2");
		for (int i = 1; i <= 8; i++) {
			String path = pc1 + i + pc2;
			imageverify(driver, "xpath", path);
		}
	}

	public void hotDealsImagesPresent() {
		String path1 = getKeyValue("hdImage");
		String path2 = getKeyValue("hdImage2");
		for (int i = 1; i <= 4; i++) {
			String path = path1 + i + path2;
			imageverify(driver, "xpath", path);
		}
	}

	public void whyViaFooterImages() {
		ArrayList<String> str = new ArrayList<String>();
		String ftrimage = getKeyValue("ftrimage");
		for (int i = 1; i <= str.size(); i++) {
			str.add(getKeyValue("ftrimage" + i));
			imageverify(driver, "xpath", ftrimage + " " + str.get(i));
		}
	}
	
	public void whyViaContent(){
		String str = getKeyValue("ftrimage");
		for (int i = 1; i <=6 ; i++) {
			String content = str+" " + getKeyValue("ftrimage" + i)+ getKeyValue("ftrimage1" + i);
			logger.info(getKeyValue("yvc" +i));
			Assert.assertEquals(getText(driver, "xpath", content), getKeyValue("yvc" +i));
			String contentPara = str+" " + getKeyValue("ftrimage" + i)+ getKeyValue("ftrimage11" + i);
			logger.info(getKeyValue("yvc1" +i));
			Assert.assertEquals(getText(driver, "xpath", contentPara), getKeyValue("yvc1" +i));
		}
	}

	public void sendUsYourFeedback() {
		sendKeys(driver, "xpath", getKeyValue("feedbackName"), "suresh");// xl and jason taught to use
		sendKeys(driver, "xpath", getKeyValue("feedbackEmail"),
				"suresh@gmail.com");// get the value for xl or jason
		sendKeys(driver, "xpath", getKeyValue("feedbackMsg"), "sent mesg");
		click(driver, "xpath", getKeyValue("SYRmsg"));
		puh.accept(driver);
	}

}