package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Table_Handling {
public static void main (String[]args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp 14s\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(); 
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	WebElement TY = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[3]"));
	JavascriptExecutor JS = (JavascriptExecutor)driver;
	JS.executeScript("window.scrollBy(0,9000);", "");
	Thread.sleep(2000);
	JS.executeScript("arguments[0].scrollIntoView();", TY);
	
	Thread.sleep(2000);
	List<WebElement> Table_1 = driver.findElements(By.xpath("//table[@id='customers']//tbody//tr//td"));
	int T1_Size =Table_1.size();
	System.out.println(T1_Size);
	
	for (WebElement data : Table_1) {
		System.out.println(data.getText());
	}
	
	System.out.println("~+~+~+~+~+~+~+~+~");
	
	Thread.sleep(2000);
	List<WebElement> Table_Head =driver.findElements(By.xpath("//table[@id='customers']//tbody//tr[1]//th"));
	int ThS = Table_Head.size();
	System.out.println(ThS);
	
	Thread.sleep(2000);
	for (WebElement TH_1 : Table_Head) {
		System.out.println(TH_1.getText());
	}
	System.out.println("~+~+~+~+~+~+~+~+~");
	
	List<WebElement> Table_3=driver.findElements(By.xpath("//table[@id='customers']//tbody//tr[4]//td"));
	int T3=Table_3.size();
	System.out.println(T3);
	
	for (WebElement Table_3_text : Table_3) {
		Boolean ThreeT = Table_3_text.isDisplayed();
		System.out.println(ThreeT);
		System.out.println(Table_3_text.getText());
	}
}
}
