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

	/*
	 * get the page title and assert
	 */

	public void getTitleSearchResultPage() {
		Assert.assertEquals(getKeyValue("HSRPTitle"), driver.getTitle());
	}

	/*
	 * search domestic pkg
	 */
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

	public int numberOfPackages() {
		int nupck = Integer.parseInt(getText(driver, "xpath", "showingCount"));
		logger.info(nupck);
		int nu = hsrpwe.nuOfPackages.size();
		logger.info(nu);
		Assert.assertEquals(nupck, nu);
		return nu;
	}

	public int totalPkgs() {
		int totlapkgs = hsrpwe.nuOfPackages.size();
		return totlapkgs;
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
		if (hsrpwe.sendEnquiryButton != null) {
			try {
				hsrpwe.sendEnquiryButton.click();
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
	}

	public void backToHolidayHomePage() {
		if (hsrpwe.backToHolidayHomepage != null) {
			try {
				hsrpwe.backToHolidayHomepage.click();
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
	}

	// Send Inquiry block on search result page
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

	// start standard test
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
				Assert.assertEquals("Standard", standrad);
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

	// end standard test

	// budget test
	public void selectStarRatingBudget() {
		if (hsrpwe.budgetcheckBox != null) {
			try {
				hsrpwe.budgetcheckBox.click();
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
	}

	public void getStarRatingBudgetText() {
		if (hsrpwe.budgetText != null) {
			try {
				String budget = hsrpwe.budgetText.getText();
				Assert.assertEquals("Budget", budget);
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
	}

	public int getselectedStarRatingBudgetTotalPkg() {
		int tot = 0;
		if (hsrpwe.budgetTotlaPkg != null) {
			try {
				String total = hsrpwe.budgetTotlaPkg.getText();
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

	// budget test end

	// star rating test
	public void selectStarRatingStar() {
		if (hsrpwe.starCheckBox != null) {
			try {
				hsrpwe.starCheckBox.click();
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
	}

	public void getStarRatingStarText() {
		if (hsrpwe.starText != null) {
			try {
				String budget = hsrpwe.starText.getText();
				Assert.assertEquals("Budget", budget);
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
	}

	public int getselectedStarRatingStarTotalPkg() {
		int tot = 0;
		if (hsrpwe.starTotalPkg != null) {
			try {
				String total = hsrpwe.starTotalPkg.getText();
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

	// end star rating test

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

	// deluxe test

	public void selectStarRatingDeluxe() {
		if (hsrpwe.deluxeCheckBox != null) {
			try {
				hsrpwe.deluxeCheckBox.click();
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
	}

	public void getStarRatingDeluxeText() {
		if (hsrpwe.deluxeCheckBox != null) {
			try {
				String deluxe = hsrpwe.deluxeCheckBox.getText();
				Assert.assertEquals("Deluxe", deluxe);
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
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

	// deluxe test end

	// going for test

	// any test
	public void selectGoingForAny() {
		if (hsrpwe.anyChecBox != null) {
			try {
				hsrpwe.anyChecBox.click();
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
	}

	public void selectGoingForAnyText() {
		if (hsrpwe.anyText != null) {
			try {
				String any = hsrpwe.anyText.getText();
				Assert.assertEquals("Any", any);
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
	}

	public int getGoingForAnyTextTotalPkg() {
		int tot = 0;
		if (hsrpwe.anyTotalPkg != null) {
			try {
				String total = hsrpwe.anyTotalPkg.getText();
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

	// end any

	// Weekend-holidays test
	public void selectGoingForWeekendHolidays() {
		if (hsrpwe.weekendHolidaysCheckBox != null) {
			try {
				hsrpwe.weekendHolidaysCheckBox.click();
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
	}

	public void selectGoingForweekendholidaysText() {
		if (hsrpwe.weekendHolidaysText != null) {
			try {
				String weekendholidays = hsrpwe.weekendHolidaysText.getText();
				Assert.assertEquals("1-3 Nights", weekendholidays);
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
	}

	public int getGoingForweekendholidaysTotalPkg() {
		int tot = 0;
		if (hsrpwe.weekendHolidaysTotlaPkg != null) {
			try {
				String total = hsrpwe.weekendHolidaysTotlaPkg.getText();
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

	// end Weekend-holidays

	// short-holidays test
	public void selectGoingForShortHolidays() {
		if (hsrpwe.ShortHolidayCheckBox != null) {
			try {
				hsrpwe.ShortHolidayCheckBox.click();
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
	}

	public void selectGoingForShortHolidaysText() {
		if (hsrpwe.ShortHolidayText != null) {
			try {
				String shortHolidays = hsrpwe.ShortHolidayText.getText();
				Assert.assertEquals("4-7 Nights", shortHolidays);
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
	}

	public int getGoingForShortHolidaysTotalPkg() {
		int tot = 0;
		if (hsrpwe.ShortHolidayTotalPkg != null) {
			try {
				String total = hsrpwe.ShortHolidayTotalPkg.getText();
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

	// end short-holidays

	// long-holidays test
	public void selectGoingForLongHolidays() {
		if (hsrpwe.longHolidayCheckBox != null) {
			try {
				hsrpwe.longHolidayCheckBox.click();
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
	}

	public void selectGoingForLongtHolidaysText() {
		if (hsrpwe.longHolidayText != null) {
			try {
				String longHolidays = hsrpwe.longHolidayText.getText();
				Assert.assertEquals("7+ Nights", longHolidays);
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
	}

	public int getGoingForLongHolidaysTotalPkg() {
		int tot = 0;
		if (hsrpwe.longHolidayTotlaPkg != null) {
			try {
				String total = hsrpwe.longHolidayTotlaPkg.getText();
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

	// end long-holidays

	// end going for test

	// Flight test

	// with flight
	public void selectWithFlight() {
		if (hsrpwe.withFlightsCheckBox != null) {
			try {
				hsrpwe.withFlightsCheckBox.click();
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
	}

	public void selectWithFlightText() {
		if (hsrpwe.withFlightsText != null) {
			try {
				String wihtFlight = hsrpwe.withFlightsText.getText();
				Assert.assertEquals("With Flight", wihtFlight);
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
	}

	public int getWithFlightTotalPkg() {
		int tot = 0;
		if (hsrpwe.withFlightsTotalPkg != null) {
			try {
				String total = hsrpwe.withFlightsTotalPkg.getText();
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

	// end with flight

	// without flight test
	public void selectWithoutFlight() {
		if (hsrpwe.withoutFlightCheckBox != null) {
			try {
				hsrpwe.withoutFlightCheckBox.click();
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
	}

	public void selectWithoutFlightText() {
		if (hsrpwe.withoutFlightText != null) {
			try {
				String withoutflights = hsrpwe.withoutFlightText.getText();
				Assert.assertEquals("Without Flight", withoutflights);
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
	}

	public int getWithoutFlightTotalPkg() {
		int tot = 0;
		if (hsrpwe.withoutFlightTotalPkg != null) {
			try {
				String total = hsrpwe.withoutFlightTotalPkg.getText();
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

	// end without flight

	// end flight

	// Transfer test

	// with transfers
	public void selectWithTransfers() {
		if (hsrpwe.withTransferCheckBox != null) {
			try {
				hsrpwe.withTransferCheckBox.click();
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
	}

	public void selectWithTransfersText() {
		if (hsrpwe.withTransferText != null) {
			try {
				String transfer = hsrpwe.withTransferText.getText();
				Assert.assertEquals("With Transfers", transfer);
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
	}

	public int getWithTransfersTotalPkg() {
		int tot = 0;
		if (hsrpwe.withTransferTotalPkg != null) {
			try {
				String total = hsrpwe.withTransferTotalPkg.getText();
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

	// end with Transfers

	// without Transfers test
	public void selectTransfersoutFlight() {
		if (hsrpwe.withoutTransferCheckBox != null) {
			try {
				hsrpwe.withoutTransferCheckBox.click();
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
	}

	public void selectTransfersoutFlightText() {
		if (hsrpwe.withoutTransferText != null) {
			try {
				String withouttransfer = hsrpwe.withoutTransferText.getText();
				Assert.assertEquals("Without Flight", withouttransfer);
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
	}

	public int getTransfersoutFlightTotalPkg() {
		int tot = 0;
		if (hsrpwe.withoutTransferTotalPkg != null) {
			try {
				String total = hsrpwe.withoutTransferTotalPkg.getText();
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

	// end without transfers

	// end transfers

	// Sightseeing test

	// with Sightseeing
	public void selectWithSightseeing() {
		if (hsrpwe.withsightseeingCheckBox != null) {
			try {
				hsrpwe.withsightseeingCheckBox.click();
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
	}

	public void selectWithSightseeingText() {
		if (hsrpwe.withsightseeingText != null) {
			try {
				String wihtse = hsrpwe.withsightseeingText.getText();
				Assert.assertEquals("With Flight", wihtse);
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
	}

	public int getWithSightseeingTotalPkg() {
		int tot = 0;
		if (hsrpwe.withsightseeingTotalPkg != null) {
			try {
				String total = hsrpwe.withsightseeingTotalPkg.getText();
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

	// end with Sightseeing

	// without Sightseeing test
	public void selectWithoutSightseeing() {
		if (hsrpwe.withoutsightseeingCheckBox != null) {
			try {
				hsrpwe.withoutsightseeingCheckBox.click();
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
	}

	public void selectWithoutSightseeingText() {
		if (hsrpwe.withoutsightseeingText != null) {
			try {
				String withoutse = hsrpwe.withoutsightseeingText.getText();
				Assert.assertEquals("Without Flight", withoutse);
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
	}

	public int getWithoutSightseeingTotalPkg() {
		int tot = 0;
		if (hsrpwe.withoutsightseeingTotalPkg != null) {
			try {
				String total = hsrpwe.withoutsightseeingTotalPkg.getText();
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

	// end without Sightseeing

	// end Sightseeing

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

	// filter testing with search result

	public void filterStarRatingStandard() {
		this.selectStarRatingStandard();
		this.getStarRatingStandardText();
		this.getselectStarRatingStandardTotalPkg();
	}

	public void filterStarRatingBudget() {
		hsrpwe.budgetcheckBox.click();
		String text = hsrpwe.budgetText.getText();
		Assert.assertEquals("Budget", text);
		String total = hsrpwe.budgetTotlaPkg.getText();
		String trimto = total.trim().replaceAll("\\W", "");
		int tot = Integer.parseInt(trimto);
		logger.info("toal filte pkg " + tot);
		int toalfilterpak = this.totalPkgs();
		logger.info("toal filte pkg " + toalfilterpak);
		Assert.assertEquals(toalfilterpak, tot);
	}
}
