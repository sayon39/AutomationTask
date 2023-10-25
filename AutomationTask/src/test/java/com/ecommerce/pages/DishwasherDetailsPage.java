package com.ecommerce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testBase.TestBase;

public class DishwasherDetailsPage extends TestBase{
	
	public DishwasherDetailsPage() {
		PageFactory.initElements(driver, this);
	}
	
	//OR
	@FindBy(xpath="//a[text()='Add to Cart']")
	WebElement link_AddtoCart;
	
	@FindBy(xpath="//a[text()='Add to Cart' and @data-variant='WHITE']")
	WebElement link_whiteAddtoCart;
	
	
		
	//methods
	public void clickAddtoCart() {
		link_AddtoCart.click();
	}
	
	public void clickWhiteAddtoCart() {
		link_whiteAddtoCart.click();
	}

}
