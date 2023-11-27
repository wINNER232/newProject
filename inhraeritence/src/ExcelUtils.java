import java.io.File;
import java.io.IOException;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


	public class ExcelUtils 
	{
		static String projectPath;
		static XSSFWorkbook workbook;
		static  XSSFSheet sheet;
		public  ExcelUtils(String excelPath,String sheetName) {
			try {
			    projectPath=System.getProperty("user.dir");
				workbook =new XSSFWorkbook(excelPath);
				sheet=workbook.getSheet(sheetName);
			} 
			catch(Exception exp){
				System.out.println(exp.getStackTrace());           		 
			}
		}
		public  void main(String[] args) 
		{
			getCelldataNumber(1,1);
			getCelldataString(0, 0);
		}
		public int  getRowCount()
		{
			try {
				 
				int rowCount=sheet.getPhysicalNumberOfRows();
				System.out.println("No Of Rows"+rowCount);
		        return rowCount;
			}
			catch(Exception exp){
				System.out.println(exp.getMessage());
				System.out.println(exp.getCause());
				System.out.println(exp.getStackTrace());           		 
			}
			return 0;
		}
		public  String getCelldataString(int rowNum,int colNum) {
			try  {
				
				String CellData= sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
				System.out.println(CellData);
				return CellData;
			}
			catch(Exception exp){
				System.out.println(exp.getMessage());
				System.out.println(exp.getCause());
				System.out.println(exp.getStackTrace());           		 
			}
			return null;

		}
		public  void getCelldataNumber(int rowNum,int colNum) {
			try  {
				
				Double CellData1= sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
				System.out.println(CellData1);
			}
			catch(Exception exp){
				System.out.println(exp.getMessage());
				System.out.println(exp.getCause());
				System.out.println(exp.getStackTrace());           		 
			}
		}}




