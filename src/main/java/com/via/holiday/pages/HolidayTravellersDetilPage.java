package com.via.holiday.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.via.holiday.pageFactory.webElements.HolidayTravellersDetilPageWebElement;

public class HolidayTravellersDetilPage {

	public WebDriver driver;
	public HolidayTravellersDetilPageWebElement htdp;

	public HolidayTravellersDetilPage(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}

	public HolidayTravellersDetilPage setTitle() {
		htdp.selectTitle.click();
		return this;
	}

	public HolidayTravellersDetilPage setFname(String fName) {
		htdp.setFirstName.sendKeys(fName);
		return this;
	}

	public HolidayTravellersDetilPage setLname(String lName) {
		htdp.setLastName.sendKeys(lName);
		return this;
	}

	public HolidayTravellersDetilPage setDOB(String dob) {
		htdp.setInfantDOB.sendKeys(dob);
		return this;
	}

	
	public HolidayTravellersDetilPage add_ons(String Addons) {
		htdp.Add_ons.sendKeys(Addons);
		return this;
	}


	public HolidayTravellersDetilPage setMobileNumeber(String mobileNu) {
		htdp.mobileNumeber.sendKeys(mobileNu);
		return this;
	}

	
	public HolidayTravellersDetilPage setEmail(String tEmail) {
		htdp.email.sendKeys(tEmail);
		return this;
	}

	
	public HolidayTravellersDetilPage TandC() {
		htdp.tANDc.click();
		return this;
	}

	public HolidayTravellersDetilPage payNow() {
		htdp.payNow.click();
		return this;
	}

	public void fillTravelersInfo(String fName, String lName, String Addons,
			String mobileNu, String tEmail) {
		this.setTitle();
		this.setFname(fName);
		this.setLname(lName);
		this.add_ons(Addons);
		this.setMobileNumeber(mobileNu);
		this.setEmail(tEmail);
		this.TandC();
		this.payNow();
	}

}
