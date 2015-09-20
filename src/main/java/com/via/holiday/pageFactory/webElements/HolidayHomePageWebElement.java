package com.via.holiday.pageFactory.webElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HolidayHomePageWebElement {
	WebDriver driver;
	
	public HolidayHomePageWebElement(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="")
	@CacheLookup
	public WebElement asdf;

}
