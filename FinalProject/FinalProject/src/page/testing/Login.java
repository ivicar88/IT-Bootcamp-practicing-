package page.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import config.ExcelConf;
import page.Home;

public class Login {

	// Use to automate log in for single user
	public static void loginForm(WebDriver driver, int i) throws Exception {
		String data;
		// Preparing excel file for use
		ExcelConf.setEFile(ExcelConf.PATH + ExcelConf.EXCELFILE,
				ExcelConf.REGSHEET);

		// Username
		Home.clickLUsername(driver);
		data = ExcelConf.getEData(i, 2);
		Thread.sleep(300);
		Home.sendDataLUsername(driver, data);

		// Password
		Home.clickLPassword(driver);
		data = ExcelConf.getEData(i, 4);
		Thread.sleep(300);
		Home.sendDataLPassword(driver, data);

		// Login button
		Home.clickLogin(driver);

		// Logout button
		Home.clickLogout(driver);
	}

	public static void logWithAllData(WebDriver driver) throws Exception {
		ExcelConf.setEFile(ExcelConf.PATH + ExcelConf.EXCELFILE,
				ExcelConf.REGSHEET);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(config.Constant.URL);
		for (int i = 1; i < ExcelConf.getWorkSheet().getLastRowNum() + 1; i++) {
			loginForm(driver, i);

		}
		driver.quit();
	}

}