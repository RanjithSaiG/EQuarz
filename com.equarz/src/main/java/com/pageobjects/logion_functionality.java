package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Testbase;

public class logion_functionality extends Testbase {
	@FindBy(id="si-email")
	WebElement user;
	@FindBy(id="si-password")
	WebElement pass;
	//String str=JOptionPane.showInputDialog("Enter captcha");
//	@FindBy(xpath="//input[@name='default_captcha_value']")
//	WebElement element;
	@FindBy(xpath="//button[text()='Sign in']")
	WebElement signinbtn;
	//private WebElement captchaInput;
	
	public logion_functionality(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public Homepage validateHomepage(String user1,String password1) throws InterruptedException
	{
		user.sendKeys(user1);
		pass.sendKeys(password1);
	
		Thread.sleep(10000);
		//element.sendKeys(str);
		signinbtn.click();
		
		return new Homepage();
		
	}
	public Homepage validateLogin(String username, String password, String captcha) {
		// TODO Auto-generated method stub
		return null;
	}
}
