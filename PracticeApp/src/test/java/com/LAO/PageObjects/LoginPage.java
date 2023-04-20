package com.LAO.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	@FindBy(name="username")
	public static WebElement USERNAME;
	
	@FindBy(name="password")
	public static WebElement PASSWORD;
	
	@FindBy(xpath="//button[@type='submit']")
	public static WebElement LOGINBUTTON;

}
