package com.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Utils.Utils;
import com.base.Testbase;
import com.pageobjects.Homepage;
import com.pageobjects.logion_functionality;

public class LoginTest extends Testbase {
	
	
	logion_functionality lg;
	public LoginTest()
	{
		super();
	}
	@BeforeMethod
	public void initialize()
	{
		Setup();
		lg =new logion_functionality(driver);
		

	}
 @Test
//public void verifyloginWithCaptcha() throws InterruptedException
	//{
	//
//		String password = props.getProperty("password");
//	}
	//@Test(dataProvider = "setdata",dataProviderClass = Utils.class)
	public void verifyurl()
	{
		//lg.validateLogin(username,password);
		lg.validateLogin();
		String url=driver.getCurrentUrl();
		Assert.assertEquals("http://e-quarz.com/", url);
	}
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}

}
