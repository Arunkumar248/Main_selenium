package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Actions_1 {
public static void main (String[]args) throws InterruptedException, IOException, AWTException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp 14s\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver Driver = (WebDriver) new ChromeDriver();
	Driver.get("https://www.google.com/");
	Driver.manage().window().maximize();
	Driver.navigate().to("https://www.facebook.com/");
	Thread.sleep(2000);
	Driver.navigate().back();

	Thread.sleep(2000);
	WebElement Image = Driver.findElement(By.xpath("//a[text()='Images']"));
	Boolean Yt= Image.isEnabled();
	System.out.println(Yt);
	Actions Act = new Actions(Driver);
	Act.contextClick(Image).build().perform();
	
	Robot Rt = new Robot ();
	Rt.keyPress(KeyEvent.VK_PAGE_DOWN);
	Rt.keyRelease(KeyEvent.VK_PAGE_DOWN);
	
	Thread.sleep(2000);
	Rt.keyPress(KeyEvent.VK_PAGE_DOWN);
	Rt.keyRelease(KeyEvent.VK_PAGE_DOWN);

	Thread.sleep(2000);
	Rt.keyPress(KeyEvent.VK_PAGE_UP);
	Rt.keyRelease(KeyEvent.VK_PAGE_UP);
	
	Thread.sleep(2000);
	Rt.keyPress(KeyEvent.VK_PAGE_DOWN);
	Rt.keyRelease(KeyEvent.VK_PAGE_DOWN);

	
	Thread.sleep(2000);
	Rt.keyPress(KeyEvent.VK_PAGE_DOWN);
	Rt.keyRelease(KeyEvent.VK_PAGE_DOWN);
	
	Thread.sleep(2000);
	Rt.keyPress(KeyEvent.VK_ENTER);
	Rt.keyRelease(KeyEvent.VK_ENTER);

	Driver.close();
	TakesScreenshot TS = (TakesScreenshot) Driver;
	File Snap_1 = TS.getScreenshotAs(OutputType.FILE);
	File Get_1= new File("C:\\Users\\Hp 14s\\eclipse-workspace\\Selenium\\Screenshot\\Actions_1.png");
	FileUtils.copyFile(Snap_1, Get_1);

}
}
