package TestNGDemo;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadingMethods {
	
	XSSFWorkbook wb;
	XSSFSheet sh;
	
	public ExcelReadingMethods(String excelPath, String sheetName) throws Exception
	{
	wb = new XSSFWorkbook(excelPath);
	sh = wb.getSheet(sheetName);
	}
	
	public int getRowCount()
	{
		int rowCount = sh.getPhysicalNumberOfRows();
		System.out.println("Total no. of rows: "+rowCount);
		return rowCount;
	}
	
	public int getColCount()
	{
		int colCount = sh.getRow(0).getPhysicalNumberOfCells();
		System.out.println("Total no. of cols: "+colCount);
		return colCount;
	}
	
	public String getCellDataString(int rowNum, int colNum)
	{
		String cellData = sh.getRow(rowNum).getCell(colNum).getStringCellValue();
		//System.out.println(cellData);
		return cellData;
		
	}
	
	public double getCellDataNumber(int rowNum, int colNum)
	{
		double cellData = sh.getRow(rowNum).getCell(colNum).getNumericCellValue();
		System.out.println(cellData);
		return cellData;
		
	}
	
	
	
	

}
