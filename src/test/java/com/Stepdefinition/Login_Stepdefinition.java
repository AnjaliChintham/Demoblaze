package com.Stepdefinition;

import com.pages.Login_pages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Login_Stepdefinition {
	Login_pages lp=new Login_pages();
	
	@Given("^the user launched   Chromebrowser$")
	public void the_user_launched_Chromebrowser()  {
		
	    lp.url();
	}

	@Then("^the  user open the Demoblaze Website$")
	public void the_user_open_the_Demoblaze_Website()   {
	   lp.website();
	}

	@Then("^the user enters the username and password$")
	public void the_user_enters_the_username_and_password()  {
	    lp.login();
	}

	@Then("^the user clicks the login button$")
	public void the_user_clicks_the_login_button()  {
	    lp.click();
	}

	
}
