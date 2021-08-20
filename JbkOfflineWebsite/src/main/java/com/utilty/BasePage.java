package com.utilty;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class BasePage {
	
	
	
	public Logger pageLogs() {
		
		String path= System.getProperty("user.dir")+"/src/main/resources/log4jPage.properties";
		Logger  logger = Logger.getLogger(this.getClass());
		PropertyConfigurator.configure(path);
		return logger;
	}

}
