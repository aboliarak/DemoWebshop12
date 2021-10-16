package com.pages;

import org.openqa.selenium.By;

import com.browser.Browser;
import com.locators.Locators;
import com.read.ExcelRead;

public class SearchAdvanced extends Browser {

	public static void getAdvanced() throws Exception {
		//for test case 4
//		driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]")).sendKeys("Sneaker");
//		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[3]/form/input[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"As\"]")).click();
		
		Thread.sleep(2000);
		Locators.search_txt_box1().sendKeys(ExcelRead.readExcel(0, 3));;
		
	}
}
