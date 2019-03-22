package regForma;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestiranjeRegForme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		try {
			driver.get(RegUrl.url);
			driver.findElement(By.xpath(RegUrl.reg)).click();;
			driver.findElement(By.xpath(RegUrl.firstn)).sendKeys(RegUrl.ime);
			driver.findElement(By.xpath(RegUrl.lastn)).sendKeys(RegUrl.prezime);
			driver.findElement(By.xpath(RegUrl.phone)).sendKeys(RegUrl.telefon);
			driver.findElement(By.xpath(RegUrl.email)).sendKeys(RegUrl.mejl);
			driver.findElement(By.xpath(RegUrl.address)).sendKeys(RegUrl.adresa);
			driver.findElement(By.xpath(RegUrl.city)).sendKeys(RegUrl.grad);
			driver.findElement(By.xpath(RegUrl.province)).sendKeys(RegUrl.oblast);
			driver.findElement(By.xpath(RegUrl.zipcode)).sendKeys(RegUrl.postkod);
			Select country = new Select(driver.findElement((By.xpath(RegUrl.dropdown))));
	           country.selectByVisibleText(RegUrl.country);
			driver.findElement(By.xpath(RegUrl.username)).sendKeys(RegUrl.korisIme);
			driver.findElement(By.xpath(RegUrl.password)).sendKeys(RegUrl.lozinka);
			driver.findElement(By.xpath(RegUrl.confpassword)).sendKeys(RegUrl.lozinka);
			driver.findElement(By.xpath(RegUrl.submit)).click();
			driver.findElement(By.xpath(RegUrl.signoff)).click();
			driver.findElement(By.xpath(RegUrl.loginu)).sendKeys(RegUrl.korisIme);
			driver.findElement(By.xpath(RegUrl.loginp)).sendKeys(RegUrl.lozinka);
			driver.findElement(By.xpath(RegUrl.submitLogIn)).click();
			Thread.sleep(5000);
			
		} catch (Exception ex) {
			System.out.println(ex.toString());
			
		} finally {
			driver.quit();
		}

	}

}
