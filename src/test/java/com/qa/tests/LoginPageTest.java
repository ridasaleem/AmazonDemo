package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class LoginPageTest extends BaseClass {

	HomePage homePage;
	LoginPage loginPage;
	
	public LoginPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		
		loginPage=new LoginPage();
		homePage=new HomePage();
		homePage.signInClickVerify();
		
		
	}
	
	@Test
	public void signInVerify()
	{
		loginPage.loginVerify();
	}


	@AfterMethod
	public void tearDown()
	{
		//driver.quit();
	}
	
}
