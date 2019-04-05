package page.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import config.ExcelConf;
import page.Home;

public class Post {
	
	// use to make new post
	public static void makeNewPost(WebDriver driver, int i) throws Exception{
		String data;
		ExcelConf.setEFile(ExcelConf.PATH+ExcelConf.EXCELFILE, ExcelConf.POSTSHEET);
		
		// Click post
		
		page.Post.clickNewPostButton(driver);
		Thread.sleep(300);
		
		// Enter post name
		page.Post.clickPostName(driver);
		data = ExcelConf.getEData(i, 1);
		page.Post.sendDataPostName(driver, data);
		Thread.sleep(300);
		
		// Enter post location
		page.Post.clickPostLocation(driver);
		data = ExcelConf.getEData(i, 2);
		page.Post.sendDataPostLocation(driver, data);
		Thread.sleep(300);
		// Choose from drop down menu
		page.Post.getSelectDropbutton(driver);
		data = ExcelConf.getEData(i, 3);
		page.Post.selectDropButton(driver, data);
		Thread.sleep(300);

		// Enter post description
		page.Post.clickDescription(driver);
		data = ExcelConf.getEData(i, 0);
		page.Post.sendDataDescription(driver, data);
		Thread.sleep(300);
		// Submit post
		page.Post.clickPostButton(driver);
		
		
		
	}
	
	public static void postWithAllData(WebDriver driver) throws Exception {
		driver = new ChromeDriver();
		driver.get(config.Constant.URL);
		driver.manage().window().maximize();
		driver.findElement(By.xpath(Home.LUSERNAME)).sendKeys("ivicar88");
		driver.findElement(By.xpath(Home.LPASSWORD)).sendKeys("srbija");
		driver.findElement(By.xpath(Home.LOGIN)).click();
		ExcelConf.setEFile(ExcelConf.PATH+ExcelConf.EXCELFILE,ExcelConf.POSTSHEET);
		for(int i=1;i<ExcelConf.getWorkSheet().getLastRowNum()+1;i++) {
			makeNewPost(driver,i);
			
		}
		driver.close();
		
	}

}
