package com.test.test1.hooks;

import cucumber.api.java.*;

public class hook {
	
	@Before("@pos")
	public void bf()
	{
		System.out.println("before...");
	}
	@Before()
	public void bf1()
	{
		System.out.println("before.one.....");
	}
	
	
	@After()
	public void af()
	{
		System.out.println("after...");
	}
	@After("@pos")
	public void af1()
	{
		System.out.println("after..one.");
	}

}
