package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	public static WebDriver driver;
   public  static Logger log= Logger.getLogger(TestBase.class);
	
	public static String readProperty(String key) {

	    //log.info("reading a value for a prooerty: "+key);
		Properties ps = new Properties();
		try {
			//log.info("initializing property file");
			FileInputStream file = new FileInputStream(
					System.getProperty("user.dir") + "/src/main/resources/com/properties/config.properties");
			ps.load(file);
		} catch (IOException e) {
			//log.error("Invalid property file path");
			e.printStackTrace();
		}
		//log.info("property value found in the file with key as: "+key+"and value is : "+ps.getProperty(key));
		return ps.getProperty(key);

	}

	public static WebDriver initialization() {
//  log.info("initializating browser");
		if (readProperty("browser").equalsIgnoreCase("Chrome")) {
//log.info("User wabts to automate with chrome browser");
			System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (readProperty("browser").equalsIgnoreCase("firefox")) {
			//log.info("user wants to automate with firefox browser");
			System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			//log.info("user wants to automate with invalid browser");
			return null;
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//log.info("launching an application");
		driver.get(readProperty("url"));
		return driver;

	}

	public static void getScreenShot(WebDriver driver, String name) {
		 //log.info("test case failed and taking screenshot");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(System.getProperty("user.dir") + "/Screenshot/" + name + ".jpg");
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			e.printStackTrace();

		}
		  //log.info("screenshot saved in the project directory");
	}

	public Logger testLogs() {
		
		String path= System.getProperty("user.dir")+"/src/main/resources/log4jTest.properties";
		Logger  logger = Logger.getLogger(this.getClass());
		PropertyConfigurator.configure(path);
		return logger;
	}
	
}
