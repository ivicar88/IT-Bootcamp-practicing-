package test;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

public class PostTest {
	
	public static void manualOrAutoPost(WebDriver driver) throws Exception {
		Scanner sc = new Scanner(System.in);
		char a;
		
		System.out.println("Welcome to Post testing. Do you want to start manual or automation testing?"
				+ " Enter 'M' or 'A'");
		a = sc.nextLine().charAt(0);

		if (a == 'A' || a == 'a') {
			System.out.println("Automation");
			
			page.testing.Post.postWithAllData(driver);
			//driver.quit();
		} else if (a == 'M' || a == 'm') {
			System.out.println("Do you want to make new post or to update the old one? Enter N for 'New' or U for 'Update'");
			page.testing.Manual.manualMakePost(driver);
			//driver.quit();
		} else {
			System.out.println("Wrong characther, try again");
		}
		
		

	}

}
