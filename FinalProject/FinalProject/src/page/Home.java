package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home {
	
	// link for site
	public static final String URL = "http://localhost:80/izlet/";
	
	// XPATHS
	// For Registration
	public static final String RFIRSTNAME = "/html/body/div[3]/div[2]/form/input[1]";
	public static final String RLASTNAME = "/html/body/div[3]/div[2]/form/input[2]";
	public static final String RUSERNAME = "/html/body/div[3]/div[2]/form/input[3]";
	public static final String REMAIL = "/html/body/div[3]/div[2]/form/input[4]";
	public static final String RPASSWORD = "/html/body/div[3]/div[2]/form/input[5]";
	public static final String REGISTER = "//*[@id=\"blue_btn\"]";
	
	// For Login
	public static final String LUSERNAME = "/html/body/div[3]/div[1]/form/input[1]";
	public static final String LPASSWORD = "/html/body/div[3]/div[1]/form/input[2]";
	public static final String LOGIN = "/html/body/div[3]/div[1]/form/input[3]";
	public static final String LOGOUT= "//*[@id=\"logoutBtn\"]";
	
	// opens Home Page
	public static void openHomePage(WebDriver driver) {
		driver.get(URL);
	}
	
	// REGISTRATION 
	// First Name
	public static WebElement findFirstName (WebDriver driver) {
		WebElement wbe = driver.findElement(By.xpath(RFIRSTNAME));
		return wbe;
	}
	
	public static void clickFirstName (WebDriver driver) {
		findFirstName(driver).click();
	} 
	
	public static void sendDataFirstName (WebDriver driver, String data) {
		findFirstName(driver).sendKeys(data);
	}
	
	// Last Name
	public static WebElement findLastName (WebDriver driver) {
		WebElement wbe = driver.findElement(By.xpath(RLASTNAME));
		return wbe;
	}
	
	public static void clickLastName (WebDriver driver) {
		findLastName(driver).click();
	} 
	
	public static void sendDataLastName (WebDriver driver, String data) {
		findLastName(driver).sendKeys(data);
	}
	
	// User name
	public static WebElement findUsername (WebDriver driver) {
		WebElement wbe = driver.findElement(By.xpath(RUSERNAME));
		return wbe;
	}
	
	public static void clickUsername (WebDriver driver) {
		findUsername(driver).click();
	} 
	
	public static void sendDataUsername (WebDriver driver, String data) {
		findUsername(driver).sendKeys(data);
	}
	
	// Email
	public static WebElement findEmail (WebDriver driver) {
		WebElement wbe = driver.findElement(By.xpath(REMAIL));
		return wbe;
	}
	
	public static void clickEmail (WebDriver driver) {
		findEmail(driver).click();
	} 
	
	public static void sendDataEmail (WebDriver driver, String data) {
		findEmail(driver).sendKeys(data);
	}
	
	// Password
	public static WebElement findPassword (WebDriver driver) {
		WebElement wbe = driver.findElement(By.xpath(RPASSWORD));
		return wbe;
	}
	
	public static void clickPassword (WebDriver driver) {
		findPassword(driver).click();
	} 
	
	public static void sendDataPassword (WebDriver driver, String data) {
		findPassword(driver).sendKeys(data);
	}
	
	// Register button
	public static WebElement findRegister (WebDriver driver) {
		WebElement wbe = driver.findElement(By.xpath(REGISTER));
		return wbe;
	}
	
	public static void clickRegister (WebDriver driver) {
		findRegister(driver).click();
	} 
	
	// Return to home page after registration
	public static void navigateTo(WebDriver dr) {
		dr.navigate().to(URL);
	}
	
	
	
	//LOGIN
	//User name
	public static WebElement findLUsername (WebDriver driver) {
		WebElement wbe = driver.findElement(By.xpath(LUSERNAME));
		return wbe;
	}
	
	public static void clickLUsername (WebDriver driver) {
		findLUsername(driver).click();
	} 
	
	public static void sendDataLUsername (WebDriver driver, String data) {
		findLUsername(driver).sendKeys(data);
	}
	
	// Password
	public static WebElement findLPassword (WebDriver driver) {
		WebElement wbe = driver.findElement(By.xpath(LPASSWORD));
		return wbe;
	}
	
	public static void clickLPassword (WebDriver driver) {
		findLPassword(driver).click();
	} 
	
	public static void sendDataLPassword (WebDriver driver, String data) {
		findLPassword(driver).sendKeys(data);
	}
	
	// Login button
	public static WebElement findLogin (WebDriver driver) {
		WebElement wbe = driver.findElement(By.xpath(LOGIN));
		return wbe;
	}
	
	public static void clickLogin (WebDriver driver) {
		findLogin(driver).click();
	}
	
	// Logout button
	public static WebElement findLogout (WebDriver driver) {
		WebElement wbe = driver.findElement(By.xpath(LOGOUT));
		return wbe;
	}
	
	public static void clickLogout (WebDriver driver) {
		findLogout(driver).click();
	}
	
}
