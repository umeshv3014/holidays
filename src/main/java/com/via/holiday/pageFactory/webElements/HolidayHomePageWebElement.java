package com.via.holiday.pageFactory.webElements;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class HolidayHomePageWebElement{
	WebDriver driver;

	public HolidayHomePageWebElement(WebDriver driver) {
		this.driver = driver;
	    //This initElements method will create all WebElements
	    PageFactory.initElements(driver, this);
	}

	// send your request
	@FindBy(how = How.XPATH, using = ".//*[@id='myFeedbackForm']/div[1]/input")
	public WebElement feedbackName;

	@FindBy(how = How.XPATH, using = ".//*[@id='myFeedbackForm']/div[2]/input")
	public WebElement feedbackEmail;

	@FindBy(how = How.XPATH, using = ".//*[@id='myFeedbackForm']/div[3]/textarea")
	public WebElement feedbackMsg;

	@FindBy(how = How.XPATH, using = ".//*[@id='myFeedbackForm']/div[4]/button")
	public WebElement SYRmsg;

	// search destinations
	@FindBy(how = How.XPATH, using = ".//button[contains(text(),'Domestic')]")
	public WebElement domesticCity;

	@FindBy(how = How.XPATH, using = ".//button[contains(text(),'International')]")
	public WebElement intlCity;

	@FindBy(how = How.XPATH, using = ".//span[contains(text(),'Please select Destination')]")
	public WebElement cityTextBox;

	@FindBy(how = How.XPATH, using = ".//*[@id='s2id_autogen1_search']")
	public WebElement citytextbox;

	@FindBy(how = How.XPATH, using = ".//span[@class='select2-match']")
	public WebElement dropDownCity;

	@FindBy(how = How.XPATH, using = ".//button[contains(text(),'SEARCH')]")
	public WebElement srchBTN;

	@FindBy(how = How.XPATH, using = "")
	public List<WebElement> pcImage;

	@FindBy(how = How.XPATH, using = "")
	public List<WebElement> pcImage2;

}