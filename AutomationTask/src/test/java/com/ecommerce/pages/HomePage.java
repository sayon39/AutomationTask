package com.ecommerce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testBase.TestBase;


public class HomePage extends TestBase{

		
		public HomePage() {
			PageFactory.initElements(driver, this);
		}
		
		//OR
		
		@FindBy(xpath="(//span[text()='Shop'])[1]")
		WebElement link_shop;
		
		@FindBy(xpath="//ul[@class='header__section-ul']//a[text()='Dishwasher']")
		WebElement link_Dishwasher;
		
		@FindBy(xpath="(//a[text()='Dishwasher']//following::a[text()='Front Control'])[1]")
		WebElement link_FrontControl;
		
		Actions act=new Actions(driver);
		
		//methods
		
		public void mouseHoverShop() {
			act.moveToElement(link_shop).build().perform();
		}
		
		public void mouseHoverDishwasher() {
			act.moveToElement(link_Dishwasher).build().perform();
		}
		
		public void clickFrontControl() {
			link_FrontControl.click();
		}
		
		

}
