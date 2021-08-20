package com.objrepository;

import java.util.List;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.utilty.BasePage;

public class OperatorRepository extends BasePage  {
	
	@FindBy(xpath = "//tbody/tr[1]//following::tr")
	 protected List<WebElement> operatorList;

	@FindBy(tagName ="h1")
	 protected WebElement header;

	@FindBy(xpath="//tbody/tr/td[2]")
	 protected List<WebElement> personName;

	@FindBy(xpath="//tbody/tr/td[3]")
	 protected List<WebElement> contactFor;
	
	@FindBy(xpath="//tbody/tr/td[4]")
	 protected List<WebElement> wayToConnet;
	
	@FindBy(xpath="//tbody/tr/td[6]")
	 protected List<WebElement> timings;
	
}
