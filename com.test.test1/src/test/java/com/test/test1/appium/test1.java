package com.test.test1.appium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class test1 extends baseclass{
	
	@Test
	public void tes()
	{
		a.get("http://www.google.com");
		a.findElement(By.name("q")).sendKeys("hello google");
		a.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		
	}
	  @Test
	  public void testLog() throws Exception {
	    a.get("https://opensource-demo.orangehrmlive.com/");
	    a.findElement(By.xpath("//div[@id='divUsername']/span")).click();
	    a.findElement(By.id("txtUsername")).clear();
	    a.findElement(By.id("txtUsername")).sendKeys("Admin");
	    a.findElement(By.id("frmLogin")).click();
	    a.findElement(By.id("frmLogin")).click();
	    a.findElement(By.id("txtPassword")).click();
	    a.findElement(By.id("txtPassword")).clear();
	    a.findElement(By.id("txtPassword")).sendKeys("admin123");
	    a.findElement(By.id("txtPassword")).sendKeys(Keys.ENTER);
	    a.findElement(By.id("welcome")).click();
	    a.findElement(By.linkText("Logout")).click();
	  }


}
