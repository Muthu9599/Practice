package com.LAO.Utilities;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

import com.LAO.Constants.constants;
import com.LAO.PageObjects.LoginPage;
import com.LAO.Webdrive_Manager.Drive_Manager;

public class Common_Utils {
	
	public void loadProperties() {
		
		/*
		 * try { reader=new FileReader("Config.properties"); } catch
		 * (FileNotFoundException e) { e.printStackTrace(); }
		 */
		
		Properties properties=new Properties();
		try {
			properties.load(getClass().getResourceAsStream("./config.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		constants.APP_URL=properties.getProperty("APP_URL");
		constants.BROWSER=properties.getProperty("BROWSER");
		constants.USERNAME=properties.getProperty("USERNAME");
		constants.PASSWORD=properties.getProperty("PASSWORD");
		constants.CHROME_DRIVER_LOCATION=properties.getProperty("CHROME_DRIVER_LOCATION");
		constants.FIREFOX_DRIVER_LOCATION=properties.getProperty("FIREFOX_DRIVER_LOCATION");
		constants.EDGE_DRIVER_LOCATION=properties.getProperty("EDGE_DRIVER_LOCATION");
		
	}
	
	
	public static void initiWebElements() {
		PageFactory.initElements(Drive_Manager.getDriver(),LoginPage.class);
	}

}
