package com.insanitycraft.insanityoverworld.util;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class InsanityLog  {

	private static Logger logger = LogManager.getLogger(Reference.MODID);

	public static void log(Level logLevel, Object object) {
		logger.log(logLevel, String.valueOf(object));
	}

	public static void log(Level logLevel, Exception e) {
		logger.log(logLevel, e);
	}

	public static void log(Level logLevel, Object object, Throwable throwable) {
		logger.log(logLevel, String.valueOf(object), throwable);
	}

	public static void info(Object object) {
		log(Level.INFO, object);
	}

	public static void info(Exception e) {
		log(Level.INFO, e);
	}

	public static void debug(Object object) {
		log(Level.DEBUG, object);
	}

	public static void debug(Exception e) {
		log(Level.DEBUG, e);
	}
}
