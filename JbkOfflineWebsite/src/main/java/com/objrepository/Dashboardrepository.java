package com.objrepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.utilty.BasePage;

public class Dashboardrepository extends BasePage {

	
	@FindBy(xpath = "//span[text()='Users']")
	protected WebElement UsersBtn;
	
	@FindBy(xpath ="//li/a/span")
	 protected List<WebElement> sideHeader;

	@FindBy(xpath = "//h3")
	protected List<WebElement> courses;

	
}
