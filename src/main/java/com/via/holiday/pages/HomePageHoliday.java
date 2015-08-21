package com.via.holiday.pages;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.Assert;

import com.via.base.util.PopUpHandler;
import com.via.properties.PropertiesFileProvider;

public class HomePageHoliday extends PropertiesFileProvider {
      PopUpHandler phh = new PopUpHandler();
	public void openB2CBrowser() throws IOException {
		openBrowsers(getKeyValue("profile"), getKeyValue("baseURL"));
	}

	public void titleHoliday() {
		String title = getKeyValue("HolidaysTitle");
		Assert.assertEquals(
				title,
				"Domestic & International Holiday Packages, Tour Packages, Package Tours - Via.com");
	}

	// public void viaB2CLogo() {
	// String xpath = getKeyValue("viaLogo");
	// isImagePresent(driver, "xpath", xpath);
	// }

//	public void menuImages() {
//		for (int i = 1; i <= 7; i++) {
//			String xpathPTR = getKeyValue("menuImage") + i
//					+ getKeyValue("menuImage2");
//			logger.info(xpathPTR);
//			String backimage = _getCssValue(driver, "xpath", xpathPTR,
//					"background-image");
//			imageverify(backimage);
//		}
//	}

	public void menuProductName() {
		ArrayList<String> str = new ArrayList<String>();
		for (int i = 1; i <= str.size(); i++) {
			String text = getKeyValue("menuImage") + i
					+ getKeyValue("menuProduct");
			str.add(text);
			Assert.assertEquals(getText(driver, "xpath", str.get(i)),
					getKeyValue("text" + i));
			if (getText(driver, "xpath", str.get(i)).equals("Explore")) {
				click(driver, "xpath", text);
				for (int j = 1; j <= str.size(); j++) {
					String textsbm = getKeyValue("submenu")
							+ getKeyValue("textsb" + j) + getKeyValue("textsm");
					str.add(textsbm);
					Assert.assertEquals(getText(driver, "xpath", str.get(j)),
							getKeyValue("textsb" + j));
				}
			}
			if (getText(driver, "xpath", str.get(i)).equals("Your trips")) {
				click(driver, "xpath", text);
				String textySI = getKeyValue("yrt");
				Assert.assertEquals(getText(driver, "xpath", textySI),
						"Sign in");
				String textyNH = getKeyValue("yrtNH");
				Assert.assertEquals(getText(driver, "xpath", textyNH),
						"New here? Register");
			}
		}
	}

	public void packagesCollectionImagesPresent() {
		String pc1 = getKeyValue("pcImage");
		String pc2= getKeyValue("pcImage2");
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

//	public void whyViaFooterImages() {
//		ArrayList<String> str = new ArrayList<String>();
//		String ftrimage = getKeyValue("ftrimage");
//		for (int i = 1; i <= str.size(); i++) {
//			str.add(getKeyValue("ftrimage" + i));
//			imageverify(driver, "xpath",ftrimage + " " + str.get(i));
//		}
//	}
	
	public void sendUsYourFeedback(){
			sendKeys(driver, "xpath",getKeyValue("feedbackName"), "suresh");//get the value for xl or jason
			sendKeys(driver, "xpath",getKeyValue("feedbackEmail"), "suresh@gmail.com");//get the value for xl or jason
			sendKeys(driver, "xpath", getKeyValue("feedbackMsg"), "sent mesg");
			click(driver, "xpath", getKeyValue("SYRmsg"));
			phh.accept(getKeyValue("alertMsg"));
		}
		
	}
