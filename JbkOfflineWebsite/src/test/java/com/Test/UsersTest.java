package com.Test;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.page.OperatorPage;
import com.page.UserPage;

public class UsersTest {
	WebDriver driver;
	UserPage up;
	public static OperatorPage op;
	public Logger log = Logger.getLogger(UsersTest.class);

	@BeforeClass
	public void setUp() {
       log.info("intialise userpage object");
		up = DashboardTest.up;

	}

	public void verifyUserName() {
		log.info("verifying usersname");
		Assert.assertTrue(up.usersName());
	}

	public void verifyUsersGmail() {
		log.info("click on user page");
		op = up.operatorClick();
		log.info("move to an userpage");
		Assert.assertTrue(up.UsersGmail());
	}

}
