package com.Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Testbase;
import com.pageobjects.Wish_list;
import com.pageobjects.logion_functionality;

public class WishlistTest extends  Testbase { 
	Wish_list wl;
	logion_functionality lg;
	
	
	public WishlistTest()
	{
		super();
	}
	@BeforeMethod
	public void initialize() throws InterruptedException
	{
		
		Setup();
		lg=new logion_functionality(driver);
		lg.validateLogin();
		wl=new Wish_list (driver);		
				
	}
	@Test()
	public void categorywishlist () throws InterruptedException 
	{
		wl.catwishlist();
		
	}
	
	@Test()
	public void searchwishlist() 
	{
		wl.searchwishlist();
	}
	@Test()
	public void bannerhwishlist() 
	{
		wl.bannerwishlist();
	}
	@Test()
	public void homehwishlist() 
	{
		wl.homewishlist();
	}
	@Test()
	public void dealswishlist() 
	{
		wl.dealswishlist();
	}
	
	@AfterMethod
	public void teardown()
	{
		//driver.close();
	}

}
