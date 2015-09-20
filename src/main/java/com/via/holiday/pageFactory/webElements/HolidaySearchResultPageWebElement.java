package com.via.holiday.pageFactory.webElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
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
	@CacheLookup
	public WebElement mobileNumberSE;

	@FindBy(xpath = "//*[@id='hldDealAltForm']//input[@name='name']")
	@CacheLookup
	public WebElement SHEname;

	@FindBy(xpath = "//*[@id='hldDealAltForm']//input[@name='email']")
	@CacheLookup
	public WebElement SHEemail;

	@FindBy(xpath = "//*[@id='hldDealAltForm']//input[@name='city']")
	@CacheLookup
	public WebElement SHEcity;

	@FindBy(xpath = "//*[@id='hldDealAltForm']//input[@name='duration']")
	@CacheLookup
	public WebElement SHEduration;

	@FindBy(xpath = "//*[@id='hldDealAltForm']//textarea[@name='comments']")
	@CacheLookup
	public WebElement SHEcomments;

	@FindBy(xpath = "//*[@id='modalPanel']//button[contains(text(),'Submit')]")
	@CacheLookup
	public WebElement SHEsubmit;

	@FindBy(xpath = "//*[@id='hldDealAltForm']//input[@name='travel_date']")
	@CacheLookup
	public WebElement SHEdate;

	@FindBy(xpath = "//a[contains(text(),'Close')]")
	@CacheLookup
	public WebElement SHEclanderClose;

	@FindBy(xpath = "//button[contains(text(),'Send Enquiry')]")
	@CacheLookup
	public WebElement SHEbutton;
	
	@FindBy(xpath = "//*[@id='modalPanel']//button")
	@CacheLookup
	public WebElement SHEsucess;

}