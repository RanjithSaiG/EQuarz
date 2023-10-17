package com.Testcases;

import java.awt.AWTException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Testbase;
import com.pageobjects.LogOut_Functionality;
import com.pageobjects.logion_functionality;

public class LogOut_Testjava extends Testbase {
	LogOut_Functionality lf;
	logion_functionality lg;
	
	
	public LogOut_Testjava ()
	{
		super();
	}
	
	@BeforeMethod
	public void initialize() 
	{
		
		Setup();
		lg=new logion_functionality(driver);
		lg.validateLogin();
		lf=new LogOut_Functionality (driver);		
				
	}
	@Test()
	public void logout() throws InterruptedException, AWTException
	{
		lf.logout();
		
	}
	@Test()
	public void refresh() throws InterruptedException, AWTException
	{
		lf.refresh();
		
	}
	@Test()
	public void back() throws InterruptedException, AWTException
	{
		lf.back();
		
	}


}
