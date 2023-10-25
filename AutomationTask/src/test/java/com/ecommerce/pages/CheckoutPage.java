package com.ecommerce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.testBase.TestBase;

public class CheckoutPage extends TestBase{
	
	public CheckoutPage() {
		PageFactory.initElements(driver, this);
	}
	
	//OR
	@FindBy(xpath="//button[text()='SUBMIT ORDER']")
	WebElement btn_SubmitOrder;
	
	@FindBy(xpath="//span[text()='The Email field is required.']")
	WebElement label_Emailvalidation;
	
	//Method
	
	SoftAssert as=new SoftAssert();
	
	public void clickSubmitOrder() {
		btn_SubmitOrder.click();
	}
	
	public void validateEmailErrMsg() {
		as.assertTrue(label_Emailvalidation.isDisplayed());
	}
	

}
