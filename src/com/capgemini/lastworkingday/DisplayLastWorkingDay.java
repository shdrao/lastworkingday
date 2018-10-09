package com.capgemini.lastworkingday;

import java.time.LocalDate;

public class DisplayLastWorkingDay {
	public static void main(String[] args) {
		int month;
		int year;
		month = 8;
		year = 2018;
		String a = displayDate(month, year);
	}

	public static String displayDate(int month, int year) {
		int date;
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
			date = 31;
		else if (month == 2 && year % 4 == 0)
			date = 29;
		else if (month == 4 || month == 6 || month == 9 || month == 11)
			date = 30;
		else
			date = 28;

		LocalDate localDate = LocalDate.of(year, month, date);
		if (localDate.getDayOfWeek().toString().equals("SUNDAY"))
			return "Last Working Day is FRIDAY:" + LocalDate.of(year, month, date - 2);

		else if (localDate.getDayOfWeek().toString().equals("SATURDAY"))
			return "Last Working Day is FRIDAY:" + LocalDate.of(year, month, date - 1);
		else {

			return "Last Working Day is " + localDate.getDayOfWeek() + ":" + localDate;
		}
	}
}
