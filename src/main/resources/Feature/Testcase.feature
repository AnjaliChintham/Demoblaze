@Demoblaze_Feature
Feature: Demoblaze Website


@tc01_demoblazelogin
Scenario:

Given the user launched   Chromebrowser
Then the  user open the Demoblaze Website
Then the user enters the username and password
And the user clicks the login button

@tc02_demoblaze_AddtoCart
Scenario:

Given the user launched the chromebrowser
Then the website opens
Then select the product
And the item is added to cart

@tc03_demoblaze_contact
Scenario:
Given the Chromebrowser launched
Then the demoblaze opens
Then click the Contact
And fill the details

@tc04_Nextpage_demoblaze
Scenario:

Given the user launched chromebrowser
Then demoblaze is opened
Then Scroll down the page
And click on nextpage


