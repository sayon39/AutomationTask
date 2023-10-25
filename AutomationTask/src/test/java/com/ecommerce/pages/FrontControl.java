package com.ecommerce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testBase.TestBase;

public class FrontControl extends TestBase {
	
	public FrontControl() {
		PageFactory.initElements(driver, this);
	}
	
	//OR
	@FindBy(xpath="//ul[@class='catalogue-sort']//a[contains(@class,'price btn-sort-price')]")
	WebElement link_PriceLowtoHigh;
	
	@FindBy(xpath="(//a[contains(text(),'Frigidaire')])[1]//following::a[1]")
	WebElement link_FrigidaireDishwasher;
	
	//methods
	
	public void clickSortByPrice() {
		link_PriceLowtoHigh.click();
	}
	
	public void clickFirstFrigidaireDishwasher() {
		link_FrigidaireDishwasher.click();
	}
	
	

}
