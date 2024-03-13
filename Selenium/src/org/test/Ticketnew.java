package org.test;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ticketnew {
	
	public static void main (String[]args) throws IOException, InterruptedException, AWTException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp 14s\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.ticketnew.com/Movie-Ticket-Online-booking/C/Chennai");
		
//		WebElement login_1 = driver.findElement(By.className("text"));
//		
//		login_1.click();
//		
//		WebElement Username_1 = driver.findElement(By.id("txtEmail"));
//		
//		Username_1.sendKeys("Arunkumar24896@gmail.com");
//		
//		Thread.sleep(2000);			
//		
//		WebElement Password_1 = driver.findElement(By.id("txtpwd"));
//		
//		Password_1.sendKeys("luckystar");
//		
//		Thread.sleep(2000);
//		
//		WebElement Rbt_1 = driver.findElement(By.xpath("(//div[@role='presentation'])[3]"));
//		
//		Rbt_1.click();

}
}
