package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		//ToFetch
    String Path= "C:\\Users\\Admin\\eclipse-workspace\\28octAutomation\\src\\test\\java\\TestData\\Sheet1.xlsx";
	FileInputStream f1= new FileInputStream(Path);
	String data= WorkbookFactory.create(f1).getSheet("Sheet3").getRow(1).getCell(0).getStringCellValue();
	System.out.println(data);
	
	//2
	String Path1="C:\\Users\\Admin\\eclipse-workspace\\28octAutomation\\src\\test\\java\\TestData\\Sheet1.xlsx";
	FileInputStream f2= new FileInputStream(Path1);
	String data1= WorkbookFactory.create(f2).getSheet("Sheet3").getRow(1).getCell(1).getStringCellValue();
	System.out.println(data1);
	
	//3
	String Path2="C:\\Users\\Admin\\eclipse-workspace\\28octAutomation\\src\\test\\java\\TestData\\Sheet1.xlsx";
	FileInputStream f3= new FileInputStream(Path2);
	//XSSFWorkbook work = new XSSFWorkbook(f3);
	boolean t1= WorkbookFactory.create(f3).getSheet("Sheet3").getRow(1).getCell(2).getBooleanCellValue();
	System.out.println(t1);
	}

}
