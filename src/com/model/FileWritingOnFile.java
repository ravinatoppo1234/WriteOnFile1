package com.model;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileWritingOnFile 
{
	public void setcellData(String filenm,String Sheetnm,int rownm,int columns,String dataval) throws IOException
	{
		FileInputStream fis=new FileInputStream(filenm);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet(Sheetnm);
		XSSFRow row=sheet.getRow(2);
		XSSFCell cell=row.getCell(2);
		String val=cell.getStringCellValue();
		System.out.println("The data in cell at index 2,2:"+val);
		System.out.println(" test.....");
	}
}
