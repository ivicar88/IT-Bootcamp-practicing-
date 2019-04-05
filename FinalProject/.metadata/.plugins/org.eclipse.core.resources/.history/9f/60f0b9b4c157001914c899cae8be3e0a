package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testiranje {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();

		try {
			RegTest.manualOrAutoReg(driver);
			LogTest.manualOrAutoLog(driver);
			PostTest.manualOrAutoPost(driver);
			
		} catch (Exception ex) {
			ex.toString();
		} finally {
			driver.quit();
		}

	}
}
