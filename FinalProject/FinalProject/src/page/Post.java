package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Post {
	
	// XPATHS
	// For making new post
	public static final String NEWPOST = "//*[@id=\"newPostBtn\"]/a";
	public static final String POSTNAME = "/html/body/div[1]/div[4]/form/input[1]";
	public static final String POSTLOCATION = "/html/body/div[1]/div[4]/form/input[2]";
	public static final String BROWSE = "/html/body/div[1]/div[4]/form/label";
	public static final String DROPBUTTON = "/html/body/div[1]/div[4]/form/select";
	public static final String DESCRIPTION = "/html/body/div[1]/div[4]/form/textarea";
	public static final String POST = "/html/body/div[1]/div[4]/form/input[3]";
	
	// Make post
	public static WebElement findNewPostButton (WebDriver driver) {
		WebElement wbe = driver.findElement(By.xpath(NEWPOST));
		return wbe;
	}
	
	public static void clickNewPostButton (WebDriver driver) {
		findNewPostButton(driver).click();
	} 
	
	// Post name
	
	public static WebElement findPostName (WebDriver driver) {
		WebElement wbe = driver.findElement(By.xpath(POSTNAME));
		return wbe;
	}
	
	public static void clickPostName (WebDriver driver) {
		findPostName(driver).click();
	} 
	
	public static void sendDataPostName (WebDriver driver, String data) {
		findPostName(driver).sendKeys(data);
	}
	
	// Post Location
	
	public static WebElement findPostLocation (WebDriver driver) {
		WebElement wbe = driver.findElement(By.xpath(POSTLOCATION));
		return wbe;
	}
	
	public static void clickPostLocation (WebDriver driver) {
		findPostLocation(driver).click();
	} 
	
	public static void sendDataPostLocation (WebDriver driver, String data) {
		findPostLocation(driver).sendKeys(data);
	}
	
	// Drop down
	public static WebElement getSelectDropbutton(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(DROPBUTTON));
		return wb;
	}
	
	public static void selectDropButton(WebDriver driver, String activity) {
		Select select = new Select(getSelectDropbutton(driver));
		select.selectByVisibleText(activity);
	}
	
	
	// Description
	
	public static WebElement findDescription (WebDriver driver) {
		WebElement wbe = driver.findElement(By.xpath(DESCRIPTION));
		return wbe;
	}
	
	public static void clickDescription (WebDriver driver) {
		findDescription(driver).click();
	} 
	
	public static void sendDataDescription (WebDriver driver, String data) {
		findDescription(driver).sendKeys(data);
	}
	
	// Post
	public static WebElement findPostButton (WebDriver driver) {
		WebElement wbe = driver.findElement(By.xpath(POST));
		return wbe;
	}
	
	public static void clickPostButton (WebDriver driver) {
		findPostButton(driver).click();
	}
}
