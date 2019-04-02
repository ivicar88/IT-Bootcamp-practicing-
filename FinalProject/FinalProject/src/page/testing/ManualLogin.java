package page.testing;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import config.ExcelConf;

public class ManualLogin {
	
	
	public static void main(String[] args) {
		
		
		String username;
		String password;
		Scanner sc = new Scanner(System.in);
		
		// Username
		System.out.println("Enter username: ");
		username = sc.nextLine();
		// Password
		System.out.println("Enter password: ");
		password = sc.nextLine();
		WebDriver driver = new ChromeDriver();
		driver.get(page.Home.URL);
		driver.manage().window().maximize();
		page.Home.clickLUsername(driver);
		page.Home.sendDataLUsername(driver, username);
		
		page.Home.clickLPassword(driver);
		page.Home.sendDataLPassword(driver, password);
		
		
		page.Home.clickLogin(driver);
		
	}

}
