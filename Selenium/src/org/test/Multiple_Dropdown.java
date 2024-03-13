package org.test;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Dropdown {
	public static void main (String[]args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp 14s\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		Driver.manage().window().maximize();
	
		Thread.sleep(3000);
		JavascriptExecutor JE = (JavascriptExecutor) Driver;
		JE.executeScript("window.scroll(0,9000);", "");
		
		Thread.sleep(3000);		
		WebElement WE = Driver.findElement(By.className("panel-heading"));
		JE.executeScript("arguments[0].scrollIntoView();", WE);
		
		TakesScreenshot TS = (TakesScreenshot) Driver;
		File Snap_1 = TS.getScreenshotAs(OutputType.FILE);
		File Get_1 = new File("C:\\Users\\Hp 14s\\eclipse-workspace\\Selenium\\Screenshot\\SED.png");
		FileUtils.copyFile(Snap_1, Get_1);
	
		Thread.sleep(3000);
		WebElement SD = Driver.findElement(By.id("select-demo"));
		Select SL = new Select(SD);
		Boolean K = SL.isMultiple();
		System.out.println(K);
		SL.selectByVisibleText("Thursday");
		
		System.out.println("*************");
		
		WebElement MSD = Driver. findElement(By.name("States"));
		Select MSD_1 = new Select(MSD);
		Boolean multiple = MSD_1.isMultiple();
		System.out.println(multiple);
		
		List<WebElement> options = MSD_1.getOptions();
		for (WebElement web : options) {
			MSD_1.selectByIndex(0);
			
		int size = options.size();	
			for(int i=0; i<=size; i++) {
				if(i==2 || i==4 ||i==6) {
					MSD_1.selectByIndex(i);
				}
			}
			System.out.println(web.getText());
		}
		File Snap_2 = TS.getScreenshotAs(OutputType.FILE);
		File Get_2 = new File("C:\\Users\\Hp 14s\\eclipse-workspace\\Selenium\\Screenshot\\MSD.png");
		FileUtils.copyFile(Snap_2,Get_2);
		
//		Driver.close();
}
}
