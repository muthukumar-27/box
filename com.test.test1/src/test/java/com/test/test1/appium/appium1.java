package com.test.test1.appium;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class appium1 {
	
	public static void main(String arg[]) throws IOException
	{
		
		DesiredCapabilities ds=new DesiredCapabilities();
		ds.setCapability("deviceName", "Lenovo K8 Plus");
		ds.setCapability("udid","HGAE6Q83");
		ds.setCapability("platformName", "Android");
		ds.setCapability("platformVersion", "8.0.0");
		ds.setCapability("appPackage", "com.google.android.calculator");
		ds.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		URL url=new URL("http://0.0.0.0:4723/wd/hub");
		
		AppiumDriver<MobileElement> a=new AppiumDriver<MobileElement>(url,ds);
		
		
		MobileElement e1=a.findElement(By.id("com.google.android.calculator:id/digit_9"));
		MobileElement e2=a.findElement(By.id("com.google.android.calculator:id/op_div"));
		
		MobileElement e3=a.findElement(By.id("com.google.android.calculator:id/digit_3"));
		MobileElement e4=a.findElement(By.id("com.google.android.calculator:id/eq"));
		MobileElement e5=a.findElement(By.id("com.google.android.calculator:id/result"));
		
		e1.click();
		e2.click();
		e3.click();
		e4.click();
		
		System.out.println("result...."+e5.getText());
		
		
	}

}
