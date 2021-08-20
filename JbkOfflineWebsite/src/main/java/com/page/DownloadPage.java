package com.page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.objrepository.DownloadRepository;
import com.utilty.ExcelUtils;

public class DownloadPage extends DownloadRepository {

	WebDriver driver;

	public DownloadPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public ArrayList<String> acttableHeader() {
		ArrayList<String> actuallist = new ArrayList<String>();
		for (WebElement webElement : tableHeaders) {
			String header = webElement.getText();
			actuallist.add(header);

		}
		return actuallist;
	}

	public ArrayList<String> exptableHeader() {
		ArrayList<String> expectedlist = ExcelUtils.getRowData(System.getProperty("user.dir")+"/src/main/resources/com/excelSheet/DownloadPage.xls", "Sheet1", 0);
		
		return expectedlist;
	}

	public String header() {
		String actual = header.getText();
		return actual;
	}

}
