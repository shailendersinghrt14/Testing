package com.test.SeleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FetchingWebElements {
	   WebDriver driver;
	   @FindBy(id="email")
	WebElement uname;
	   @FindBy(id="pass")
		WebElement pass;
	   @FindBy(id="u_0_9")
	 		WebElement login;
	public FetchingWebElements(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
		
	}
	void SendKey() {
		uname.sendKeys("shailendersinghrt11@yahoo.com");
		pass.sendKeys("8500148125");
		login.click();
		
	}

}
