package com.Stepdefinition;

import com.pages.Contact_pages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Contact_Stepdefinition {
	Contact_pages cp=new Contact_pages();
	@Given("^the Chromebrowser launched$")
	public void the_Chromebrowser_launched() 
	{
	    cp.url();
	}

	@Then("^the demoblaze opens$")
	public void the_demoblaze_opens() 
	{
	    cp.application();
	}

	@Then("^click the Contact$")
	public void click_the_Contact() 
	{
	    cp.contact();
	}

	@Then("^fill the details$")
	public void fill_the_details() 
	{
	   cp.send();
	}


}
