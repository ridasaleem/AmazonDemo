package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseClass;

public class LoginPage extends BaseClass {
	
	//Object Repository
	
	  
	   @FindBy(xpath="//input[@type='email']")
	   WebElement emailTextBox;
	  
	   @FindBy(xpath="//input[@type='password']")
	   WebElement pwdTextBox;
	   
	   @FindBy(xpath="//input[@id='signInSubmit']")
	   WebElement signInBtn;
	   
	   

		public LoginPage()
		{
			PageFactory.initElements(driver, this);
		
		}
		
		//Actions
		
		
		public String verifyPageTitle()
		{
			String title= driver.getTitle();
			return title;
		}
		
		public void loginVerify()
		{
			emailTextBox.sendKeys("h.bhatti@hotmail.com"); // to fetched from dataprovider later on
			pwdTextBox.sendKeys("rida7432");
			signInBtn.click();
			
		}

}
