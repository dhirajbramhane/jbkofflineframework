package com.objrepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.utilty.BasePage;

public class UserRepository extends BasePage  {
	
	
	@FindBy(xpath = "//span[text()='Operators']")
	protected WebElement OperatorsBtn;

	@FindBy(xpath = "//tbody/tr/td[2]")
	protected List<WebElement> usernames;

	@FindBy(xpath = "//tbody/tr/td[7]")
	protected List<WebElement> userState;

	@FindBy(xpath = "//tbody/tr/td[3]")
	protected List<WebElement> emailsId;

}
