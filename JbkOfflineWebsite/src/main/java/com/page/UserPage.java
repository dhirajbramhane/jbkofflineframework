package com.page;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Test.UsersTest;
import com.objrepository.UserRepository;

public class UserPage extends UserRepository {

	WebDriver driver;
	ArrayList<String> actUsersName;
	ArrayList<String> actUsersState;
	public Logger log = Logger.getLogger(UsersTest.class);

	public UserPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		 this.driver=driver;
	}

	
	public boolean usersName() {
		Workbook wb = null;

		System.out.println(usernames.size());
		actUsersName = new ArrayList<String>();
		for (WebElement label : usernames) {
			String text = label.getText();
			actUsersName.add(text);
		}

		ArrayList<String> expUsersName = new ArrayList<String>();
		DataFormatter df = new DataFormatter();
		FileInputStream file;
		try {
			file = new FileInputStream("com/excelSheet/Book.xls");
			wb = WorkbookFactory.create(file);
		} catch (Exception e) {

			e.printStackTrace();
		}

		Sheet sh = wb.getSheet("Sheet2");
		int rows = sh.getLastRowNum();// 5
		for (int i = 0; i <= rows; i++) {
			int cols = sh.getRow(i).getLastCellNum();// 1
			for (int j = 0; j < cols; j++) {
				Cell c = sh.getRow(i).getCell(j);
				String value = df.formatCellValue(c);
				expUsersName.add(value);
			}

		}

		if (expUsersName.equals(actUsersName)) {
			log.info("Username list is as expected list");
			return true;
		}
		log.error("username list name is not as expected ");
		return false;

	}

	
	public OperatorPage operatorClick() {
		OperatorsBtn.click();
		return new OperatorPage(driver);
	}
	public void usersStateNames() {

		System.out.println(userState.size());
		actUsersState = new ArrayList<String>();
		for (WebElement label : userState) {
			String text = label.getText();
			actUsersState.add(text);
		}

		System.out.println(actUsersState);
		System.out.println(actUsersName);

		// HashMap<String,String> stateNames= new HashMap<>();
		Iterator<String> name = actUsersName.iterator();
		Iterator<String> state = actUsersState.iterator();

		while (name.hasNext() && state.hasNext()) {
			String n = name.next();
			String s = state.next();
			System.out.println(n + "=" + s);

		}

	}

	public boolean UsersGmail() {
		ArrayList<String> actemailsId = new ArrayList<String>();
		for (WebElement emailId : emailsId) {
			String text = emailId.getText();
			System.out.println(text);
			String gmails = text.substring(text.lastIndexOf("@") + 1);
			System.out.println(gmails);
			if (gmails.equals("gmail.com")) {
				actemailsId.add(text);
				return true;
			}
			return false;
		}
		return false;
		

	}

}
