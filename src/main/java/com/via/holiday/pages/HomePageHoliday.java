package com.via.holiday.pages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;

import com.via.base.util.PopUpHandler;
import com.via.properties.FileProvider;

public class HomePageHoliday extends FileProvider {
	public PopUpHandler puh = new PopUpHandler();
	public List<String> str;

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
		str = new ArrayList<String>();
		int count = Integer.parseInt(getKeyValue("pcImageCount"));
		for (int i = 1; i <= count; i++) {
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
		str = new ArrayList<String>();
		int count = Integer.parseInt(getKeyValue("pcImageCount"));
		for (int i = 0; i < count;) {
			str.add(getKeyValue("pcImage") + ++i + getKeyValue("pcImage2"));
				imageverify(driver, "xpath", str.get(i - 1));
		}
	}

	public void hotDealsImagesPresent() {
		str = new ArrayList<String>();
		int count = Integer.parseInt(getKeyValue("hdImageCount"));
		for (int i = 1; i <= count; i++) {
			str.add(getKeyValue("hdImage") + i + getKeyValue("hdImage2"));
			imageverify(driver, "xpath", str.get(i-1));
		}
	}

	public void whyViaFooterImages() {
		str = new ArrayList<String>();
		int count = Integer.parseInt(getKeyValue("whyViaFooterImagesCount"));
		String ftrimage = getKeyValue("ftrimage");
		for (int i = 1; i <= count; i++) {
			str.add(getKeyValue("ftrimage" + i));
			imageverify(driver, "xpath", ftrimage + " " + str.get(i-1));
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

	public void sendUsYourFeedback(String name, String email, String msg ) {
		sendKeys(driver, "xpath", getKeyValue("feedbackName"), name);// xl and jason taught to use
		sendKeys(driver, "xpath", getKeyValue("feedbackEmail"),email);// get the value for xl or jason
		sendKeys(driver, "xpath", getKeyValue("feedbackMsg"), msg);
		click(driver, "xpath", getKeyValue("SYRmsg"));
		puh.accept(driver);
		clearText(driver, "xpath", getKeyValue("feedbackName"));// xl and jason taught to use
		clearText(driver, "xpath", getKeyValue("feedbackEmail"));// get the value for xl or jason
		clearText(driver, "xpath", getKeyValue("feedbackMsg"));
	}
	
	public void holidayDestinationSearchbox(String destinationCity) throws InterruptedException {
		click(driver, "xpath", getKeyValue("selectDropDown"));
		sendKeys(driver, "xpath", getKeyValue("HDcity"), destinationCity);
		click(driver, "xpath", getKeyValue("selecrDropDown"));
		click(driver, "xpath", getKeyValue("searchBTN"));
		Thread.sleep(5000);
		click(driver, "xpath", getKeyValue("backtohomepage"));
	}

}
