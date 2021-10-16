package com.locators;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.browser.Browser;
import com.read.ExcelRead;

public class Locators extends Browser{

	
	public static WebElement search_txt_box1() throws Exception {
		String searchbtn2 = com.read.ReadLocators.getData("search_txtbox222");
		WebElement search_txt_Box3 = driver.findElement(By.xpath(searchbtn2));
		return search_txt_Box3;
	}
	
	public static WebElement search_btn() throws Exception {
//		String filelocation = System.getProperty("user.dir") + "\\Applica_conf\\Confi.properties";
//		FileInputStream fis =new FileInputStream(filelocation);
//		Properties prop = new Properties();
//		prop.load(fis);
		
		String searchbtn = com.read.ReadLocators.getData("Search_btn");
		WebElement btn = driver.findElement(By.xpath(searchbtn));
		return btn;
	}
	
	public static WebElement getclear() throws Exception {
	
		WebElement search_txt_box2 = driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
		return search_txt_box2;
	}
	
	public static WebElement getsuglist() throws InterruptedException {
		
		WebElement sug_list = driver.findElement(By.xpath("//*[@id=\"ui-id-1\"]"));
		return sug_list;
	}

//	public static WebElement getmin() throws InterruptedException {
//	
//		WebElement search_txt_box12 = driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
//		WebElement search_btn5 = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[3]/form/input[2]"));
//		return search_btn5;
//		
//	}
	
	public static WebElement getAdvanced() throws Exception {

		WebElement search_adv = driver.findElement(By.xpath("//*[@id=\"As\"]"));
		return search_adv;
	    
	}
	
//	public static WebElement getsearchby() throws Exception {
//		WebElement search_txt_box10 = driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
//		WebElement search_btn10 = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[3]/form/input[2]"));
//		return search_btn10;
//	}
//	
	
}
