package com.page;

import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.PageFactory;

import com.Test.DashboardTest;
import com.objrepository.Dashboardrepository;


public class DashboardPage extends Dashboardrepository {

	WebDriver driver;
	public Logger log = Logger.getLogger(DashboardPage.class);
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public UserPage UserClick() {
		UsersBtn.click();
		return new UserPage(driver);
	}

	
	public boolean coursesName() {
		ArrayList<String> actCourses = new ArrayList<String>();

		for (WebElement course : courses) {
			String text = course.getText();
			actCourses.add(text);
		}
		ArrayList<String> expCourses = new ArrayList<String>();
		expCourses.add("Selenium");
		expCourses.add("Java / J2EE");
		expCourses.add("Python");
		expCourses.add("Php");
                                           
		if (actCourses.equals(expCourses)) {
			log.info("Courses list is as expected");
			return true;
		}
		log.info("Courses list not as expected");
		return false;

	}

	public boolean sideHeaders() {
		Workbook wb = null;
		
		ArrayList<String> actlist = new ArrayList<String>();
		for (WebElement label : sideHeader) {
			String text = label.getText();
			actlist.add(text);
		}

		ArrayList<String> explist = new ArrayList<String>();
		DataFormatter df = new DataFormatter();
		FileInputStream file;
		try {
			file = new FileInputStream("com/excelSheet/Book.xls");
			wb = WorkbookFactory.create(file);
		} catch (Exception e) {

			e.printStackTrace();
		}

		Sheet sh = wb.getSheet("Sheet1");
		int rows = sh.getLastRowNum();// 5
		for (int i = 0; i <= rows; i++) {
			int cols = sh.getRow(i).getLastCellNum();// 1
			for (int j = 0; j < cols; j++) {
				Cell c = sh.getRow(i).getCell(j);
				String value = df.formatCellValue(c);
				explist.add(value);
			}

		}

		if (actlist.equals(explist)) {
			log.info("side header list is as expected");
			return true;
		}
		log.info("side header list is not as expected");
		return false;
	}

}
