package page.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import config.ExcelConf;
import page.Home;

public class Registration {

	// Use to automate registration for single user
	public static void registerForm(WebDriver driver, int i) throws Exception {
		String data;
		// Preparing excel file for use
		ExcelConf.setEFile(ExcelConf.PATH + ExcelConf.EXCELFILE,
				ExcelConf.REGSHEET);

		// First name
		Home.clickFirstName(driver);
		data = ExcelConf.getEData(i, 0);
		Home.sendDataFirstName(driver, data);
		Thread.sleep(300);
		// Last name
		Home.clickLastName(driver);
		data = ExcelConf.getEData(i, 1);
		Home.sendDataLastName(driver, data);
		Thread.sleep(300);
		// User name
		Home.clickUsername(driver);
		data = ExcelConf.getEData(i, 2);
		Home.sendDataUsername(driver, data);
		Thread.sleep(300);
		// Email
		Home.clickEmail(driver);
		data = ExcelConf.getEData(i, 3);
		Home.sendDataEmail(driver, data);
		Thread.sleep(300);
		// Password
		Home.clickPassword(driver);
		data = ExcelConf.getEData(i, 4);
		Home.sendDataPassword(driver, data);
		Thread.sleep(300);
		// Register button
		Home.clickRegister(driver);
	}

	public static void regInWithAllData(WebDriver driver) throws Exception {
		ExcelConf.setEFile(ExcelConf.PATH + ExcelConf.EXCELFILE,
				ExcelConf.REGSHEET);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(config.Constant.URL);
		for (int i = 1; i < ExcelConf.getWorkSheet().getLastRowNum() + 1; i++) {
			registerForm(driver, i);
		}
		driver.close();
	}
}
