package com.insanitycraft.insanityoverworld.util;

import java.util.Calendar;

import static java.util.Calendar.*;

public class CalendarUtils {

	private static boolean today;

	private static boolean newYear; //1/1

	private static boolean valentinesDay; //14/2

	private static int day;


	public static void dayCheck() {

		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(System.currentTimeMillis());

		day = calendar.get(DAY_OF_MONTH);

		switch(calendar.get(MONTH)) {
			case JANUARY: {
				if(day == 1) {
					newYear = true;
				}
			}
			case FEBRUARY: {
				if(day == 14) {
					valentinesDay = true;
				}
			}

		}

		today = true;

	}

	public static boolean isToday() {
		return today;
	}

	public static boolean isNewYear() {
		return newYear;
	}

	public static boolean isValentinesDay() {
		return valentinesDay;
	}
}
