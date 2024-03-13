package org.retest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Lax {

	public static void main (String[]args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp 14s\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();	
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	driver.navigate().to("https://www.etsy.com/in-en/c/home-and-living/home-decor/wall-decor?ref=catnav-891");
}
}
