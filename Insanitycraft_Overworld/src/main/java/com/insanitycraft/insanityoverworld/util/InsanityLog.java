package com.insanitycraft.insanityoverworld.util;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class InsanityLog  {

	private static Logger logger = LogManager.getLogger(Reference.MODID);

	public static void log(Level logLevel, Object object) {
		logger.log(logLevel, String.valueOf(object));
	}

	public static void log(Level logLevel, String text, Object... params) {
		logger.log(logLevel, text, params);
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

	public static void info(String text, Object format) {
		log(Level.INFO, text, format);
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

	public static void error(Object object) {
		log(Level.ERROR, object);
	}

	public static void error(Exception e) {
		log(Level.ERROR, e);
	}

	public static void error(String text, Object... params) {
		log(Level.ERROR, text, params);
	}

	public static void warn(Object object) {
		log(Level.WARN, object);
	}

	public static void warn(String text, Object format) {
		log(Level.WARN, text, format);
	}

	public static void warn(Exception e) {
		log(Level.WARN, e);
	}
}
