package SampleJava;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestNg1 {
	WebDriver a;
	static String data[][]=null;
    @Test
	public static void login_data() throws BiffException, IOException{
		FileInputStream file = new FileInputStream("C:\\Users\\admin\\Desktop\\bangaram.xls");
		Workbook wb = Workbook.getWorkbook(file);
		Sheet sheet = wb.getSheet("Sheet1");
		int rows = sheet.getRows();
		int col = sheet.getColumns();
		data=new String[rows][col];		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				data[i][j]= sheet.getCell(j,i).getContents();
				System.out.print(data[i][j]);
				}
			}
		file.close();
		
	}
  @Test
  public void f() {
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
