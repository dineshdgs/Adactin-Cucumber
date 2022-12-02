package Baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass_Demo {
public static WebDriver driver;
public static String value;
	
	
	//1.browser launch
	public static WebDriver browserLaunch(String type) {
		if (type.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			
			
		}else if (type.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			
				}
		return driver;
		 	}
	//2.click
	public static WebElement clickonelement(WebElement element) {
		element.click();
		return element;
	}
	//3.close
	public static void closeOnMethod() {
		driver.close();
		
       }
	//4.quit
	public static void quitMethod() {
		driver.quit();
		 
	}
	//5.Navigate to
	public static void navigateTO(String value) {
       driver.navigate().to(value);
	}
	//6.Navigate back
	public  void navigateBack() {
       driver.navigate().back();
	}
	//7.Navigate Forward
	public static void navigateForward() {
    driver.navigate().forward();
	}
	//8.Navigate Refresh
	public static void navigateRefresh() {
    driver.navigate().refresh();
	}
	//9.Get
	public static WebDriver getMethod(String value) {
      driver.get(value);
       
	return driver;
	}//10.Action
	public static void actionMethod(String xpath) {
		Actions ac =new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath(xpath))).build().perform();
		//ac.doubleClick(xpath);
	
	}
	//11.read data from excel
	public static void readData(String value,int sheetindex,int rowindex,int cellindex) throws IOException {
        File f =new File(value);
        FileInputStream fls =new FileInputStream(f);
        Workbook wb =new XSSFWorkbook(fls);
        Sheet sheetAt = wb.getSheetAt(sheetindex);
        Row row = sheetAt.getRow(rowindex);
        Cell cell = row.getCell(cellindex);
        CellType cellType = cell.getCellType();
        if (cellType.equals(CellType.STRING)) {
        	  value=cell.getStringCellValue();
			
		}
        
	}
	
	
	

	}
		
		
    
	




