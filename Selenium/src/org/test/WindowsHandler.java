package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;


public class WindowsHandler {
public static void main (String[]args) throws AWTException, InterruptedException  {
	System.setProperty("webdriver.chrome.drover", "C:\\Users\\Hp 14s\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver driver  = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
	WebElement  BS = driver.findElement(By.xpath ("(//a[text()='Best Sellers'])[2]"));
	
	Actions BS_1 = new Actions(driver);
	BS_1.contextClick().build().perform();
	
	Robot Rt = new Robot();
	Rt.keyPress(KeyEvent.VK_PAGE_DOWN);
	Rt.keyRelease(KeyEvent.VK_PAGE_DOWN);
	
	Thread.sleep(2000);
	Rt.keyPress(KeyEvent.VK_ENTER);
	Rt.keyRelease(KeyEvent.VK_ENTER);
	
	int K = driver.getWindowHandles().size();
	System.out.println(K);
}
}
