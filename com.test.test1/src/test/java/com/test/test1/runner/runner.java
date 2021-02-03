package com.test.test1.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="featurefiles/test1.feature",glue= {"com.test.test1.stepdefinitions","com.test.test1.hooks"},monochrome=true,
format= {"html:webreports/report1","json:webreports/report2.json","junit:webreports/report3.xml"})

public class runner {

	
}
