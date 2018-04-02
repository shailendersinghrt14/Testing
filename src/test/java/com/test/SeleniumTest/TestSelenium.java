package com.test.SeleniumTest;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestSelenium {
 public static WebDriver driver;
@BeforeClass
public static void openBrowser() {
	String path = "I:\\ntt java\\chromedriver_win32\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	
	driver =new ChromeDriver();
	
}
@Test
public void getTitle() {
	driver.get("https://www.facebook.com/");
System.out.println(driver.getTitle());	
	
	
	
}

@AfterClass
public static void closeBrowser() {
	 driver.quit();
	
}
}
