package com.LAO.Webdrive_Manager;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.LAO.Constants.constants;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drive_Manager {

	private static final org.apache.logging.log4j.Logger LOGGER = LogManager.getLogger(Drive_Manager.class);

	public static WebDriver driver=null;

	

	public static void launchbrowser() {

		try {
			switch (constants.BROWSER) {
			case "CHROME":

				WebDriverManager.chromedriver().setup();
				LOGGER.info("Launching : " + constants.BROWSER);
				driver = new ChromeDriver();
				break;
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				LOGGER.info("Launching : " + constants.BROWSER);
				driver = new FirefoxDriver();
				break;
			case "edge":
				WebDriverManager.edgedriver().setup();
				LOGGER.info("Launching : " + constants.BROWSER);
				driver = new EdgeDriver();
				break;
			case "ie":
				WebDriverManager.iedriver().setup();
				LOGGER.info("Launching : " + constants.BROWSER);
				driver = new InternetExplorerDriver();
				break;

			default:

				System.setProperty(constants.CHROME_DRIVER, constants.CHROME_DRIVER_LOCATION);
				LOGGER.info("Launching : " + constants.BROWSER);
				driver = new ChromeDriver();
				break;

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static WebDriver getDriver() {
		return driver;
	}
}