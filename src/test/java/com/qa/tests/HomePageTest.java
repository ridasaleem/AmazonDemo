package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class HomePageTest extends BaseClass{
	
	HomePage homePage;
	LoginPage loginPage;
	
	public HomePageTest()
	{
		super();
	}
	
	
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		
		homePage=new HomePage();
		
	}
	
	@Test
	public void validateSearch()
	{
		String title=homePage.verifySearchBox();
		Assert.assertEquals(title, "Amazon.com: Nike Shoes");
	}
	
	@Test
	public void validateCreateList()
	{
		homePage.createListVerify();
	}
	
	@Test
	public void signInClick()  
	{
		LoginPage loginPage= homePage.signInClickVerify();
		String title= loginPage.verifyPageTitle();
		Assert.assertEquals(title,"Amazon Sign In");
		
		
	}
	
	
	
	@AfterMethod
	public void tearDown()
	{
		//driver.quit();
	}

}
