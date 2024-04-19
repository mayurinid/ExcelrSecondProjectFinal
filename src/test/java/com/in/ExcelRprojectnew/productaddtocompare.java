package com.in.ExcelRprojectnew;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class productaddtocompare extends Base{
	
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
		wdp.womenlink();
		String Actualwhatsnewpagelanding=wdp.whatsnewpagelanding();
		String Expectedwhatsnewpagelanding="Women";
		Assert.assertTrue(Actualwhatsnewpagelanding.contains(Expectedwhatsnewpagelanding));
		wdp.hoodieslink();
		wdp.firstproductmousehoverlink();
		wdp.firstproductsize();
		wdp.firstproductcolor();
		cartDetailsPage cdp1 = new cartDetailsPage(driver);
		cdp1.addtocompare();
		String Actualfirstproductadded=cdp1.addtocomparesucess();
		String Expectedfirstproductadded="You added product";
		Assert.assertTrue(Actualfirstproductadded.contains(Expectedfirstproductadded));
		   	}
@AfterMethod
public void tearclose() {
	driver.quit();
}
}
