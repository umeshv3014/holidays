package com.via.base.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class DateSelector {
	GregorianCalendar calender = new GregorianCalendar();
	public String clickDateOnCalender() {
		String we = "*//td/a[contains(@title,'Select "
				+ new SimpleDateFormat("EEEE").format(calender.getTime())
				+ ", " + new SimpleDateFormat("MMM").format(calender.getTime())
				+ " " + calender.get(Calendar.DAY_OF_MONTH) + ", "
				+ calender.get(Calendar.YEAR) + "')]";
		return we;

	}
}
