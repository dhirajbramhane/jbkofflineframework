package com.objrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.utilty.BasePage;

public class LoginRepository extends BasePage  {
	
	
	@FindBy(id = "email")
	protected WebElement email;

	@FindBy(id = "password")
	protected WebElement pass;

	@FindBy(xpath = "//button")
	protected WebElement button;

	@FindBy(xpath = "//b")
	protected WebElement header;

	@FindBy(tagName = "h4")
	protected WebElement subHeaderName;

	@FindBy(partialLinkText = "Register a")
	protected WebElement registerLink;


}
