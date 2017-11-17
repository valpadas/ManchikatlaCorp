package SampleJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadDataFromExcel {

	public static void main(String[] args) throws BiffException, IOException {
		File f=new File("C:\\Users\\admin\\Desktop\\venu1.xls");
		FileInputStream file=new FileInputStream(f);
		Workbook work=Workbook.getWorkbook(file);
		Sheet s=work.getSheet("Sheet1");
		int rows = s.getRows();
		int col=s.getColumns();
		System.out.println(col+"no of col");
		System.out.println(rows+"no of rows");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				String contents = s.getCell(j, i).getContents();
				System.out.println(contents + "the contents are");
				
			}
			
		}


	}

}
