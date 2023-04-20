package com.LAO.Stepdefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.LAO.Utilities.Common_Utils;
import com.LAO.Webdrive_Manager.Drive_Manager;

import io.cucumber.java.Before;
	
public class Common_Step_Definition {

	// launchbrowser
	//public static WebDriver driver;

	private static final Logger LOGGER = LogManager.getLogger(Common_Step_Definition.class);
	
	@Before
	public static void beforeScenario() {
	
		LOGGER.info("Execution Started");
		try {
			LOGGER.info("Instantiation the CommonUtils");
			Common_Utils commonUtils = new Common_Utils();
			LOGGER.info("Loading The Properties File");
			commonUtils.loadProperties();
			LOGGER.info("Checking the Driver Null Or Not");
			if (Drive_Manager.getDriver()==null) {
				LOGGER.info("Driver is null Instantiating it!");
				Drive_Manager.launchbrowser();
				Common_Utils.initiWebElements();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * public void launchbrowser() {
	 * 
	 * try {
	 * 
	 * switch (constant.BROWSER) { case "chrome":
	 * 
	 * ChromeOptions op=new ChromeOptions();
	 * op.addArguments("--remote-allow-origins=*");
	 * 
	 * //WebDriverManager.chromedriver().setup();
	 * System.setProperty("webdriver.chrome.driver",
	 * "D:\\Workpace\\Java-Selenium(14-2-23)\\PracticeApp\\DRIVER\\chromedriver.exe"
	 * );
	 * //System.setProperty(constant.CHROME_DRIVER,constant.CHROME_DRIVER_LOCATION);
	 * LOGGER.info("Launching : "+constant.BROWSER); driver=new ChromeDriver();
	 * break; case "firefox": //WebDriverManager.firefoxdriver().setup();
	 * System.setProperty(constant.FIREFOX_DRIVER,constant.FIREFOX_DRIVER_LOCATION);
	 * LOGGER.info("Launching : "+constant.BROWSER); driver=new FirefoxDriver();
	 * break; case "edge":
	 * System.setProperty(constant.EDGE_DRIVER,constant.EDGE_DRIVER_LOCATION);
	 * LOGGER.info("Launching : "+constant.BROWSER); driver=new EdgeDriver(); break;
	 * 
	 * default:
	 * 
	 * System.setProperty(constant.CHROME_DRIVER,constant.CHROME_DRIVER_LOCATION);
	 * LOGGER.info("Launching : "+constant.BROWSER); driver=new ChromeDriver();
	 * break;
	 * 
	 * }
	 * 
	 * } catch (Exception e) { e.printStackTrace(); } }
	 */

}
