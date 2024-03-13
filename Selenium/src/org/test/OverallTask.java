package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

public class OverallTask {
public static void main (String[]args) throws InterruptedException, AWTException, IOException  {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp 14s\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver Driver = new ChromeDriver();
	Driver.get("https://www.google.co.in/");
	Driver.manage().window().maximize();
	
	Driver.navigate().to("https://www.amazon.in/");
	
	JavascriptExecutor JE = (JavascriptExecutor) Driver;
	Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement Japan = Driver.findElement(By.xpath("//a[text()='France']"));
	JE.executeScript("arguments[0].scrollIntoView();",Japan);
//	Thread.sleep(4000);
	JE.executeScript("arguments[0].click();", Japan);
	
//	Thread.sleep(2000);
	WebElement AIC =Driver.findElement(By.id("sp-cc-accept"));
	JE.executeScript("arguments[0].click();", AIC);
	
//	Thread.sleep(2000);
	JE.executeScript("window.scrollBy(0,9000);", "scrolldown");
	
	WebElement India = Driver.findElement(By.xpath("//a[text()='Inde']"));
	JE.executeScript("arguments[0].click();", India);
	
//	Thread.sleep(2000);
	WebElement BS = Driver.findElement(By.xpath("//a[text()='Best Sellers']"));
	
//	Thread.sleep(2000);
	Actions AS = new Actions (Driver);
	AS.contextClick(BS).build().perform();

	Robot RT = new Robot();
	RT.keyPress(KeyEvent.VK_PAGE_DOWN);
	RT.keyRelease(KeyEvent.VK_PAGE_DOWN);
	
	RT.keyPress(KeyEvent.VK_ENTER);
	RT.keyRelease(KeyEvent.VK_ENTER);
	
	int Size_W = Driver.getWindowHandles().size();
	System.out.println(Size_W);
	
//	Thread.sleep(2000);
	Set<String>Title=Driver.getWindowHandles();
	System.out.println(Title);
	
	for (String Title_name : Title) {
		String K = Driver.switchTo().window(Title_name).getTitle();
		System.out.println(K);
	}
	TakesScreenshot TS =  (TakesScreenshot) Driver ;
	File snap_1 = TS.getScreenshotAs(OutputType.FILE);
	File Get_1 = new File("C:\\Users\\Hp 14s\\eclipse-workspace\\Selenium\\Screenshot\\OV_Task_1.png");
	FileUtils.copyFile(snap_1, Get_1);

	
}
}
