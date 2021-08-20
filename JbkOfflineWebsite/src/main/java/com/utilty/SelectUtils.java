package com.utilty;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectUtils {
	
	public void selectByText(WebElement element, String text) {
		Select sel= new Select(element);
		sel.selectByVisibleText(text);	
	}
	

	public void selectByValue(WebElement element, String value) {
		Select sel= new Select(element);
		sel.selectByValue(value);	
	}


	public void selectByIndex(WebElement element, int index) {
		Select sel= new Select(element);
		sel.selectByIndex(index);;	
	}

}
