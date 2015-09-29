package com.via.holiday.pages;


import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.via.base.util.SeleniumBase;
import com.via.holiday.pageFactory.webElements.HolidayHomePageWebElement;
import com.via.holiday.pageFactory.webElements.HolidaySearchResultPageWebElement;

public class HolidaySearchresultPage extends SeleniumBase {
	public WebDriver driver;
	public HolidaySearchResultPageWebElement hsrpwe;
	public HolidayHomePageWebElement hhpwe;

	public HolidaySearchresultPage(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		hsrpwe = PageFactory.initElements(driver,
				HolidaySearchResultPageWebElement.class);
		hhpwe = PageFactory.initElements(driver,
				HolidayHomePageWebElement.class);
	}

	public void getTitleSearchResultPage() {
		Assert.assertEquals(getKeyValue("HSRPTitle"), driver.getTitle());
	}

	public void destinationCityDataMatching(String destinationCity) {
		if (hsrpwe.modifySearch != null) {
			try {
				hsrpwe.modifySearch.click();
				Assert.assertEquals(destinationCity,
						getText(driver, "xpath", "getDestinationcity"));
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
	}

	public boolean isDomEnabled() {
		if (hhpwe.domesticCity != null) {
			try {
				hhpwe.domesticCity.isEnabled();
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
		return true;
	}

	public int numberOfPackages() {
		int nupck = Integer.parseInt(getText(driver, "xpath", "showingCount"));
		logger.info(nupck);
		int nu = hsrpwe.nuOfPackages.size();
		logger.info(nu);
		Assert.assertEquals(nupck, nu);
		return nu;
	}

	public int totalPkgs() {
		int nu = hsrpwe.nuOfPackages.size();
		return nu;
	}

	public int getTotalNumberOfBOOKNOW() {
		int totlaNumberOfBookableHolidys = hsrpwe.nuOfbookableHolidays.size();
		logger.info("total number of Book Now " + totlaNumberOfBookableHolidys);
		return totlaNumberOfBookableHolidys;
	}

	public int getTotalNumberOfSENDENQUIRY() {
		int totlaNumberOfSendEnquiry = hsrpwe.nuOfSendEnquiry.size();
		logger.info("total number of Send Enquiry " + totlaNumberOfSendEnquiry);
		return totlaNumberOfSendEnquiry;
	}

	public void sendEnquiry() {
		click(driver, "xpath", "nuOfSENDENQUIRY");
	}

	public void backToHolidayHomePage() {
		click(driver, "xpath", "backToHome");
	}

	// Send Enqiry block on seasrh ressult page
	public void selectSendEnqiry() {
		hsrpwe.SHEbutton.click();
	}

	public void setNameSE(String name) {
		if (hsrpwe.SHEname != null) {
			try {
				hsrpwe.SHEname.sendKeys(name);
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
	}

	public void setEmailSE(String email) {
		if (hsrpwe.SHEemail != null) {
			try {
				hsrpwe.SHEemail.sendKeys(email);
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
	}

	public void setMobileNumberSE(String mobileNu) {
		if (hsrpwe.mobileNumberSE != null) {
			try {
				hsrpwe.mobileNumberSE.sendKeys(mobileNu);
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
	}

	public void setdateSE(String date) {
		if (hsrpwe.SHEdate != null || hsrpwe.SHEclanderClose != null) {
			try {
				hsrpwe.SHEdate.clear();
				hsrpwe.SHEdate.sendKeys(date);
				hsrpwe.SHEclanderClose.click();
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
	}

	public void setoriginCitySE(String originCity) {
		if (hsrpwe.SHEcity != null) {
			try {
				hsrpwe.SHEcity.sendKeys(originCity);
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
	}

	public void setDurationSE(String duration) {
		if (hsrpwe.SHEduration != null) {
			try {
				hsrpwe.SHEduration.sendKeys(duration);
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
	}

	public void setTourRequirementAndPreference(
			String tourRequirementAndPreference) {
		if (hsrpwe.SHEcomments != null) {
			try {
				hsrpwe.SHEcomments.sendKeys(tourRequirementAndPreference);
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
	}

	public void submitSE() {
		if (hsrpwe.SHEsubmit != null) {
			try {
				hsrpwe.SHEsubmit.click();
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
	}

	public void enquirySubmittedSuccessfully() {
		if (hsrpwe.SHEsucess != null) {
			try {
				hsrpwe.SHEsucess.click();
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
	}

	public void selectStarRatingStandard() {
		if (hsrpwe.standardCheckBox != null) {
			try {
				hsrpwe.standardCheckBox.click();
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
	}

	public void getStarRatingStandardText() {
		if (hsrpwe.standardText != null) {
			try {
				String standrad = hsrpwe.standardText.getText();
				Assert.assertEquals("standard", standrad);
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
	}

	public int getselectStarRatingStandardTotalPkg() {
		int tot = 0;
		if (hsrpwe.standardTotalpkg != null) {
			try {
				String total = hsrpwe.standardTotalpkg.getText();
				String trimto = total.trim().replaceAll("\\W", "");
				tot = Integer.parseInt(trimto);
				logger.info("toal filte pkg " + tot);
				int toalfilterpak = this.totalPkgs();
				logger.info("toal filte pkg " + toalfilterpak);
				Assert.assertEquals(toalfilterpak, tot);
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
		return tot;

	}

	public int getselectedStarRatingBudgetTotalPkg() {
		int tot = 0;
		if (hsrpwe.budgetcheckBox != null) {
			try {
				String total = hsrpwe.budgetcheckBox.getText();
				String trimto = total.trim().replaceAll("\\W", "");
				tot = Integer.parseInt(trimto);
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
		return tot;

	}

	public int getselectedStarRatingStarTotalPkg() {
		int tot = 0;
		if (hsrpwe.starTextBox != null) {
			try {
				String total = hsrpwe.starTextBox.getText();
				String trimto = total.trim().replaceAll("\\W", "");
				tot = Integer.parseInt(trimto);
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
		return tot;

	}

	public int getselectedStarRatingLuxuryTotalPkg() {
		int tot = 0;
		if (hsrpwe.luxuryCheckBox != null) {
			try {
				String total = hsrpwe.luxuryCheckBox.getText();
				String trimto = total.trim().replaceAll("\\W", "");
				tot = Integer.parseInt(trimto);
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
		return tot;

	}

	public int getselectedStarRatingDeluxTotalPkg() {
		int tot = 0;
		if (hsrpwe.deluxeCheckBox != null) {
			try {
				String total = hsrpwe.deluxeCheckBox.getText();
				String trimto = total.trim().replaceAll("\\W", "");
				tot = Integer.parseInt(trimto);
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
		return tot;

	}

	public void goingForBlock() {
		int tot = 0;
		if (hsrpwe.anyChecBox != null || hsrpwe.anyText != null
				|| hsrpwe.anyTotalPkg != null) {
			try {
				hsrpwe.anyChecBox.click();
				String text = hsrpwe.anyText.getText();
				Assert.assertEquals("Any", text);
				String total = hsrpwe.anyTotalPkg.getText();
				String trimto = total.trim().replaceAll("\\W", "");
				tot = Integer.parseInt(trimto);
				Assert.assertEquals(hsrpwe.getTotalPackage, tot);
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
	}

	public void holidyasThumbImages() {
		for (int i = 0; i < hsrpwe.thumbImg.size(); i++) {
			imageverify(driver, hsrpwe.thumbImg);
			logger.info("all images " + hsrpwe.thumbImg.size());
		}
	}

	public void dragSlider(String locatorType, String locatorValue, int xAxis,
			int yAxis) {
		super.horizontalSliderBarAction(driver, locatorType, locatorValue,
				xAxis, yAxis);
	}

	// search result page test cases
	public void sendHolidayEnquiry(String name, String email, String mobileNu,
			String date, String originCity, String duration,
			String tourRequirementAndPreference) {
		this.selectSendEnqiry();
		this.setNameSE(name);
		this.setEmailSE(email);
		this.setMobileNumberSE(mobileNu);
		this.setdateSE(date);
		this.setoriginCitySE(originCity);
		this.setDurationSE(duration);
		this.setTourRequirementAndPreference(tourRequirementAndPreference);
		this.submitSE();
	}

	public void countNumberOfBookNowAndSendEnquirey(String name, String email,
			String mobileNu, String date, String originCity, String duration,
			String tourRequirementAndPreference) {
		this.getTotalNumberOfBOOKNOW();
		this.getTotalNumberOfSENDENQUIRY();
		this.sendEnquiry();
		this.sendHolidayEnquiry(name, email, mobileNu, date, originCity,
				duration, tourRequirementAndPreference);
		this.holidyasThumbImages();
	}
}
