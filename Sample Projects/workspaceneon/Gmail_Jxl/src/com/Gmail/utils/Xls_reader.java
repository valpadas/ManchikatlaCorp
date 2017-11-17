package com.Gmail.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Xls_reader {
	public static void main(String[] args)throws BiffException, IOException{

	File src=new File("C:\\Users\\admin\\Desktop\\Book1.xls");
		FileInputStream fis=new FileInputStream(src);
		Workbook work=Workbook.getWorkbook(fis);
		Sheet sheet = work.getSheet("Sheet1");
		int rows = sheet.getRows();
        int columns = sheet.getColumns();
        for (int i = 0; i < rows; i++) {
        	for (int j = 0; j < columns; j++) {
        		String contents = sheet.getCell(j,i).getContents();
        		System.out.println("hdsbfsdj::::::::"+contents);
				
			}
			
		}
	}
}
	
	


