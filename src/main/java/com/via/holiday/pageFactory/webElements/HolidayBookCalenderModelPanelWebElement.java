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
	
	public void dateAndpriceBookPanel(){
		this.dateModalPanel.isDisplayed();
	}

	@FindBy(how = How.XPATH, using = "//*[contains(@title, 'Show the previous month')]")
	public WebElement previousMonth;
	
	public void previousMonth(){
		this.previousMonth.click();
	}

	@FindBy(how = How.XPATH, using = "//*[contains(@title, 'Show today')]")
	public WebElement showToday;
	
	public void showtodayDate(){
		this.showToday.click();
	}

	@FindBy(how = How.XPATH, using = "//*[contains(@title, 'Show the next month')]")
	public WebElement nextMonth;
	
	public void nextMonth(){
		this.nextMonth.click();
	}

}
