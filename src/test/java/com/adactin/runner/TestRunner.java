package com.adactin.runner;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.Properties;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import baseClass.Baseclass;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//adactin//feature",
glue="com.adactin.stepdefinition",
monochrome= true,
dryRun=false,
strict=true,
tags="@smokeTest",
plugin= {"html:Reports/Html_Report",
		"pretty",
		"json:Reports/Json_Report.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Reports/.Report.html"		
}) 
public class TestRunner  {
	
	public static WebDriver driver; //null

    @BeforeClass
	public static void setUp() throws IOException {
		
    	 FileInputStream fis=new FileInputStream("D:\\SOFTWARE\\Eclipse _\\AdactinCucumber\\src\\test\\java\\com\\adactin\\properties\\Configuration.properties");
    	 
    	 Properties p=new Properties();	
    	 
    	 p.load(fis);	
    	 
          driver=Baseclass.browserLaunch(p.getProperty("browser"));
    	  
//	      WebDriverManager.chromedriver().setup();
//	      
//	      driver = new ChromeDriver();
//	      
//	      driver.manage().window().maximize();
	      
	}
    
    @AfterClass
	public static void tearDown(){
		
    	Baseclass.driverQuit();
//		driver.close();
		
	}
}
