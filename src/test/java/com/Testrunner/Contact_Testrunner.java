package com.Testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="/Demoblaze/src/main/resources/Feature/Testcase.feature",
plugin = {"pretty","html:reports/cucumber-html-report"},
tags= {"@tc03_demoblaze_contact"},
glue= {"steps"},
monochrome=true
)
public class Contact_Testrunner {
	

}
