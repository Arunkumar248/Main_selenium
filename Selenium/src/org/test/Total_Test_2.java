package org.test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
public class Total_Test_2{
public static void main (String[]args) throws IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp 14s\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver Driver = new ChromeDriver();
	Driver.get("https://adactinhotelapp.com/index.php");
	Driver.manage().window().maximize();
	
	WebElement US_1 = Driver.findElement(By.xpath("(//input[@class='login_input'])[1]"));
	US_1.sendKeys("Arun24896");
	
	WebElement PW_1 = Driver.findElement(By.xpath("(//input[@class='login_input'])[2]"));
	PW_1.sendKeys("A@RrUuNn123");
	
	WebElement LG_1 =Driver.findElement(By.name("login"));
	JavascriptExecutor JE = (JavascriptExecutor) Driver;
	JE.executeScript("arguments[0].click();", LG_1);

	WebElement Location_1 = Driver.findElement(By.id("location"));
	Select St = new Select (Location_1);
	St.selectByVisibleText("Sydney");
	Boolean St_1= St.isMultiple();
	System.out.println(St_1);
	
	WebElement Hotels = Driver.findElement(By.xpath("//select[@name='hotels']"));
	Select HT_1 =new Select(Hotels);
	HT_1.selectByIndex(4);
	
	WebElement Room_1 = Driver.findElement(By.id("room_type"));
	Select R_1 = new Select (Room_1);
	R_1.selectByVisibleText("Super Deluxe");
	
	WebElement NR_1 =Driver.findElement(By.id("room_nos"));
	Select NR1=new Select (NR_1);
	NR1.selectByVisibleText("8 - Eight");
	Boolean NR_1D = NR_1.isDisplayed();
	System.out.println("is displayed" + " " +NR_1D);
	
	WebElement Date_E_1 = Driver.findElement(By.xpath("(//input[@maxlength='10'])[1]"));
	Date_E_1.sendKeys("24/08/2022");
	
	WebElement Date_O_1 = Driver.findElement(By.xpath("(//input[@maxlength='10'])[2]"));
	Date_O_1.sendKeys("25/08/2022");
	
	WebElement APR = Driver.findElement(By.id("adult_room"));
	Select APR_1 = new Select (APR);
	APR_1.selectByIndex(3);
	
	TakesScreenshot TS = (TakesScreenshot) Driver;
	File Snap_1 = TS.getScreenshotAs(OutputType.FILE);
	File Get_1 = new File("C:\\Users\\Hp 14s\\eclipse-workspace\\Selenium\\Screenshot\\Hotel_1.png");
	FileUtils.copyFile(Snap_1, Get_1);
	
	WebElement Search = Driver.findElement(By.xpath("//input[@value='Search']"));
	Search.click();
	
	WebElement Fill = Driver.findElement(By.name("radiobutton_0"));
	Fill.click();
	Boolean Fill_1=Fill.isSelected();
	System.out.println(Fill_1);
	
	WebElement Continue_1 =Driver.findElement(By.name("continue"));
	JE.executeScript("arguments[0].click();", Continue_1);
	
	WebElement FN_1=Driver.findElement(By.name("first_name"));
	FN_1.sendKeys("Arun");
	System.out.println("FirstName" +" " +FN_1.getText());
	
	WebElement LN_1=Driver.findElement(By.id("last_name"));
	LN_1.sendKeys("Kumar");
	System.out.println("LastName" +" " + LN_1.getText());
	
	WebElement BA_1 = Driver.findElement(By.id("address"));
	BA_1.sendKeys("annai theresa st,tambaram.ch-59");
	System.out.println("Address"+ " " +BA_1.getText());
	
	WebElement CDN = Driver.findElement(By.xpath("(//input[contains(@onkeypress,'return')])[1]"));
	CDN.sendKeys("1234567898765432");
	System.out.println("Size of the No" + " " +CDN.getSize());
	
	WebElement CCT = Driver.findElement(By.id("cc_type"));
	Select CCT_1 = new Select (CCT);
	CCT_1.selectByValue("MAST");
//	System.out.println("Card Name" +" " +CCT_1);
	
	WebElement Mnth_1 = Driver.findElement(By.id("cc_exp_month"));
	Select Mnth1 = new Select (Mnth_1);
	Mnth1.selectByValue("4");
	
	WebElement Year_1 = Driver.findElement(By.name("cc_exp_year"));
	Select Year1 = new Select (Year_1);
	Year1.selectByVisibleText("2022");
	
	WebElement CVV_1 = Driver.findElement(By.id("cc_cvv"));
	CVV_1.sendKeys("342");

	File Snap_2 = TS.getScreenshotAs(OutputType.FILE);
	File Get_2 = new File("C:\\Users\\Hp 14s\\eclipse-workspace\\Selenium\\Screenshot\\Hotel_2.png");
	FileUtils.copyFile(Snap_2, Get_2);
			
	WebElement BN = Driver.findElement(By.id("book_now"));
	BN.click();
	
	Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	WebElement SH = Driver.findElement(By.id("my_itinerary"));
	SH.click();

	File Snap_3 = TS.getScreenshotAs(OutputType.FILE);
	File Get_3 = new File("C:\\Users\\Hp 14s\\eclipse-workspace\\Selenium\\Screenshot\\Hotel_3.png");
	FileUtils.copyFile(Snap_3, Get_3);
	
	
	
}
}
