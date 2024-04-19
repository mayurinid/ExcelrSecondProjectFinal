package com.in.ExcelRprojectnew;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class accountinformation extends Base{
	
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
		myaccountdetails mad=new myaccountdetails(driver);
		cap.signoutbtn();
		mad.myaccountlinkclick();
		mad.myaccountinformationclick();
		String Actualfirstproductadded1=mad.myaccountaddressbookmsg();
		String Expectedfirstproductadded1="Edit Account Information";
		Assert.assertTrue(Actualfirstproductadded1.contains(Expectedfirstproductadded1));
		mad.myaccountsavebutton();
		String Actualfirstproductadded2=mad.myaccountinfosavesucessmsg();
		String Expectedfirstproductadded2="You saved the account information.";
		Assert.assertTrue(Actualfirstproductadded2.contains(Expectedfirstproductadded2));
		   	}
@AfterMethod
public void tearclose() {
	driver.quit();
}


}
