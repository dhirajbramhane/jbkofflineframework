package com.Test;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.page.DashboardPage;
import com.page.UserPage;

public class DashboardTest extends TestBase {

	WebDriver driver;
	DashboardPage dp;
	static UserPage up;
	public Logger log = Logger.getLogger(DashboardTest.class);

	@BeforeClass
	public void setUp() {
		log.info("intializing DashboardPage of DashboardTest");
		dp = LoginTest.dp;
	}


	@Test(priority=1)
	public void verifySideHeaders() {
		log.info("verifying side header");
		Assert.assertTrue(dp.sideHeaders());
	}


	@Test(priority=2)
	public void verifyCoursesName() {
		log.info("verifying courses names");
		Assert.assertTrue(dp.coursesName());
		log.info("initializing userpage object");
		up = dp.UserClick();
	}
}
