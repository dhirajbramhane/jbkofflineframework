package com.objrepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.utilty.BasePage;

public class UsefulLinksRepository extends BasePage  {



	@FindBy(tagName = "h1")
	 protected WebElement header;

	@FindBy(xpath = "//tbody/tr/td[2]")
	  protected List<WebElement> content;

	@FindBy(xpath = "//span[text()='Go !']")
	 protected List<WebElement> contentlinks;

}
	


