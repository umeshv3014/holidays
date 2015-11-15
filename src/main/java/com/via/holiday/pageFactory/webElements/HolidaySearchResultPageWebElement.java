package com.via.holiday.pageFactory.webElements;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

	@FindBy(xpath = "//span[contains(text(),'Holidays')]")
	public WebElement backToHolidayHomepage;

	@FindBy(xpath = "//*[@id='packagesResults']//button[contains(text(),'BOOK NOW')]")
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

	@FindBy(how = How.CSS, using = ".row.list")
	public List<WebElement> nuOfPackages;

	@FindBy(how = How.XPATH, using = "//*[@id='packagesResults']//button[contains(text(),'BOOK NOW')]")
	public List<WebElement> nuOfbookableHolidays;

	@FindBy(how = How.XPATH, using = "//*[@id='packagesResults']//button[contains(text(),'SEND ENQUIRY')]")
	public List<WebElement> nuOfSendEnquiry;

	@FindBy(how = How.XPATH, using = "//*[@id='packagesResults']//button[contains(text(),'SEND ENQUIRY')]")
	public WebElement sendEnquiryButton;

	@FindBy(how = How.XPATH, using = "//*[@id='packagesResults']//img[@class='fullWidth']")
	public List<WebElement> thumbImg;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Modify Search')]")
	public WebElement modifySearch;

	@FindBy(how = How.XPATH, using = "//*[@id='Standard']/following-sibling::label/span[1]")
	public WebElement standardCheckBox;

	@FindBy(how = How.XPATH, using = "//*[@id='Standard']/following-sibling::label/span[2]")
	public WebElement standardText;
	
	@FindBy(how = How.XPATH, using = "//*[@id='Standard']/following-sibling::label/span[3]")
	public WebElement standardTotalpkg;

	@FindBy(how = How.XPATH, using = "//*[@id='2 Star']/following-sibling::label/span[1]")
	public WebElement star2CheckBox;

	@FindBy(how = How.XPATH, using = "//*[@id='2 Star']/following-sibling::label/span[2]")
	public WebElement star2Text;

	@FindBy(how = How.XPATH, using = "//*[@id='2 Star']/following-sibling::label/span[3]")
	public WebElement star2Total;

	@FindBy(how = How.XPATH, using = "//*[@id='3 Star']/following-sibling::label/span[1]")
	public WebElement star3CheckBox;

	@FindBy(how = How.XPATH, using = "//*[@id='3 Star']/following-sibling::label/span[2]")
	public WebElement star3Text;

	@FindBy(how = How.XPATH, using = "//*[@id='3 Star']/following-sibling::label/span[3]")
	public WebElement star3Total;

	@FindBy(how = How.XPATH, using = "//*[@id='4 Star']/following-sibling::label/span[1]")
	public WebElement star4CheckBox;

	@FindBy(how = How.XPATH, using = "//*[@id='4 Star']/following-sibling::label/span[2]")
	public WebElement star4Text;

	@FindBy(how = How.XPATH, using = "//*[@id='4 Star']/following-sibling::label/span[3]")
	public WebElement star4Total;

	@FindBy(how = How.XPATH, using = "//*[@id='5 Star']/following-sibling::label/span[1]")
	public WebElement star5CheckBox;

	@FindBy(how = How.XPATH, using = "//*[@id='5 Star']/following-sibling::label/span[2]")
	public WebElement star5Text;

	@FindBy(how = How.XPATH, using = "//*[@id='5 Star']/following-sibling::label/span[3]")
	public WebElement star5Total;

	@FindBy(how = How.XPATH, using = "//*[@id='packagesFilters']/div[2]//span[2]")
	public List<WebElement> starRatingText;

	@FindBy(how = How.XPATH, using = "//*[@id='packagesFilters']/div[2]//span[2]")
	public WebElement starRatingTexts;

	@FindBy(how = How.XPATH, using = "//*[@id='packagesFilters']/div[3]//span[2]")
	public List<WebElement> goingForText;

	@FindBy(how = How.XPATH, using = "//*[@id='packagesFilters']/div[3]//span[2]")
	public WebElement goingForTexts;

	@FindBy(how = How.XPATH, using = "//*[@id='packagesFilters']/div[4]//span[2]")
	public List<WebElement> flightText;

	@FindBy(how = How.XPATH, using = "//*[@id='packagesFilters']/div[4]//span[2]")
	public WebElement flightTexts;

	@FindBy(how = How.XPATH, using = "//*[@id='packagesFilters']/div[5]//span[2]")
	public List<WebElement> transferText;

	@FindBy(how = How.XPATH, using = "//*[@id='packagesFilters']/div[5]//span[2]")
	public WebElement transferTexts;

	@FindBy(how = How.XPATH, using = "//*[@id='packagesFilters']/div[6]//span[2]")
	public List<WebElement> sightseeingText;

	@FindBy(how = How.XPATH, using = "//*[@id='packagesFilters']/div[6]//span[2]")
	public WebElement sightseeingTexts;

	@FindBy(how = How.XPATH, using = "//*[@id='Budget']/following-sibling::label/span[1]")
	public WebElement budgetcheckBox;

	@FindBy(how = How.XPATH, using = "//*[@id='Budget']/following-sibling::label/span[2]")
	public WebElement budgetText;

	@FindBy(how = How.XPATH, using = "//*[@id='Budget']/following-sibling::label/span[3]")
	public WebElement budgetTotlaPkg;

	@FindBy(how = How.XPATH, using = "//*[@id='Star']/following-sibling::label/span[1]")
	public WebElement starCheckBox;

	@FindBy(how = How.XPATH, using = "//*[@id='Star']/following-sibling::label/span[2]")
	public WebElement starText;

	@FindBy(how = How.XPATH, using = "//*[@id='Star']/following-sibling::label/span[3]")
	public WebElement starTotalPkg;

	@FindBy(how = How.XPATH, using = "//*[@id='Luxury']/following-sibling::label/span[1]")
	public WebElement luxuryCheckBox;

	@FindBy(how = How.XPATH, using = "//*[@id='Luxury']/following-sibling::label/span[2]")
	public WebElement luxuryText;

	@FindBy(how = How.XPATH, using = "//*[@id='Luxury']/following-sibling::label/span[3]")
	public WebElement luxuryTotalPkg;
	
	@FindBy(how = How.XPATH, using = "//*[@id='Super Luxury']/following-sibling::label/span[1]")
	public WebElement superLuxuryCheckBox;

	@FindBy(how = How.XPATH, using = "//*[@id='Super Luxury']/following-sibling::label/span[2]")
	public WebElement superLuxuryText;

	@FindBy(how = How.XPATH, using = "//*[@id='Super Luxury']/following-sibling::label/span[3]")
	public WebElement superLuxuryTotalPkg;
	
	@FindBy(how = How.XPATH, using = "//*[@id='Deluxe']/following-sibling::label/span[1]")
	public WebElement deluxeCheckBox;

	@FindBy(how = How.XPATH, using = "//*[@id='Deluxe']/following-sibling::label/span[2]")
	public WebElement deluxeText;

	@FindBy(how = How.XPATH, using = "//*[@id='Deluxe']/following-sibling::label/span[3]")
	public WebElement deluxeTotlaPkg;
	
	@FindBy(how = How.XPATH, using = "//*[@id='Super Deluxe']/following-sibling::label/span[1]")
	public WebElement superDeluxeCheckBox;

	@FindBy(how = How.XPATH, using = "//*[@id='Super Deluxe']/following-sibling::label/span[2]")
	public WebElement superDeluxeText;

	@FindBy(how = How.XPATH, using = "//*[@id='Super Deluxe']/following-sibling::label/span[3]")
	public WebElement superDeluxeTotlaPkg;
	
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

	@FindBy(how = How.XPATH, using = "//*[@id='weekend-holidays']/following-sibling::label/span[1]")
	public WebElement weekendHolidaysCheckBox;

	@FindBy(how = How.XPATH, using = "//*[@id='weekend-holidays']/following-sibling::label/span[2]")
	public WebElement weekendHolidaysText;

	@FindBy(how = How.XPATH, using = "//*[@id='weekend-holidays']/following-sibling::label/span[3]")
	public WebElement weekendHolidaysTotlaPkg;

	@FindBy(how = How.XPATH, using = "//*[@id='short-holidays']/following-sibling::label/span[1]")
	public WebElement ShortHolidayCheckBox;

	@FindBy(how = How.XPATH, using = "//*[@id='short-holidays']/following-sibling::label/span[2]")
	public WebElement ShortHolidayText;

	@FindBy(how = How.XPATH, using = "//*[@id='short-holidays']/following-sibling::label/span[3]")
	public WebElement ShortHolidayTotalPkg;

	@FindBy(how = How.XPATH, using = "//*[@id='long-holidays']/following-sibling::label/span[1]")
	public WebElement longHolidayCheckBox;

	@FindBy(how = How.XPATH, using = "//*[@id='long-holidays']/following-sibling::label/span[2]")
	public WebElement longHolidayText;

	@FindBy(how = How.XPATH, using = "//*[@id='long-holidays']/following-sibling::label/span[3]")
	public WebElement longHolidayTotlaPkg;

	@FindBy(how = How.XPATH, using = "//*[@id='with-flight']/following-sibling::label/span[1]")
	public WebElement withFlightsCheckBox;

	@FindBy(how = How.XPATH, using = "//*[@id='with-flight']/following-sibling::label/span[2]")
	public WebElement withFlightsText;

	@FindBy(how = How.XPATH, using = "//*[@id='with-flight']/following-sibling::label/span[3]")
	public WebElement withFlightsTotalPkg;

	@FindBy(how = How.XPATH, using = "//*[@id='without-flight']/following-sibling::label/span[1]")
	public WebElement withoutFlightCheckBox;

	@FindBy(how = How.XPATH, using = "//*[@id='without-flight']/following-sibling::label/span[2]")
	public WebElement withoutFlightText;

	@FindBy(how = How.XPATH, using = "//*[@id='without-flight']/following-sibling::label/span[3]")
	public WebElement withoutFlightTotalPkg;

	@FindBy(how = How.XPATH, using = "//*[@id='with-transfers']/following-sibling::label/span[1]")
	public WebElement withTransferCheckBox;

	@FindBy(how = How.XPATH, using = "//*[@id='with-transfers']/following-sibling::label/span[2]")
	public WebElement withTransferText;

	@FindBy(how = How.XPATH, using = "//*[@id='with-transfers']/following-sibling::label/span[3]")
	public WebElement withTransferTotalPkg;

	@FindBy(how = How.XPATH, using = "//*[@id='without-transfers']/following-sibling::label/span[1]")
	public WebElement withoutTransferCheckBox;

	@FindBy(how = How.XPATH, using = "//*[@id='without-transfers']/following-sibling::label/span[2]")
	public WebElement withoutTransferText;

	@FindBy(how = How.XPATH, using = "//*[@id='without-transfers']/following-sibling::label/span[3]")
	public WebElement withoutTransferTotalPkg;

	@FindBy(how = How.XPATH, using = "//*[@id='with-sightseeing']/following-sibling::label/span[1]")
	public WebElement withsightseeingCheckBox;

	@FindBy(how = How.XPATH, using = "//*[@id='with-sightseeing']/following-sibling::label/span[2]")
	public WebElement withsightseeingText;

	@FindBy(how = How.XPATH, using = "//*[@id='with-sightseeing']/following-sibling::label/span[3]")
	public WebElement withsightseeingTotalPkg;

	@FindBy(how = How.XPATH, using = "//*[@id='without-sightseeing']/following-sibling::label/span[1]")
	public WebElement withoutsightseeingCheckBox;

	@FindBy(how = How.XPATH, using = "//*[@id='without-sightseeing']/following-sibling::label/span[2]")
	public WebElement withoutsightseeingText;

	@FindBy(how = How.XPATH, using = "//*[@id='without-sightseeing']/following-sibling::label/span[3]")
	public WebElement withoutsightseeingTotalPkg;
	
	@FindBy(how = How.XPATH, using = "//*[@id='Inside Cabin']/following-sibling::label/span[1]")
	public WebElement insideCabinCheckBox;

	@FindBy(how = How.XPATH, using = "//*[@id='Inside Cabin']/following-sibling::label/span[2]")
	public WebElement insideCabinText;

	@FindBy(how = How.XPATH, using = "//*[@id='Inside Cabin']/following-sibling::label/span[3]")
	public WebElement insideCabinTotalPkg;
	
	@FindBy(how = How.XPATH, using = "//*[@id='Deluxe Ocean View Cabin']/following-sibling::label/span[1]")
	public WebElement DOVCcabinCheckBox;

	@FindBy(how = How.XPATH, using = "//*[@id='Deluxe Ocean View Cabin']/following-sibling::label/span[2]")
	public WebElement DOVCcabinText;

	@FindBy(how = How.XPATH, using = "//*[@id='Deluxe Ocean View Cabin']/following-sibling::label/span[3]")
	public WebElement DOVCcabinTotalPkg;
	
	@FindBy(how = How.XPATH, using = "//*[@id='Outside/Ocean View Cabin']/following-sibling::label/span[1]")
	public WebElement OOVCcabinCheckBox;

	@FindBy(how = How.XPATH, using = "//*[@id='Outside/Ocean View Cabin']/following-sibling::label/span[2]")
	public WebElement OOVCcabinText;

	@FindBy(how = How.XPATH, using = "//*[@id='Outside/Ocean View Cabin']/following-sibling::label/span[3]")
	public WebElement OOVCcabinTotalPkg;

	@FindBy(how = How.CSS, using = ".row.list")
	public WebElement getTotalPackage;

	@FindBy(how = How.XPATH, using = "//*[@id='show-all']")
	public WebElement showAll;

}