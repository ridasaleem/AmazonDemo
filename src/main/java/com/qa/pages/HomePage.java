package com.qa.pages;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseClass;

public class HomePage extends BaseClass {
	
	//Object Repository
	
   @FindBy(xpath="//input[@id='twotabsearchtextbox']")
   WebElement searchTextBox;
   
   @FindBy(xpath="//input[@value='Go']")
   WebElement goBtn;
   
   @FindBy(xpath="//span[contains(text(),\"Account & Lists\")]")
   WebElement lists;
   
   @FindBy(xpath="//span[contains(text(),\"Create a List\")]")
   WebElement createList;
   
   @FindBy(xpath="//span[contains(text(),\"Sign in\")]")
   WebElement signIn;
   
   

	public HomePage()
	{
		PageFactory.initElements(driver, this);
	
	}
	
	//Actions
   
   public String verifySearchBox()
   {
	   searchTextBox.sendKeys("Nike Shoes");
	   goBtn.click();
	   String title= driver.getTitle();
	   
	   return title;
	   
   }
   
   public void createListVerify()
   {
	   Actions action=new Actions(driver);
	   action.moveToElement(lists).build().perform();
	   createList.click();
	   
   }
   
   public LoginPage signInClickVerify()
   {
	   Actions action=new Actions(driver);
	   action.moveToElement(lists).build().perform();
	   signIn.click();
	   
	   return new LoginPage();
	   
   }
     
   
}
