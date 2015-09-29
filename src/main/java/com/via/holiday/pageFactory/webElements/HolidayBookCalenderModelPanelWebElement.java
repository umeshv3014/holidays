package com.via.holiday.pageFactory.webElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HolidayBookCalenderModelPanelWebElement {
	WebDriver driver;
	
	public HolidayBookCalenderModelPanelWebElement(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//*[@id='modalPanel']/div[2]")
	public WebElement dateModalPanel;

	@FindBy(how = How.XPATH, using = "//*[contains(@title, 'Show the previous month')]")
	public WebElement previousMonth;

	@FindBy(how = How.XPATH, using = "//*[contains(@title, 'Show today')]")
	public WebElement showToday;

	@FindBy(how = How.XPATH, using = "//*[contains(@title, 'Show the next month')]")
	public WebElement nextMonth;

}
