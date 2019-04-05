package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DeleteEditPost {

	// XPATHS
	public static final String MENU = "div.container:nth-child(22) div.posts:nth-child(7) div.text div.postheader div.headertxt div.location:nth-child(2) > a:nth-child(3)";
	public static final String DELETE = "div.container:nth-child(22) div.posts:nth-child(7) div.text div.postheader div.headertxt div.location:nth-child(2) div:nth-child(4) a:nth-child(2) > i.fas.fa-trash-alt";
	public static final String EDIT = "div.container:nth-child(22) div.posts:nth-child(7) div.text div.postheader div.headertxt div.location:nth-child(2) div:nth-child(4) > i.fas.fa-edit:nth-child(1)";
	public static final String TITLE = "#title";
	public static final String LOCATION = "#location";
	public static final String TRANSPORT = "#transport";
	public static final String DESCRIPTION = "#description";
	public static final String SUBMIT = "/html/body/div[1]/div[6]/form/input[4]";

	// Open change delete menu
	public static WebElement findPostMenuButton(WebDriver driver) {
		WebElement wbe = driver.findElement(By.cssSelector(MENU));
		return wbe;
	}

	public static void clickPostMenuButton(WebDriver driver) {
		findPostMenuButton(driver).click();
	}

	// Click delete button
	public static WebElement findDeletePostButton(WebDriver driver) {
		WebElement wbe = driver.findElement(By.cssSelector(DELETE));
		return wbe;
	}

	public static void clickDeletePostButton(WebDriver driver) {
		findDeletePostButton(driver).click();
	}

	// Click edit button
	public static WebElement findEditPostButton(WebDriver driver) {
		WebElement wbe = driver.findElement(By.cssSelector(EDIT));
		return wbe;
	}

	public static void clickEditPostButton(WebDriver driver) {
		findEditPostButton(driver).click();
	}

	// Change title status

	public static WebElement findTitleName(WebDriver driver) {
		WebElement wbe = driver.findElement(By.cssSelector(TITLE));
		return wbe;
	}

	public static void clickTitleName(WebDriver driver) {
		findTitleName(driver).click();
	}

	public static void clearTitleName(WebDriver driver) {
		findTitleName(driver).clear();
	}

	public static void sendDataTitleName(WebDriver driver, String data) {
		findTitleName(driver).sendKeys(data);
	}

	// Change location status

	public static WebElement findLocationName(WebDriver driver) {
		WebElement wbe = driver.findElement(By.cssSelector(LOCATION));
		return wbe;
	}

	public static void clickLocationName(WebDriver driver) {
		findLocationName(driver).click();
	}

	public static void clearLocationName(WebDriver driver) {
		findLocationName(driver).clear();
	}

	public static void sendDataLocationName(WebDriver driver, String data) {
		findLocationName(driver).sendKeys(data);
	}

	// Drop down menu - activity (transport)

	public static WebElement getSelectDropbutton(WebDriver driver) {
		WebElement wb = driver.findElement(By.cssSelector(TRANSPORT));
		return wb;
	}

	public static void selectDropButton(WebDriver driver, String activity) {
		Select select = new Select(getSelectDropbutton(driver));
		select.selectByVisibleText(activity);
	}

	// Change description status

	public static WebElement findDescription(WebDriver driver) {
		WebElement wbe = driver.findElement(By.cssSelector(DESCRIPTION));
		return wbe;
	}

	public static void clickDescription(WebDriver driver) {
		findDescription(driver).click();
	}

	public static void clearDescription(WebDriver driver) {
		findDescription(driver).clear();
	}

	public static void sendDataDescription(WebDriver driver, String data) {
		findDescription(driver).sendKeys(data);
	}

	// Submit
	public static WebElement findSubmiButton(WebDriver driver) {
		WebElement wbe = driver.findElement(By.xpath(SUBMIT));
		return wbe;
	}

	public static void clickPostButton(WebDriver driver) {
		findSubmiButton(driver).click();
	}

}
