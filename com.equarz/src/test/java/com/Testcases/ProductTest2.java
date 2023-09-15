package com.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Testbase;
import com.pageobjects.Product_Functionality2;

public class ProductTest2 extends Testbase { 
Product_Functionality2 pf1;
	
	public ProductTest2()
	{
			
		super();
	}
	@BeforeMethod
	public void initialize()
	{
		
		Setup();
		pf1=new Product_Functionality2 (driver);
		
	}
	@Test
	public void verifyurl() throws InterruptedException
	{
		pf1.validateProduct1();
		String url=driver.getCurrentUrl();
		Assert.assertEquals("http://e-quarz.com/product/hp-laptop-15-amd-ryzen-3-7320u-156-inch396cm-fhd-micro-edge-laptop8gb-ram512gb-ssdamd-radeon-graphicsdual-speakersalexan", url);
	}
	
	
	@AfterMethod
	public void teardown()
	{
		//driver.close();
	}

}
