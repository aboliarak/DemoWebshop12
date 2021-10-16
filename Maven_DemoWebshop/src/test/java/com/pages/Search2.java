package com.pages;

import org.openqa.selenium.By;

import com.browser.Browser;
import com.locators.Locators;
import com.read.ExcelRead;

public class Search2 extends Browser{

	public static void getsuglist() throws Exception {
		
		//for test case 2
		
//		driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]")).sendKeys("Book");
//		driver.findElement(By.xpath("//*[@id=\"ui-id-1\"]")).click();
		Thread.sleep(2000);
		Locators.search_txt_box1().sendKeys(ExcelRead.readExcel(0, 1));
		Thread.sleep(2000);
		Locators.getsuglist().click();
		
		
	
	}
	
}