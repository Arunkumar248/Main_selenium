
package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Batch_1 {
public static void main (String[]args) throws Exception {
//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp 14s\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
//	WebDriver Driver = new ChromeDriver();
//	Driver.get("https://www.facebook.com/");
//	Driver.manage().window().maximize();
//	WebElement user =Driver.findElement(By.id("email"));
//	user.sendKeys("Gp_muthu_Thalaivar");
//	WebElement password =Driver.findElement(By.id("pass"));
//	password.sendKeys("paperId");
//	WebElement login = Driver.findElement(By.name("login"));
//	login.click();
//	Driver.navigate().back();
//	Driver.navigate().back();
//	WebElement forget = Driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
//	forget.click();
//	Thread.sleep(6000);
//	Driver.navigate().back();
//	Thread.sleep(5000);
////	WebElement Create = Driver.findElement(null)
//	Driver.close();
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp 14s\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver Driver = new ChromeDriver();
	Driver.get("https://www.google.com/");
	Driver.manage().window().maximize();
	Driver.navigate().to("https://www.etsy.com/in-en/c/home-and-living/home-decor/wall-decor?ref=catnav-891");

}
}
