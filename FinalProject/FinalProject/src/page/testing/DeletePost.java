package page.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeletePost {
	// Use to delete first two posts
	public static void deletFirstTwoPosts(WebDriver driver) throws Exception {

		// Starting browser
		driver = new ChromeDriver();
		driver.get(config.Constant.URL);
		driver.manage().window().maximize();

		// Forwarding predefined user name and password
		page.Home.clickLUsername(driver);
		Thread.sleep(300);
		page.Home.sendDataLUsername(driver, config.Constant.USERNAME);
		Thread.sleep(300);
		page.Home.clickLPassword(driver);
		Thread.sleep(300);
		page.Home.sendDataLPassword(driver, config.Constant.PASSWORD);
		Thread.sleep(300);

		// Click login button
		page.Home.clickLogin(driver);
		Thread.sleep(300);

		// Open post or edit menu
		page.DeleteEditPost.findPostMenuButton(driver);
		Thread.sleep(300);
		page.DeleteEditPost.clickPostMenuButton(driver);
		Thread.sleep(400);
		// Click on delete post
		page.DeleteEditPost.findDeletePostButton(driver);
		Thread.sleep(300);
		page.DeleteEditPost.clickDeletePostButton(driver);
		Thread.sleep(400);
		// Open post or edit menu
		page.DeleteEditPost.findPostMenuButton(driver);
		Thread.sleep(300);
		page.DeleteEditPost.clickPostMenuButton(driver);
		Thread.sleep(400);
		// Click on delete post
		page.DeleteEditPost.findDeletePostButton(driver);
		Thread.sleep(300);
		page.DeleteEditPost.clickDeletePostButton(driver);
		
		driver.quit();
	}
}
