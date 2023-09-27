package com.Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Testbase;
import com.pageobjects.Buynow;
import com.pageobjects.logion_functionality;

public class BuynowTest extends Testbase {
	
Buynow bf;
	logion_functionality lg;
	
	
	public BuynowTest()
	{
		super();
	}
	@BeforeMethod
	public void initialize() throws InterruptedException
	{
		
		Setup();
		lg=new logion_functionality(driver);
		lg.validateLogin();
		bf=new Buynow (driver);		
				
	}
	@Test()
	public void addbuy () throws InterruptedException 
	{
		bf.addbuy();
		
	}
	@Test()
	public void buy () throws InterruptedException 
	{
		bf.buynow();
		
	}
	
	
	
	@AfterMethod
	public void teardown()
	{
		//driver.close();
	}

}
