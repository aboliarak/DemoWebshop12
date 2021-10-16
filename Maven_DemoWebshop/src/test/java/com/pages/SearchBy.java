package com.pages;

import org.openqa.selenium.By;

import com.browser.Browser;
import com.locators.Locators;
import com.read.ExcelRead;

public class SearchBy extends Browser{

	public static void getsearchby1() throws Exception {
		
		//for test case 5
		
//		driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]")).sendKeys("Dell");
//		driver.findElement(By.xpath("/html/body/div[4]/div[1]/1div[1]/div[3]/form/input[2]")).click();
		Thread.sleep(2000);
		Locators.search_txt_box1().sendKeys(ExcelRead.readExcel(0, 4));
			
	}
}
