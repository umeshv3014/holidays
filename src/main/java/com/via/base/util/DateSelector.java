package com.via.base.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateSelector {
	Date date = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public String getCurrDate(){
			String crdate = sdf.format(date);
			return crdate;
	}
	
	public String SetDate(int dd, int mm, int yyyy){
		return this.getCurrDate();
	}
}
