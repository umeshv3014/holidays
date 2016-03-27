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
	
	@FindBy(how = How.XPATH, using=".//*[@id='packagesFilters']//strong[2]/span")
	public WebElement totalPackages;
	
	public int totalNumberOfPackages(){
		String total = this.totalPackages.getText();
		int tot = Integer.parseInt(total);
		return tot;
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

	public void getStandardText() {
		this.standardText.getText();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='Standard']/following-sibling::label/span[3]")
	public WebElement standardTotalpkg;

	public int getTotalStandartdpkg() {
		String total = this.standardTotalpkg.getText();
		String trimto = total.trim().replaceAll("\\W", "");
		int tot = Integer.parseInt(trimto);
		int totalpk = this.numberOfFilteredPackages();
		Assert.assertEquals(totalpk, tot);
		if(tot == this.totalNumberOfPackages()){
			this.deselectStandard();
		}else{
			this.resetFilter();
		}
		return tot;
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

	public int getTotalStar_2() {
		String total = this.star2Total.getText();
		String trimto = total.trim().replaceAll("\\W", "");
		int tot = Integer.parseInt(trimto);
		int totalpk = this.numberOfFilteredPackages();
		Assert.assertEquals(totalpk, tot);
		if(tot == this.totalNumberOfPackages()){
			this.deselect_2_star();
		}else{
			this.resetFilter();
		}
		return tot;
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

	public int get3StarTotal() {
		String total = this.star3Total.getText();
		String trimto = total.trim().replaceAll("\\W", "");
		int tot = Integer.parseInt(trimto);
		int totalpk = this.numberOfFilteredPackages();
		Assert.assertEquals(totalpk, tot);
		if(tot == this.totalNumberOfPackages()){
			this.deselect3Star();
		}else{
			this.resetFilter();
		}
		return tot;
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

	public int get4StarTotal() {
		String total = this.star4Total.getText();
		String trimto = total.trim().replaceAll("\\W", "");
		int tot = Integer.parseInt(trimto);
		int totalpk = this.numberOfFilteredPackages();
		Assert.assertEquals(totalpk, tot);
		if(tot == this.totalNumberOfPackages()){
			this.deselect4Star();
		}else{
			this.resetFilter();
		}
		return tot;
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

	public int get5StarTotal() {
		String total = this.star5Total.getText();
		String trimto = total.trim().replaceAll("\\W", "");
		int tot = Integer.parseInt(trimto);
		int totalpk = this.numberOfFilteredPackages();
		Assert.assertEquals(totalpk, tot);
		if(tot == this.totalNumberOfPackages()){
			this.deselect5Star();
		}else{
			this.resetFilter();
		}
		return tot;
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

	public int getbudgetTotlaPkg() {
		String total = this.budgetTotlaPkg.getText();
		String trimto = total.trim().replaceAll("\\W", "");
		int tot = Integer.parseInt(trimto);
		int totalpk = this.numberOfFilteredPackages();
		Assert.assertEquals(totalpk, tot);
		if(tot == this.totalNumberOfPackages()){
			this.deselectBudget();
		}else{
			this.resetFilter();
		}
		return tot;
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

	public int getstarTotalPkg() {
		String total = this.starTotalPkg.getText();
		String trimto = total.trim().replaceAll("\\W", "");
		int tot = Integer.parseInt(trimto);
		int totalpk = this.numberOfFilteredPackages();
		Assert.assertEquals(totalpk, tot);
		if(tot == this.totalNumberOfPackages()){
			this.deselectStar();
		}else{
			this.resetFilter();
		}
		return tot;
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

	public int getluxuryTotalPkg() {
		String total = this.luxuryTotalPkg.getText();
		String trimto = total.trim().replaceAll("\\W", "");
		int tot = Integer.parseInt(trimto);
		int totalpk = this.numberOfFilteredPackages();
		Assert.assertEquals(totalpk, tot);
		if(tot == this.totalNumberOfPackages()){
			this.deselectLuxury();
		}else{
			this.resetFilter();
		}
		return tot;
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

	public int getsuperLuxuryTotalPkg() {
		String total = this.superLuxuryTotalPkg.getText();
		String trimto = total.trim().replaceAll("\\W", "");
		int tot = Integer.parseInt(trimto);
		int totalpk = this.numberOfFilteredPackages();
		Assert.assertEquals(totalpk, tot);
		if(tot == this.totalNumberOfPackages()){
			this.deselectSuperLuxury();
		}else{
			this.resetFilter();
		}
		return tot;
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

	public int getdeluxeTotlaPkg() {
		String total = this.deluxeTotlaPkg.getText();
		String trimto = total.trim().replaceAll("\\W", "");
		int tot = Integer.parseInt(trimto);
		int totalpk = this.numberOfFilteredPackages();
		Assert.assertEquals(totalpk, tot);
		if(tot == this.totalNumberOfPackages()){
			this.deselectdeluxe();
		}else{
			this.resetFilter();
		}
		return tot;
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

	public int getSuperDeluxeTotlaPkg() {
		String total = this.superDeluxeTotlaPkg.getText();
		String trimto = total.trim().replaceAll("\\W", "");
		int tot = Integer.parseInt(trimto);
		int totalpk = this.numberOfFilteredPackages();
		Assert.assertEquals(totalpk, tot);
		if(tot == this.totalNumberOfPackages()){
			this.deselectSuperDeluxe();
		}else{
			this.resetFilter();
		}
		return tot;
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
	
	public void selectAnyCheckBox(){
		this.anyCheckBox.click();
	}
	
	public void deselectAnyCheckBox(){
		this.anyCheckBox.click();
	}

	@FindBy(how = How.XPATH, using = "//*[contains(@for,'any')]/span[2]")
	public WebElement anyText;

	public String getanyText() {
		return this.anyText.getText();
	}

	@FindBy(how = How.XPATH, using = "//*[contains(@for,'any')]/span[3]")
	public WebElement anyTotalPkg;

	public int getanyTotalPkg() {
		String total = this.anyTotalPkg.getText();
		String trimto = total.trim().replaceAll("\\W", "");
		int tot = Integer.parseInt(trimto);
		int totalpk = this.numberOfFilteredPackages();
		Assert.assertEquals(totalpk, tot);
		if(tot == this.totalNumberOfPackages()){
			this.deselectAnyCheckBox();
		}else{
			this.resetFilter();
		}
		return tot;
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

	public int getweekendHolidaysTotlaPkg() {
		int tot = Integer.parseInt(this.weekendHolidaysTotlaPkg.getText()
				.trim().replaceAll("\\W", ""));
		int totalpk = this.numberOfFilteredPackages();
		Assert.assertEquals(totalpk, tot);
		if(tot == this.totalNumberOfPackages()){
			this.deselectWeekendHolidays();
		}else{
			this.resetFilter();
		}
		return tot;
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

	public int getShortHolidayTotalPkg() {
		String total = this.ShortHolidayTotalPkg.getText();
		String trimto = total.trim().replaceAll("\\W", "");
		int tot = Integer.parseInt(trimto);
		int totalpk = this.numberOfFilteredPackages();
		Assert.assertEquals(totalpk, tot);
		if(tot == this.totalNumberOfPackages()){
			this.deselectShortHoliday();
		}else{
			this.resetFilter();
		}
		return tot;
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

	public int getlongHolidayTotlaPkg() {
		String total = this.longHolidayTotlaPkg.getText();
		String trimto = total.trim().replaceAll("\\W", "");
		int tot = Integer.parseInt(trimto);
		Assert.assertEquals(this.numberOfFilteredPackages(), tot);
		if(tot == this.totalNumberOfPackages()){
			this.deselectLongHoliday();
		}else{
			this.resetFilter();
		}
		return tot;
	}

	@FindBy(how = How.XPATH, using = "//*[@id='with-flight']/following-sibling::label/span[1]")
	public WebElement withFlightsCheckBox;

	public void selectWithFlights() {
		this.withFlightsCheckBox.click();
	}
	
	public void deselectWithFlights(){
		this.withFlightsCheckBox.click();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='with-flight']/following-sibling::label/span[2]")
	public WebElement withFlightsText;

	public String getwithFlightsText() {
		return this.withFlightsText.getText();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='with-flight']/following-sibling::label/span[3]")
	public WebElement withFlightsTotalPkg;

	public int getwithFlightsTotalPkg() {
		String total = this.withFlightsTotalPkg.getText();
		String trimto = total.trim().replaceAll("\\W", "");
		int tot = Integer.parseInt(trimto);
		int totalpk = this.numberOfFilteredPackages();
		Assert.assertEquals(totalpk, tot);
		if(tot == this.totalNumberOfPackages()){
			this.deselectWithFlights();
		}else{
			this.resetFilter();
		}
		return tot;
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

	public int getwithoutFlightTotalPkg() {
		String total = this.withoutFlightTotalPkg.getText();
		String trimto = total.trim().replaceAll("\\W", "");
		int tot = Integer.parseInt(trimto);
		int totalpk = this.numberOfFilteredPackages();
		Assert.assertEquals(totalpk, tot);
		if(tot == this.totalNumberOfPackages()){
			this.deselectWithoutFlight();
		}else{
			this.resetFilter();
		}
		return tot;
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

	public int getwithTransferTotalPkg() {
		String total = this.withTransferTotalPkg.getText();
		String trimto = total.trim().replaceAll("\\W", "");
		int tot = Integer.parseInt(trimto);
		int totalpk = this.numberOfFilteredPackages();
		Assert.assertEquals(totalpk, tot);
		if(tot == this.totalNumberOfPackages()){
			this.deselectWithTransfer();
		}else{
			this.resetFilter();
		}
		return tot;
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

	public int getwithoutTransferTotalPkg() {
		String total = this.withoutTransferTotalPkg.getText();
		String trimto = total.trim().replaceAll("\\W", "");
		int tot = Integer.parseInt(trimto);
		int totalpk = this.numberOfFilteredPackages();
		Assert.assertEquals(totalpk, tot);
		if(tot == this.totalNumberOfPackages()){
			this.deselectWithoutTransfer();
		}else{
			this.resetFilter();
		}
		return tot;
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

	public int getwithsightseeingTotalPkg() {
		String total = this.withsightseeingTotalPkg.getText();
		String trimto = total.trim().replaceAll("\\W", "");
		int tot = Integer.parseInt(trimto);
		int totalpk = this.numberOfFilteredPackages();
		Assert.assertEquals(totalpk, tot);
		if(tot == this.totalNumberOfPackages()){
			this.deselectWithsightseeing();
		}else{
			this.resetFilter();
		}
		return tot;
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

	public int getwithoutsightseeingTotalPkg() {
		String total = this.withoutsightseeingTotalPkg.getText();
		String trimto = total.trim().replaceAll("\\W", "");
		int tot = Integer.parseInt(trimto);
		int totalpk = this.numberOfFilteredPackages();
		Assert.assertEquals(totalpk, tot);
		if(tot == this.totalNumberOfPackages()){
			this.deselectwithoutsightseeing();
		}else{
			this.resetFilter();
		}
		return tot;
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

	public int getinsideCabinTotalPkg() {
		String total = this.insideCabinTotalPkg.getText();
		String trimto = total.trim().replaceAll("\\W", "");
		int tot = Integer.parseInt(trimto);
		int totalpk = this.numberOfFilteredPackages();
		Assert.assertEquals(totalpk, tot);
		if(tot == this.totalNumberOfPackages()){
			this.deselectinsideCabin();
		}else{
			this.resetFilter();
		}
		return tot;
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

	public int getDOVCcabinTotalPkg() {
		String total = this.dovcCabinTotalPkg.getText();
		String trimto = total.trim().replaceAll("\\W", "");
		int tot = Integer.parseInt(trimto);
		int totalpk = this.numberOfFilteredPackages();
		Assert.assertEquals(totalpk, tot);
		if(tot == this.totalNumberOfPackages()){
			this.deselectDovcCabin();
		}else{
			this.resetFilter();
		}
		return tot;
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

	public int getOOVCcabinTotalPkg() {
		String total = this.OOVCcabinTotalPkg.getText();
		String trimto = total.trim().replaceAll("\\W", "");
		int tot = Integer.parseInt(trimto);
		int totalpk = this.numberOfFilteredPackages();
		Assert.assertEquals(totalpk, tot);
		if(tot == this.totalNumberOfPackages()){
			this.deselectoovcCabin();
		}else{
			this.resetFilter();
		}
		return tot;
	}

	@FindBy(how = How.CSS, using = ".row.list")
	public WebElement getTotalPackage;

	@FindBy(how = How.XPATH, using = "//*[@id='show-all']")
	public WebElement showAll;

	public void resetFilter() {
		if(showAll.isDisplayed()){
			this.showAll.click();
		}
	}

	public boolean isDisplayedResetFilter() {
		return this.showAll.isDisplayed();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='modalPanel']//button")
	public WebElement SendEnquirySuccessAlert;

}