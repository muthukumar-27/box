package com.test.test1.stepdefinitions;

import cucumber.api.java.en.*;

public class stepdef2 {

	@Given("^this is step(\\d+)$")
	public void this_is_step(int arg1) throws Throwable {
	    
	}

	@When("^this is step \"([^\"]*)\" and \"([^\"]*)\"$")
	public void this_is_step_and(String arg1, String arg2) throws Throwable {
	    System.out.println(arg1+" "+arg2);
	}
	@Then("^this is final$")
	public void this_is_final() throws Throwable {
	    
	}
	
	
}
