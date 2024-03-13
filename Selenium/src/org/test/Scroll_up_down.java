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
import org.openqa.selenium.remote.server.handler.FindElement;

public class Scroll_up_down {
public static void main (String[]args) throws InterruptedException, IOException  {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Hp 14s\\\\eclipse-workspace\\\\Selenium\\\\Drivers\\\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	driver.navigate().to("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=58075519359&hvpone=&hvptwo=&hvadid=486462454211&hvpos=&hvnetw=g&hvrand=11599742814359932299&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061890&hvtargid=kwd-64107830&hydadcr=14452_2154371&gclid=EAIaIQobChMInq7agcam-gIVfp1LBR0jOgeFEAAYASAAEgK5N_D_BwE");
	
	TakesScreenshot TS = (TakesScreenshot) driver;
	Thread.sleep(3000);
	File Snap_1 = TS.getScreenshotAs(OutputType.FILE);
	File Get_1 = new File("C:\\Users\\Hp 14s\\eclipse-workspace\\Selenium\\Screenshot\\Amazon_1.png");
	FileUtils.copyFile(Snap_1, Get_1);
	
	Thread.sleep(3000);
	JavascriptExecutor JS = (JavascriptExecutor) driver;
	JS.executeScript("window.scroll(0,9000);", "");
	
	Thread.sleep(3000);
	File Snap_2 = TS.getScreenshotAs(OutputType.FILE);
	File Get_2 = new File("C:\\Users\\Hp 14s\\eclipse-workspace\\Selenium\\Screenshot\\Amazon_2.png");
	FileUtils.copyFile(Snap_2, Get_2);
	
	Thread.sleep(3000);
	JS.executeScript("window.scroll(0,-9000);", "");
	
	Thread.sleep(3000);
	JS.executeScript("window.scroll(0,3000);", "");
	File Snap_3 = TS.getScreenshotAs(OutputType.FILE);
	File Get_3 = new File("C:\\Users\\Hp 14s\\eclipse-workspace\\Selenium\\Screenshot\\Amazon_3.png");
	FileUtils.copyFile(Snap_3, Get_3);
	
	Thread.sleep(3000);
	JS.executeScript("window.scroll(0,-3000);", "");
	
	Thread.sleep(3000);
	JS.executeScript("window.scroll(0,9000);" ,"");
		
	Thread.sleep(5000);
	WebElement j = driver.findElement(By.xpath("//a[text()='Japan']"));
	j.click();
	
	Thread.sleep(5000);
	File Snap_4 =  TS.getScreenshotAs(OutputType.FILE);
	File Get_4 = new File("C:\\Users\\Hp 14s\\eclipse-workspace\\Selenium\\Screenshot\\Japan_1.png");
	FileUtils.copyFile(Snap_4, Get_4);
	
	Thread.sleep(3000);	
	driver.close();
}
}