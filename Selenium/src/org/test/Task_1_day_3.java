package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_1_day_3 {
public static void main (String[]args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp 14s\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver Driver = new ChromeDriver();
	Driver.get("https://www.google.com/");
	Driver.manage().window().maximize();
	Driver.navigate().to("https://www.instagram.com/");
	Thread.sleep(4000);
	WebElement user = Driver.findElement(By.name("username"));
	user.sendKeys("Ajireuka");
	WebElement Password = Driver.findElement(By.xpath("//input[@type='password']"));
	Password.sendKeys("pulipandi");
	WebElement Login = Driver.findElement(By.xpath("//button[contains(@ type,'submit')]"));
	Login.click();
	Driver.navigate().refresh();
	WebElement Signup = Driver.findElement(By.xpath("//a[@data-testid='sign-up-link']"));
	Signup.click();
	Thread.sleep(3000);
	Driver.navigate().refresh();
	WebElement Username_2 = Driver.findElement(By.name("emailOrPhone"));
	Username_2.sendKeys("Joel");
	WebElement Fullname = Driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	Fullname.sendKeys("Vikas");
	WebElement Username_3 = Driver.findElement(By.name("username"));
	Username_3.sendKeys("Rajini");
	WebElement password_2 = Driver.findElement(By.xpath("//input[@type='password']"));
	password_2.sendKeys("fighi");
	WebElement Signup_2 = Driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]"));
	Signup_2.click();
	Driver.navigate().refresh();
}
}