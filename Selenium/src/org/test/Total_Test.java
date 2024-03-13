package org.test;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class Total_Test {
	public static void main (String[]args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp 14s\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver Driver = new ChromeDriver();
	Driver.get("https://www.google.com/");
	Driver.manage().window().maximize();
	Driver.navigate().to("https://adactinhotelapp.com/");
	Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement Register = Driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
	Register.click();
	
	WebElement US_1 = Driver.findElement(By.name("username"));
	US_1.sendKeys("Arun24896");
	WebElement PW_1 = Driver.findElement(By.id("password"));
	Boolean PW_2=PW_1.isSelected();
	System.out.println("Password is Selected---" + PW_2);
	PW_1.sendKeys("A@RrUuNn123");
	
	WebElement CPW_1 = Driver.findElement(By.id("re_password"));
	CPW_1.sendKeys("A@RrUuNn123");

	WebElement FN_1 = Driver.findElement(By.id("full_name"));
	FN_1.sendKeys("Arunkumar");
	
	WebElement EA_1 = Driver.findElement(By.name("email_add"));
	EA_1.sendKeys("arunkumar24896@gmail.com");
	
	WebElement Tick = Driver.findElement(By.xpath("//input[@type='checkbox']"));
	Tick.click();

}
}
