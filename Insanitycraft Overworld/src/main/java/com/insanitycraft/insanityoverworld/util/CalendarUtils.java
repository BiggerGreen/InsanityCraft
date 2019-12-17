package com.insanitycraft.insanityoverworld.util;

import java.util.Calendar;

import static java.util.Calendar.*;

public class CalendarUtils {

	private static boolean isNewYear; //1/1

	public static int day;


	public static void dayCheck() {

		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(System.currentTimeMillis());

		day = calendar.get(DAY_OF_MONTH);

		switch(calendar.get(MONTH)) {
			case JANUARY: {
				if(day == 1) {
					isNewYear = true;
				}
			}

		}

	}

	public static boolean isIsNewYear() {
		return isNewYear;
	}
}
