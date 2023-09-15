package com.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Testbase;
import com.pageobjects.Product_Functionality;
import com.pageobjects.Product_Functionality1;

public class ProductTest1 extends Testbase {

Product_Functionality1 pf1;
	
	 ProductTest1()
	{
			
		super();
	}
	@BeforeMethod
	public void initialize()
	{
		
		Setup();
		pf1=new Product_Functionality1 (driver);
		
	}
	@Test
	public void verifyurl() throws InterruptedException
	{
		pf1.validateProduct14();
		String url=driver.getCurrentUrl();
		Assert.assertEquals("http://e-quarz.com/product/jodhpuri-blazer-for-men-black-formal-casual-svSGUX", url);
	}
	
	
	@AfterMethod
	public void teardown()
	{
		//driver.close();
	}
}

