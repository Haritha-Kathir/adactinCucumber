package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class selectpage {

public static WebDriver driver;
	
	@FindBy(xpath="//input[@name='radiobutton_0']")
	private WebElement radio;
	
	@FindBy(id="continue")
	private WebElement click;


	public selectpage(WebDriver driver2) {
		
		this.driver=driver2;
		
		PageFactory.initElements(driver2, this);
	}

	public WebElement getRadio() {
		return radio;
	}

	public WebElement getClick() {
		return click;
	}
}
