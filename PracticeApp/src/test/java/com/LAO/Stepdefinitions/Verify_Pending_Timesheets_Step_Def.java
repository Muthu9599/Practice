package com.LAO.Stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Verify_Pending_Timesheets_Step_Def {
	public static WebDriver deiver;
	
	@Given("the user is on the Homepage")
	public void the_user_is_on_the_homepage() {
	    System.out.println("the user is on the Homepage");
	}
	@When("the user cliks on the time option from the menu bar")
	public void the_user_cliks_on_the_time_option_from_the_menu_bar() {
	    System.out.println("the user cliks on the time option from the menu bar");
	}
	@When("the user enter name as {string}")
	public void the_user_enter_name_as(String string) {
		System.out.println("the user enter name as Muthukumar");
	    
	}
	@When("the user click on the view button")
	public void the_user_click_on_the_view_button() {
	    System.out.println("the user click on the view button");
	}
	@Then("the user should see the message as {string}")
	public void the_user_should_see_the_message_as(String string) {
	   System.out.println("the user should see the message as To Time Sheets Not Found");
	}




}
 