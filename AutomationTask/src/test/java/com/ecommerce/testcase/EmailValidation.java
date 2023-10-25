package com.ecommerce.testcase;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ecommerce.pages.CheckoutPage;
import com.ecommerce.pages.DishwasherDetailsPage;
import com.ecommerce.pages.FrontControl;
import com.ecommerce.pages.HomePage;
import com.testBase.TestBase;

public class EmailValidation extends TestBase{
	
	public EmailValidation() {
		super();
	}
	
	HomePage hp;
	FrontControl fc;
	DishwasherDetailsPage ddp;
	CheckoutPage cp;
	
	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		hp=new HomePage();
		fc=new FrontControl();
		ddp= new DishwasherDetailsPage();
		cp=new CheckoutPage();
	}
	
	@Test
	public void validateEmailBlank() {
		hp.mouseHoverShop();
		hp.mouseHoverDishwasher();
		hp.clickFrontControl();
		fc.clickSortByPrice();
		fc.clickFirstFrigidaireDishwasher();
		ddp.clickAddtoCart();
		ddp.clickWhiteAddtoCart();
		cp.clickSubmitOrder();
		cp.validateEmailErrMsg();
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
