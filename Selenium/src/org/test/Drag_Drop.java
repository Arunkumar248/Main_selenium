package org.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {
public static void main (String[]args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp 14s\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	driver.navigate().to("https://leafground.com/drag.xhtml");
	
	Thread.sleep(2000);
	WebElement From = driver.findElement(By.id("form:drag_content"));
	WebElement To = driver.findElement(By.id("form:drop_content"));
	
	Actions Drag = new Actions(driver);
	Drag.dragAndDrop(From, To).build().perform();
	
	Thread.sleep(2000);
	TakesScreenshot TS = (TakesScreenshot) driver;
	File Snap_1 = TS.getScreenshotAs(OutputType.FILE);
	File Get_1 = new File("C:\\Users\\Hp 14s\\eclipse-workspace\\Selenium\\Screenshot\\Drag&Drop_1.png");
	FileUtils.copyFile(Snap_1, Get_1);

	Thread.sleep(2000);
	JavascriptExecutor JS = (JavascriptExecutor) driver;
	WebElement Start_1 = driver.findElement(By.xpath("//th[@aria-label='Name']"));
	JS.executeScript("arguments[0].scrollIntoView();", Start_1);
	
	Thread.sleep(2000);
	WebElement From_1 = driver.findElement(By.xpath("(//tr[@role='row'])[16]"));
	WebElement To_1 =driver.findElement(By.xpath("(//tr[@role='row'])[13]"));
//	Drag.dragAndDrop(From_1,To_1).build().perform();
	Drag.clickAndHold(From_1).moveToElement(To_1).release().perform();
	
	Thread.sleep(2000);
	File Snap_2 = TS .getScreenshotAs(OutputType.FILE);
	File Get_2 = new File("C:\\Users\\Hp 14s\\eclipse-workspace\\Selenium\\Screenshot\\Drag&Drop_2.png");
	FileUtils.copyFile(Snap_2, Get_2);
	
	Thread.sleep(2000);
	WebElement Start = driver.findElement(By.xpath("//button[@role='button']"));
	Start.click();
//	driver.close();
}
}
