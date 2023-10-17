package com.Testcases;

import java.awt.AWTException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Testbase;
import com.pageobjects.Edit_Profile;
import com.pageobjects.logion_functionality;

public class Edit_ProfileTestjava extends Testbase {
	Edit_Profile ef;
	logion_functionality lg;
	
	
	public Edit_ProfileTestjava ()
	{
		super();
	}
	@BeforeClass
	public void login()
	{
		Setup();
		lg=new logion_functionality(driver);
		lg.validateLogin();
		
	}
	@BeforeMethod
	public void initialize() 
	{
		
//		Setup();
//		lg=new Login_Functionality(driver);
//		lg.validateLogin();
		ef=new Edit_Profile (driver);		
				
	}
	@Test()
	public void search() throws InterruptedException, AWTException
	{
		ef.editprofie();
		
	}


}
