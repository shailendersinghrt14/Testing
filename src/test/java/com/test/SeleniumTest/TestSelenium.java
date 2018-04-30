package com.test.SeleniumTest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestSelenium {
 WebDriver driver;
 FetchingWebElements ft;
@Before
public void openBrowser() {
	String path = "I:\\ntt java\\chromedriver_win32\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	
	driver =new ChromeDriver();
	
}
@Test
public void getTitle() {
	driver.get("https://www.facebook.com/");
System.out.println(driver.getTitle());	
	
	
	
}
@Test
public void elementFB() {
	
	ft=new FetchingWebElements(driver);
	ft.SendKey1();
	
	
}

@After
public void closeBrowser() {
	 driver.quit();
	
}
}
