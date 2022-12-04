package com.utility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class UtilityFiles {
	public static WebDriver driver;
	public static Workbook wb;
public static WebDriver setproperty() {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Priya\\eclipse-workspace\\cucumber\\Diver\\chromedriver.exe");
	driver = new ChromeDriver();
	return driver;
}
	public static void window_commands (String window) {
		if(window.equalsIgnoreCase("maximize")) {
			
		driver.manage().window().maximize();	
		}
		else if (window.equalsIgnoreCase("fullscreen")) {
			driver.manage().window().fullscreen();
		}
	}
public static void 	windowchange() {
	Set<String> windowHandles = driver.getWindowHandles();
String url ="https://www.amazon.in/Fastrack-Calling-Display-Storage-Watchfaces/dp/B0BHTHSYWB/ref=sr_1_1?crid=3NEW59CJIZYCA&keywords=smart+watch&qid=1670153211&sprefix=smart+watch%2Caps%2C698&sr=8-1";
for (String all_ID : windowHandles) {
	

if (driver.switchTo().window(all_ID).getCurrentUrl().equals(url)) {
	System.out.println(url);
	break;
	
}

}
	}


	
	public static void Takes_Screenshot (String path) throws IOException {
		TakesScreenshot ts= (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des =new File(path);
		FileUtils.copyFile(src, des);
	}
	
	public static void url(String URL) {
	driver.get(URL);
	
	}
	
	public static void close() {
		driver.close();
	}
	public static void refresh() {
		driver.navigate().refresh();
	}
	public static void title() {
		driver.getTitle();
		
	}
	public static void currenturl() {
		driver.getCurrentUrl();
	}
	
	public static void right_Click(WebDriver driver, WebElement element) {
		Actions a = new Actions(driver);
		a.contextClick(element).build().perform();
	}

	
	public static void quit() {
		driver.quit();
	}
	public static void navigation(String commands) {
		if (commands.equalsIgnoreCase("refresh")) {
			driver.navigate().refresh();
			
		}
		else if(commands.equalsIgnoreCase("back")) {
			driver.navigate().back();

		}
		else if (commands.equalsIgnoreCase("forward"))
		driver.navigate().forward();
		
	}
	
		
	public static void select_index(WebElement element,int i) {
		Select s = new  Select(element);
		s.selectByIndex(i);
		}
	
	public static void select_value(WebElement element,String S) {
		Select s = new  Select(element);
		s.selectByValue(S);
		
	}
	public static void select_text(WebElement element,String s1) {
		Select s = new  Select(element);
		s.selectByVisibleText(s1);
	}
	
	public static void clear(WebElement e) {
		e.clear();
	}
	public static void gettext(WebElement e) {
		e.getText();
	}
	public static boolean isdisplayed(WebElement e) {
	boolean displayed = e.isDisplayed();
	return displayed;
}
	public static boolean isenabled(WebElement e) {
		boolean enabled = e.isEnabled();
		return enabled;
	}
	public static boolean isselected(WebElement e) {
		boolean selected = e.isSelected();
		return selected;
		
	}
	public static String getAttribute(WebElement e, String name) {
		String attribute = e.getAttribute(name);
		return attribute;
	}
	public static void moveto(WebElement e) {
		Actions a = new Actions(driver);
		a.moveToElement(e).build().perform();
		
	}
	
	public static void click(WebElement e) {
		e.click();
			}
	public static void send_keys(WebElement e, String keys) {
		e.sendKeys(keys);
			}
	public static void java_script (String S) {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView()", S);
	}
	public static void down() throws AWTException {
		Robot r =new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}
	public static void enter() throws AWTException {
		Robot r =new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	
	public static String particular_cell_data(String path,int sheetno,int rowno) throws IOException {
		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheetAt(sheetno);
		Row row = sheet.getRow(rowno);
		Cell c =row.getCell(5);
		
		CellType type =c.getCellType();
		String valueOf="";
		if (type.equals(CellType.STRING)) {
			valueOf = c.getStringCellValue();
			System.out.println(valueOf);

		} else if (type.equals(CellType.NUMERIC)) {
			double numeric = c.getNumericCellValue();
			int i2 = (int) numeric;
			valueOf = String.valueOf(i2);
			System.out.println(valueOf);

		}
		System.out.println(valueOf);
		return valueOf;
	
	
	
	
	
	}


}
