package com.ajay.HackerRank;

import java.sql.Date;
import java.util.Calendar;

public class CountingSundays {

	public static void main(String[] arg)throws Exception{
		System.out.println("for two diff Dates "+ getNumberOfWeekEnds("2005-Oct-09","2005-Nov-09"));
		}
	
	public static int getNumberOfWeekEnds(String d1,String d2)throws Exception {
		Date date1=getDate(d1);
		Date date2=getDate(d2);

		Calendar c1 = Calendar.getInstance();
		c1.clear();
		c1.setTime(date1);
		Calendar c2 = Calendar.getInstance();
		c2.clear();
		c2.setTime(date2);
		int WeekEnds = 0;

		while(c2.after(c1)) {
		if(c1.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY||
		c1.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
		WeekEnds++;
		c1.add(Calendar.DATE,1);

		}
		System.out.println(WeekEnds);
		return WeekEnds;

		}
}
