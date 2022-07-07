package com.helper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configreader {

	Properties p; 	

	public Configreader() throws IOException {
		FileInputStream fis = new FileInputStream("src/test/java/com/helper/Data");
		p = new Properties();
		p.load(fis);
	}
	
	public String passing_URL() {
		String URL_property = p.getProperty("URL");
		return URL_property;
	}
	public String fromLocation() {
		String from_property = p.getProperty("From");
		return from_property;
	}
	
	public String toLocation() {
		String To_property = p.getProperty("To");
		return To_property;
	}
	
	public String username() {
		String Username_property = p.getProperty("Username");
		return Username_property;
	}
	
	public String password() {
		String password_property = p.getProperty("Password");
		return password_property;
	}
}


