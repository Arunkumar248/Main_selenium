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
import org.openqa.selenium.support.ui.Select;


public class Dropdown {
public static void main (String[]args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp 14s\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver Driver = new ChromeDriver();
	Driver.get("https://www.facebook.com/");
	Driver.manage().window().maximize();
	
	WebElement US = Driver.findElement(By.name("email"));
	US.sendKeys("Arun");
	WebElement PW_1 = Driver.findElement(By.id("pass"));
	PW_1.sendKeys("Viruman");
	WebElement LB_1 = Driver.findElement(By.xpath("//button[@type ='submit']"));
	LB_1.click();
	
	Driver.navigate().back();
	Driver.navigate().back();
	Thread.sleep(2000);
	WebElement CNA = Driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	CNA.click();
	
	Thread.sleep(2000);
	WebElement FN = Driver.findElement(By.xpath("//input[@placeholder='First name']"));
	Boolean enabled = FN.isEnabled();
	System.out.println(enabled);
	FN.sendKeys("ARK");
	WebElement SN = Driver.findElement(By.name("lastname"));
	SN.sendKeys("Tharun");
	WebElement MN = Driver.findElement(By.xpath("(//input[@data-type='text'])[3]"));
	MN.sendKeys("2378495744");
	WebElement PW_2 = Driver.findElement(By.xpath("(//input[@type='password'])[2]"));
	PW_2.sendKeys("Serunakls");
	
	WebElement Day = Driver.findElement(By.id("day"));
	Boolean displayed = Day.isDisplayed();
	System.out.println(displayed);
	Select Sel_1 = new Select(Day);
	Sel_1.selectByValue("24");
	
	WebElement Month = Driver.findElement(By.name("birthday_month"));
	Boolean Selected_1 = Month.isSelected();
	System.out.println(Selected_1);
	Select Sel_2 = new Select(Month);
	Sel_2.selectByVisibleText("Aug");

	WebElement Year = Driver.findElement(By.xpath("//select[@aria-label='Year']"));
	Select Sel_3 = new Select(Year);
	Sel_3.selectByIndex(25);
	
	WebElement Female = Driver.findElement(By.xpath("(//input[@name='sex'])[1]"));
	Boolean Selected_2 = Female.isSelected();
	System.out.println(Selected_2);
	
	WebElement Male = Driver.findElement(By.xpath("(//input[@name='sex'])[2]"));
	Male.click();
	Boolean Male_2 = Male.isSelected();
	System.out.println(Male_2);
	
	TakesScreenshot Signup = (TakesScreenshot) Driver;
	File Snap_1 = Signup.getScreenshotAs(OutputType.FILE);
	File Get_1 = new File("C:\\Users\\Hp 14s\\eclipse-workspace\\Selenium\\Screenshot\\Signup_1.png");
	FileUtils.copyFile(Snap_1, Get_1);
	
	WebElement Signup_2 = Driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	Signup_2.click();
	
	Thread.sleep(5000);
	TakesScreenshot ASU = (TakesScreenshot) Driver;
	File Snap_2 = ASU.getScreenshotAs(OutputType.FILE);
	File Get_2 = new File("C:\\Users\\Hp 14s\\eclipse-workspace\\Selenium\\Screenshot\\AFS_2.png");
	FileUtils.copyFile(Snap_2, Get_2);
	
	Thread.sleep(5000);
	Driver.close();
}
}
