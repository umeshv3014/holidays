package com.via.holiday.pageFactory.webElements;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.via.base.util.SeleniumBase;
import com.via.holiday.pages.HolidayHomePage;

public class HolidaySearchResultPageWebElement {
	WebDriver driver;
	HolidayHomePage hhp;
	SeleniumBase sb;

	public HolidaySearchResultPageWebElement(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Holidays')]")
	public WebElement backToHolidayHomepage;

	public void goToHomePage() {
		this.backToHolidayHomepage.click();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='packagesResults']//button[contains(text(),'BOOK NOW')]")
	public List<WebElement> getTotalNumberOfBOOKNOW;

	public int countNumberOfBookNow() {
		return this.getTotalNumberOfBOOKNOW.size();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='hldDealAltForm']//input[@name='mobile']")
	public WebElement mobileNumberSE;

	public void setSendEnquiryMobileNumber(String mobileNumber) {
		this.mobileNumberSE.sendKeys(mobileNumber);
	}

	@FindBy(how = How.XPATH, using = "//*[@id='hldDealAltForm']//input[@name='name']")
	public WebElement sendEnquiryname;

	public void setSendEnquiryname(String name) {
		this.sendEnquiryname.sendKeys(name);
	}

	@FindBy(how = How.XPATH, using = "//*[@id='hldDealAltForm']//input[@name='email']")
	public WebElement sendEnquiryEmail;

	public void setSendEnquiryEmail(String email) {
		this.sendEnquiryEmail.sendKeys(email);
	}

	@FindBy(how = How.XPATH, using = "//*[@id='hldDealAltForm']//input[@name='city']")
	public WebElement sendEnquiryCityName;

	public void setSendEnquiryCityName(String originCity) {
		this.sendEnquiryCityName.sendKeys(originCity);
	}

	@FindBy(how = How.XPATH, using = "//*[@id='hldDealAltForm']//input[@name='duration']")
	public WebElement sendEnquiryduration;

	public void setSendEnquiryDuration(String duration) {
		this.sendEnquiryduration.sendKeys(duration);
	}

	@FindBy(how = How.XPATH, using = "//*[@id='hldDealAltForm']//textarea[@name='comments']")
	public WebElement sendEnquirycomments;

	public void setSendEnquirycomments(String tourRequirementAndPreference) {
		this.sendEnquirycomments.sendKeys(tourRequirementAndPreference);
	}

	@FindBy(how = How.XPATH, using = "//*[@id='modalPanel']//button[contains(text(),'Submit')]")
	public WebElement sendEnquirysubmit;

	public void submitSendEnquiry() {
		this.sendEnquirysubmit.click();
	}

	// need to work on this

	@FindBy(how = How.XPATH, using = "//*[@id='hldDealAltForm']//input[@name='travel_date']")
	public WebElement sendEnquiryDate;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Close')]")
	public WebElement SHEclanderClose;

	@FindBy(how = How.XPATH, using = "//*[@id='hldDealAltForm']//input[@placeholder='Select Travel Date']")
	public WebElement selectDate;

	public void setSendEnquiryDate() {
		this.sendEnquiryDate.clear();
		this.selectDate.click();
		hhp.selectDate();
	}

	// complete above work

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Send Enquiry')]")
	public WebElement SendEnquiryButton;

	public void selectSendEnquiry() {
		this.SendEnquiryButton.click();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='modalPanel']//button")
	public WebElement SHEsucess;

	@FindBy(how = How.XPATH, using = ".//*[@id='packagesFilters']//strong[1]/span")
	public WebElement totalPackagesZero;

	@FindBy(how = How.XPATH, using = ".//*[@id='packagesFilters']//strong[2]/span")
	public WebElement totalPackages;

	public int totalNumberOfPackages() {
		return Integer.parseInt(this.totalPackages.getText());
	}

	public int totalNumberOfPackagesZero() {
		return Integer.parseInt(this.totalPackagesZero.getText());
	}

	@FindBy(how = How.XPATH, using = "//*[@id='packagesResults']/div/div[@class='row list']")
	public List<WebElement> nuOfPackages;

	public int numberOfFilteredPackages() {
		return this.nuOfPackages.size();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='packagesResults']//button[contains(text(),'BOOK NOW')]")
	public List<WebElement> nuOfbookableHolidays;

	public int totlalNumberOfBookNow() {
		return this.nuOfbookableHolidays.size();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='packagesResults']//button[contains(text(),'SEND ENQUIRY')]")
	public List<WebElement> nuOfSendEnquiry;

	public int totalNumberOSendEnquiry() {
		return this.nuOfSendEnquiry.size();
	}

	public int totlaNumberOfSendEnquiry() {
		return this.nuOfSendEnquiry.size();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='packagesResults']//button[contains(text(),'SEND ENQUIRY')]")
	public WebElement sendEnquiryButton;

	public void sendEnquiry() {
		this.SendEnquiryButton.click();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='packagesResults']//img[@class='fullWidth']")
	public List<WebElement> thumbImg;

	public int thumbImages() {
		return this.thumbImg.size();
	}

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Modify Search')]")
	public WebElement modifySearch;

	public void modifySearch() {
		this.modifySearch.click();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='Standard']/following-sibling::label/span[1]")
	public WebElement standardCheckBox;

	public void selectStandard() {
		this.standardCheckBox.click();
	}

	public void deselectStandard() {
		this.standardCheckBox.click();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='Standard']/following-sibling::label/span[2]")
	public WebElement standardText;

	public String getStandardText() {
		return this.standardText.getText();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='Standard']/following-sibling::label/span[3]")
	public WebElement standardTotalPkg;

	public int standardTotalpkg() {
		int tot = Integer.parseInt(this.standardTotalPkg.getText().trim()
				.replaceAll("\\W", ""));
		return tot;
	}

	public void standartdPkg() {
		Assert.assertEquals(this.numberOfFilteredPackages(),
				this.standardTotalpkg());
		if (this.standardTotalpkg() == this.totalNumberOfPackages()) {
			this.deselectStandard();
		} else {
			this.resetFilter();
		}
	}

	@FindBy(how = How.XPATH, using = "//*[@id='2 Star']/following-sibling::label/span[1]")
	public WebElement star2CheckBox;

	public void select_2_star() {
		this.star2CheckBox.click();
	}

	public void deselect_2_star() {
		this.star2CheckBox.click();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='2 Star']/following-sibling::label/span[2]")
	public WebElement star2Text;

	public String get2StarText() {
		return this.star2Text.getText();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='2 Star']/following-sibling::label/span[3]")
	public WebElement star2Total;

	public int star2Totalpkg() {
		int tot = Integer.parseInt(this.star2Total.getText().trim()
				.replaceAll("\\W", ""));
		return tot;
	}

	public void getTotalStar_2() {
		Assert.assertEquals(this.numberOfFilteredPackages(),
				this.star2Totalpkg());
		if (this.star2Totalpkg() == this.totalNumberOfPackages()) {
			this.deselect_2_star();
		} else {
			this.resetFilter();
		}
	}

	@FindBy(how = How.XPATH, using = "//*[@id='3 Star']/following-sibling::label/span[1]")
	public WebElement star3CheckBox;

	public void select3Star() {
		this.star3CheckBox.click();
	}

	public void deselect3Star() {
		this.star3CheckBox.click();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='3 Star']/following-sibling::label/span[2]")
	public WebElement star3Text;

	public String get3StarText() {
		return this.star3Text.getText();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='3 Star']/following-sibling::label/span[3]")
	public WebElement star3Total;

	public int star3Totalpkg() {
		int tot = Integer.parseInt(this.star3Total.getText().trim()
				.replaceAll("\\W", ""));
		return tot;
	}

	public void get3StarTotal() {
		Assert.assertEquals(this.numberOfFilteredPackages(),
				this.star3Totalpkg());
		if (this.star3Totalpkg() == this.totalNumberOfPackages()) {
			this.deselect3Star();
		} else {
			this.resetFilter();
		}
	}

	@FindBy(how = How.XPATH, using = "//*[@id='4 Star']/following-sibling::label/span[1]")
	public WebElement star4CheckBox;

	public void select4Star() {
		this.star4CheckBox.click();
	}

	public void deselect4Star() {
		this.star4CheckBox.click();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='4 Star']/following-sibling::label/span[2]")
	public WebElement star4Text;

	public String get4StarText() {
		return this.star4Text.getText();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='4 Star']/following-sibling::label/span[3]")
	public WebElement star4Total;

	public int star4Totalpkg() {
		int tot = Integer.parseInt(this.star4Total.getText().trim()
				.replaceAll("\\W", ""));
		return tot;
	}

	public void get4StarTotal() {
		Assert.assertEquals(this.numberOfFilteredPackages(),
				this.star4Totalpkg());
		if (this.star4Totalpkg() == this.totalNumberOfPackages()) {
			this.deselect4Star();
		} else {
			this.resetFilter();
		}
	}

	@FindBy(how = How.XPATH, using = "//*[@id='5 Star']/following-sibling::label/span[1]")
	public WebElement star5CheckBox;

	public void deselect5Star() {
		this.star5CheckBox.click();
	}

	public void select5Star() {
		this.star5CheckBox.click();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='5 Star']/following-sibling::label/span[2]")
	public WebElement star5Text;

	public String get5StarText() {
		return this.star3Text.getText();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='5 Star']/following-sibling::label/span[3]")
	public WebElement star5Total;

	public int star5Totalpkg() {
		int tot = Integer.parseInt(this.star5Total.getText().trim()
				.replaceAll("\\W", ""));
		return tot;
	}

	public void get5StarTotal() {
		Assert.assertEquals(this.numberOfFilteredPackages(),
				this.star5Totalpkg());
		if (this.star5Totalpkg() == this.totalNumberOfPackages()) {
			this.deselect5Star();
		} else {
			this.resetFilter();
		}
	}

	@FindBy(how = How.XPATH, using = "//*[@id='packagesFilters']/div[2]//span[2]")
	public List<WebElement> starRatingText;

	public int totalStarRatingPackages() {
		return this.starRatingText.size();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='packagesFilters']/div[2]//span[2]")
	public WebElement starRatingTexts;

	public String getStarRatingTexts() {
		return this.star3Text.getText();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='packagesFilters']/div[3]//span[2]")
	public List<WebElement> goingForText;

	public int totalGoingForPackages() {
		return this.goingForText.size();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='packagesFilters']/div[3]//span[2]")
	public WebElement goingForTexts;

	public String getGoingForTexts() {
		return this.goingForTexts.getText();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='packagesFilters']/div[4]//span[2]")
	public List<WebElement> flightText;

	public int totalFlightPackages() {
		return this.flightText.size();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='packagesFilters']/div[4]//span[2]")
	public WebElement flightTexts;

	public String getflightTexts() {
		return this.flightTexts.getText();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='packagesFilters']/div[5]//span[2]")
	public List<WebElement> transferText;

	@FindBy(how = How.XPATH, using = "//*[@id='packagesFilters']/div[5]//span[2]")
	public WebElement transferTexts;

	public String gettransferTexts() {
		return this.transferTexts.getText();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='packagesFilters']/div[6]//span[2]")
	public List<WebElement> sightseeingText;

	public int totalSightSeeingPackages() {
		return this.sightseeingText.size();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='packagesFilters']/div[6]//span[2]")
	public WebElement sightseeingTexts;

	public String getsightseeingTexts() {
		return this.sightseeingTexts.getText();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='Budget']/following-sibling::label/span[1]")
	public WebElement budgetcheckBox;

	public void selectBudget() {
		this.budgetcheckBox.click();
	}

	public void deselectBudget() {
		this.budgetcheckBox.click();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='Budget']/following-sibling::label/span[2]")
	public WebElement budgetText;

	public String getbudgetText() {
		return this.budgetText.getText();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='Budget']/following-sibling::label/span[3]")
	public WebElement budgetTotlaPkg;

	public int budgetTotlapkg() {
		int tot = Integer.parseInt(this.budgetTotlaPkg.getText().trim()
				.replaceAll("\\W", ""));
		return tot;
	}

	public void getbudgetTotlaPkg() {
		Assert.assertEquals(this.numberOfFilteredPackages(),
				this.budgetTotlapkg());
		if (this.budgetTotlapkg() == this.totalNumberOfPackages()) {
			this.deselectBudget();
		} else {
			this.resetFilter();
		}
	}

	@FindBy(how = How.XPATH, using = "//*[@id='Star']/following-sibling::label/span[1]")
	public WebElement starCheckBox;

	public void selectStar() {
		this.starCheckBox.click();
	}

	public void deselectStar() {
		this.starCheckBox.click();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='Star']/following-sibling::label/span[2]")
	public WebElement starText;

	public String getstarText() {
		return this.starText.getText();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='Star']/following-sibling::label/span[3]")
	public WebElement starTotalPkg;

	public int starTotalpkg() {
		int tot = Integer.parseInt(this.starTotalPkg.getText().trim()
				.replaceAll("\\W", ""));
		return tot;
	}

	public void starTotalPkg() {
		Assert.assertEquals(this.numberOfFilteredPackages(),
				this.starTotalpkg());
		if (this.starTotalpkg() == this.totalNumberOfPackages()) {
			this.deselectStar();
		} else {
			this.resetFilter();
		}
	}

	@FindBy(how = How.XPATH, using = "//*[@id='Luxury']/following-sibling::label/span[1]")
	public WebElement luxuryCheckBox;

	public void selectLuxury() {
		this.luxuryCheckBox.click();
	}

	public void deselectLuxury() {
		this.luxuryCheckBox.click();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='Luxury']/following-sibling::label/span[2]")
	public WebElement luxuryText;

	public String getluxuryText() {
		return this.luxuryText.getText();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='Luxury']/following-sibling::label/span[3]")
	public WebElement luxuryTotalPkg;

	public int luxuryTotalpkg() {
		int tot = Integer.parseInt(this.luxuryTotalPkg.getText().trim()
				.replaceAll("\\W", ""));
		return tot;
	}

	public void luxuryTotalPkg() {
		Assert.assertEquals(this.numberOfFilteredPackages(),
				this.luxuryTotalpkg());
		if (this.luxuryTotalpkg() == this.totalNumberOfPackages()) {
			this.deselectLuxury();
		} else {
			this.resetFilter();
		}
	}

	@FindBy(how = How.XPATH, using = "//*[@id='Super Luxury']/following-sibling::label/span[1]")
	public WebElement superLuxuryCheckBox;

	public void selectSuperLuxury() {
		this.superLuxuryCheckBox.click();
	}

	public void deselectSuperLuxury() {
		this.superLuxuryCheckBox.click();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='Super Luxury']/following-sibling::label/span[2]")
	public WebElement superLuxuryText;

	public String getsuperLuxuryText() {
		return this.superLuxuryText.getText();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='Super Luxury']/following-sibling::label/span[3]")
	public WebElement superLuxuryTotalPkg;

	public int superLuxuryTotalpkg() {
		int tot = Integer.parseInt(this.superLuxuryTotalPkg.getText().trim()
				.replaceAll("\\W", ""));
		return tot;
	}

	public void superLuxuryTotalPkg() {
		Assert.assertEquals(this.numberOfFilteredPackages(),
				this.superLuxuryTotalpkg());
		if (this.superLuxuryTotalpkg() == this.totalNumberOfPackages()) {
			this.deselectSuperLuxury();
		} else {
			this.resetFilter();
		}
	}

	@FindBy(how = How.XPATH, using = "//*[@id='Deluxe']/following-sibling::label/span[1]")
	public WebElement deluxeCheckBox;

	public void selectdeluxe() {
		this.deluxeCheckBox.click();
	}

	public void deselectdeluxe() {
		this.deluxeCheckBox.click();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='Deluxe']/following-sibling::label/span[2]")
	public WebElement deluxeText;

	public String getdeluxeText() {
		return this.deluxeText.getText();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='Deluxe']/following-sibling::label/span[3]")
	public WebElement deluxeTotlaPkg;

	public int deluxeTotlapkg() {
		int tot = Integer.parseInt(this.deluxeTotlaPkg.getText().trim()
				.replaceAll("\\W", ""));
		return tot;
	}

	public void deluxeTotlaPkg() {
		Assert.assertEquals(this.numberOfFilteredPackages(),
				this.deluxeTotlapkg());
		if (this.deluxeTotlapkg() == this.totalNumberOfPackages()) {
			this.deselectdeluxe();
		} else {
			this.resetFilter();
		}
	}

	@FindBy(how = How.XPATH, using = "//*[@id='Super Deluxe']/following-sibling::label/span[1]")
	public WebElement superDeluxeCheckBox;

	public void selectSuperDeluxe() {
		this.superDeluxeCheckBox.click();
	}

	public void deselectSuperDeluxe() {
		this.superDeluxeCheckBox.click();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='Super Deluxe']/following-sibling::label/span[2]")
	public WebElement superDeluxeText;

	public String getsuperDeluxeText() {
		return this.superDeluxeText.getText();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='Super Deluxe']/following-sibling::label/span[3]")
	public WebElement superDeluxeTotlaPkg;

	public int superDeluxeTotlapkg() {
		int tot = Integer.parseInt(this.superDeluxeTotlaPkg.getText().trim()
				.replaceAll("\\W", ""));
		return tot;
	}

	public void superDeluxeTotlaPkg() {
		Assert.assertEquals(this.numberOfFilteredPackages(),
				this.superDeluxeTotlapkg());
		if (this.superDeluxeTotlapkg() == this.totalNumberOfPackages()) {
			this.deselectSuperDeluxe();
		} else {
			this.resetFilter();
		}
	}

	@FindBy(how = How.XPATH, using = "//*[@id='packagesFilters']/div[1]/h5")
	public WebElement refineByBudget;

	@FindBy(how = How.XPATH, using = "//*[@id='packagesFilters']/div[2]/h5")
	public WebElement starRating;

	@FindBy(how = How.XPATH, using = "//*[@id='packagesFilters']/div[3]/h5")
	public WebElement goingFor;

	@FindBy(how = How.XPATH, using = "//*[@id='packagesFilters']/div[4]/h5")
	public WebElement flightsFilter;

	@FindBy(how = How.XPATH, using = "//*[@id='packagesFilters']/div[5]/h5")
	public WebElement transfersFilter;

	@FindBy(how = How.XPATH, using = "//*[@id='packagesFilters']/div[6]/h5")
	public WebElement sightseeingFilter;

	@FindBy(how = How.XPATH, using = "//*[@id='packagesFilters']/div[7]/h5")
	public WebElement citiesRegions;

	@FindBy(how = How.XPATH, using = "//*[@id='packagesFilters']/div[8]/h5")
	public WebElement hotelsFilter;

	@FindBy(how = How.XPATH, using = "//*[@id='packagesFilters']/div[9]/h5")
	public WebElement cityAndHotel;

	@FindBy(how = How.XPATH, using = "//*[contains(@for,'any')]/span[1]")
	public WebElement anyCheckBox;

	public void selectAnyCheckBox() {
		this.anyCheckBox.click();
	}

	public void deselectAnyCheckBox() {
		this.anyCheckBox.click();
	}

	@FindBy(how = How.XPATH, using = "//*[contains(@for,'any')]/span[2]")
	public WebElement anyText;

	public String getanyText() {
		return this.anyText.getText();
	}

	@FindBy(how = How.XPATH, using = "//*[contains(@for,'any')]/span[3]")
	public WebElement anyTotalPkg;

	public int anyTotalpkg() {
		int tot = Integer.parseInt(this.anyTotalPkg.getText().trim()
				.replaceAll("\\W", ""));
		return tot;
	}

	public void anyTotalPkg() {
		Assert.assertEquals(this.numberOfFilteredPackages(), this.anyTotalpkg());
		if (this.anyTotalpkg() == this.totalNumberOfPackages()) {
			this.deselectAnyCheckBox();
		} else {
			this.resetFilter();
		}
	}

	@FindBy(how = How.XPATH, using = "//*[@id='weekend-holidays']/following-sibling::label/span[1]")
	public WebElement weekendHolidaysCheckBox;

	public void selectWeekendHolidays() {
		this.weekendHolidaysCheckBox.click();
	}

	public void deselectWeekendHolidays() {
		this.weekendHolidaysCheckBox.click();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='weekend-holidays']/following-sibling::label/span[2]")
	public WebElement weekendHolidaysText;

	public String getweekendHolidaysText() {
		return this.weekendHolidaysText.getText();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='weekend-holidays']/following-sibling::label/span[3]")
	public WebElement weekendHolidaysTotlaPkg;

	public int weekendHolidaysTotlapkg() {
		int tot = Integer.parseInt(this.weekendHolidaysTotlaPkg.getText()
				.trim().replaceAll("\\W", ""));
		return tot;
	}

	public void weekendHolidaysTotlaPkg() {
		Assert.assertEquals(this.numberOfFilteredPackages(),
				this.weekendHolidaysTotlapkg());
		if (this.weekendHolidaysTotlapkg() == this.totalNumberOfPackages()) {
			this.deselectWeekendHolidays();
		} else {
			this.resetFilter();
		}
	}

	@FindBy(how = How.XPATH, using = "//*[@id='short-holidays']/following-sibling::label/span[1]")
	public WebElement shortHolidayCheckBox;

	public void selectShortHoliday() {
		this.shortHolidayCheckBox.click();
	}

	public void deselectShortHoliday() {
		this.shortHolidayCheckBox.click();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='short-holidays']/following-sibling::label/span[2]")
	public WebElement ShortHolidayText;

	public String getShortHolidayText() {
		return this.ShortHolidayText.getText();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='short-holidays']/following-sibling::label/span[3]")
	public WebElement ShortHolidayTotalPkg;

	public int ShortHolidayTotalpkg() {
		int tot = Integer.parseInt(this.ShortHolidayTotalPkg.getText().trim()
				.replaceAll("\\W", ""));
		return tot;
	}

	public void getShortHolidayTotalPkg() {
		Assert.assertEquals(this.numberOfFilteredPackages(),
				this.ShortHolidayTotalpkg());
		if (this.ShortHolidayTotalpkg() == this.totalNumberOfPackages()) {
			this.deselectShortHoliday();
		} else {
			this.resetFilter();
		}
	}

	@FindBy(how = How.XPATH, using = "//*[@id='long-holidays']/following-sibling::label/span[1]")
	public WebElement longHolidayCheckBox;

	public void selectLongHoliday() {
		this.longHolidayCheckBox.click();
	}

	public void deselectLongHoliday() {
		this.longHolidayCheckBox.click();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='long-holidays']/following-sibling::label/span[2]")
	public WebElement longHolidayText;

	public String getlongHolidayText() {
		return this.longHolidayText.getText();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='long-holidays']/following-sibling::label/span[3]")
	public WebElement longHolidayTotlaPkg;

	public int longHolidayTotlapkg() {
		int tot = Integer.parseInt(this.longHolidayTotlaPkg.getText().trim()
				.replaceAll("\\W", ""));
		return tot;
	}

	public void getlongHolidayTotlaPkg() {
		Assert.assertEquals(this.numberOfFilteredPackages(),
				this.longHolidayTotlapkg());
		if (this.longHolidayTotlapkg() == this.totalNumberOfPackages()) {
			this.deselectLongHoliday();
		} else {
			this.resetFilter();
		}
	}

	@FindBy(how = How.XPATH, using = "//*[@id='with-flight']/following-sibling::label/span[1]")
	public WebElement withFlightsCheckBox;

	public void selectWithFlights() {
		this.withFlightsCheckBox.click();
	}

	public void deselectWithFlights() {
		this.withFlightsCheckBox.click();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='with-flight']/following-sibling::label/span[2]")
	public WebElement withFlightsText;

	public String getwithFlightsText() {
		return this.withFlightsText.getText();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='with-flight']/following-sibling::label/span[3]")
	public WebElement withFlightsTotalPkg;

	public int withFlightsTotalpkg() {
		int tot = Integer.parseInt(this.withFlightsTotalPkg.getText().trim()
				.replaceAll("\\W", ""));
		return tot;
	}

	public void getwithFlightsTotalPkg() {
		Assert.assertEquals(this.numberOfFilteredPackages(),
				this.withFlightsTotalpkg());
		if (this.withFlightsTotalpkg() == this.totalNumberOfPackages()) {
			this.deselectWithFlights();
		} else {
			this.resetFilter();
		}
	}

	@FindBy(how = How.XPATH, using = "//*[@id='without-flight']/following-sibling::label/span[1]")
	public WebElement withoutFlightCheckBox;

	public void selectWithoutFlight() {
		this.withoutFlightCheckBox.click();
	}

	public void deselectWithoutFlight() {
		this.withoutFlightCheckBox.click();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='without-flight']/following-sibling::label/span[2]")
	public WebElement withoutFlightText;

	public String getwithoutFlightText() {
		return this.withoutFlightText.getText();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='without-flight']/following-sibling::label/span[3]")
	public WebElement withoutFlightTotalPkg;

	public int withoutFlightTotalpkg() {
		int tot = Integer.parseInt(this.withoutFlightTotalPkg.getText().trim()
				.replaceAll("\\W", ""));
		return tot;
	}

	public void getwithoutFlightTotalPkg() {
		Assert.assertEquals(this.numberOfFilteredPackages(),
				this.withoutFlightTotalpkg());
		if (this.withoutFlightTotalpkg() == this.totalNumberOfPackages()) {
			this.deselectWithoutFlight();
		} else {
			this.resetFilter();
		}
	}

	@FindBy(how = How.XPATH, using = "//*[@id='with-transfers']/following-sibling::label/span[1]")
	public WebElement withTransferCheckBox;

	public void selectWithTransfer() {
		this.withTransferCheckBox.click();
	}

	public void deselectWithTransfer() {
		this.withTransferCheckBox.click();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='with-transfers']/following-sibling::label/span[2]")
	public WebElement withTransferText;

	public String getwithTransferText() {
		return this.withTransferText.getText();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='with-transfers']/following-sibling::label/span[3]")
	public WebElement withTransferTotalPkg;

	public int withTransferTotalpkg() {
		int tot = Integer.parseInt(this.withTransferTotalPkg.getText().trim()
				.replaceAll("\\W", ""));
		return tot;
	}

	public void withTransferTotalPkg() {
		Assert.assertEquals(this.numberOfFilteredPackages(),
				this.withTransferTotalpkg());
		if (this.withTransferTotalpkg() == this.totalNumberOfPackages()) {
			this.deselectWithTransfer();
		} else {
			this.resetFilter();
		}
	}

	@FindBy(how = How.XPATH, using = "//*[@id='without-transfers']/following-sibling::label/span[1]")
	public WebElement withoutTransferCheckBox;

	public void selectWithoutTransfer() {
		this.withoutTransferCheckBox.click();
	}

	public void deselectWithoutTransfer() {
		this.withoutTransferCheckBox.click();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='without-transfers']/following-sibling::label/span[2]")
	public WebElement withoutTransferText;

	public String getwithoutTransferText() {
		return this.withoutTransferText.getText();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='without-transfers']/following-sibling::label/span[3]")
	public WebElement withoutTransferTotalPkg;

	public int withoutTransferTotalpkg() {
		int tot = Integer.parseInt(this.withoutTransferTotalPkg.getText()
				.trim().replaceAll("\\W", ""));
		return tot;
	}

	public void withoutTransferTotalPkg() {
		Assert.assertEquals(this.numberOfFilteredPackages(),
				this.withoutTransferTotalpkg());
		if (this.withoutTransferTotalpkg() == this.totalNumberOfPackages()) {
			this.deselectWithoutTransfer();
		} else {
			this.resetFilter();
		}
	}

	@FindBy(how = How.XPATH, using = "//*[@id='with-sightseeing']/following-sibling::label/span[1]")
	public WebElement withsightseeingCheckBox;

	public void selectWithsightseeing() {
		this.withsightseeingCheckBox.click();
	}

	public void deselectWithsightseeing() {
		this.withsightseeingCheckBox.click();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='with-sightseeing']/following-sibling::label/span[2]")
	public WebElement withsightseeingText;

	public String getwithsightseeingText() {
		return this.withsightseeingText.getText();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='with-sightseeing']/following-sibling::label/span[3]")
	public WebElement withsightseeingTotalPkg;

	public int withsightseeingTotalpkg() {
		int tot = Integer.parseInt(this.withsightseeingTotalPkg.getText()
				.trim().replaceAll("\\W", ""));
		return tot;
	}

	public void withsightseeingTotalPkg() {
		Assert.assertEquals(this.numberOfFilteredPackages(),
				this.withsightseeingTotalpkg());
		if (this.withsightseeingTotalpkg() == this.totalNumberOfPackages()) {
			this.deselectWithsightseeing();
		} else {
			this.resetFilter();
		}
	}

	@FindBy(how = How.XPATH, using = "//*[@id='without-sightseeing']/following-sibling::label/span[1]")
	public WebElement withoutsightseeingCheckBox;

	public void selectwithoutsightseeing() {
		this.withoutsightseeingCheckBox.click();
	}

	public void deselectwithoutsightseeing() {
		this.withoutsightseeingCheckBox.click();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='without-sightseeing']/following-sibling::label/span[2]")
	public WebElement withoutsightseeingText;

	public String getwithoutsightseeingText() {
		return this.withoutsightseeingText.getText();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='without-sightseeing']/following-sibling::label/span[3]")
	public WebElement withoutsightseeingTotalPkg;

	public int withoutsightseeingTotalpkg() {
		int tot = Integer.parseInt(this.withoutsightseeingTotalPkg.getText()
				.trim().replaceAll("\\W", ""));
		return tot;
	}

	public void withoutsightseeingTotalPkg() {
		Assert.assertEquals(this.numberOfFilteredPackages(),
				this.withoutsightseeingTotalpkg());
		if (this.withoutsightseeingTotalpkg() == this.totalNumberOfPackages()) {
			this.deselectwithoutsightseeing();
		} else {
			this.resetFilter();
		}
	}

	@FindBy(how = How.XPATH, using = "//*[@id='Inside Cabin']/following-sibling::label/span[1]")
	public WebElement insideCabinCheckBox;

	public void selectinsideCabin() {
		this.insideCabinCheckBox.click();
	}

	public void deselectinsideCabin() {
		this.insideCabinCheckBox.click();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='Inside Cabin']/following-sibling::label/span[2]")
	public WebElement insideCabinText;

	public String getinsideCabinText() {
		return this.insideCabinText.getText();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='Inside Cabin']/following-sibling::label/span[3]")
	public WebElement insideCabinTotalPkg;

	public int insdeCabinTotalpkg() {
		int tot = Integer.parseInt(this.insideCabinTotalPkg.getText().trim()
				.replaceAll("\\W", ""));
		return tot;
	}

	public void insideCabinTotalPkg() {
		Assert.assertEquals(this.numberOfFilteredPackages(),
				this.insdeCabinTotalpkg());
		if (this.insdeCabinTotalpkg() == this.totalNumberOfPackages()) {
			this.deselectinsideCabin();
		} else {
			this.resetFilter();
		}
	}

	@FindBy(how = How.XPATH, using = "//*[@id='Deluxe Ocean View Cabin']/following-sibling::label/span[1]")
	public WebElement dovcCabinCheckBox;

	public void selectDovcCabin() {
		this.dovcCabinCheckBox.click();
	}

	public void deselectDovcCabin() {
		this.dovcCabinCheckBox.click();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='Deluxe Ocean View Cabin']/following-sibling::label/span[2]")
	public WebElement DOVCcabinText;

	public String getDOVCcabinText() {
		return this.DOVCcabinText.getText();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='Deluxe Ocean View Cabin']/following-sibling::label/span[3]")
	public WebElement dovcCabinTotalPkg;

	public int dovCabinTotalpkg() {
		int tot = Integer.parseInt(this.dovcCabinTotalPkg.getText().trim()
				.replaceAll("\\W", ""));
		return tot;
	}

	public void dOVCcabinTotalPkg() {
		Assert.assertEquals(this.numberOfFilteredPackages(),
				this.dovCabinTotalpkg());
		if (this.dovCabinTotalpkg() == this.totalNumberOfPackages()) {
			this.deselectDovcCabin();
		} else {
			this.resetFilter();
		}
	}

	@FindBy(how = How.XPATH, using = "//*[@id='Outside/Ocean View Cabin']/following-sibling::label/span[1]")
	public WebElement oovcCabinCheckBox;

	public void selectoovcCabin() {
		this.oovcCabinCheckBox.click();
	}

	public void deselectoovcCabin() {
		this.oovcCabinCheckBox.click();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='Outside/Ocean View Cabin']/following-sibling::label/span[2]")
	public WebElement OOVCcabinText;

	public String getOOVCcabinText() {
		return this.OOVCcabinText.getText();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='Outside/Ocean View Cabin']/following-sibling::label/span[3]")
	public WebElement OOVCcabinTotalPkg;

	public int OOVCcabinTotalpkg() {
		int tot = Integer.parseInt(this.OOVCcabinTotalPkg.getText().trim()
				.replaceAll("\\W", ""));
		return tot;
	}

	public void oOVCcabinTotalPkg() {
		Assert.assertEquals(this.numberOfFilteredPackages(),
				this.OOVCcabinTotalpkg());
		if (this.OOVCcabinTotalpkg() == this.totalNumberOfPackages()) {
			this.deselectoovcCabin();
		} else {
			this.resetFilter();
		}
	}

	@FindBy(how = How.CSS, using = ".row.list")
	public WebElement getTotalPackage;

	@FindBy(how = How.XPATH, using = "//*[@id='show-all']")
	public WebElement showAll;

	public void resetFilter() {
		if (showAll.isDisplayed()) {
			this.showAll.click();
		}
	}

	public boolean isDisplayedResetFilter() {
		return this.showAll.isDisplayed();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='modalPanel']//button")
	public WebElement sendEnquirySuccessAlert;

	public void closeEnquirySubmittedSuccessfully() {
		this.sendEnquirySuccessAlert.click();
	}

}