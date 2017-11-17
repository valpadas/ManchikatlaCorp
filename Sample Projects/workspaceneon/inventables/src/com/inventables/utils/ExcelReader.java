package com.inventables.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelReader {
	public HashMap<String, String> reader() throws BiffException, IOException{
		
	File fis = new File("D:\\workspaceneon\\inventables\\src\\com\\inventables\\data\\inventables.xls");
	FileInputStream file = new FileInputStream(fis);
	Workbook work = Workbook.getWorkbook(file);
	Sheet sheet = work.getSheet("Sheet1");
	int rows = sheet.getRows();
	int columns = sheet.getColumns();
	HashMap<String,String> map = new HashMap<String,String>();
	for(int i=0;i<rows;i++){
		
		String Username=sheet.getCell(0,i).getContents();
		String password  = sheet.getCell(1,i).getContents();
		map.put(Username, password);
		System.out.println(map  +"mapelements");
	}
return map;	

}
	
	
	
}