package com.model;

import java.io.IOException;

import com.model.pages.FlightFinder;
import com.model.pages.LoginPage;
import com.model.pages.UserRegisterPage;
import com.model.utility.LaunchApp1;

public class TestExicution {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
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
		
		LoginPage lp=new LoginPage();
		lp.loadLoginpage();
		lp.enterUsername("rutuja");
		lp.enterPssword("rutuja");
		lp.clickonlogin();
		System.out.println("User login successfully");
		
		FlightFinder fd=new FlightFinder();
		fd.loadFlightfinder();
		fd.flightimg();
		fd.signoffclick();
		
		
		
	}

}
