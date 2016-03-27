package com.via.holiday.pageFactory.webElements;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HolidayHomePageWebElement {
	WebDriver driver;

	public HolidayHomePageWebElement(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}

	// send your request
	@FindBy(how = How.XPATH, using = ".//*[@id='myFeedbackForm']/div[1]/input")
	public WebElement feedbackName;

	public void getFeedbackName(String name) {
		this.feedbackName.sendKeys(name);
	}

	public void clearFeedbackName() {
		this.feedbackName.clear();
	}

	@FindBy(how = How.XPATH, using = ".//*[@id='myFeedbackForm']/div[2]/input")
	public WebElement feedbackEmail;

	public void getFeedbackEmail(String email) {
		this.feedbackEmail.sendKeys(email);
	}

	public void clearFeedbackEmail() {
		this.feedbackEmail.clear();
	}

	@FindBy(how = How.XPATH, using = ".//*[@id='myFeedbackForm']/div[3]/textarea")
	public WebElement feedbackMsg;

	public void getFeedbackMsg(String msg) {
		this.feedbackMsg.sendKeys(msg);
	}

	public void clearFeedbackMsg() {
		this.feedbackMsg.clear();
	}

	@FindBy(how = How.XPATH, using = ".//*[@id='myFeedbackForm']/div[4]/button")
	public WebElement SYRmsg;

	public void sendFeedBackMsg() {
		this.SYRmsg.click();
	}

	@FindBy(how = How.XPATH, using = ".//*[@id='holidaySearchForm']//label[contains(text(),'Destination')]/following-sibling::input")
	public WebElement destinationTextBox;

	public void holidayDestination(String destination) {
		this.destinationTextBox.sendKeys(destination);
	}
	
	public String holidayDestination() {
		return this.destinationTextBox.getText();
	}

	@FindBy(how = How.XPATH, using = ".//*[@id='holidaySearchForm']//a")
	public WebElement calender;

	public void selectCalender() {
		calender.click();
	}

	@FindBy(how = How.XPATH, using = ".//*[@id='holidaySearchForm']//label[contains(text(),'Rooms (OPTIONAL)')]/following-sibling::input")
	public WebElement roomsOPTIONAL;

	public WebElement selectroomsOPTIONAL() {
		return roomsOPTIONAL;
	}

	@FindBy(how = How.XPATH, using = ".//*[@id='holidaySearchForm']//label[contains(text(),'Departure Date')]/following-sibling::input")
	public WebElement departureDate;

	public WebElement selectDepartureDate() {
		return departureDate;
	}

	@FindBy(how = How.XPATH, using = ".//*[@id='themeType']")
	public WebElement themeType;

	public WebElement selectDuration() {
		return themeType;
	}

	@FindBy(how = How.XPATH, using = ".*//div/strong[contains(text(),'Honeymoon')]")
	public WebElement dropDownCity;

	public WebElement selectDropDownCity() {
		return dropDownCity;
	}

	@FindBy(how = How.XPATH, using = ".//button[contains(text(),'SEARCH')]")
	public WebElement srchBTN;

	public void clicksrchBTN() {
		srchBTN.click();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='packages-collection']//a/img")
	public List<WebElement> pcImage;

	public int getOurCollectionsImageCount() {
		int count = pcImage.size();
		return count;
	}

	@FindBy(how = How.XPATH, using = "//*[@id='featuredPackages']//img")
	public List<WebElement> hdimage;

	public int getHotDealsImageCount() {
		int count = hdimage.size();
		return count;
	}

	@FindBy(how = How.XPATH, using = "//a/span[contains(text(),'Holiday')]")
	public WebElement backToHolidayPage;

	public void gobackToHolidayPage() {
		this.backToHolidayPage.click();
	}

}