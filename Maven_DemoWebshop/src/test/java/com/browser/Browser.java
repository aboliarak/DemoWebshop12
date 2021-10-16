package com.browser;

import java.io.FileInputStream;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
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

	public static void getUrl() throws Exception {
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
	public static void main(String[] args) throws Exception {
		Browser.setDriver();
		Browser.getUrl();
	}
	
//	public void result_should_displayed() throws Exception  {
//		   String expectedResults = "Demo Web Shop";
//		   String actualResults =(driver.getTitle());
//		   try
//		   {
//			   Assert.assertTrue(expectedResults.equals(actualResults) ? true: false);
//			   System.out.println("pass");
//		   }
//		   catch(AssertionError e)
//		   {
//			   System.out.println("fail");
//		   }
//	}
}