package com.seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium {
	
	public static void main(String[]args) {
	
	System.setProperty("webdriver.chrome.driver","D:/Manohar/Work/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://google.com");
	
	
	}

}
