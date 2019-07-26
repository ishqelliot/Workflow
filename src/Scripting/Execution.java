package Scripting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generic.Constant;
import generic.Property;

public class Execution implements Constant {
	public static void main(String[] args) {
		System.setProperty(Key, value);
		WebDriver driver = new ChromeDriver();
		driver.get(Property.getdata(path, "URL"));
	}
}
