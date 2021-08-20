package com.Test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.page.UsefulLinksPage;

public class UsefulLinksTest extends TestBase {
	UsefulLinksPage uf ;
	
	@BeforeClass
	public void initializObject() {
		uf = new UsefulLinksPage(driver);
		
	}
	
	@Test
	public void verifyHeader() {
		String actual = uf.pageHeader();
		String expected = "Useful Links";
		Assert.assertEquals(actual, expected);
		}

}
