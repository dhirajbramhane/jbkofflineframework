package com.objrepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.utilty.BasePage;

public class DownloadRepository extends BasePage {
	
	
	@FindBy(tagName = "h3")
	 protected WebElement header;

	@FindBy(xpath = "//tbody/tr/th")
	protected List<WebElement> tableHeaders;
	
	
	
	
}
