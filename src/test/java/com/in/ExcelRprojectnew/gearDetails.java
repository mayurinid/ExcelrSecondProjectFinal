package com.in.ExcelRprojectnew;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class gearDetails extends Base{
	
	@BeforeMethod
	public void browserLunch() {
		Loadproperties();
		browserLunchMethod();
	}
@Test
	public void accountcreate() {
		AccountcreatePage cap = new AccountcreatePage(driver);
		cap.clickSigninlink();
		cap.loginemailaddress();
		cap.loginpassword();
		cap.clickSignin();
		String Actualaftersigninlanding1=cap.aftersigninlandingpage();
		String Expectedaftersigninlanding1="Welcome,";
		Assert.assertTrue(Actualaftersigninlanding1.contains(Expectedaftersigninlanding1));
		whatsnewdetailsPage wdp=new whatsnewdetailsPage(driver);
		wdp.gearlink();
		String Actualwhatsnewpagelanding=wdp.whatsnewpagelanding();
		String Expectedwhatsnewpagelanding="Gear";
		Assert.assertTrue(Actualwhatsnewpagelanding.contains(Expectedwhatsnewpagelanding));
		wdp.baglink();
		wdp.bagcartlink();
	
		wdp.firstproductaddtocartlink();
		String Actualfirstproductadded=wdp.bagaddedsucesslink();
		String Expectedfirstproductadded="The requested qty is not available";
		Assert.assertTrue(Actualfirstproductadded.contains(Expectedfirstproductadded));
		   	}
@AfterMethod
public void tearclose() {
	driver.quit();
}

}
