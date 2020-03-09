package com.Stepdefinition;

import com.pages.Next_pages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Next_Stepdefinition {
	Next_pages np=new Next_pages();
	
	@Given("^the user launched chromebrowser$")
	public void the_user_launched_chromebrowser() 
	{
	        np.url();
	}

	@Then("^demoblaze is opened$")
	public void demoblaze_is_opened() 
	{
	      np.website();
	}

	@Then("^Scroll down the page$")
	public void scroll_down_the_page() 
	{
	   np.scrollby();
	}

	@Then("^click on nextpage$")
	public void click_on_nextpage() 
	{
        np.click();
	}


}
