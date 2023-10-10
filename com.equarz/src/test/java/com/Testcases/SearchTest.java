package com.Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Testbase;
import com.pageobjects.Search_functionality;
import com.pageobjects.logion_functionality;

public class SearchTest  extends Testbase {
	Search_functionality bf;
	logion_functionality lg;

	
	
	public SearchTest()
	{
		super();
	}
	@BeforeMethod
	public void initialize() throws InterruptedException
	{
		
		Setup();
		lg=new logion_functionality(driver);
		lg.validateLogin();
		bf=new Search_functionality (driver);		
				
	}
	@Test()
	public void search () throws InterruptedException 
	{
		bf.validatesearch();
		
	}
	@Test()
	public void searchdrop () throws InterruptedException 
	{
		bf.dropdownsearch();
		
	}
	@AfterMethod
	public void teardown()
	{
		//driver.close();
	}

}
