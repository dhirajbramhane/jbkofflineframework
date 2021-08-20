package com.Test;


import org.openqa.selenium.WebDriver;

import org.testng.Assert;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.page.DashboardPage;
import com.page.LoginPage;

public class LoginTest extends TestBase {
	static WebDriver driver;
	LoginPage login;
	static DashboardPage dp;
	

	@BeforeClass
	public void setUp() {
		testLogs().info("initializating the webdriver");
		driver = initialization();
		testLogs().info("Passing driver to loginpage ");
		login = new LoginPage(driver);
	}

	@Test(priority=4)
	public void ValidIdLogin() {
		testLogs().info("entering login credential");
		login.enterEmail().sendKeys("kiran@gmail.com");
		login.enterPassword().sendKeys("123456");
		login.submitbutton().click();
		testLogs().info("passing driver to Dashboardpage");
		dp = new DashboardPage(driver);
	}

	@Test(priority=1)
	public void verifyHeaderName() {
		testLogs().info("verifying header ");
		Assert.assertTrue(login.HeaderName());

	}

	@Test(priority=2)
	public void verifySubHeaderName() {
		testLogs().info("verifying subheader ");
		Assert.assertTrue(login.SubHeaderName());
	}

	@Test(priority=3)
	public void verifyRegisterLink() {
		testLogs().info("verifying register link");
		Assert.assertTrue(login.registerLink());
	}

}
