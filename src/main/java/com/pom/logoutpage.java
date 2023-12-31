package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logoutpage {

	public logoutpage(WebDriver driver2) {
		this.driver=driver2;
		
		PageFactory.initElements(driver2, this);
	}

	public static WebDriver driver;
	
	@FindBy(id="logout")
	private WebElement log;

	public WebElement getLog() {
		return log;
	}
}
