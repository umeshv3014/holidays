package com.via.holiday.pageFactory.webElements;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HolidaySearchResultPageWebElement {
	WebDriver driver;

	public HolidaySearchResultPageWebElement(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id='packagesResults']//button[contains(text(),'BOOK NOW')]")
	@CacheLookup
	public WebElement getTotalNumberOfBOOKNOW;

	@FindBy(xpath = "//*[@id='hldDealAltForm']//input[@name='mobile']")
	public WebElement mobileNumberSE;

	@FindBy(xpath = "//*[@id='hldDealAltForm']//input[@name='name']")
	public WebElement SHEname;

	@FindBy(xpath = "//*[@id='hldDealAltForm']//input[@name='email']")
	public WebElement SHEemail;

	@FindBy(xpath = "//*[@id='hldDealAltForm']//input[@name='city']")
	public WebElement SHEcity;

	@FindBy(xpath = "//*[@id='hldDealAltForm']//input[@name='duration']")
	public WebElement SHEduration;

	@FindBy(xpath = "//*[@id='hldDealAltForm']//textarea[@name='comments']")
	public WebElement SHEcomments;

	@FindBy(xpath = "//*[@id='modalPanel']//button[contains(text(),'Submit')]")
	public WebElement SHEsubmit;

	@FindBy(xpath = "//*[@id='hldDealAltForm']//input[@name='travel_date']")
	public WebElement SHEdate;

	@FindBy(xpath = "//a[contains(text(),'Close')]")
	public WebElement SHEclanderClose;

	@FindBy(xpath = "//button[contains(text(),'Send Enquiry')]")
	public WebElement SHEbutton;

	@FindBy(xpath = "//*[@id='modalPanel']//button")
	public WebElement SHEsucess;

	@FindBy(how = How.XPATH, using = "//*[@id='packagesResults']/div/div")
	public List<WebElement> nuOfPackages;

	@FindBy(how = How.XPATH, using = "//*[@id='packagesResults']//button[contains(text(),'BOOK NOW')]")
	public List<WebElement> nuOfbookableHolidays;

	@FindBy(how = How.XPATH, using = "//*[@id='packagesResults']//button[contains(text(),'SEND ENQUIRY')]")
	public List<WebElement> nuOfSendEnquiry;

	@FindBy(how = How.XPATH, using = "//*[@id='packagesResults']//img[@class='fullWidth']")
	public List<WebElement> thumbImg;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Modify Search')]")
	public WebElement modifySearch;

	@FindBy(how = How.XPATH, using = "//*[contains(@for,'Standard')]/span[1]")
	public WebElement standardCheckBox;

	@FindBy(how = How.XPATH, using = "//*[contains(@for,'Standard')]/span[2]")
	public WebElement standardText;

	@FindBy(how = How.XPATH, using = "//*[contains(@for,'Standard')]/span[3]")
	public WebElement standardTotalpkg;

	@FindBy(how = How.XPATH, using = "//*[contains(@for,'Budget')]/span[1]")
	public WebElement budgetcheckBox;

	@FindBy(how = How.XPATH, using = "//*[contains(@for,'Budget')]/span[2]")
	public WebElement budgetText;

	@FindBy(how = How.XPATH, using = "//*[contains(@for,'Budget')]/span[3]")
	public WebElement budgetTotlaPkg;

	@FindBy(how = How.XPATH, using = "//*[contains(@for,'Star')]/span[1]")
	public WebElement starTextBox;

	@FindBy(how = How.XPATH, using = "//*[contains(@for,'Star')]/span[2]")
	public WebElement starText;

	@FindBy(how = How.XPATH, using = "//*[contains(@for,'Star')]/span[3]")
	public WebElement starTotalPkg;

	@FindBy(how = How.XPATH, using = "//*[contains(@for,'Luxury')]/span[1]")
	public WebElement luxuryCheckBox;

	@FindBy(how = How.XPATH, using = "//*[contains(@for,'Luxury')]/span[2]")
	public WebElement luxuryText;

	@FindBy(how = How.XPATH, using = "//*[contains(@for,'Luxury')]/span[3]")
	public WebElement luxuryTotalPkg;

	@FindBy(how = How.XPATH, using = "//*[contains(@for,'Deluxe')]/span[1]")
	public WebElement deluxeCheckBox;

	@FindBy(how = How.XPATH, using = "//*[contains(@for,'Deluxe')]/span[2]")
	public WebElement deluxeText;

	@FindBy(how = How.XPATH, using = "//*[contains(@for,'Deluxe')]/span[3]")
	public WebElement deluxeTotlaPkg;

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
	public WebElement anyChecBox;

	@FindBy(how = How.XPATH, using = "//*[contains(@for,'any')]/span[2]")
	public WebElement anyText;

	@FindBy(how = How.XPATH, using = "//*[contains(@for,'any')]/span[3]")
	public WebElement anyTotalPkg;

	@FindBy(how = How.XPATH, using = "//*[contains(@for,'weekend-holidays')]/span[1]")
	public WebElement weekendHolidaysCheckBox;

	@FindBy(how = How.XPATH, using = "//*[contains(@for,'weekend-holidays')]/span[2]")
	public WebElement weekendHolidaysText;

	@FindBy(how = How.XPATH, using = "//*[contains(@for,'weekend-holidays')]/span[3]")
	public WebElement weekendHolidaysTotlaPkg;

	@FindBy(how = How.XPATH, using = "//*[contains(@for,'short-holidays')]/span[1]")
	public WebElement ShortHolidayCheckBox;

	@FindBy(how = How.XPATH, using = "//*[contains(@for,'short-holidays')]/span[2]")
	public WebElement ShortHolidayText;

	@FindBy(how = How.XPATH, using = "//*[contains(@for,'short-holidays')]/span[3]")
	public WebElement ShortHolidayTotalPkg;

	@FindBy(how = How.XPATH, using = "//*[contains(@for,'long-holidays')]/span[1]")
	public WebElement longHolidayCheckBox;

	@FindBy(how = How.XPATH, using = "//*[contains(@for,'long-holidays')]/span[2]")
	public WebElement longHolidayText;

	@FindBy(how = How.XPATH, using = "//*[contains(@for,'long-holidays')]/span[3]")
	public WebElement longHolidayTotlaPkg;

	@FindBy(how = How.XPATH, using = "//*[contains(@for,'with-flight')]/span[1]")
	public WebElement withFlightsCheckBox;

	@FindBy(how = How.XPATH, using = "//*[contains(@for,'with-flight')]/span[2]")
	public WebElement withFlightsText;

	@FindBy(how = How.XPATH, using = "//*[contains(@for,'with-flight')]/span[3]")
	public WebElement withFlightsTotalPkg;

	@FindBy(how = How.XPATH, using = "//*[contains(@for,'without-flight')]/span[1]")
	public WebElement withoutFlightCheckBox;

	@FindBy(how = How.XPATH, using = "//*[contains(@for,'without-flight')]/span[2]")
	public WebElement withoutFlightText;

	@FindBy(how = How.XPATH, using = "//*[contains(@for,'without-flight')]/span[3]")
	public WebElement withoutFlightTotalPkg;

	@FindBy(how = How.XPATH, using = "//*[contains(@for,'with-transfers')]/span[1]")
	public WebElement withTRansferCheckBox;

	@FindBy(how = How.XPATH, using = "//*[contains(@for,'with-transfers')]/span[2]")
	public WebElement withTRansferText;

	@FindBy(how = How.XPATH, using = "//*[contains(@for,'with-transfers')]/span[3]")
	public WebElement withTRansferTotalPkg;

	@FindBy(how = How.XPATH, using = "//*[contains(@for,'without-transfers')]/span[1]")
	public WebElement withoutTransferCheckBox;

	@FindBy(how = How.XPATH, using = "//*[contains(@for,'without-transfers')]/span[2]")
	public WebElement withoutTransferText;

	@FindBy(how = How.XPATH, using = "//*[contains(@for,'without-transfers')]/span[3]")
	public WebElement withoutTransferTotalPkg;

	@FindBy(how = How.XPATH, using = "//*[contains(@for,'with-sightseeing')]/span[1]")
	public WebElement withsightseeingCheckBox;

	@FindBy(how = How.XPATH, using = "//*[contains(@for,'with-sightseeing')]/span[2]")
	public WebElement withsightseeingText;

	@FindBy(how = How.XPATH, using = "//*[contains(@for,'with-sightseeing')]/span[3]")
	public WebElement withsightseeingTotalPkg;

	@FindBy(how = How.XPATH, using = "//*[contains(@for,'without-sightseeing')]/span[1]")
	public WebElement withoutsightseeingCheckBox;

	@FindBy(how = How.XPATH, using = "//*[contains(@for,'without-sightseeing')]/span[2]")
	public WebElement withoutsightseeingText;

	@FindBy(how = How.XPATH, using = "//*[contains(@for,'without-sightseeing')]/span[3]")
	public WebElement withoutsightseeingTotalPkg;
	
	@FindBy(how = How.XPATH, using = "//*[@id='packagesResults']/div/div")
	public WebElement getTotalPackage;


}