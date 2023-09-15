package com.Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Testbase;
import com.pageobjects.Product_Functionality3;

public class ProductTest3  extends Testbase{
Product_Functionality3 pf1;
	
	public ProductTest3()
	{
			
		super();
	}
	@BeforeMethod
	public void initialize()
	{
		
		Setup();
		pf1=new Product_Functionality3 (driver);
		
	}
	@Test
	public void verifyurl() throws InterruptedException
	{
		pf1.validateProduct3();
		//String url=driver.getCurrentUrl();
		
		
		
		//Assert.assertEquals("http://e-quarz.com/product/avro-furniture-set-of-2-plastic-chairs-matt-and-gloss-pattern-plastic-chairs-for-home-living-room-bearing-capacity-up-to", url);
	}
	
	
	@AfterMethod 
	public void teardown()
	{
		//driver.close();
	}

}
