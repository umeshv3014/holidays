package com.via.base.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DateSelector extends SeleniumBase {
	WebDriver driver;

	public DateSelector(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnDate() {
		GregorianCalendar calender = new GregorianCalendar();
		driver.findElement(
				By.xpath("*//td/a[contains(@title,'Select "
						+ new SimpleDateFormat("EEEE").format(calender
								.getTime())
						+ ", "
						+ new SimpleDateFormat("MMM").format(calender.getTime())
						+ " " + calender.get(Calendar.DAY_OF_MONTH) + ", "
						+ calender.get(Calendar.YEAR) + "')]")).click();

	}
}
