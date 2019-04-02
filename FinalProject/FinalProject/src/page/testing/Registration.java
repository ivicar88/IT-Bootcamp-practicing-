package page.testing;

import org.openqa.selenium.WebDriver;

import config.ExcelConf;
import page.Home;

public class Registration {
	
	
	// Use to automate registration for singe user
	public static void registerForm(WebDriver driver, int i) throws Exception{
	String data;
	// Preparing excel file for use
	ExcelConf.setEFile(ExcelConf.PATH+ExcelConf.EXCELFILE, ExcelConf.REGSHEET);
	
	// First name
	Home.clickFirstName(driver);
	data = ExcelConf.getEData(i, 0);
	Home.sendDataFirstName(driver, data);
	
	// Last name
	Home.clickLastName(driver);
	data = ExcelConf.getEData(i, 1);
	Home.sendDataLastName(driver, data);
	
	// Username
	Home.clickUsername(driver);
	data = ExcelConf.getEData(i, 2);
	Home.sendDataUsername(driver, data);
	
	// Email
	Home.clickEmail(driver);
	data = ExcelConf.getEData(i, 3);
	Home.sendDataEmail(driver, data);
	
	// Password
	Home.clickPassword(driver);
	data = ExcelConf.getEData(i, 4);
	Home.sendDataPassword(driver, data);
	
	// Register button
	Home.clickRegister(driver);
	}
	
	public static void regInWithAllData(WebDriver driver) throws Exception {
		ExcelConf.setEFile(ExcelConf.PATH+ExcelConf.EXCELFILE,ExcelConf.REGSHEET);
		for(int i=1;i<ExcelConf.getWorkSheet().getLastRowNum()+1;i++) {
			registerForm(driver,i);
			
		}
		
		
	}

}
