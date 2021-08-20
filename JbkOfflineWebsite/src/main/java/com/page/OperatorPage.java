package com.page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.objrepository.OperatorRepository;

public class OperatorPage extends OperatorRepository {

	WebDriver driver;

	public OperatorPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public ArrayList tablehearderName() {
		ArrayList<String> actList = new ArrayList<String>();
		for (WebElement webElement : operatorList) {
			String list = webElement.getText();
			actList.add(list);
		}
		return actList;

	}

	public String headerName() {
		return header.getText();
	}

	public ArrayList personName() {
		ArrayList<String> actList = new ArrayList<String>();
		for (WebElement webElement : personName) {
			String list = webElement.getText();
			actList.add(list);
		}

		return actList;

	}

	public ArrayList wayofConnect() {
		ArrayList<String> actList = new ArrayList<String>();
		for (WebElement webElement : wayToConnet) {
			String list = webElement.getText();
			actList.add(list);           
		}

		return actList;

	}

}
