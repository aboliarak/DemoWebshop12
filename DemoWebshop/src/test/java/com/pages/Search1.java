package com.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.browser.Browser;
import com.locators.Locators;
import com.read.ExcelRead;

public class Search1 extends Browser{
	
	public static void show_resu() throws Exception
	{
		//for test case 1
		
//		driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]")).sendKeys("Book");
//		driver.findElement(By.xpath("/html/body/dive[4]/div[1]/div[1]/div[3]/form/input[2]")).click();	
	
		Locators.search_txt_box1().sendKeys(ExcelRead.readExcel(0, 0));
		Thread.sleep(2000);
	
	}


	public static void getclickbtn1() throws Exception {
		
		Locators.search_btn().click();
	}
}
