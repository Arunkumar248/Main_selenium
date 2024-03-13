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

public class Alert_1 {
public static void main (String []args) throws InterruptedException, IOException  {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp 14s\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.bing.com/");
	driver.manage().window().maximize();
	driver.navigate().to("https://demo.automationtesting.in/Alerts.html");
		
	Thread.sleep(2000);
	WebElement Alert_2 = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
	
	JavascriptExecutor JS = (JavascriptExecutor) driver;
	JS.executeScript("arguments[0].click();", Alert_2);
	
	Thread.sleep(2000);
	WebElement Confirmbox =driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	JS.executeScript("arguments[0].click();",Confirmbox );
		
	Thread.sleep(4000);
	driver.switchTo().alert().dismiss();

	TakesScreenshot TS = (TakesScreenshot) driver;
	File snap_1 = TS.getScreenshotAs(OutputType.FILE);
	File Get_1 = new File("C:\\Users\\Hp 14s\\eclipse-workspace\\Selenium\\Screenshot\\confirm.png");
	FileUtils.copyFile(snap_1, Get_1);

	WebElement Acpt_2 = driver.findElement(By.id("demo"));
	String K = Acpt_2.getText();
	System.out.println(K);
	
	Thread.sleep(4000);
	WebElement Textbox = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
	JS.executeScript("arguments[0].click();",Textbox);
	
	Thread.sleep(4000);
	WebElement Promt = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
	JS.executeScript("arguments[0].click();", Promt);
	driver.switchTo().alert().dismiss();
	
	Thread.sleep(2000);
	File Snap_2 = TS.getScreenshotAs(OutputType.FILE);
	File get_2 = new File("C:\\Users\\Hp 14s\\eclipse-workspace\\Selenium\\Screenshot\\promt.png");
	FileUtils.copyFile(Snap_2, get_2);

	
	Thread.sleep(2000);
	driver.close();
}
}
