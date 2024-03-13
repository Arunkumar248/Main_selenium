package org.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
public static void main (String[]args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp 14s\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver Driver = new ChromeDriver(); 
	Driver.get("https://demo.automationtesting.in/Frames.html");
	Driver.manage().window().maximize();
	
	WebElement Single_1 = Driver.findElement(By.id("singleframe"));
	Driver.switchTo().frame(Single_1);
	
	Thread.sleep(2000);
	WebElement Single = Driver.findElement(By.xpath("//input[@type='text']"));
	Single.sendKeys("Vk");
	
	Thread.sleep(2000);
	TakesScreenshot TS = (TakesScreenshot)Driver;
	File Snap_1 = TS.getScreenshotAs(OutputType.FILE);
	File Get_1= new File ("C:\\Users\\Hp 14s\\eclipse-workspace\\Selenium\\Screenshot\\Single_1.png");
	FileUtils.copyFile(Snap_1, Get_1);
	
	Thread.sleep(2000);
	Driver.switchTo().defaultContent();
	
	Thread.sleep(2000);

	WebElement Multi =Driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
	Multi.click();
	
	Thread.sleep(2000);
//	WebElement Multi_1= Driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
	Driver.switchTo().frame(0);
	
	Thread.sleep(2000);
	WebElement Multi_2 = Driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
	Driver.switchTo().frame(Multi_2);
	
	Thread.sleep(2000);
	WebElement Multi_3 = Driver.findElement(By.xpath("//input[@type='text']"));
	Boolean M_3 = Multi_3.isEnabled();
	System.out.print(M_3);
	Multi_3.sendKeys("Rohit");
	
	Driver.switchTo().defaultContent();
	
	Thread.sleep(2000);
	WebElement Vedio = Driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[5]"));
	Vedio.click();
	
	Thread.sleep(2000);
	File Snap_2 = TS.getScreenshotAs(OutputType.FILE);
	File Get_2 = new File("C:\\Users\\Hp 14s\\eclipse-workspace\\Selenium\\Screenshot\\Multi_1.png");
	FileUtils.copyFile(Snap_2, Get_2);
	
	Thread.sleep(2000);
//	Driver.close();
}
}