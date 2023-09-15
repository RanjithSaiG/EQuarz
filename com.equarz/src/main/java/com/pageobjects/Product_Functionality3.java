package com.pageobjects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Testbase;

public class Product_Functionality3  extends Testbase{
	@FindBy(xpath="//a[@href='http://e-quarz.com/product/avro-furniture-set-of-2-plastic-chairs-matt-and-gloss-pattern-plastic-chairs-for-home-living-room-bearing-capacity-up-to'][1]")
	WebElement product;
	@FindBy(xpath="//span[text()='Add to cart']")
	WebElement addtocart;
	@FindBy(xpath="//div[text()='Successfully added!']")
	WebElement successful;
	
	public Product_Functionality3(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public Homepage validateProduct3() throws InterruptedException
	{
		//popclose.click();
		product.click();
		addtocart.click();
		String print=successful.getText();
		assertEquals("Successfully added!",print);
		return new Homepage();
		
	}

}
