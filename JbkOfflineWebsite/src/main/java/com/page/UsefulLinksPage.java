package com.page;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;

import com.objrepository.UsefulLinksRepository;

public class UsefulLinksPage extends UsefulLinksRepository {

	WebDriver driver;

	public UsefulLinksPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	  
	
	public String  pageHeader() {
		 String actual=header.getText();
	return actual;	
	}
	
	
	

}
