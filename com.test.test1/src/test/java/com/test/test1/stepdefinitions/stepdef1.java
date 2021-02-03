package com.test.test1.stepdefinitions;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;

public class stepdef1 {

	
	@Given("^user is on one$")
	public void user_is_on_one() throws Throwable {
	    
	}

	@When("^user is on \"([^\"]*)\"$")
	public void user_is_on(String arg1, DataTable arg2) throws Throwable {
	 
		List<Map<String,String>> l=arg2.asMaps(String.class, String.class);
		System.out.println(l.get(0).get("a"));
		System.out.println(l.get(0).get("b"));
		
	}

	@When("^user is on three$")
	public void user_is_on_three() throws Throwable {
	  
	}

	
}
