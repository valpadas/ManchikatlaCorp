package com.Gmail.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;




public class ExcelData {
	public void exceldataconfig() throws Exception{
		//specify the path
		File src = new File("C:\\Users\\admin\\Desktop\\aaaa.xlsx");
		//load the file
		FileInputStream fis =new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheet("Sheet1");
	    int lastRowNum = sheet1.getLastRowNum();
	    System.out.println("no of rows"  +lastRowNum);
	    for( int i=0;i<=lastRowNum;i++){
	    	
	    		String stringCellValue = sheet1.getRow(i).getCell(0).getStringCellValue();
	    		
	    		System.out.println("data  ::"+stringCellValue);
				
			
	    	
	    }
	    
		
		
	}
	public static void main(String[] args) throws Exception{
		ExcelData excel=new ExcelData();
		excel.exceldataconfig();
		
	}

}
