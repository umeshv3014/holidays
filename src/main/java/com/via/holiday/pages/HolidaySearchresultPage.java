package com.via.holiday.pages;

import java.util.ArrayList;
import java.util.List;

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
				Assert.assertEquals(
						destinationCity,
						getText(driver, "xpath",
								getKeyValue("getDestinationcity")));
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
	}

	public int numberOfPackages() {
		int nupck = Integer.parseInt(getText(driver, "xpath",
				getKeyValue("showingCount")));
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

	public String getStandardText() {
		String text = hsrpwe.standardText.getText();
		return text;

	}

	public int getselectStarRatingStandardTotalPkg() {
		int tot = 0;
		if (hsrpwe.standardTotalpkg != null) {
			try {
				String total = hsrpwe.standardTotalpkg.getText();
				String trimto = total.trim().replaceAll("\\W", "");
				tot = Integer.parseInt(trimto);
				logger.info("toal filte pkg " + tot);
				int totalpk = hsrpwe.nuOfPackages.size();
				logger.info("toal filte pkg " + totalpk);
				Assert.assertEquals(totalpk, tot);
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
		return tot;

	}

	// end standard test

	// start 2 star test
	public void selectStarRatingStar_2() {
		if (hsrpwe.star2CheckBox != null) {
			try {
				hsrpwe.star2Text.click();
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
	}

	public void getStarRatingStar_2_Text() {
		if (hsrpwe.star2Text != null) {
			try {
				String star2 = hsrpwe.star2Text.getText();
				Assert.assertEquals("2 Star", star2);
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
	}

	public String getStar_2_Text() {
		String text = hsrpwe.star2Text.getText();
		return text;

	}

	public int getselectStarRatingStar_2_TotalPkg() {
		int tot = 0;
		if (hsrpwe.star2Total != null) {
			try {
				String total = hsrpwe.star2Total.getText();
				String trimto = total.trim().replaceAll("\\W", "");
				tot = Integer.parseInt(trimto);
				logger.info("toal filte pkg " + tot);
				int totalpk = hsrpwe.nuOfPackages.size();
				logger.info("toal filte pkg " + totalpk);
				Assert.assertEquals(totalpk, tot);
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
		return tot;

	}

	// end 2 star

	// start 3 star

	public void selectStarRatingStar_3() {
		if (hsrpwe.star3CheckBox != null) {
			try {
				hsrpwe.star3CheckBox.click();
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
	}

	public void getStarRatingStar_3_Text() {
		if (hsrpwe.star3Text != null) {
			try {
				String star3 = hsrpwe.star3Text.getText();
				Assert.assertEquals("3 Star", star3);
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
	}

	public String getStar_3_Text() {
		String text = hsrpwe.star3Text.getText();
		return text;

	}

	public int getselectStarRatingStar_3_TotalPkg() {
		int tot = 0;
		if (hsrpwe.star3Total != null) {
			try {
				String total = hsrpwe.star3Total.getText();
				String trimto = total.trim().replaceAll("\\W", "");
				tot = Integer.parseInt(trimto);
				logger.info("toal filte pkg " + tot);
				int totalpk = hsrpwe.nuOfPackages.size();
				logger.info("toal filte pkg " + totalpk);
				Assert.assertEquals(totalpk, tot);
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
		return tot;

	}

	// end 3 star
	// start 4 star
	public void selectStarRatingStar_4() {
		if (hsrpwe.star4CheckBox != null) {
			try {
				hsrpwe.star4CheckBox.click();
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
	}

	public void getStarRatingStar_4_Text() {
		if (hsrpwe.star4Text != null) {
			try {
				String star2 = hsrpwe.star4Text.getText();
				Assert.assertEquals("4 Star", star2);
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
	}

	public String getStar_4_Text() {
		String text = hsrpwe.star3Text.getText();
		return text;

	}

	public int getselectStarRatingStar_4_TotalPkg() {
		int tot = 0;
		if (hsrpwe.star4Total != null) {
			try {
				String total = hsrpwe.star4Total.getText();
				String trimto = total.trim().replaceAll("\\W", "");
				tot = Integer.parseInt(trimto);
				logger.info("toal filte pkg " + tot);
				int totalpk = hsrpwe.nuOfPackages.size();
				logger.info("toal filte pkg " + totalpk);
				Assert.assertEquals(totalpk, tot);
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
		return tot;

	}

	// end 4 atar

	// start 5 star
	public void selectStarRatingStar_5() {
		if (hsrpwe.star5CheckBox != null) {
			try {
				hsrpwe.star5CheckBox.click();
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
	}

	public void getStarRatingStar_5_Text() {
		if (hsrpwe.star5Text != null) {
			try {
				String star2 = hsrpwe.star5Text.getText();
				Assert.assertEquals("5 Star", star2);
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
	}

	public String getStar_5_Text() {
		String text = hsrpwe.star5Text.getText();
		return text;

	}

	public int getselectStarRatingStar_5_TotalPkg() {
		int tot = 0;
		if (hsrpwe.star5Total != null) {
			try {
				String total = hsrpwe.star5Total.getText();
				String trimto = total.trim().replaceAll("\\W", "");
				tot = Integer.parseInt(trimto);
				logger.info("toal filte pkg " + tot);
				int totalpk = hsrpwe.nuOfPackages.size();
				logger.info("toal filte pkg " + totalpk);
				Assert.assertEquals(totalpk, tot);
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
		return tot;

	}

	// end 4 atar

	// end star test

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

	public String getBudgetText() {
		String str = hsrpwe.budgetText.getText();
		return str;
	}

	public int getselectedStarRatingBudgetTotalPkg() {
		int tot = 0;
		if (hsrpwe.budgetTotlaPkg != null) {
			try {
				String total = hsrpwe.budgetTotlaPkg.getText();
				String trimto = total.trim().replaceAll("\\W", "");
				tot = Integer.parseInt(trimto);
				logger.info("toal filte pkg " + tot);
				int totalpk = hsrpwe.nuOfPackages.size();
				logger.info("toal filte pkg " + totalpk);
				Assert.assertEquals(totalpk, tot);
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
				logger.info("toal filte pkg " + tot);
				int totalpk = hsrpwe.nuOfPackages.size();
				logger.info("toal filte pkg " + totalpk);
				Assert.assertEquals(totalpk, tot);
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
		return tot;

	}

	// end star rating test
	
	// luxury
	public void selectStarRatingluxury() {
		if (hsrpwe.luxuryCheckBox != null) {
			try {
				hsrpwe.luxuryCheckBox.click();
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
	}

	public void getStarRatingluxuryText() {
		if (hsrpwe.luxuryText != null) {
			try {
				String luxury = hsrpwe.luxuryText.getText();
				Assert.assertEquals("Luxury", luxury);
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
	}
	public int getselectedStarRatingLuxuryTotalPkg() {
		int tot = 0;
		if (hsrpwe.luxuryTotalPkg != null) {
			try {
				String total = hsrpwe.luxuryTotalPkg.getText();
				String trimto = total.trim().replaceAll("\\W", "");
				tot = Integer.parseInt(trimto);
				logger.info("toal filte pkg " + tot);
				int totalpk = hsrpwe.nuOfPackages.size();
				logger.info("toal filte pkg " + totalpk);
				Assert.assertEquals(totalpk, tot);
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
		return tot;

	}
	
	//end luxury

	// Super luxury
		public void selectStarRatingSuperluxury() {
			if (hsrpwe.superLuxuryCheckBox != null) {
				try {
					hsrpwe.superLuxuryCheckBox.click();
				} catch (NoSuchElementException e) {
					logger.error(
							"Not able to locate the webelement, please check the xpath",
							e);
				}
			}
		}

		public void getStarRatingSuperLuxuryText() {
			if (hsrpwe.superLuxuryText != null) {
				try {
					String superluxury = hsrpwe.superLuxuryText.getText();
					Assert.assertEquals("Super Luxury", superluxury);
				} catch (NoSuchElementException e) {
					logger.error(
							"Not able to locate the webelement, please check the xpath",
							e);
				}
			}
		}
		public int getselectedStarRatingSuperLuxuryTotalPkg() {
			int tot = 0;
			if (hsrpwe.superLuxuryTotalPkg != null) {
				try {
					String total = hsrpwe.superLuxuryTotalPkg.getText();
					String trimto = total.trim().replaceAll("\\W", "");
					tot = Integer.parseInt(trimto);
					logger.info("toal filte pkg " + tot);
					int totalpk = hsrpwe.nuOfPackages.size();
					logger.info("toal filte pkg " + totalpk);
					Assert.assertEquals(totalpk, tot);
				} catch (NoSuchElementException e) {
					logger.error(
							"Not able to locate the webelement, please check the xpath",
							e);
				}
			}
			return tot;

		}
		
		//end super luxury

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
		if (hsrpwe.deluxeText != null) {
			try {
				String deluxe = hsrpwe.deluxeText.getText();
				Assert.assertEquals("Deluxe", deluxe);
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
	}

	public int getStarRatingDeluxTotalPkg() {
		int tot = 0;
		if (hsrpwe.deluxeTotlaPkg != null) {
			try {
				String total = hsrpwe.deluxeTotlaPkg.getText();
				String trimto = total.trim().replaceAll("\\W", "");
				tot = Integer.parseInt(trimto);
				logger.info("toal filte pkg " + tot);
				int totalpk = hsrpwe.nuOfPackages.size();
				logger.info("toal filte pkg " + totalpk);
				Assert.assertEquals(totalpk, tot);
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
		return tot;

	}

	// deluxe test end
	
//Super deluxe test

	public void selectStarRatingSuperDeluxe() {
		if (hsrpwe.superDeluxeCheckBox != null) {
			try {
				hsrpwe.superDeluxeCheckBox.click();
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
	}

	public void getStarRatingsuperDeluxeText() {
		if (hsrpwe.superDeluxeText != null) {
			try {
				String suprerdeluxe = hsrpwe.superDeluxeText.getText();
				Assert.assertEquals("Super Deluxe", suprerdeluxe);
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
	}

	public int getStarRatingsuperDeluxeTotalPkg() {
		int tot = 0;
		if (hsrpwe.superDeluxeTotlaPkg != null) {
			try {
				String total = hsrpwe.superDeluxeTotlaPkg.getText();
				String trimto = total.trim().replaceAll("\\W", "");
				tot = Integer.parseInt(trimto);
				logger.info("toal filte pkg " + tot);
				int totalpk = hsrpwe.nuOfPackages.size();
				logger.info("toal filte pkg " + totalpk);
				Assert.assertEquals(totalpk, tot);
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
		return tot;

	}

	// Super deluxe test end

	// Inside Cabin test

		public void selectStarRatingInsideCabin() {
			if (hsrpwe.insideCabinCheckBox != null) {
				try {
					hsrpwe.insideCabinCheckBox.click();
				} catch (NoSuchElementException e) {
					logger.error(
							"Not able to locate the webelement, please check the xpath",
							e);
				}
			}
		}

		public void getStarRatingInsideCabinText() {
			if (hsrpwe.insideCabinText != null) {
				try {
					String insidecabin = hsrpwe.insideCabinText.getText();
					Assert.assertEquals("Inside Cabin", insidecabin);
				} catch (NoSuchElementException e) {
					logger.error(
							"Not able to locate the webelement, please check the xpath",
							e);
				}
			}
		}

		public int getStarRatingInsideCabinTotalPkg() {
			int tot = 0;
			if (hsrpwe.insideCabinTotalPkg != null) {
				try {
					String total = hsrpwe.insideCabinTotalPkg.getText();
					String trimto = total.trim().replaceAll("\\W", "");
					tot = Integer.parseInt(trimto);
					logger.info("toal filte pkg " + tot);
					int totalpk = hsrpwe.nuOfPackages.size();
					logger.info("toal filte pkg " + totalpk);
					Assert.assertEquals(totalpk, tot);
				} catch (NoSuchElementException e) {
					logger.error(
							"Not able to locate the webelement, please check the xpath",
							e);
				}
			}
			return tot;

		}

		// Inside Cabin test end
		
//Deluxe Ocean View Cabin test

		public void selectStarRatingDOVCcabin() {
			if (hsrpwe.DOVCcabinCheckBox != null) {
				try {
					hsrpwe.DOVCcabinCheckBox.click();
				} catch (NoSuchElementException e) {
					logger.error(
							"Not able to locate the webelement, please check the xpath",
							e);
				}
			}
		}

		public void getStarRatingDOVCcabinText() {
			if (hsrpwe.DOVCcabinText != null) {
				try {
					String docvc = hsrpwe.DOVCcabinText.getText();
					Assert.assertEquals("Deluxe Ocean View Cabin", docvc);
				} catch (NoSuchElementException e) {
					logger.error(
							"Not able to locate the webelement, please check the xpath",
							e);
				}
			}
		}

		public int getStarRatingDOVCcabinTotalPkg() {
			int tot = 0;
			if (hsrpwe.DOVCcabinTotalPkg != null) {
				try {
					String total = hsrpwe.DOVCcabinTotalPkg.getText();
					String trimto = total.trim().replaceAll("\\W", "");
					tot = Integer.parseInt(trimto);
					logger.info("toal filte pkg " + tot);
					int totalpk = hsrpwe.nuOfPackages.size();
					logger.info("toal filte pkg " + totalpk);
					Assert.assertEquals(totalpk, tot);
				} catch (NoSuchElementException e) {
					logger.error(
							"Not able to locate the webelement, please check the xpath",
							e);
				}
			}
			return tot;

		}

		// Deluxe Ocean View Cabin test end


//Outside/Ocean View Cabin test

		public void selectStarRatingOOVCcabin() {
			if (hsrpwe.OOVCcabinCheckBox != null) {
				try {
					hsrpwe.OOVCcabinCheckBox.click();
				} catch (NoSuchElementException e) {
					logger.error(
							"Not able to locate the webelement, please check the xpath",
							e);
				}
			}
		}

		public void getStarRatingOOVCcabinText() {
			if (hsrpwe.OOVCcabinText != null) {
				try {
					String OOVC = hsrpwe.OOVCcabinText.getText();
					Assert.assertEquals("Outside/Ocean View Cabin", OOVC);
				} catch (NoSuchElementException e) {
					logger.error(
							"Not able to locate the webelement, please check the xpath",
							e);
				}
			}
		}

		public int getStarRatingOOVCcabinTotalPkg() {
			int tot = 0;
			if (hsrpwe.OOVCcabinTotalPkg != null) {
				try {
					String total = hsrpwe.OOVCcabinTotalPkg.getText();
					String trimto = total.trim().replaceAll("\\W", "");
					tot = Integer.parseInt(trimto);
					logger.info("toal filte pkg " + tot);
					int totalpk = hsrpwe.nuOfPackages.size();
					logger.info("toal filte pkg " + totalpk);
					Assert.assertEquals(totalpk, tot);
				} catch (NoSuchElementException e) {
					logger.error(
							"Not able to locate the webelement, please check the xpath",
							e);
				}
			}
			return tot;

		}

		// Outside/Ocean View Cabin test end

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

	public void getGoingForAnyText() {
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
				logger.info("toal filte pkg " + tot);
				int totalpk = hsrpwe.nuOfPackages.size();
				logger.info("toal filte pkg " + totalpk);
				Assert.assertEquals(totalpk, tot);
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

	public void getGoingForweekendholidaysText() {
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
				logger.info("toal filte pkg " + tot);
				int totalpk = hsrpwe.nuOfPackages.size();
				logger.info("toal filte pkg " + totalpk);
				Assert.assertEquals(totalpk, tot);
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

	public void getGoingForShortHolidaysText() {
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
				logger.info("toal filte pkg " + tot);
				int totalpk = hsrpwe.nuOfPackages.size();
				logger.info("toal filte pkg " + totalpk);
				Assert.assertEquals(totalpk, tot);
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

	public void getGoingForLongtHolidaysText() {
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
				logger.info("toal filte pkg " + tot);
				int totalpk = hsrpwe.nuOfPackages.size();
				logger.info("toal filte pkg " + totalpk);
				Assert.assertEquals(totalpk, tot);
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

	public void gettWithFlightText() {
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
				logger.info("toal filte pkg " + tot);
				int totalpk = hsrpwe.nuOfPackages.size();
				logger.info("toal filte pkg " + totalpk);
				Assert.assertEquals(totalpk, tot);
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

	public void getWithoutFlightText() {
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
				logger.info("toal filte pkg " + tot);
				int totalpk = hsrpwe.nuOfPackages.size();
				logger.info("toal filte pkg " + totalpk);
				Assert.assertEquals(totalpk, tot);
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
				logger.info("toal filte pkg " + tot);
				int totalpk = hsrpwe.nuOfPackages.size();
				logger.info("toal filte pkg " + totalpk);
				Assert.assertEquals(totalpk, tot);
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
				logger.info("toal filte pkg " + tot);
				int totalpk = hsrpwe.nuOfPackages.size();
				logger.info("toal filte pkg " + totalpk);
				Assert.assertEquals(totalpk, tot);
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

	public void getWithSightseeingText() {
		if (hsrpwe.withsightseeingText != null) {
			try {
				String wihtse = hsrpwe.withsightseeingText.getText();
				Assert.assertEquals("With Sightseeing", wihtse);
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
				logger.info("toal filte pkg " + tot);
				int totalpk = hsrpwe.nuOfPackages.size();
				logger.info("toal filte pkg " + totalpk);
				Assert.assertEquals(totalpk, tot);
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

	public void getWithoutSightseeingText() {
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
				logger.info("toal filte pkg " + tot);
				int totalpk = hsrpwe.nuOfPackages.size();
				logger.info("toal filte pkg " + totalpk);
				Assert.assertEquals(totalpk, tot);
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

	public void show_All() {
		if (hsrpwe.showAll != null) {
			try {
				if (hsrpwe.showAll.isDisplayed()) {
					hsrpwe.showAll.click();
				}
			} catch (NoSuchElementException e) {
				logger.error(
						"Not able to locate the webelement, please check the xpath",
						e);
			}
		}
	}

	// need to alter
	public void holidyasThumbImages() {
		int count = hsrpwe.thumbImg.size();
		logger.info(count);
		List<String> str = new ArrayList<String>();
		for (int i = 1; i < count; i++) {
			String we = super.getKeyValue("holidayThumbImages") + i
					+ super.getKeyValue("htImage");
			logger.info(we);
			str.add(we);
			String path = str.get(i - 1);
			imageverify(driver, "xpath", path);
			logger.info(imageverify(driver, "xpath", str.get(i - 1)));
		}
	}

	public void dragSlider(String locatorType, String locatorValue, int xAxis,
			int yAxis) {
		super.horizontalSliderBarAction(driver, locatorType, locatorValue,
				xAxis, yAxis);
		this.show_All();
	}

	// search result page test cases

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
