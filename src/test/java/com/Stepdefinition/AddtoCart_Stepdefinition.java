package com.Stepdefinition;

import com.pages.AddtoCart_pages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AddtoCart_Stepdefinition {
	AddtoCart_pages ac=new AddtoCart_pages();
	
	@Given("^the user launched the chromebrowser$")
	public void the_user_launched_the_chromebrowser() 
	{
	    ac.url();
	}

	@Then("^the website opens$")
	public void the_website_opens() 
	{
	    ac.website();
	}

	@Then("^select the product$")
	public void select_the_product() 
	{
	   ac.selectitem();
	}

	@Then("^the item is added to cart$")
	public void the_item_is_added_to_cart() 
	{
	    ac.Addelement();
	}
	

}
