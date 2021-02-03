package com.test.test1.appium;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class baseclass {

	AppiumDriver<MobileElement> a;
	DesiredCapabilities ds;
	URL url;
	@BeforeSuite
	public void bs() throws IOException
	{
		ds=new DesiredCapabilities();
		ds.setCapability("deviceName", "Lenovo K8 Plus");
		ds.setCapability("udid","HGAE6Q83");
		ds.setCapability("platformName", "Android");
		ds.setCapability("platformVersion", "8.0.0");
		ds.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		ds.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 10);
		
		url=new URL("http://0.0.0.0:4723/wd/hub");
		
		a=new AppiumDriver<MobileElement>(url,ds);
		
	}
	@Test
	public void testing()
	{
		System.out.println("test staerted..");
	}
	@AfterSuite
	public void as()
	{
		
	}
	

}
