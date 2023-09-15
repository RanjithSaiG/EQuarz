package com.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Utils.Signutlis;
import com.base.Testbase;
import com.pageobjects.Signup_Functionality;

import net.bytebuddy.implementation.bind.annotation.Super;

public class SinupTest extends Testbase {
	
	Signup_Functionality sf;
	
	public  void SignupTest()
	{
		Super();
	
	}
	private void Super() {
		// TODO Auto-generated method stub
		
	}
	@BeforeMethod
	public void initialize()
	{
		Setup();
		sf=new Signup_Functionality(driver);
		
		
	}
	@Test(dataProvider = "setdata",dataProviderClass = Signutlis.class)
	public void verifyurl(String firstname,String lastname,String Email,String phone,String password,String cpassword) throws InterruptedException
	{
		sf.validateSignup(firstname,lastname,Email,phone,password,cpassword);
		String url=driver.getCurrentUrl();
		Assert.assertEquals("http://e-quarz.com/customer/auth/login", url);
	}
	@AfterMethod
	public void teardown()
	{
		//driver.close();
	}
}
