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
		htdp = PageFactory.initElements(driver, HolidayTravellersDetilPageWebElement.class);
	}

	public void setTitle() {
		htdp.selectTitle.click();
	}

	public void setFname(String fName) {
		htdp.setFirstName.sendKeys(fName);
	}

	public void setLname(String lName) {
		htdp.setLastName.sendKeys(lName);
	}

	public void setDOB(String dob) {
		htdp.setInfantDOB.sendKeys(dob);
	}

	
	public void add_ons(String Addons) {
		htdp.Add_ons.sendKeys(Addons);
	}


	public void setMobileNumeber(String mobileNu) {
		htdp.mobileNumeber.sendKeys(mobileNu);
	}

	
	public void setEmail(String tEmail) {
		htdp.email.sendKeys(tEmail);
	}

	
	public void TandC() {
		htdp.tANDc.click();
	}

	public void payNow() {
		htdp.payNow.click();
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