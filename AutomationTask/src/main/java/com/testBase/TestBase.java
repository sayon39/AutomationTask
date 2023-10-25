package com.testBase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class TestBase {
	public static WebDriver driver;
	
	public static void initialization() throws IOException {
		String browserName="chrome";
		
		if(browserName.equals("chrome")) {
			ChromeOptions co=new ChromeOptions();
			co.setBrowserVersion("116");
			driver=new ChromeDriver(co);
		} 	
		else {
			System.out.println("browser is not initialized by base class");
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.tascoappliance.ca/home/");

	}

}
