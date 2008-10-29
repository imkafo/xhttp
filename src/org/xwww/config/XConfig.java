package org.xwww.config;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.PropertyConfigurator;

public class XConfig {

	private static String LOG_PROPERTIES = "config/log4j.properties";
	
	static public void loadLogProperties() {
		
		// Init log
		try {
			System.out.println("Loading log.properties: " + LOG_PROPERTIES );
			PropertyConfigurator.configure( LOG_PROPERTIES);
		} catch (Exception e) {
			BasicConfigurator.configure();
			System.out.println("Error initializing logger: " + e.toString());
		}	
		
	}
	
	
}
