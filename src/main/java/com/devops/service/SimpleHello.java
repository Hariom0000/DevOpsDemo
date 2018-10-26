package com.devops.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author hrm
 *
 */
public class SimpleHello {

	/** The Constant LOGGER. */
	private static final Logger LOGGER = LoggerFactory.getLogger(SimpleHello.class);

	/**
	 * This method is use to print hello message.
	 */
	public static void printMessage() {
		LOGGER.debug("Hello to spring boot");
	}

	public static void main(String[] args) {
		printMessage();
	}
}
