package com.model.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.model.Config;
import com.model.utility.LaunchApp1;

import sun.applet.Main;

public class LoginPage 
{

	@FindBy(how=How.XPATH,using="//input[@name='userName']")
	WebElement objusername;
	
	@FindBy(how=How.XPATH,using="//input[@name='password']")
	WebElement objpassword;
	
	@FindBy(how=How.XPATH,using="//input[@name='login']")
	WebElement objlogin;
	
	
	
	public void loadLoginpage()
	{
		PageFactory.initElements(Config.driver, this);
	}
	
	
	public void enterUsername(String username)
	{
		objusername.sendKeys(username);
	}
	
	public void enterPssword(String password)
	{
		objpassword.sendKeys(password);
	}
	
	
	public void clickonlogin()
	{
		objlogin.click();
	}
	
	public static void main(String[] args) throws IOException 
	{
		LaunchApp1 lc= new LaunchApp1();
		lc.openBrowser("chrome");
		lc.enterApplicationURL("http://newtours.demoaut.com/mercurywelcome.php");
		lc.maximizebrowser();
		lc.waittillLoginpageloaded(15);
		
		LoginPage lp=new LoginPage();
		lp.loadLoginpage();
		lp.enterUsername("rutuja");
		lp.enterPssword("rutuja");
		lp.clickonlogin();
		
		
	}
	
	
}
