package com.in.ExcelRprojectnew;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class myaccountproductreview extends Base{
	
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
		cdp1.addtowistlist();
		String Actualfirstproductadded=cdp1.addtowishlistsucess();
		String Expectedfirstproductadded="has been added to your Wish List.";
		Assert.assertTrue(Actualfirstproductadded.contains(Expectedfirstproductadded));
		myaccountdetails mad=new myaccountdetails(driver);
		cap.signoutbtn();
		mad.myaccountlinkclick();
		mad.myaccountreviewclick();
		String Actualfirstproductadded1=mad.myaccountaddressbookmsg();
		String Expectedfirstproductadded1="My Product Reviews";
		Assert.assertTrue(Actualfirstproductadded1.contains(Expectedfirstproductadded1));
		mad.myaccountreviewseedetails();
		String Actualfirstproductadded2=mad.myaccountaddressbookmsg();
		String Expectedfirstproductadded2="Review Details";
		Assert.assertTrue(Actualfirstproductadded2.contains(Expectedfirstproductadded2));
		   	}
@AfterMethod
public void tearclose() {
	driver.quit();
}
}
