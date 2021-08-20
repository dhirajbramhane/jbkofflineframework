package com.Test;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.page.DashboardPage;
import com.page.OperatorPage;
import com.utilty.ExcelUtils;

public class OperatorTest {

	WebDriver driver;
	OperatorPage op;

	 @BeforeClass
	public void setUp() {
		
		op = UsersTest.op;

	}

	@Test
	public void verifyheader() {
		String actutal = op.headerName();
		String expected = "Operators";
		Assert.assertEquals(actutal, expected);

	}

	
	@Test
	public void verifypersonName() {
		//ArrayList actutal = op.personName();
		//ArrayList expected = "Operators";
		//Assert.assertEquals(actutal, expected);

	}
	
	@Test
	public void verifyPersonName() {
		System.out.println(op.tablehearderName());

	}

	@Test
	public void verifyName() {
		 ArrayList<String> actList=  op.personName();
		 ArrayList<String> expList =ExcelUtils.getcolumnData("C:\\Users\\ankit\\Eclips\\JbkOfflineWebsite\\src\\test\\resources\\com\\excelsheet/sheetttt.xls", "Sheet1", 1);
Assert.assertEquals(actList, expList);
		 
	}
	
	@Test
	public void validateDifferentWayOfConnect() {
		ArrayList<String> actNameList=  op.personName();
		 ArrayList<String> actList=  op.wayofConnect();
		 //ArrayList<String> expList =ExcelUtils.getcolumnData("C:\\Users\\ankit\\Eclips\\JbkOfflineWebsite\\src\\test\\resources\\com\\excelsheet/sheetttt.xls", "Sheet1", 3);
//Assert.assertEquals(actList, expList);
	 for (int i = 0; i <actNameList.size() ; i++) {
		  String name = actNameList.get(i);
		   String way =actList.get(i);
		 if ( way.contains("Whats App Only")) {
			System.out.println(name);
		} 
		
	}
		 
	}
	
	
	
	
	
	
}
