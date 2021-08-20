package com.page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.PageFactory;


import com.objrepository.LoginRepository;


public class LoginPage extends LoginRepository {
	WebDriver driver;


	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	public WebElement enterEmail() {
		return email;
	}

	public WebElement enterPassword() {
		return pass;
	}

	public WebElement submitbutton() {
		return button;
	}

	public boolean registerLink() {
		String actregisterText = registerLink.getText();
		String expText = "Register a new membership";
		if (actregisterText.equals(expText)) {
			
			pageLogs().info("register link is as expected");
			return true;
		}
		pageLogs().info("redister link is not as expected");
		return false;
	}

	public boolean SubHeaderName() {
		String actsubHeadName = subHeaderName.getText();
		String expsubHeadName = "JAVA | SELENIUM | PYTHON";
		if (actsubHeadName.equals(expsubHeadName)) {
			pageLogs().info("subheader is as expected");
			return true;
		}
		pageLogs().info("subheader is not as expected");
		return false;
	}

	public boolean HeaderName() {
		String actHeadName = header.getText();
		String expHeadName = "Java By Kiran";
		if (actHeadName.equals(expHeadName)) {
			pageLogs().info("subheader is as expected");
				return true;
		}
		pageLogs().info("header is not as expected");
		return false;
	}

}
