package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.Home;
import page.Post;
import page.testing.Registration;

import java.util.Scanner;

public class Testiranje {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		try {
		/*char test;
		System.out.println("Do you want to start manual or automation testing?"
				+ " Enter 'M' for manual or 'A' for automation");	
		sc.next().charAt(0);*/
		driver.get(page.Home.URL);
		page.testing.ManualLogin(driver);
		page.testing.Login.logWithAllData(driver);
			
		} catch (Exception ex) {
			ex.toString();
		} finally {
			// driver.quit();
		}
		
		
	}

}