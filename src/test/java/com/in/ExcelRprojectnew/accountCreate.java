package com.in.ExcelRprojectnew;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class accountCreate extends Base{
	
	@BeforeMethod
	public void browserLunch() {
		Loadproperties();
		browserLunchMethod();
	}
@Test
	public void accountcreate() {
		AccountcreatePage cap = new AccountcreatePage(driver);
		    cap.CreateAccouPageclick();
		    String ActualLanding=cap.isLandingAccountPageTextDisplayed();
		    String ExpectedLandingtoAccountPage="Create New Customer Account";
		    Assert.assertEquals(ActualLanding, ExpectedLandingtoAccountPage);
		    cap.firstname();
		    cap.lastname();
		    cap.emailaddress();
		    cap.password();
		    cap.pwconfirmation();
		    cap.btnCreateAccount();
		    String Actualregistersucess=cap.registersuccess();
		    String Expectedregistersucess="Thank you for registering with Main Website Store.";
		    Assert.assertEquals(Actualregistersucess, Expectedregistersucess);
		    String Actualsucessregisterlanding=cap.landingonaccountpage();
		    String Expectedsucessregisterlanding="My Account";
		    Assert.assertEquals(Actualsucessregisterlanding, Expectedsucessregisterlanding);
		 	  
	}
@AfterMethod
public void tearclose() {
	driver.quit();
}
}
