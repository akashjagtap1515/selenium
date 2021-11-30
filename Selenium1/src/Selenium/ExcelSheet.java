package Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String path = "E:\\Selenium\\hello excel.xlsx";
		FileInputStream file= new FileInputStream(path);
		FileInputStream file1= new FileInputStream(path);
		
		String username =		
	WorkbookFactory.create(file).getSheet("Sheet1").getRow(5).getCell(0).getStringCellValue();
		
		String pass =		
	WorkbookFactory.create(file1).getSheet("Sheet1").getRow(5).getCell(1).getStringCellValue();
       
		System.out.println(username +"," + pass);
	}

}
