package com.read;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadLocators {

	public static String getData(String Name) throws Exception
	{
		String fileLocation = System.getProperty("user.dir") + "\\Applica_conf\\Confi.properties";
        FileInputStream fis = new FileInputStream(fileLocation);
        Properties prop = new Properties();
        prop.load(fis);
        return prop.getProperty(Name);
	}

	
}
