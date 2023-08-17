package com.adactin.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class configuration_Reader {
   
	public static Properties p;  
	
	public configuration_Reader() throws IOException {
		
		File f=new File("D:\\SOFTWARE\\Eclipse _\\AdactinCucumber\\src\\test\\java\\com\\adactin\\properties\\Configuration.properties");
	     
		FileInputStream fis=new FileInputStream(f);
		
		Properties p=new Properties();
		
		p.load(fis);	
	
	}
	
	public String getbrowser() {
		
		String browser = p.getProperty("browser");

		return browser;
	}
	
	private String geturl() {
		String url = p.getProperty("url");
		
		return url;
		
	}
	
	
}
