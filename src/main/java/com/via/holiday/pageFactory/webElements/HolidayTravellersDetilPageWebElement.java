package com.via.holiday.pageFactory.webElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HolidayTravellersDetilPageWebElement {

	public WebDriver driver;

	public HolidayTravellersDetilPageWebElement(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "")
	@CacheLookup
	public WebElement selectTitle;

	@FindBy(xpath = "")
	@CacheLookup
	public WebElement setFirstName;

	@FindBy(xpath = "")
	@CacheLookup
	public WebElement setLastName;

	@FindBy(xpath = "")
	@CacheLookup
	public WebElement setInfantDOB;

	@FindBy(xpath = "")
	@CacheLookup
	public WebElement Add_ons;

	@FindBy(xpath = "")
	@CacheLookup
	public WebElement mobileNumeber;

	@FindBy(xpath = "")
	@CacheLookup
	public WebElement email;

	@FindBy(xpath = "")
	@CacheLookup
	public WebElement tANDc;

	@FindBy(xpath = "")
	@CacheLookup
	public WebElement payNow;

}
