package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Data1 {

	public static void main(String[] args) throws IOException {

		//To fetch string type data from excel sheet
		String Path ="C:\\Users\\Admin\\eclipse-workspace\\28octAutomation\\src\\test\\java\\TestData\\Sheet1.xlsx";
		FileInputStream file= new FileInputStream(Path);
		String Data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(Data);
		
		//2
		FileInputStream file1 = new FileInputStream(Path);
		String Data1= WorkbookFactory.create(file1).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		System.out.println(Data1);
	
	   //3
		FileInputStream file2 = new FileInputStream(Path);
		String Data2 =WorkbookFactory.create(file2).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(Data2);
		
		//Int type of data
		
//		FileInputStream F1 = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\28octAutomation\\src\\test\\java\\TestData\\Sheet1.xlsx");
//	    String data5 = WorkbookFactory.create(F1).getSheetAt(0).getRow(0).getCell(1).getStringCellValue();
//		//int data6 =(int) data5;
//		System.out.println(data5);
		
		FileInputStream F2 = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\28octAutomation\\src\\test\\java\\TestData\\Sheet1.xlsx");
		double data55= WorkbookFactory.create(F2).getSheetAt(0).getRow(1).getCell(1).getNumericCellValue();
		int data7 = (int) data55;
		System.out.println(data7);
	
//		FileInputStream F3 = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\28octAutomation\\src\\test\\java\\TestData.xlsx");
//		double data51= WorkbookFactory.create(F2).getSheetAt(1).getRow(2).getCell(2).getNumericCellValue();
//		double data8 = (int) data51;
//		System.out.println(data8);
	}}
