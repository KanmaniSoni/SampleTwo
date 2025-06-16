package com.app.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base {
	
public static WebDriver driver = null;
	
	public static String prop_reuse(String data) {
		String value=null;

		try {
			File f = new File("C:\\Users\\Admin\\Desktop\\25.5.2025\\AdactinHotel2\\src\\test\\resources\\config.properties");
			FileReader read = new FileReader(f);
			Properties prop = new Properties();
			prop.load(read);
			value = prop.getProperty(data);
			System.out.println(value);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;

	}
	
	public static String  exread(int a , int b) {
		String value = null;
			try {
				File f = new File("C:\\Users\\Admin\\Desktop\\25.5.2025\\AdactinHotel2\\src\\test\\resources\\AdactinHotel.xlsx");
				FileInputStream fis = new FileInputStream(f);
				Workbook wb = new XSSFWorkbook(fis);
				Sheet sheet = wb.getSheet("Sheet1");
				Row row = sheet.getRow(a);
				Cell cell = row.getCell(b);
				int cellType = cell.getCellType();
				if(cellType==1) {
					value = cell.getStringCellValue();
					
				}else if (cellType==0) {
					if(DateUtil.isCellDateFormatted(cell)){
						Date dateCellValue = cell.getDateCellValue();
						SimpleDateFormat sm = new SimpleDateFormat("dd/MM/yyyy");
						value= sm.format(dateCellValue);	
					}else {
						double numericCellValue = cell.getNumericCellValue();
						long l = (long)numericCellValue;
						value = String.valueOf(l);
					}
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return value;
			
		}
	
	public static void browserLaunch()
	{
		driver = new ChromeDriver();
	}
	
	public static void windowMaximize()
	{
		driver.manage().window().maximize();
	}
	
	public static void loadUrl(String url)
	{
		driver.get(url);
		
	}
	public static void inputKey(WebElement element, String data) {
		element.sendKeys(data);
	}
	
	public static void elementClick(WebElement element)
	{
	  element.click();
	}
	public static void selectIndex(WebElement element,int index)
	{
		Select select = new Select(element);
		select.selectByIndex(index);
		
	}
		
}
