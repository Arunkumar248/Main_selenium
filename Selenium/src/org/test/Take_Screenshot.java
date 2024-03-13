package org.test;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Take_Screenshot {
public static void main (String[]args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp 14s\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	
	TakesScreenshot Pic = (TakesScreenshot)driver;
	File Snap_1 = Pic.getScreenshotAs(OutputType.FILE);
	File Get_1 = new File("C:\\Users\\Hp 14s\\eclipse-workspace\\Selenium\\ScreenShot\\first.png");
	FileUtils.copyFile(Snap_1, Get_1);
	
}
}