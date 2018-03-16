package com.proj.version2.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class test {
	public static String getPastDate(int past) {  
	       Calendar calendar = Calendar.getInstance();  
	       calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR) - past);  
	       Date today = calendar.getTime();  
	       SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");  
	       String result = format.format(today);  
	       System.out.println(result);
	       return result;  
	   }  
	public static void main(String[] args) {
		String re = getPastDate(6);
	}
}
