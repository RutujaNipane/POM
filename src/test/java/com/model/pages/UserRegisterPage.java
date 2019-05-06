package com.model.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.model.Config;
import com.model.utility.LaunchApp1;

public class UserRegisterPage 
{

	
	@FindBy(how=How.XPATH,using="//a[.='REGISTER']")
	WebElement objregisterbtn;
	
	@FindBy(how=How.XPATH,using="//input[@name='firstName']")
	WebElement objfirstnm;
	
	@FindBy(how=How.XPATH,using="//input[@name='lastName']")
	WebElement objlastnm;
	
	@FindBy(how=How.XPATH,using="//input[@name='phone']")
	WebElement objphone;
	
	@FindBy(how=How.XPATH,using="//input[@name='userName']")
	WebElement objemail;
	
	@FindBy(how=How.XPATH,using="//input[@name='address1']")
	WebElement objadd;
	
	@FindBy(how=How.XPATH,using="//input[@name='city']")
	WebElement objcity;
	
	@FindBy(how=How.XPATH,using="//input[@name='state']")
	WebElement objstate;
	
	@FindBy(how=How.XPATH,using="//input[@name='postalCode']")
	WebElement objpost;
	
	@FindBy(how=How.XPATH,using="//select[@name='country']")
	WebElement objcountry;
	
	@FindBy(how=How.XPATH,using="//input[@name='email']")
	WebElement objusernm;
	
	@FindBy(how=How.XPATH,using="//input[@name='password']")
	WebElement objpass;
	
	@FindBy(how=How.XPATH,using="//input[@name='confirmPassword']")
	WebElement objconpass;
	
	@FindBy(how=How.XPATH,using="//input[@name='register']")
	WebElement objsubmit;
	
	@FindBy(how=How.XPATH,using="//a[.='Home']")
	WebElement objhome;
	
	public void loadRegisterPage()
	{
		PageFactory.initElements(Config.driver, this);
	}
	
	public void clickonRegister()
	{
		objregisterbtn.click();
	}
	
	public void enterFirstname(String firstnm)
	{
		objfirstnm.sendKeys(firstnm);
	}
	
	public void enterLastname(String lastnm)
	{
		objlastnm.sendKeys(lastnm);
	}
	
	public void enterPhoneno(String number)
	{
		objphone.sendKeys(number);
	}
	
	public void enterEmailid(String mailid)
	{
		objemail.sendKeys(mailid);
	}
	
	public void enterAddress(String address)
	{
		objadd.sendKeys(address);
	}
	
	public void enterCity(String city)
	{
		objcity.sendKeys(city);
	}
	
	public void enterState(String state)
	{
		objstate.sendKeys(state);
	}
	
	public void enterPostalcode(String postal)
	{
		objpost.sendKeys(postal);
	}
	
	public void enterCountry(String country)
	{
		Select sel=new Select(objcountry);
		sel.selectByVisibleText(country);
	}
	
	public void enterUsername(String usernm)
	{
		objusernm.sendKeys(usernm);
	}
	
	public void enterPassword(String password)
	{
		objpass.sendKeys(password);
	}
	
	public void enterConfirmpass(String conpass)
	{
		objconpass.sendKeys(conpass);
	}
	
	public void clickonsubmit()
	{
		objsubmit.click();
	}
	
	public void clickonhome()
	{
		objhome.click();
	}
	
	
	
	public static void main(String[] args) throws IOException 
	{
		LaunchApp1 lc= new LaunchApp1();
		lc.openBrowser("chrome");
		lc.enterApplicationURL("http://newtours.demoaut.com/mercurywelcome.php");
		lc.maximizebrowser();
		lc.waittillLoginpageloaded(15);
		
		UserRegisterPage regi=new UserRegisterPage();
		regi.loadRegisterPage();
		regi.clickonRegister();
		regi.enterFirstname("Rutuja");
		regi.enterLastname("Nipane");
		regi.enterPhoneno("9898989898");
		regi.enterEmailid("rutuja@1233");
		regi.enterAddress("12 shastrinagar");
		regi.enterCity("Pune");
		regi.enterState("Maharashtra");
	    regi.enterPostalcode("418003");
		regi.enterCountry("INDIA");
		regi.enterUsername("rutuja");
		regi.enterPassword("rutuja");
		regi.enterConfirmpass("rutuja");
		regi.clickonsubmit();
		regi.clickonhome();
		System.out.println("User Register Successfully");
	}
	
	
	
}
