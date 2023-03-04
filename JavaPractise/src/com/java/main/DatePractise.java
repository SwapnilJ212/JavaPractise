package com.java.main;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class DatePractise {
	public static void main(String args[]) {
		//System.out.println("Week Day ::::"+findDay(29,2,2004));
		numberFormat((double) 100000);
	}
	
	public static void numberFormat(Double amt){
		System.out.println(new Locale("en", "IN"));
		System.out.println("Us :::>"+NumberFormat.getCurrencyInstance(Locale.US).format(amt));
		System.out.println("China :::>"+NumberFormat.getCurrencyInstance(Locale.CHINA).format(amt));
		System.out.println("France :::>"+NumberFormat.getCurrencyInstance(Locale.FRANCE).format(amt));
		System.out.println("India :::>"+NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(amt));
	}
	@SuppressWarnings("deprecation")
	public static String findDay(int date , int month ,  int year){
		Date d = new Date(year - 1900 , month - 1 , date);
		LocalDate d1 = LocalDate.of(year, month, date); 
		System.out.println(d1.getDayOfWeek());
		String day = "";
		System.out.println("Week Day Count "+d.getDay());
		switch (d.getDay() - 1) {
			case 0:
				day = "MONDAY";
				break;
			case 1:
				day = "TUESDAY";
				break;	
			case 2:
				day = "WENSDAY";
				break;
			case 3:
				day = "THURSDAY";
				break;
			case 4:
				day = "FRIDAY";
				break;
			case 5:
				day = "SATURDAY";
				break;
			case 6:
				day = "SUNDAY";
				break;	
	
			default:
				day = "SUNDAY";
				break;
		}
		return day;
	}
}
