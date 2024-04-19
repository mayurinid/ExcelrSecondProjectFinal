package com.in.ExcelRprojectnew;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Alreadyexistaccountclickhere extends Base{
	
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
		    String Actualalreadyexistaccount=cap.getExistingAccountMessage();
		    String Expectedreadyexistaccount="There is already an account with this email address. If you are sure that it is your email address, ";
		    Assert.assertTrue(Actualalreadyexistaccount.contains(Expectedreadyexistaccount));
		    cap.onclicklink();
		    cap.emailaddress();
		    cap.restpasswordbtn();
		    String Actualafterrestpassword=cap.restpasswordbtnsucess();
		    String Expectedafterrestpassword="If there is an account associated with";
		    Assert.assertTrue(Actualafterrestpassword.contains(Expectedafterrestpassword));
		   	}
@AfterMethod
public void tearclose() {
	driver.quit();
}

}
