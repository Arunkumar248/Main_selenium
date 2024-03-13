package org.sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Day_1 {
public static void main (String[]args) {
	System.setProperty("webdriver.edgedriver",
			"C:\\Users\\ELCOT-Lenovo\\eclipse-workspace\\Selenium\\Drivers\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.get("http://facebook.com/");
}
}
