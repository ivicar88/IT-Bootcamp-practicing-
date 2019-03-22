package vezbanje;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube extends Url{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver youtube = new ChromeDriver();
		
		try {
			
			youtube.get(url2);
			youtube.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys(performer);
			youtube.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]")).click();
			youtube.findElement(By.xpath("//*[@id=\"img\"]")).click();
			
			List<Youtube> lst1 = new ArrayList<>();
			List<Youtube> lst2 = (List<Youtube>) youtube.findElement(By.className("ytd-compact-video-renderer"));
			System.out.println(lst2.get(2));
			
		} catch (Exception ex) {
			System.out.println(ex.toString());
		} 
		finally {
			
		}

	}

}
