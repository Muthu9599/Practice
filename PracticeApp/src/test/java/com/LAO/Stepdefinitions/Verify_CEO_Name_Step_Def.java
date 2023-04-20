package com.LAO.Stepdefinitions;

import java.sql.DriverManager;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;

import com.LAO.Constants.constants;
import com.LAO.PageObjects.LoginPage;
import com.LAO.Webdrive_Manager.Drive_Manager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Verify_CEO_Name_Step_Def {
	//public static WebDriver driver;
	private static final org.apache.logging.log4j.Logger LOGGER=LogManager.getLogger(Verify_CEO_Name_Step_Def.class);
	
	@Given("the user logged is successfully and is on Homepage")
	public void the_user_logged_is_successfully_and_is_on_homepage() {
		//login 
		Drive_Manager.getDriver().get(constants.APP_URL);//url lanch
		LoginPage.USERNAME.sendKeys(constants.USERNAME);
		LoginPage.PASSWORD.sendKeys(constants.PASSWORD);
		LoginPage.LOGINBUTTON.click();
		String Url = Drive_Manager.getDriver().getCurrentUrl();
		if(Url.contains("dashboard")) {
			LOGGER.info("the user logged is successfully and is on Homepage");
			
		}
		
	   
	}
	@When("the user cliks on the directory option from the menu bar")
	public void the_user_cliks_on_the_directory_option_from_the_menu_bar() {
	    System.out.println("the user cliks on the directory option from the menu bar");
	}
	@When("the user select the job title as {string} from the dropdown")
	public void the_user_select_the_job_title_as_from_the_dropdown(String string) {
	    System.out.println("the user select the job title as CEO from the dropdown");
	}
	@When("the user click the search button")
	public void the_user_click_the_search_button() {
	    System.out.println("the user click the search button");
	}
	@Then("user should see the CEO Name as {string}")
	public void user_should_see_the_ceo_name_as(String string) {
		System.out.println("user should see the CEO Name as MuthuKumar");
	    
	}


}
