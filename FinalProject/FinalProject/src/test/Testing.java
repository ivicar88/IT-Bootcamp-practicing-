package test;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import config.ExcelConf;
import page.testing.*;

public class Testing {

	public static void manualOrAutoLog(WebDriver driver) throws Exception {
		Scanner sc = new Scanner(System.in);
		char a;
		System.out.println("Welcome to testing. Do you want to start manual or automation testing?"
						+ " Enter 'A' or 'M'");
		a = sc.nextLine().charAt(0);

		if (a == 'A' || a == 'a') {
			System.out.println("Automation");
			Registration.regInWithAllData(driver);
			Login.logWithAllData(driver);
			Post.postWithAllData(driver);
			DeletePost.deletFirstTwoPosts(driver);
			// driver.close();

		} else if (a == 'M' || a == 'm') {
			System.out.println("Manual");
			System.out.println("Manual registration");
			Manual.manualRegistration(driver);
			System.out.println("Manual login");
			Manual.manualLogin(driver);
			System.out.println("Make post manually");
			Manual.manualMakePost(driver);
			System.out.println("Change post manually");
			Manual.manualChangePost(driver);
		//	driver.quit();
		} else {
			System.out.println("Wrong characther, try again");
			
		}
		

	}


}
