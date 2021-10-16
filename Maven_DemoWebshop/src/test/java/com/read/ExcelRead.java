package com.read;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static String readExcel(int row, int column) throws IOException {
		String testData=null;
		try {
			
			String filePath = System.getProperty("user.dir") + "\\Excel\\Testdata.xlsx";
			FileInputStream file = new FileInputStream(filePath);
			XSSFWorkbook wb = new XSSFWorkbook(file);
			XSSFSheet ws = wb.getSheetAt(0);
			testData = String.valueOf(ws.getRow(row).getCell(column));
			
			wb.close();
		}catch(Exception e)
		{
			System.out.println("Excel Read");
		}
		return testData;
	}
	
	public static void main(String[] args) throws Exception{
		
		System.out.println(readExcel(0,0));
		System.out.println(readExcel(0,1));
		System.out.println(readExcel(0,2));
		System.out.println(readExcel(0,3));
		System.out.println(readExcel(0,4));
		
	}
}	