package com.model.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.model.Config;

public class FlightFinder 
{
	
	
	@FindBy(how=How.XPATH,using="//img[@src='/images/masts/mast_flightfinder.gif']")
    WebElement objflightfind;
	
	
	@FindBy(how=How.XPATH,using="//a[.='SIGN-OFF']")
	WebElement objsignoff;
	
	
	public void loadFlightfinder()
	{
		PageFactory.initElements(Config.driver, this);
	}
	
	public void flightimg()
	{
		boolean flag=objflightfind.isDisplayed();
		if(flag)
		{
			System.out.println("Flight finder img is displayed");
		}
		
	}
	
	public void signoffclick()
	{
		objsignoff.click();
	}
	
}
