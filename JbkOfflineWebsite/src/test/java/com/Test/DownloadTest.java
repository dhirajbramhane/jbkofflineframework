package com.Test;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.page.DownloadPage;

public class DownloadTest {
	 WebDriver driver;
		DownloadPage downloadPage;
	
	@BeforeClass
	public void initialisePage() {
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///D:/JAVA/Offline%20Website/Offline%20Website/pages/examples/downloads.html");
		downloadPage= new DownloadPage(driver);
		}
	
	@Test
	public void verifyTablesHeader() {
		 ArrayList<String> actual=downloadPage.acttableHeader();
		 System.out.println(actual);
		 ArrayList<String> expected=downloadPage.exptableHeader();
		 System.out.println(expected);
		 Assert.assertEquals(actual,expected);
		 
		
	}
	

}
