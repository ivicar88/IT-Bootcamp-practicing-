package page.testing;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import config.ExcelConf;
import page.Home;

public class Manual {

	public static void manualRegistration(WebDriver driver) throws Exception {
		String firstName;
		String lastName;
		String username;
		String email;
		String password;


		Scanner sc = new Scanner(System.in);
		// First name
		System.out.println("Enter first name: ");
		firstName = sc.nextLine();
		// Last name
		System.out.println("Enter last name: ");
		lastName = sc.nextLine();
		// User name
		System.out.println("Enter username: ");
		username = sc.nextLine();
		// Email
		System.out.println("Enter email: ");
		email = sc.nextLine();
		// Password
		System.out.println("Enter password: ");
		password = sc.nextLine();
		
		driver = new ChromeDriver();
		driver.get(config.Constant.URL);

		// Browser will have full size
		driver.manage().window().maximize();

		// First name
		Home.clickFirstName(driver);
		Home.sendDataFirstName(driver, firstName);
		Thread.sleep(300);
		// Last name
		Home.clickLastName(driver);
		Home.sendDataLastName(driver, lastName);
		Thread.sleep(300);
		// User name
		Home.clickUsername(driver);
		Home.sendDataUsername(driver, username);
		Thread.sleep(300);
		// Email
		Home.clickEmail(driver);
		Home.sendDataEmail(driver, email);
		Thread.sleep(300);
		// Password
		Home.clickPassword(driver);
		Home.sendDataPassword(driver, password);
		Thread.sleep(300);
		// Register button
		Home.clickRegister(driver);
		
		driver.close();

	}

	public static void manualLogin(WebDriver driver) throws Exception {

		String username;
		String password;
		Scanner sc = new Scanner(System.in);

		// User name
		System.out.println("Enter username: ");
		username = sc.nextLine();
		// Password
		System.out.println("Enter password: ");
		password = sc.nextLine();
		
		driver = new ChromeDriver();
		driver.get(config.Constant.URL);

		// Browser will have full size
		driver.manage().window().maximize();

		// Forwarding inputed user name and password
		page.Home.clickLUsername(driver);
		page.Home.sendDataLUsername(driver, username);
		Thread.sleep(300);
		page.Home.clickLPassword(driver);
		page.Home.sendDataLPassword(driver, password);
		Thread.sleep(300);
		// Click login button
		page.Home.clickLogin(driver);
		
		Thread.sleep(500);
		
		//click logout button
		page.Home.clickLogout(driver);
		
		driver.close();

	}

	public static void manualMakePost(WebDriver driver) throws Exception {
		String postName;
		String postLocation;
		// String browse;
		String activity;
		String description;

		Scanner sc = new Scanner(System.in);

		// Post Name
		System.out.println("Enter post name: ");
		postName = sc.nextLine();
		// Post Location
		System.out.println("Enter post location: ");
		postLocation = sc.nextLine();
		
		// Activity
		System.out.println("Enter post activity(transport): Walk, Car, Motorbike, Bicycle, Bus ");
		activity = sc.nextLine();
		// Description
		System.out.println("Enter post description: ");
		description = sc.nextLine();

		// Starting browser
		driver = new ChromeDriver();
		driver.get(config.Constant.URL);

		// Browser will have full size
		driver.manage().window().maximize();

		// Predefine login data
		page.Home.clickLUsername(driver);
		page.Home.sendDataLUsername(driver, config.Constant.USERNAME);
		Thread.sleep(300);
		page.Home.clickLPassword(driver);
		page.Home.sendDataLPassword(driver, config.Constant.PASSWORD);
		Thread.sleep(300);
		// Click login button
		page.Home.clickLogin(driver);

		// Forwarding inputed data
		// click on new post button
		page.Post.clickNewPostButton(driver);
		Thread.sleep(300);
		// Enter post name
		page.Post.clickPostName(driver);
		page.Post.sendDataPostName(driver, postName);
		Thread.sleep(300);
		// Enter post location
		page.Post.clickPostLocation(driver);
		page.Post.sendDataPostLocation(driver, postLocation);
		Thread.sleep(300);
		/*
		 * // Browse picture page.Post.clickBrowse(driver);
		 * page.Post.sendDataBrowse(driver, browse);
		 */
		// Choose from drop down menu
		page.Post.clickPostLocation(driver);
		page.Post.sendDataPostLocation(driver, activity);
		Thread.sleep(300);
		// Description
		page.Post.clickDescription(driver);
		page.Post.sendDataDescription(driver, description);
		Thread.sleep(300);

		// Submit post
		page.Post.clickPostButton(driver);
		
		driver.close();

	}

	public static void manualChangePost(WebDriver driver) throws InterruptedException {

		String postName;
		String postLocation;
		String activity;
		String description;

		Scanner sc = new Scanner(System.in);

		// Post Name
		System.out.println("Change post name: ");
		postName = sc.nextLine();
		// Post Location
		System.out.println("Change post location: ");
		postLocation = sc.nextLine();
		// Activity
		System.out.println("Change post activity(transport): Walk, Car, Motorbike, Bicycle, Bus ");
		activity = sc.nextLine();
		// Description
		System.out.println("Change post description: ");
		description = sc.nextLine();

		// Starting browser
		driver = new ChromeDriver();
		driver.get(config.Constant.URL);

		// Browser will have full size
		driver.manage().window().maximize();

		// Predefine login data
		page.Home.clickLUsername(driver);
		page.Home.sendDataLUsername(driver, config.Constant.USERNAME);
		Thread.sleep(300);
		page.Home.clickLPassword(driver);
		page.Home.sendDataLPassword(driver, config.Constant.PASSWORD);
		Thread.sleep(300);
		// Click login button
		page.Home.clickLogin(driver);

		// Forwarding inputed data
		// Open post or edit menu
		page.DeleteEditPost.findPostMenuButton(driver);
		page.DeleteEditPost.clickPostMenuButton(driver);
		Thread.sleep(300);
		// Click on Edit post
		page.DeleteEditPost.findEditPostButton(driver);
		page.DeleteEditPost.clickEditPostButton(driver);
		Thread.sleep(300);
		// Change Title
		page.DeleteEditPost.findTitleName(driver);
		page.DeleteEditPost.clickTitleName(driver);
		Thread.sleep(300);
		page.DeleteEditPost.clearTitleName(driver);
		page.DeleteEditPost.sendDataTitleName(driver, postName);
		Thread.sleep(300);
		// Change Location
		page.DeleteEditPost.findLocationName(driver);
		page.DeleteEditPost.clickLocationName(driver);
		Thread.sleep(300);
		page.DeleteEditPost.clearLocationName(driver);
		page.DeleteEditPost.sendDataLocationName(driver, postLocation);
		Thread.sleep(300);
		// Change activity
		page.DeleteEditPost.getSelectDropbutton(driver);
		page.DeleteEditPost.selectDropButton(driver, activity);
		Thread.sleep(300);
		// change description
		page.DeleteEditPost.findDescription(driver);
		page.DeleteEditPost.clickDescription(driver);
		Thread.sleep(300);
		page.DeleteEditPost.clearDescription(driver);
		page.DeleteEditPost.sendDataDescription(driver, description);
		Thread.sleep(300);
		// Submit edited post
		page.DeleteEditPost.findSubmiButton(driver);
		page.DeleteEditPost.clickPostButton(driver);
		Thread.sleep(300);
		driver.close();

	}

}
