package testing;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class temp {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Properties p = new Properties();
		
		try {
			p.load(new FileInputStream(".data.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		driver.get("https://gaana.com");
		driver.findElement(By.id("sb")).sendKeys("automation");
		
		String t = driver.getTitle();
		String url = driver.getCurrentUrl();
		System.out.println("title"+t);
		System.out.println("URL"+url);
		//driver.close();
	}
}
