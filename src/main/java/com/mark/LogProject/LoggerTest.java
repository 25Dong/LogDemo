package com.mark.LogProject;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerTest {
	private static final Logger logger =  LoggerFactory.getLogger(LoggerTest.class);
	public static void main(String[] args)
	{
		logger.info("this is a logger info");
	}

}
