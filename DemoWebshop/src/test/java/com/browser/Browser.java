package com.browser;

import java.io.FileInputStream;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	
	public static WebDriver driver;
	
	public static void setDriver()
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/abarak/Downloads/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	public static void getUrl(String Url) throws Exception {
		try {

			String fileLocation = System.getProperty("user.dir") + "\\Applica_conf\\Confi.properties";
	        FileInputStream fis = new FileInputStream(fileLocation);
	        Properties prop = new Properties();
	        prop.load(fis);
		
		driver.get(prop.getProperty("url")); //http://demowebshop.tricentis.com/
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}catch(Exception e)
		{
		System.out.println("URL Method");
		}
	}
//	public static void main(String[] args) throws Exception {
//		Browser.setDriver();
//		Browser.getUrl();
//	}
	
	public void result_should_displayed() throws Exception  {
		   String expectedResults =driver.getCurrentUrl();   //driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/form/div[1]/div[1]/input")).getText();
		   String actualResults = "http://demowebshop.tricentis.com/search?q=Book";
		   System.out.println(expectedResults);
		   try
		   {
			   Assert.assertTrue(expectedResults.equals(actualResults) ? true: false);
			   System.out.println("pass");
		   }
		   catch(AssertionError e)
		   {
			   System.out.println("fail");
		   }
	}
}